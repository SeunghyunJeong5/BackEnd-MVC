package com.mysite.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysite.board.BoardDAO;
import com.mysite.board.BoardDTO;

import com.mysite.users.UsersDAO;
import com.mysite.users.UsersDTO;

/**
 * Servlet implementation class MyController
 */
//@WebServlet("/MyController")		<== 어노테이션으로 요청을 처리(spring)

/*
 * 		Controller : Client 의 요청을 처리함 (get,post)	--- url로 요청하는건 get방식
 * 
 * 				- doGet() {} : client 에서 보내는 get 요청을 처리하는 메소드, <form method = "get" action = "a.jsp">, <a href = "b.jsp">
 * 				- doPost() {} : client 에서 보내는 post 요청을 처리하는 메소드, <form method = "post" action = "a.jsp">
 * 
 * 			controller 요청을 처리하는 방법:
 * 					web.xml : 클라이언트의 요청에 대한 controller를 지정함. --- 이거는 톰캣세팅
 * 					@WebServlet :어노테이션을 사용해서 처리
 * 
 * 			client 가 보내는 요청 정보의 URI를 캐치해서 분기처리
 * */





public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at (MyController): ").append(request.getContextPath());
		
		// client에서 get 방식으로 넘어오는 요청처리를 doPost에서 한꺼번에 처리하도록 던져준다.
		
		request.setCharacterEncoding("UTF-8");
		doPost ( request, response );   //client---request---> server,,, 반대는 response
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		// client 요청 ---> controller 가 받음 get이나 post로... 여기는 get으로 받은걸 
		// post로 한꺼번에 처리하도록함.
		
		
		
		// client 에서 Get / Post 방식으로 넘어오는 모두를 한꺼번에 처리함.
		
		
		// URL : http://localhost:8181/JSP_Study_MVC_M2/my.do
		// URI : /JSP_Study_MVC_M2/my.do
		
		
		request.setCharacterEncoding("UTF-8");
		//한글 안깨지게 처리
		
		
		// 1. Client의 요청 정보를 path 변수에 등록함.
		String url = request.getRealPath(getServletInfo());
			System.out.println("클라이언트가 보내는 전체 URL(실제 시스템의 물리적경로 : "+url);
		
		
		
		String uri = request.getRequestURI();
			//System.out.println("클라이언트가 보내는 요청 uri : "+uri);
	
		
		String path = uri.substring(uri.lastIndexOf("/"));
			//System.out.println("파일 명을 읽어옴 : "+path);
	
	
			
		// 2. Client의 요청정보에 따라서 적절하게 분기처리한다.
			
		 if(path.equals("/login.do")) {
			 System.out.println("login.do 요청을 했습니다.");
			 // 로그인을 처리하는 코드블락
			 
		 } else if (path.equals("/logout.do")) {
			 System.out.println("logout.do 요청을 했습니다.");
			 // 로그아웃 요청을 처리하는 코드블락
			 
		 } else if (path.equals("/insertBoard.do")) {
			 System.out.println("insertBoard.do 요청을 했습니다.");
			 // 게시판에서 값을 DB에 저장함.
			 
			 // 1. client 폼에서 넘어오는 변수의 값을 받아서 새로운 변수에 제 할당.
			 String title = request.getParameter("title");
			 String writer = request.getParameter("writer");
			 String content = request.getParameter("content");
			 
			 // 2. DTO 객체를 생성해서 Setter 주입
			 BoardDTO dto = new BoardDTO();
			 dto.setTitle(title);
			 dto.setWrite(writer);
			 dto.setContent(content);
			 
			 // 3. DAO 객체 생성 후 insertBoard(dto)
			 BoardDAO dao = new BoardDAO();
			 dao.insertBoard(dto);		//insert완료
			 
			 // 4. 비즈니스 로직을 처리 후 view 페이지로 이동
			 response.sendRedirect("getBoardList.do");
			 
			 
			 
			 
			 
			 
		 } else if (path.equals("/getBoard.do")) {
			 System.out.println("getBoard.do 요청을 했습니다.");
			// 게시판의 값을 읽어올때.
		 
		 
		 } else if (path.equals("/getBoardList.do")) {
			 System.out.println("getBoardList.do 요청을 했습니다.");
			
			 // 1. DTO 객체 생성
			 BoardDTO dto = new BoardDTO();
			 
			 
			 // 2. DAO의 getBoardList(dto)
			 BoardDAO dao = new BoardDAO();
			 
			 List<BoardDTO> boardList = new ArrayList<BoardDTO>();
			
			 //boardList 에는 board 테이블의 각 레코드를 dto에 저장 후 boardList에 추가된 객체를 리턴
			 boardList = dao.getBoardList(dto);
			 
			 //리턴받은 boardList를 Client의 View 페이지로 전송, (Session에 리스트를 저장 후 클라이언트로 전송)
			 
			 //Session : 접속한 모든 Client에 고유하게 부여된 식별자가 서버 메모리에 할당. 
			 
			 //세션 변수 선언
			 HttpSession session = request.getSession();
			 
			 //세션에 boardList를 추가
			 session.setAttribute("boardList", boardList); //session명 boardList으로 지정하고 boardList정보를 담아옴.
			 
			 //클라이언트 뷰페이지로 이동
			 response.sendRedirect("getBoardList.jsp");
			 
			 
			 
			 
			 
			 
			
		 } else if (path.equals("/insertUsers.do")) {
			 //Users 테이블에 값을 Insert 코드 블락
			 
			 System.out.println("insertUsers.do 요청을 했습니다.");
			 // 게시판에서 값을 DB에 저장함.
			 
			 // 1. client 폼에서 넘어오는 변수의 값을 받아서 새로운 변수에 제 할당.
			 String id = request.getParameter("id");
			 String password = request.getParameter("password");
			 String name = request.getParameter("name");
			 String role = request.getParameter("role");
			 
			 // 2. DTO 객체를 생성해서 Setter 주입
			 UsersDTO dto = new UsersDTO();
			 dto.setId(id);
			 dto.setPassword(password);
			 dto.setName(name);
			 dto.setRole(role);
			 
			 // 3. DAO 객체 생성 후 insertBoard(dto)
			 UsersDAO dao = new UsersDAO();
			 dao.insertUsers(dto);		//insert완료
			 
			 // 4. 비즈니스 로직을 처리 후 view 페이지로 이동
			 response.sendRedirect("getUsersList.do");
			 
			 
			 
			 
			 
		 } else if (path.equals("/getUsersList.do")) {
			 //Users테이블의 값을 Select해서 출력
			 
			 System.out.println("getUsersList.do 요청을 했습니다.");
				
			 // 1. DTO 객체 생성
			 UsersDTO dto = new UsersDTO();
			 
			 
			 // 2. DAO의 getUsersList(dto)
			 UsersDAO dao = new UsersDAO();
			 
			 List<UsersDTO> usersList = new ArrayList<UsersDTO>();
			
			 //usersList 에는 users 테이블의 각 레코드를 dto에 저장 후 usersList에 추가된 객체를 리턴
			 usersList = dao.getUsersList(dto);
			 
			 //리턴받은 usersList를 Client의 View 페이지로 전송, (Session에 리스트를 저장 후 클라이언트로 전송)
			 
			 //Session : 접속한 모든 Client에 고유하게 부여된 식별자가 서버 메모리에 할당. 
			 
			 //세션 변수 선언
			 HttpSession session = request.getSession();
			 
			 //세션에 boardList를 추가
			 session.setAttribute("usersList", usersList); //session명 boardList으로 지정하고 boardList정보를 담아옴.
			 
			 //클라이언트 뷰페이지로 이동
			 response.sendRedirect("getUsersList.jsp");
			 
			 
			 
		 }
		
			
			
			
			
			
			
			
			
			
	}

}
