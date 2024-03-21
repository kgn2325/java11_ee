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
	String did = "kim";
	String dname = "김동연";
%>

<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	
	if(did.equals(id)&&dname.equals(name))
	{
		session.setAttribute("sid", id);
		session.setAttribute("sname", name);
		response.sendRedirect("test10.jsp");
	}else
	{
		response.sendRedirect("Login.jsp");
	}
	
	
%>
</body>
</html>