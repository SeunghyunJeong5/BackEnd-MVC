package com.mysite.test;

import java.util.ArrayList;
import java.util.List;

import com.mysite.board.BoardDAO;
import com.mysite.board.BoardDTO;

public class GetBoardList_Test {

	public static void main(String[] args) {
		
		// 1. DTO 객체 생성
		BoardDTO dto = new BoardDTO();
		
		// 2. DAO 객체 성성
		BoardDAO dao = new BoardDAO();
		
		// 3. 메소드 호출시 리턴받을 리스트 변수 선언 : List<BoardDTO>
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		
		//boardList는 board 테이블의 레코드를 dto에 저장 후 List에 추가됨(add)
		boardList = dao.getBoardList(dto);	
		
		//ArrayList에 저장된 값을 끄집어내서 출력
		//for 문을 사용해서 출력
		System.out.println("=====For문을 사용해서 출력======");
		for (int i = 0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
		
		
		//향상된 For문을 사용해서 출력
		System.out.println("=====Enhanced For문을 사용해서 출력======");
		for(BoardDTO k : boardList) {
			System.out.println(k);
		}
	
	
	
	
	
	
	}

}
