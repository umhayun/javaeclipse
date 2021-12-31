<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String uid=request.getParameter("id");
	String una=request.getParameter("name");
	
	String sql="INSERT INTO feed(author,desc) VALUES(uid, una)";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teset","root","0000");
	Statement stmt=conn.createStatement();
	int count=stmt.executeUpdate(sql);

	
%>
</body>
</html>