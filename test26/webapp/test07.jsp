<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "org.kh.dto.Member" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL(Java Standard Tag Library) FMT</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<hr>
<h2>FMT(Format : 표시형식)</h2>
<c:set var="num" value="12345678.9876543"></c:set>
<c:set var="data" value="3,652,733"></c:set>
<c:set var="su1" value="0"></c:set>
<c:set var="su2" value="4"></c:set>
<c:set var="su3" value="-6500000"></c:set>
<c:set var="today" value="<%=new Date() %>"></c:set>
<br><hr><br>
<h3>01. 숫자 데이터 변환문 fmt:parseNumber</h3>
<c:out value="${data }"></c:out>
<p><fmt:parseNumber value="${data }" pattern="0,000" var="num2"></fmt:parseNumber></p>
<p>${num2 }</p>
<p>1년은 ${num2/10000 }일 입니다.</p>
<hr>
<h3>02. 숫자 표시형식 변환문 fmf:formatNumber</h3>
<p>groupingUsed 속성 : 천단위 구분기호 사용여부</p>
<p><fmt:formatNumber value="${num }" groupingUsed="true"></fmt:formatNumber></p>
<p><fmt:formatNumber value="${su1 }" groupingUsed="true"></fmt:formatNumber></p>
<p><fmt:formatNumber value="${su3 }" groupingUsed="true"></fmt:formatNumber></p>
<br>
<p>pattern 속성 활용</p>
<p><fmt:formatNumber value="${num }" pattern="#,##0"></fmt:formatNumber></p>
<p><fmt:formatNumber value="${su1 }" pattern="#,##0"></fmt:formatNumber></p>
<p><fmt:formatNumber value="${su3 }" pattern="#,##0"></fmt:formatNumber></p>
<p><fmt:formatNumber value="${num }" pattern="\ #,##0"></fmt:formatNumber></p>
</body>
</html>