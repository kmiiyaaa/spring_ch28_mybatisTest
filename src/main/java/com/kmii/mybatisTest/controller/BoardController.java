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
import com.kmii.mybatisTest.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired  
	private SqlSession sqlSession;    //DI(의존성 자동주입)
	
//	@Autowired
//	private BoardService boardService;
	
	@RequestMapping(value="/boardList")
	public String boardList(HttpServletRequest request, Model model) {
		
		IDao idao = sqlSession.getMapper(IDao.class);
		List<IDto> iDtos = idao.boardListDao(); 
		
		//int bCount = boardService.getBoardCount();  서비스 사용시 
		int bCount = idao.boardCountDao();
		
		model.addAttribute("iDtos",iDtos);
		model.addAttribute("bCount",bCount);
		
		return "boardList";
	}
	
	@RequestMapping(value="/writeForm")  //글쓰기 양식을 출력하는 요청 처리
	public String writeForm() {
		return "writeForm";
	}
	

	@RequestMapping(value="/writeOk")
	public String writeOk(HttpServletRequest request, Model model) {
		
		String btitle = request.getParameter("btitle");
        String bcontent = request.getParameter("bcontent");
        String bname = request.getParameter("bname"); 
		
        IDao idao = sqlSession.getMapper(IDao.class);
	    idao.boardWriteDao(btitle, bcontent, bname);
				
	    
		return "redirect:boardList";
		
	}
	
	@RequestMapping(value="/deleteForm")
	public String deleteForm() {
		return "deleteForm";
	}
	
	@RequestMapping(value = "/deleteOk")
	public String deleteOk(HttpServletRequest request, Model model) {
		
		String bnum = request.getParameter("bnum");		
		
		IDao idao = sqlSession.getMapper(IDao.class);
		int result = idao.boardDeleteDao(bnum);
		System.out.println("result:"+result);
		//result값이 1이면 글삭제 성공, 0이면 글삭제 실패
		if (result == 0) { //글삭제 실패
			model.addAttribute("error", "Yes");
			return "deleteForm";
		}
		
		return "redirect:boardList";
	}
	
	@RequestMapping(value="/contentView")
	public String contentView(HttpServletRequest request, Model model) {
		
		String bnum = request.getParameter("bnum");
		
		
		return "contentView";
	}
	
	
	

}
