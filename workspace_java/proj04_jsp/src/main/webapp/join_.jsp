<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/proj04_jsp/signup">
	<h1> 회원가입 페이지</h1>
	아이디: <input type="text" name="id"><br><br>
	비밀번호:<input type="password" name="password"><br><br>
	비밀번호 확인:<input type="password" name="passwordcheck"><br><br>
	이름: <input type="text" name="name"><br><br>
	휴대폰번호:<input type="text" name="phonenumber"><br><br>
	나이:<input type="text" name="age"><br><br>
	주소:<input type="text" name="address"><br><br>
	<button type="submit"> 회원가입 </button>
	</form>
	
	<br>
	<a href="/proj04_jsp/login_.jsp">로그인으로 돌아가기</a>
</body>
</html>