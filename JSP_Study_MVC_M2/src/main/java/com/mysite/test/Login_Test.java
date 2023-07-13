package com.mysite.test;

import com.mysite.users.UsersDAO;
import com.mysite.users.UsersDTO;

public class Login_Test {

	public static void main(String[] args) {
		
		// 1. DTO에 임시 ID와 Password를 setter로 주입
		UsersDTO dto = new UsersDTO();
		dto.setId("admin");
		dto.setPassword("1234");
		
		// 2. DAO의 로그인 메소드 호출 :
		UsersDAO dao = new UsersDAO();
		
			//리턴받을 변수 선언(반환받은 users = NULL인 경우 : 인증 실패 -- DB에 클라가 입력한 값이 없는 경우임.)
			//(반환받은 users = NULL이 아닌 경우 : 인증 성공)
			UsersDTO users = dao.login(dto);
			
			if (users == null) {
				System.out.println("해당 아이디와 패스워드가 DB에 존재하지 않습니다.");
			}else {
				System.out.println("로그인 성공되었습니다.");
			}

	}

}
