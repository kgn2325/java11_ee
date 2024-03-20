<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 데이터 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	int point = Integer.parseInt(request.getParameter("point"));
	
	
%>

<h2>요청된 데이터</h2>
<%
	String hak="";
	if(point>=90)
	{
		hak="수";
	}else if(point>=80)
	{
		hak="우";
	}else if(point>=70)
	{
		hak="미";
	}
	else if(point>=60)
	{
		hak="양";
	}
	else
	{
		hak="가";
	}
%>
<ul>
	<li><string>이름</string> : <span><%=name %></span></li>
	<li><string>나이</string> : <span><%=age %></span></li>
	<li><string>점수</string> : <span><%=point %></span></li>
	<li><string>학점</string> : <span><%=hak %></span></li>
</ul>
</body>
</html>