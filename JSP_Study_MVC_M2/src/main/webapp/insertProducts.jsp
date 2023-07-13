<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>


<%

	String sessionId = (String) session.getAttribute("id");
	String sessionRole = (String) session.getAttribute("role");
	
%>
<html>
<head>
<title>새글등록</title>
</head>
<body>
	<center>
		<h1>제품 등록 -- 로그인 한 사용자만 제품을 등록 함.</h1>
		
		<%
		if(sessionRole != null && sessionRole.equals("Admin")){		//조건 주는거 중요!!!
		
		%>
		
		<%= sessionId %> 님을 환영합니다. 당신은 제품을 등록할 수 있습니다.
		
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertProducts.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제품번호</td>
					<td align="left"><input type="text" name="p_code" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">제품이름</td>
					<td align="left"><input type="text" name="p_name" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">제품종류</td>
					<td align="left"><input type="text" name="p_kind" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">제품가격</td>
					<td align="left"><input type="text" name="p_price" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">제품수량</td>
					<td align="left"><input type="text" name="p_quantity" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">제품내용</td>
					<td align="left"><textarea name="p_content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 제품 등록 " /></td>
				</tr>
			</table>
		</form>
		
		<%
		
		}else{		// sessionId 변수가 null일때 출력 부분
		%>
		
		당신은 로그인 되지 않은 상태입니다. 먼저 로그인 후 제품을 등록할 수 있습니다.
		<br><br>
		<a href = "LoginForm.jsp">로그인 하기</a>
		
		
		<%
		
		}
		
		%>
		
		<hr>
		<a href="getProductsList.do">제품 목록 가기</a>
		<br><br>
		<a href = "/JSP_Study_MVC_M2"> 처음 페이지로 이동 </a>
	</center>
</body>
</html>