package com.kmii.mybatisTest.dao;

import java.util.List;

import com.kmii.mybatisTest.dto.IDto;

public interface IDao {
	
	//모든글 LIST 불러오기 추상메서드 선언
	public List<IDto>  boardListDao();
	

}
