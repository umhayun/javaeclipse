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
	String ups=request.getParameter("ps");
%>
<h3>User ID: <%=uid %></h3>
<h3>User PS: <%=ups %></h3>

</body>
</html>