<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ page import = "java.util.*"%>
<%@ page import = "com.mysite.board.BoardDTO"%>


<%
	//세션에 저장된 값을 끄집어낸다.
	List<BoardDTO> boardList = new ArrayList<BoardDTO>();

	boardList = (List) session.getAttribute("boardList");


%>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
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
			<th bgcolor = "orange" width = "100px"> 번호 </th> 
			<th bgcolor = "orange" width = "200px"> 제목 </th> 
			<th bgcolor = "orange" width = "150px"> 작성자 </th> 
			<th bgcolor = "orange" width = "150px"> 등록일 </th> 
			<th bgcolor = "orange" width = "100px"> 조회수 </th> 
		
		</tr>
		
		<!-- DB의 값을 가져와서 루프 시작 -->
		<%
			for(BoardDTO k : boardList){
				
			
		%>
		<!-- k는 DTO임 -->
		<tr> 
			<td><%= k.getSeq() %></td>
			<!-- 제목에 링크를 걸어서 글의 상세 페이지를 출력할 수 있도록 Get 방식으로 링크 설정 -->
			<td>
			
			
			<a href = "getBoard.do?seq=<%= k.getSeq() %>" > <!-- 변수명(seq)에 getSeq로 값을 넣어서... 공백도 주의 -->
			<%= k.getTitle() %>
			</a>
			
			
			</td>
			<td><%= k.getWrite() %></td>
			<td><%= k.getRegdate() %></td>
			<td><%= k.getCnt() %></td>
		
		</tr>
		
		<%
			}
		
			//session 변수를 사용 후 변수에 담긴 값을 제거
			session.removeAttribute("boardList");
		
		%>
		
		<!-- 그리고 getBoardList.do로 실행함 -->
		
		<!-- DB의 값을 가져와서 루프 시작 -->
	
	
	</table>
	
	<br><br>
	<a href = "insertBoard.jsp"> 새 글 등록 </a> <p/>
	<a href = "/JSP_Study_MVC_M2"> 처음으로 이동 </a> <p/>
	
</div>
</body>
</html>