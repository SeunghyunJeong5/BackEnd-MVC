<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!-- 
    		dbgb-write.html =======> 에서 form에서 넘어오는 값을 받아서 DB에 저장하는 파일
     -->
     
     
 <%@ page import = "java.sql.*,java.util.*" %>	
 
 <!--  클라이언트에서 넘어오는 한글이 깨어지지 않게 처리 -->    
 <% request.setCharacterEncoding("UTF-8"); %>
 
 
 <!--  dbgb_wirte.html 폼에서 넘어오는 변수의 값을 받아서 새로운 변수에 할당
 
 		request : 클라이언트 정보를 서버에서 읽어오는 객체 (JSP의 내장 객체)
 		response : 서버의 정보를 클라이언트에게 보내는 객체 (JSP의 내장 객체)
  -->
 <%
 	String tna = request.getParameter("tname");
 	String tpa = request.getParameter("tpass");
 	String tem = request.getParameter("temail");
 	String tad = request.getParameter("taddr");
 	String su = request.getParameter("sub");
 	String cont = request.getParameter("content");
 	String ymd = (new java.util.Date()).toLocaleString(); //현재 시스템의 날짜를 생성해서 String으로 변환
 
 %>
 
 
 <!-- //오라클 DB연결 -->
 <%@ include file = "../DB_Connection/db_conn_oracle.jsp" %>
 <!-- Connection conn = null;		//Connection 객체 변수 초기화
String driver = "oracle.jdbc.driver.OracleDriver";		//driver에 ("안의 내용 할당)
String url = "jdbc:oracle:thin:@localhost:1521:XE";
try{	
Class.forName(driver);	//외부드라이버가 있는지 확인.(해당 경로에 OracleDriver 클래스가 존재하는지 확인)
conn = DriverManager.getConnection(url, "C##HR2", "1234");
} catch (Exception e){
	//e.printStackTrace();
} 

이내용이 저기 안에 있는거임

mssql 파일로 jsp파일을 바꾸면 mssql DB가 연결이 되는것임-->
 <%
 
 	// Client 에서 폼에서 넘어오는 값을 DataBase에 저장
 	
 	String sql = null;		// DataBase에 insert 쿼리를 담은 문자열
 	Statement stmt = null; 	// Statement
 	
 	// Statement 객체 생성 : 쿼리를 DB에 (insert, update, delete) 쿼리를 실행하는 객체 
 	// Statement : Connection 객체의 createStatement()로 활성화
 	stmt = conn.createStatement();
 	
 	
 	sql = "insert into testboard( tname, tpass, temail, taddr, today, sub, content ) ";
 	sql = sql + "values ('" + tna + "','" + tpa + "','" + tem + "','" + tad + "','" + ymd + "','" + su + "','" + cont + "')";
 
 	try{
 	// stmt 객체에 sql 쿼리를 넣어서 DB에 저장 :
 	stmt.executeUpdate(sql);	// insert, update, delete 쿼리일때 사용, 톰켓 기본설정은 commit이 작동됨.
 	// DB 연결에 문제가 생길시 오류발생 : try catch로 묶어줘야한다.
 	} catch (Exception e){
 		//오류 발생시 실행
 		e.printStackTrace();
 		out.println("DB연결에 문제가 발생했습니다. 고객센터로 연락 바랍니다. 010-1111-1111");
 	}finally{
 	conn.close();
 	stmt.close();
 	}
 
 %>
 <!-- 클라이언트의 값을 DB에 저장 후 페이지 이동 -->
<jsp:forward page = "dbgb_show.jsp" />
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% out.println (sql); %>

	<h3> 클라이언트에서 넘어오는 변수를 받아서 출력 </h3>
	<div> <%= tna %></div>
	<div> <%= tpa %></div>		<!-- 출력하는 기능 -->
	<div> <%= tem %></div>
	<div> <%= tad %></div>
	<div> <%= ymd %></div>
	<div> <%= su %></div>
	<div> <%= cont %></div>


	<hr>
	<h3> 출력 out.println </h3>
	<%
	
	out.println("<div> tna 변수의 값" +tna+ "</div>");
	out.println("<div> tpa 변수의 값" +tpa+ "</div>");
	out.println("<div> tem 변수의 값" +tem+ "</div>");
	out.println("<div> tad 변수의 값" +tad+ "</div>");
	out.println("<div> ymd 변수의 값" +ymd+ "</div>");
	out.println("<div> su 변수의 값" +su+ "</div>");
	out.println("<div> cont 변수의 값" +cont+ "</div>");
	
	
	%>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>