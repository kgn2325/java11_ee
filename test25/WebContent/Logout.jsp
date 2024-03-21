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
	String sesData = (String)session.getAttribute("sid");
	if(sesData!=null)
	{
		session.invalidate();
	}
	response.sendRedirect("test10.jsp");
%>
</body>
</html>