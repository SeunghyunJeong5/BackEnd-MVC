<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!-- DB의 값을 읽어와서 출력하는 페이지 : ResultSet 객체를 사용 -->    
<%@ page import = "java.sql.*, java.util.*" %>

<!-- DB Connection -->
<%@ include file = "../DB_Connection/db_conn_oracle.jsp" %>

<%
	//DB를 접속해서 값을 읽어옴, Select 쿼리 (변수값이 없이 DB에서 읽어오는 쿼리)
	
	String sql = null;
	PreparedStatement pstmt = null;
	
	ResultSet rs = null;	//DB에서 읽어온 레코드셋을 저장하는 객체

	//SQL 쿼리
	sql = "select * from testboard order by today desc";
	
	//Preparedstatement 객체 활성화
	pstmt = conn.prepareStatement(sql);
	
	//SQL쿼리에 ?가 없으므로 바로 실행.
	
	//rs는 select한 결과 레코드셋을 담고있다.
	rs = pstmt.executeQuery(); 		//sql 쿼리가 Select문인 경우 ==> stmt.excuteQuery(sql) (insert, update, delete이런거 하는문이랑 다름),
										//rs 에 select한 레코드들이 저장됨.

		
	

%>





   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		div{
		width : 600px;
		margin : 0 auto;
		}
		table, tr, td{
		padding : 5px;
		border-collapse : collapse;}
	</style>
</head>
<body>
<h1> DB에서 값을 읽어와서 출력하는 페이지 </h1>

<!-- DB의 내용을 출력하는 페이지 -->
<div>


<%


	
%>
	<table width ="600px" border ="1px">
		<tr> <th>이름</th> <th>패스워드</th> <th>메일주소</th> <th>주소</th> <th>날짜</th> <th>제목</th> <th>내용</th> </tr>
		
		<% if( rs.next() ){
			
			
			do{
				
			
		
		
		
		%>
		
		
		<tr> <td><%=rs.getString(1) %></td> <td><%=rs.getString(2) %></td> <td><%=rs.getString(3) %></td> <td><%=rs.getString(4) %></td> <td><%=rs.getString(5) %></td> <td><%=rs.getString(6) %></td> <td><%=rs.getString(7) %></td> </tr>
		
		<%
			}while (rs.next());
		
		}else{
			out.println("DB에 값이 존재하지 않습니다. ");
		}
		
		
		%>
		
		
	</table>
	<p /><p /><p /><p />

<%

	


%>


</div>





</body>
</html>