<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    

<%@ page import = "java.util.*"%>
<%@ page import = "com.mysite.products.ProductsDTO"%>


<%

	String sessionId = (String) session.getAttribute("id");
	String sessionRole = (String) session.getAttribute("role");
	
%>

<%
	//세션에 저장된 값을 끄집어낸다.
	List<ProductsDTO> productsList = new ArrayList<ProductsDTO>();

	productsList = (List) session.getAttribute("productsList");


%>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products 목록</title>
<style>
	div{
		width: 750px;
		margin: 0 auto;
		
	}
</style>
</head>
<body>
	<div>
	<h3> Products 목록 </h3>
		<%
		if(sessionRole != null && sessionRole.equals("Admin")){
		
		%>
		
		<%= sessionId %> 님을 환영합니다. 당신은 제품리스트를 볼 수 있습니다.
		
		<a href="logout.do">Log-out</a>
		<hr>
	<table border = "1px" cellpadding = "0" cellspacing ="0" width ="700px">
	
		<tr>
			<th bgcolor = "orange" width = "100px"> 제품번호 </th> 
			<th bgcolor = "orange" width = "200px"> 제품이름 </th> 
			<th bgcolor = "orange" width = "150px"> 제품종류 </th> 
			<th bgcolor = "orange" width = "150px"> 제품가격 </th> 
			<th bgcolor = "orange" width = "100px"> 내용 </th> 
			<th bgcolor = "orange" width = "100px"> 수량 </th> 
			<th bgcolor = "orange" width = "100px"> 등록일 </th> 
		
		</tr>
		
		<!-- DB의 값을 가져와서 루프 시작 -->
		<%
			for(ProductsDTO k : productsList){
				
			
		%>
		<!-- k는 DTO임 -->
		<tr> 
			<td><%= k.getP_code() %></td>
			<!-- 제목에 링크를 걸어서 글의 상세 페이지를 출력할 수 있도록 Get 방식으로 링크 설정 -->
			<td>
			
			
			<a href = "getProducts.do?p_code=<%= k.getP_code() %>" > <!-- 변수명(p_code)에 getP_code로 값을 넣어서... 공백도 주의 -->
			<%= k.getP_name() %>
			</a>
			
			
			</td>
			<td><%= k.getP_kind() %></td>
			<td><%= k.getP_price() %></td>
			<td><%= k.getP_quantity() %></td>
			<td><%= k.getP_content() %></td>
			
			
			<td><%= k.getIndate() %></td>
			
		
		</tr>
		
		<%
			}
		
			//session 변수를 사용 후 변수에 담긴 값을 제거
			session.removeAttribute("productsList");
		
		%>
		
		<!-- 그리고 getProductsList.do로 실행함 -->
		
		<!-- DB의 값을 가져와서 루프 시작 -->
	
	
	</table>
	
	
	<%
		
		}else{		// sessionId 변수가 null일때 출력 부분
		%>
		
		당신은 로그인 되지 않은 상태입니다. 먼저 로그인 후 글을 쓸 수 있습니다.
		<br><br>
		<a href = "LoginForm.jsp">로그인 하기</a>
		
		
		<%
		
		}
		
		%>
	
	
	
	
	
	<br><br>
	<a href = "insertProducts.jsp"> 새 글 등록 </a> <p/>
	<a href = "/JSP_Study_MVC_M2"> 처음으로 이동 </a> <p/>
	
	
	
	
	
	
		
	
</div>
</body>
</html>