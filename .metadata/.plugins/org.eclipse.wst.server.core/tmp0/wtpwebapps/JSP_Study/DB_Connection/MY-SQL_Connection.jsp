<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import = "java.sql.*" %>
<!-- 
%@ %�̰Ŵ� jsp �ڵ���... ��Ĺ���� �ؼ��ؼ� �������� ���� Ŭ�� �ѷ���.
java.sql ��Ű�� ������ ��� Ŭ������ �����´�.

connection ��ü: database�� �����ϴ� ��ü

statement ��ü: database�� ������ ������ ��ü(insert, update, delete...��)
preparestatement ��ü: statement�� �����ؼ� ���� ��ü

resultset ��ü: database���� select�� ���� �������� ��ü (select�� ���ڵ���� ���� ��ü)
 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>MY-SQL Connection</title>
</head>
<body>
<h2> MY-SQL Connection </h2>
<%
Connection conn = null;		//Connection ��ü ���� �ʱ�ȭ
String driver = "com.mysql.jdbc.Driver";		//driver�� ("���� ���� �Ҵ�)
String url = "jdbc:mysql://localhost:3306/mydb";

Boolean connect = false;	//DB������ �����ߴ��� �˷��ִ� ����

try{
	
Class.forName(driver);	//�ܺε���̹��� �ִ��� Ȯ��.(�ش� ��ο� mysql Driver Ŭ������ �����ϴ��� Ȯ��)

conn = DriverManager.getConnection(url, "root", "1234");

connect = true;

} catch (Exception e){
connect = false;	
}

// connection ������ true : DB ���� ����, false : DB���� ����

if (connect == true){
	out.println("MY-SQL Server�� �� ���� �Ǿ����ϴ�.");
}else {
	out.println("MY-SQL Server�� ���� ���� �Ǿ����ϴ�.");
}





%>





</body>
</html>