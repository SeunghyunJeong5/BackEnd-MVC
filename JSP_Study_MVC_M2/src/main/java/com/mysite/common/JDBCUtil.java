package com.mysite.common;

import java.sql.*;

public class JDBCUtil {
		
	//모든 도메인(패키지) 에서 공통으로 사용됨 : 작업을 분리하는 바운더리
	//DB연결하는 클래스
	
	public JDBCUtil() {	//기본생성자
		System.out.println("JDBCUtil 클래스 호출 성공");
	}
		// 3개의 메소드 모두 static 키워드를 사용해서 객체 생성없이 클래스 이름으로 호출해서 사용가능
	
	
	// 1. 메소드 : DataBase 를 Connection 하는 메소드 생성 (import도 해야한다.)
	public static Connection getConnection () {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";		//driver에 ("안의 내용 할당)
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			
			Class.forName(driver);	//외부드라이버가 있는지 확인.(해당 경로에 OracleDriver 클래스가 존재하는지 확인)
			conn = DriverManager.getConnection(url, "C##HR2", "1234");
			
			System.out.println("DataBase가 잘 연결되었습니다.");
			
		}catch (Exception e) {
			//e.printStackTrace();// 오류 확인하는 명령어
			
			System.out.println("DataBase 연결이 실패했습니다.");
		}
		
		return conn;
	}
	
	
	// 2. 메소드 : 사용한 메소드를 제거하는 메소드 ( PreparedStatement, Connection ) 
			// Insert, Update, Delete 문을 사용했을 시 
	public static void close (PreparedStatement pstmt, Connection conn) {
		
		//PreparedStatement 객체 제거
		if (pstmt != null) {		//pstmt가 null이 아닐때
			try {
				if(!pstmt.isClosed()) {		// pstmt가 close가 아닐때
					pstmt.close();
				}
				System.out.println("PreparedStatement가 잘 제거되었습니다.");
				
			}catch (Exception e) {
				System.out.println("PreparedStatement가 제거중 오류 발생");
			}
		}
		
		
		//Connection 객체 제거
		if (conn != null) {		// conn이 null이 아닐때
			try {
				if(!conn.isClosed()) {		// conn이 close가 아닐때
					conn.close();
				}
				System.out.println("Connection이 잘 제거되었습니다.");
				
			}catch (Exception e) {
				System.out.println("Connection이 제거중 오류 발생");
			}
		}
		
		
		
		
	}
	
	
	
	
	
	// 3. 메소드 : 사용한 메소드를 제거하는 메소드 ( ResultSet, PreparedStatement, Connection )
			// Select 문일때
	
public static void close (ResultSet rs,PreparedStatement pstmt, Connection conn) {
		
		//ResultSet 객체 제거
			if (rs != null) {		//rs가 null이 아닐때
				try {
					if(!rs.isClosed()) {		// rs가 close가 아닐때
						rs.close();
					}
					System.out.println("ResultSet이 잘 제거되었습니다.");
					
				}catch (Exception e) {
					System.out.println("ResultSet이 제거중 오류 발생");
				}
			}
	
		//PreparedStatement 객체 제거
		if (pstmt != null) {		//pstmt가 null이 아닐때
			try {
				if(!pstmt.isClosed()) {		// pstmt가 close가 아닐때
					pstmt.close();
				}
				System.out.println("PreparedStatement가 잘 제거되었습니다.");
				
			}catch (Exception e) {
				System.out.println("PreparedStatement가 제거중 오류 발생");
			}
		}
		
		
		//Connection 객체 제거
		if (conn != null) {		// conn이 null이 아닐때
			try {
				if(!conn.isClosed()) {		// conn이 close가 아닐때
					conn.close();
				}
				System.out.println("Connection이 잘 제거되었습니다.");
				
			}catch (Exception e) {
				System.out.println("Connection이 제거중 오류 발생");
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
