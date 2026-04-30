<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
</head>
<body>
	<h2>수정</h2>

	<form action="update" method="post">

		empno: <input type="text" name="empno" value="${empDTO.empno}"><br>
		ename: <input type="text" name="ename" value="${empDTO.ename}"><br>
		job: <input type="text" name="job" value="${empDTO.job}"><br>
		sal: <input type="text" name="sal" value="${empDTO.sal}"><br>
		mgr: <input type="text" name="mgr" value="${empDTO.mgr}"><br>
		hiredate: <input type="date" name="hiredate" value="${empDTO.hiredate}"><br>
		comm: <input type="text" name="comm" value="${empDTO.comm}"><br>
		deptno: <input type="text" name="deptno" value="${empDTO.deptno}"><br>

		<button type="submit">수정</button>
	</form>

	<br>
	<a href="list">목록으로</a>

</body>
</html>