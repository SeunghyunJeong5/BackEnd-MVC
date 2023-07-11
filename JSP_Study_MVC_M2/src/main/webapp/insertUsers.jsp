<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users 새글등록</title>
</head>
<body>

<center>
		<h1>글 등록</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertUsers.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">아이디</td>
					<td align="left"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">비밀번호</td>
					<td align="left"><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">이름</td>
					<td align="left"><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">역할</td>
					<td align="left"><input type="text" name="role" /></td>
				</tr>
		
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getUsersList.do">글 목록 가기</a>
	</center>

</body>
</html>