package com.mysite.board;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor  //==> 기본생성자
@ToString

public class BoardDTO2 {
	
	/*
	 	LOMBOK : 1. 라이브러리 등록 : webapp\WEB-INF\lib\lombok.jar
	 			 2. 이클립스 종료 후 다시 시작
	 			 3. 클래스 상단에 어노테이션 등록
	 			 		@Getter	: 
						@Setter	:
						@NoArgsConstructor	: 기본생성자
						@ToString	: toString 메소드 오버라이딩
						
						@Data : 한꺼번에 다 만드는 것 (getter/hash/equals/...)

	 */
	
	
	private int seq;
	private String title;
	private String write;
	private String content;
	private Date regdate;
	private int cnt;

}
