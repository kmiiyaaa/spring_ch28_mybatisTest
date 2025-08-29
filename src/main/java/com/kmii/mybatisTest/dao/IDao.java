package com.kmii.mybatisTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kmii.mybatisTest.dto.IDto;

public interface IDao {
	
	//모든글 LIST 불러오기 추상메서드 선언
	public List<IDto>  boardListDao();
	
	
	//게시판 글쓰기 추상 메서드 선언
	public void boardWriteDao(@Param("btitle") String btitle,@Param("bcontent") String bcontent,@Param("bname") String bname);
	//public void boardWriteDao(@Param String btitle,@Param String bcontent,@Param String bname);
	// 그냥 param만하면 dao.xml파일에서 parm1,2,3  이렇게 써주면 된다

	//게시판 글 삭제 추상메서드 선언
	public int boardDeleteDao(String bnum);
	
	//모든글 수 가져오기 추상메서드 선언
	public int boardCountDao();
	
}
