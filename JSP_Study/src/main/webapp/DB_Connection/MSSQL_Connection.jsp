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
<title>MSSQL Connection</title>
</head>
<body>
<h2> MSSQL Connection </h2>
<%
Connection conn = null;		//Connection ��ü ���� �ʱ�ȭ
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";		//driver�� ("���� ���� �Ҵ�)
String url = "jdbc:sqlserver://localhost:1433;DatabaseName=myDB;encrypt=false";

Boolean connect = false;	//DB������ �����ߴ��� �˷��ִ� ����

try{
	
Class.forName(driver);	//�ܺε���̹��� �ִ��� Ȯ��.(�ش� ��ο� OracleDriver Ŭ������ �����ϴ��� Ȯ��)

conn = DriverManager.getConnection(url, "sa", "1234");

connect = true;

} catch (Exception e){
connect = false;	
}

// connection ������ true : DB ���� ����, false : DB���� ����

if (connect == true){
	out.println("MSSQL Server�� �� ���� �Ǿ����ϴ�.");
}else {
	out.println("MSSQL Server�� ���� ���� �Ǿ����ϴ�.");
}





%>





</body>
</html>