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
<title>Oracle Connection</title>
</head>
<body>
<h2> Oracle Connection </h2>
<%
Connection conn = null;		//Connection ��ü ���� �ʱ�ȭ
String driver = "oracle.jdbc.driver.OracleDriver";		//driver�� ("���� ���� �Ҵ�)
String url = "jdbc:oracle:thin:@localhost:1521:XE";

Boolean connect = false;	//DB������ �����ߴ��� �˷��ִ� ����

try{
	
Class.forName(driver);	//�ܺε���̹��� �ִ��� Ȯ��.(�ش� ��ο� OracleDriver Ŭ������ �����ϴ��� Ȯ��)

conn = DriverManager.getConnection(url, "C##HR2", "1234");

connect = true;

} catch (Exception e){
	
	e.printStackTrace();
	
connect = false;	
}

// connection ������ true : DB ���� ����, false : DB���� ����

if (connect == true){
	out.println("����Ŭ�� �� ���� �Ǿ����ϴ�.");
}else {
	out.println("����Ŭ�� ���� ���� �Ǿ����ϴ�.");
}





%>





</body>
</html>