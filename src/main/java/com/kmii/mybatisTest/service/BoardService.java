package com.kmii.mybatisTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmii.mybatisTest.dao.IDao;

@Service
public class BoardService {
	
	@Autowired
	private IDao idao;
	
	public int getBoardCount() {
		
		int bCount =idao.boardCountDao();
		
		return bCount;
		
	}

}
