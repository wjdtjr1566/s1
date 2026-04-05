<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>

<h1>회원 리스트</h1>

<table border="2">
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>주소</th>
		<th>나이</th>
	</tr>

	
	<c:forEach var="user" items="${list}">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.phonenumber}</td>
			<td>${user.address}</td>
			<td>${user.age}</td>
		</tr>
	</c:forEach>
</table>

<a href="/proj04_jsp/login_.jsp">로그인으로 돌아가기</a>

</body>
</html>