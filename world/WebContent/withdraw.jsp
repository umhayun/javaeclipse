<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="util.ConnectionPool" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String uid=request.getParameter("id");
	
	//1드라이버로드
	//Class.forName("com.mysql.jdbc.Driver");
	//2.DB 연결
	//Connection conn=ConnectionPool.get();
	//Connection conn=DriverManager.getConnection("jdbc:mysql:localhost:3306/testdb","root","0000");
	//3 SQL 던지기
	/* String sql="DELETE FROM user WHERE id=?";
	PreparedStatement stmt=conn.prepareStatement(sql);
	stmt.setString(1,uid); */
	
	//4 결과 받기
	UserDAO dao=new UserDAO();
	int count=dao.delete(uid);
	if(count==1){
		out.print("회원 탈퇴가 완료되었습니다.");
	}
	else{
		out.print("오류가 발생했습니다.");
	}
%>
</body>
</html>