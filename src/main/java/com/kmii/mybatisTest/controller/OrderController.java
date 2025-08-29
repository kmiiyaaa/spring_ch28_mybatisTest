package com.kmii.mybatisTest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kmii.mybatisTest.dao.IDao;
import com.kmii.mybatisTest.dao.OrderDao;
import com.kmii.mybatisTest.dto.IDto;
import com.kmii.mybatisTest.dto.UserOrderDto;

@Controller
public class OrderController {
	

	@Autowired  
	private SqlSession sqlSession;    //DI(의존성 자동주입)
	
	@RequestMapping(value="/orderList")
	public String orderList(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		List<UserOrderDto> userOrderDtos = orderDao.userOrderListDao("hong"); 
		 
		model.addAttribute("userOrderDtos", userOrderDtos);
		
		return "orderList";
	}

	
}
