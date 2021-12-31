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
Class.forName("com.mysql.jdbc.Driver"); // 드라이버 로딩
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teset","root","0000");
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("SELECT*FROM user");
String str="";
while(rs.next()){
	str+=rs.getString("id")+","+rs.getString("name")+rs.getString("password")+rs.getString("ts")+"<br>";
	
}
out.print(str);

/* 
1.JDBC 드라이버 로딩
2.DB 접속을 위한 Connection 객체 생성
3.SQL 명령문을 전달하기 위한 Statement 객체 생성
4. Statement객체를 이용하여 쿼리 실행 */

%>
</body>
</html>