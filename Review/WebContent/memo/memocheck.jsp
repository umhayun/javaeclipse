<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="dao.MemoDAO"%>
    
<%
String ume=request.getParameter("memo");
String sid=(String)session.getAttribute("id");

MemoDAO dao=new MemoDAO();
if(dao.insert(sid,ume)){
	response.sendRedirect("/main.jsp");
}


%>