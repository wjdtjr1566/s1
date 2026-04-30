<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>
검색 결과 : ${list}
<br>
<c:if test="${not empty list}">
	<c:forEach var="dto" items="${list}">
		empno: ${dto.empno } <br>
		ename: ${dto.ename } <br>
	</c:forEach>
</c:if>

<c:if test="${empty list }">
	empno: ${empDTO.empno } <br>
	ename: ${empDTO.ename } <br>
</c:if>
<a href="http://localhost:8080/human4/search.jsp">검색창으로 </a>
</body>
</html>