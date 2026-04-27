<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>현재 칼로리 : ${bodyCal}kcal</h2>

	<c:if test="${bodyCal > 1000}">
		<p style="color: red;">돼지야 운동해.</p>
	</c:if>

	<h3>음식 선택</h3>
	<form method="post" action="eat">

		<button type="submit" name="foodCal" value="100">아메리카노 100kcal</button>

		<button type="submit" name="foodCal" value="600">햄버거 600kcal</button>

		<button type="submit" name="foodCal" value="300">초콜릿 300kcal</button>
	</form>

	<hr>
	<h3>운동 선택</h3>
	<form method="post" action="exercise">

		<button type="submit" name="exerciseCal" value="50">걷기 50kcal
		</button>

		<button type="submit" name="exerciseCal" value="150">달리기
			150kcal</button>

		<button type="submit" name="exerciseCal" value="100">자전거
			100kcal</button>

	</form>


</body>
</html>