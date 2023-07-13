package com.mysite.test;

import com.mysite.board.BoardDAO;
import com.mysite.board.BoardDTO;

public class DeleteBoard_Test {

	public static void main(String[] args) {
		// 단위 테스트 : 메소드가 잘 동작하는지 테스트
		
		// 1. DTO객체 생성
		BoardDTO dto = new BoardDTO();
		dto.setSeq(11);
		
		// 2. DAO객체 생성
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(dto);
		

	}

}
