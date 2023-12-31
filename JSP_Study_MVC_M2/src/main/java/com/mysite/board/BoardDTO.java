package com.mysite.board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO {

	//DTO (VO) : 데이터를 받아서 전송해주는 객체
		//1. 모든 접근제어자는 private로 설정
		//2. DataBase의 테이블의 컬럼명을 변수명으로 사용함.
		//3. 변수의 자료형도 DataBase의 테이블의 컬럼명의 자료형과 같게 생성함.
		//4. private이므로 Getter/Setter로 값을 넣고빼고 해야됨.
		//5. 기본생성자
	
		//LOMBOK 어노테이션을 이용해서 Getter/Setter/기본생성자 등을 자동으로 생성
	
	//DAO : DataBase를 Insert/Update/Delete/Select 하는 쿼리를 가지고 있는 객체
	
	//MVC M2 : ===> MVC로 개발
	
	// client ===dto에 담에서====> Controller ===dto===>DAO <=====> DataBase
	
	
	
	
	// Board 테이블에 각 컬럼에 값을 저장할 dto 생성 
	
	private int seq;
	private String title;
	private String write;
	private String content;
	private Date regdate;
	private int cnt;
	//===========================테이블 매핑 컬럼 끝
	
	
	
	//검색기능을 처리하는 변수 : 2개추가
	private String searchCondition;		//TITLE, WRITE, CONTENT, REGDATE
	private String searchKeyword;		//검색어 : ?
	
	
	//날짜를 기준으로 검색 : 년도만 검색
	
	
	
	//기본 생성자
	public BoardDTO() {}

	
	
	//getter, setter 생성
//	lombok 으로만들어버림


	
	// toString 오버라이딩 객체 자체를 출력시 필드의 내용을 출력

	
	
	
	
	
	
	
	
	
	
	
	
	

}
