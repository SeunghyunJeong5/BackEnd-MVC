package com.mysite.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.mysite.common.JDBCUtil;

public class UsersDAO {
	
		//사용할 변수선언 : private
			//connection, preparedstatement, resultset ===> java.sql.*
		private Connection conn = null;
		private PreparedStatement pstmt = null;
		private ResultSet rs = null;
		
		//SQL 쿼리를 상수로 정의 후에 각각 필요한 메소드에서 사용
		private final String USERS_INSERT = "insert into users( id, password, name, role ) values(?,?,?,?)"; 
		private final String USERS_UPDATE = "";
		private final String USERS_DELETE = "";
		private final String USERS_GET = "";
		private final String USERS_LIST = "select*from users order by id desc";
		
	
	//1. users 테이블에 값을 넣는 메소드
	public void insertUsers(UsersDTO dto) {
		
		
		System.out.println("======== insertUsers 기능 처리 ==========");
		
		try {
			conn = JDBCUtil.getConnection(); 	//conn 객체가 활성화 (Oracle/XE/HR2/1234) 이렇게 됨.
			
			
			// PreparedStatement 객체를 활성화
			pstmt = conn.prepareStatement(USERS_INSERT);	// pstmt 객체 활성화
			// ? 에 들어갈 변수의 값을 dto의 getter를 사용해서 값을 할당
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getRole());
			
			// PreparedStatement 객체를 실행 : DB에 값이 Insert 됨.
			pstmt.executeUpdate(); 	//insert/update/delete
			
			System.out.println(" Users 테이블에 값이 잘 insert되었습니다. ");
			
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(" Users 테이블에 값이 insert 실패했습니다. ");
		} finally {
			//사용한 객체를 제거
			JDBCUtil.close(pstmt, conn);
		}
	
		
		
		
		
		
		
		
	}
	
	//2. users 테이블의 모든 레코드를 출력하는 메소드
	public List<UsersDTO> getUsersList(UsersDTO dto){
		System.out.println("getUsersList 메소드 호출 - Users 리스트 페이지");
	
		//주의 : while 블락밖에서 선언해야한다.
		List<UsersDTO> usersList = new ArrayList<UsersDTO>(); // try 블락 밖에서 선언이 되어야함.
						
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USERS_LIST);
			rs = pstmt.executeQuery();		// rs에는 select한 결과 레코드셋을 담고있다.
			
			//rs의 값을 끄집어내서 DTO에 저장
			while (rs.next()) {
				
				//주의 : while 블락내에서 DTO객체를 생성해야 users(DTO)의 힙주소가 새로 생성됨.(밖에서 생성하면 힙주소가 계속 동일하기 때문에 마지막 값만 적용됨.)
				UsersDTO users = new UsersDTO();		// DTO객체를 while 루프 내에서 생성해야됨.
				
				users.setId(rs.getNString("ID"));
				users.setPassword(rs.getNString("PASSWORD"));
				users.setName(rs.getNString("NAME"));
				users.setRole(rs.getNString("ROLE"));
				
				
				//usersList에 DTO를 추가
				usersList.add(users);
			}
			
			System.out.println("usersList에 모든 레코드 추가 성공");
			
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println("usersList에 모든 레코드 추가 실패");
		}finally {
			//사용한 객체 모두 제거(close)
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return usersList;		//usersList : users 테이블의 각각의 레코드를 dto에 담아서 usersList에 저장됨.
		
	}
	
	

}
