<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/proj04_jsp/login">
	<h1>로그인 페이지</h1>

	아이디:   <input type="text" name="id"> <br><br>
	비밀번호: <input type="password" name="password"><br><br>
	<c:if test="${param.msg eq 1 }">
	<div style=color:red>
	아이디 또는 비밀번호를 확인해주세요
	</div>
	</c:if>
	<button type="submit"> 로그인 </button> <br><br>
	</form>
	<a href="/proj04_jsp/join_.jsp">회원가입</a>
	
</body>
</html>