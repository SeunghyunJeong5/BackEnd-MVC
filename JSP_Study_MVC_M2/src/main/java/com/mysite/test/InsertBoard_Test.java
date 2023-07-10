package com.mysite.test;

import com.mysite.board.BoardDAO;
import com.mysite.board.BoardDTO;

public class InsertBoard_Test {

	public static void main(String[] args) {
	
		// 1. DTO 객체를 생성해서 Setter에 값을 주입
		BoardDTO dto = new BoardDTO();
		
				//dto객체에 setter를 사용해서 필드의 값을 입력
				dto.setTitle("글 제목을 입력합니다. -5");
				dto.setWrite("admin");
				dto.setContent("글 내용을 입니다. -5");
		
		// 2. DAO 객체를 생성해서 insertBoard(dto) 호출 시===> DB에 insert됨. 
		BoardDAO dao = new BoardDAO();
	
		//DAO 객체의 insert메소드 호출시 매개변수로 dto를 매개변수로 던짐.
		dao.insertBoard(dto);		//DB에 값이 insert됨.
	
	}

}
