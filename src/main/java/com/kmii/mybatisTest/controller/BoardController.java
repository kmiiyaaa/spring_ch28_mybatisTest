package com.kmii.mybatisTest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kmii.mybatisTest.dao.IDao;
import com.kmii.mybatisTest.dto.IDto;

@Controller
public class BoardController {
	
	@Autowired  
	private SqlSession sqlSession;    //DI(의존성 자동주입)
	
	@RequestMapping(value="/boardList")
	public String boardList(HttpServletRequest request, Model model) {
		
		IDao idao = sqlSession.getMapper(IDao.class);
		List<IDto> iDtos = idao.boardListDao(); 
		
		model.addAttribute("iDtos",iDtos);
		
		return "boardList";
	}

}
