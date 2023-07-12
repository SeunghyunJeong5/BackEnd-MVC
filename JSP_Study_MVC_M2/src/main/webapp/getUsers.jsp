<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import = "com.mysite.users.UsersDTO" %>

<%
	//세션에 저장된 변수의 값을 불러옴
	UsersDTO users = (UsersDTO) session.getAttribute("users");		// "board"에는 dto가 저장되어있음. 이걸 끄집어내와야함. 다운캐스팅을해서...

	/*
	//그냥 한번 찍어보는것
	out.println(users.getId() + "<br><br>");
	out.println(users.getPassword() + "<br><br>");
	out.println(users.getName() + "<br><br>");
	out.println(users.getRole() + "<br><br>");
	
	*/
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users 글 상세</title>
<style>
	div{
		width : 700px;
		margin: 0 auto;
	
	}
	td{
		padding : 10px;
	}

</style>
</head>
<body>
		<div>
			<h1> 글 상세 페이지 - Form 태그 내부에 value 값에 출력 (수정을 바로 할 수 있도록) </h1>
			<hr>
			<br><br>
			
			<form action = "updateUsers.do" method="post">
			
				<!-- 글 수정시 id 변수 값을 서버로 전송 ... id를 받아와서 다시 서버로 전송...-->
				<input type = "hidden" name ="id" value ="<%=users.getId()%>">
			
				<table border="1px" cellspacing="0" cellpadding="0">
					<tr>
					<td bgcolor = "orange">아이디</td>
					<td><%= users.getId()%></td>
					</tr>
					<tr>
					<td bgcolor = "orange">비밀번호</td>
					<td><%= users.getPassword()%></td>
					</tr>
					<tr>
					<td bgcolor = "orange">이름</td>
					<td><input type = "text" name = "name" value = "<%= users.getName()%>"></td>
					</tr>
					<tr>
					<td bgcolor = "orange">역할</td>
					<td><input type ="text" name = "role" value = "<%= users.getRole()%>"></td>
					</tr>
					
					<tr><td colspan ="2" align = "center"><input type="submit" value ="글 수정하기"></td>
					</tr>
						
				</table>
			</form>
		
		<br><br>
		<a href = "getUsersList.do"> 글 목록 보기 </a>
		<br><br>
		<a href = "insertUsers.do"> 글쓰기 </a>
		<br><br>
		<a href = "deleteUsers.do?seq=<%= users.getId() %>"> 글삭제 </a>
		</div>
</body>
</html>