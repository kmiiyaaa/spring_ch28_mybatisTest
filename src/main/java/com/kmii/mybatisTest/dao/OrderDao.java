package com.kmii.mybatisTest.dao;

import java.util.List;

import com.kmii.mybatisTest.dto.UserOrderDto;

public interface OrderDao {
	
	public List<UserOrderDto> userOrderListDao(String userid);  // 한 유저의 주문리스트 
	
	
	

}
