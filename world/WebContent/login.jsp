<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--  <%..... %> 스크립틀릿 scriptlet 일반 자바 코드 삽입
 <%@.... %> 지시어 directive 
 <%=.... %> 표현식 expression
 <%!....%> 선언문 declaration
  주석 comment --%> 
<!-- html 주석 -->
<!-- 주석 두가지 다사용-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>User ID : <%=request.getParameter("id") %></h3>
<br>
<h3>User PW : <%=request.getParameter("ps") %></h3>

</body>
</html>