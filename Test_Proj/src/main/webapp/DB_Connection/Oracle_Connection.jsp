<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import = "java.sql.*" %>
<!-- 
%@ %이거는 jsp 코드임... 톰캣에서 해석해서 페이지를 만들어서 클라에 뿌려줌.
java.sql 패키지 내부의 모든 클래스를 가져온다.

connection 객체: database를 연결하는 객체

statement 객체: database에 쿼리를 보내는 객체(insert, update, delete...등)
preparestatement 객체: statement를 개선해서 만든 객체

resultset 객체: database에서 select한 값을 가져오는 객체 (select한 레코드셋을 담은 객체)
 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Oracle Connection</title>
</head>
<body>
<h2> Oracle Connection </h2>
<%
Connection conn = null;		//Connection 객체 변수 초기화
String driver = "oracle.jdbc.driver.OracleDriver";		//driver에 ("안의 내용 할당)
String url = "jdbc:oracle:thin:@localhost:1521:XE";

Boolean connect = false;	//DB접속이 성공했는지 알려주는 변수

try{
	
Class.forName(driver);	//외부드라이버가 있는지 확인.(해당 경로에 OracleDriver 클래스가 존재하는지 확인)

conn = DriverManager.getConnection(url, "C##HR2", "1234");

connect = true;

} catch (Exception e){
	
	e.printStackTrace();
	
connect = false;	
}

// connection 변수가 true : DB 접속 성공, false : DB접속 실패

if (connect == true){
	out.println("오라클에 잘 접속 되었습니다.");
}else {
	out.println("오라클에 접속 실패 되었습니다.");
}





%>





</body>
</html>