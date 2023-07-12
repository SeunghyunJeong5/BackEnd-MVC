<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ page import = "java.util.*"%>
	<%@ page import = "com.mysite.users.UsersDTO"%>


<%
	//세션에 저장된 값을 끄집어낸다.
	List<UsersDTO> usersList = new ArrayList<UsersDTO>();

	usersList = (List) session.getAttribute("usersList");


%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users 글목록</title>
<style>
	div{
		width: 750px;
		margin: 0 auto;
		
	}
</style>
</head>
<body>
<div>
	<h3> 글 목록 </h3>
	
	<table border = "1px" cellpadding = "0" cellspacing ="0" width ="700px">
	
		<tr>
			<th bgcolor = "orange" width = "150px"> 아이디 </th> 
			<th bgcolor = "orange" width = "150px"> 비밀번호 </th> 
			<th bgcolor = "orange" width = "150px"> 이름 </th> 
			<th bgcolor = "orange" width = "150px"> 역할 </th> 
			
		
		</tr>
		
		<!-- DB의 값을 가져와서 루프 시작 -->
		<%
			for(UsersDTO k : usersList){
				
			
		%>
		<!-- k는 DTO임 -->
		<tr> 
			<td><%= k.getId() %></td>
			<td><%= k.getPassword() %></td>
			
			
			<!-- 이름에 링크를 걸어서 글의 상세 페이지를 출력할 수 있도록 Get 방식으로 링크 설정 -->
			<td>
			<a href = "getUsers.do?id=<%= k.getId() %>" > <!-- 변수명(id)에 getId로 값을 넣어서... 공백도 주의 -->
			<%= k.getName() %>
			</td>
			
			
			<td><%= k.getRole() %></td>
			
		
		</tr>
		
	
		
		<%
			}
		
		//session 변수를 사용 후 변수에 담긴 값을 제거
		session.removeAttribute("usersList");
		
		%>
		
		<!-- 그리고 getUsersList.do로 실행함 -->
		
	
	
	</table>
	
	<br><br>
	<a href = "insertUsers.jsp"> 새 글 등록 </a>
</div>
</body>
</html>