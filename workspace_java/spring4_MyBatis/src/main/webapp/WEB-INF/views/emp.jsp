<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<a href="http://localhost:8080/human4/join.do">가입</a>
<hr>
<form method="get" action="search">
<%-- 	이름: <input type="text" name="ename" value="${empDTO.ename}"> --%>
<%-- 	월급: <input type="text" name="sal" value="${empDTO.sal}"> --%>

	<select name="type">
		<option value="ename" ${empDTO.type eq 'ename' ? 'selected':''}>ename</option>
		<option value="sal" ${empDTO.type eq 'sal' ? 'selected':''}>sal(이상)</option>
		<option value="job" ${empDTO.type eq 'job' ? 'selected':''}>job</option>
	</select>
	<input type="text" name="keyword" value="${empDTO.keyword}">

	<input type="submit" value="검색">	
	
</form>


<hr>
<form method="get" action="choice">
	<table border="1">
	 <thead>
	 	<tr>
	 		<th>선택</th>
	 		<th>empno</th>
	 		<th>ename</th>
	 		<th>job</th>
	 		<th>mgr</th>
	 		<th>hiredate</th>
	 		<th>sal</th>
	 		<th>comm</th>
	 		<th>deptno</th>
	 	</tr>
	 </thead>
	 <tbody>
	 	<c:if test="${not empty list}">
	 	<c:forEach var="a" items="${list }">
	 	<tr>
	 		<td>
	 			<input type="checkbox" name="empnos" value="${a.empno}">
	 		</td>
	 		<td>${a.empno}</td>
	 		  <td>
        <a href="detail?empno=${a.empno}">
            ${a.ename}
        </a>
    </td>
	 		<td>${a.job}</td>
	 		<td>${a.mgr}</td>
	 		<td>${a.hiredate}</td>
	 		<td>${a.sal}</td>
	 		<td>${a.comm}</td>
	 		<td>${a.deptno}</td>
	 		<td>
		        <form action="delete" method="post">
		            <input type="hidden" name="empno" value="${a.empno}">
		            <button type="submit"
		                    onclick="return confirm('삭제하시겠습니까?')">
		                삭제
		            </button>
		        </form>
   		 	</td>
	 		
	 	</tr>
	 	</c:forEach>
	 	</c:if>
	 	
	 	<c:if test="${not empty empDTO}">
	 	<tr>
	 		<td>${empDTO.empno}</td>
	 		<td>${empDTO.ename}</td>
	 		<td>${empDTO.job}</td>
	 		<td>${empDTO.mgr}</td>
	 		<td>${empDTO.hiredate}</td>
	 		<td>${empDTO.sal}</td>
	 		<td>${empDTO.comm}</td>
	 		<td>${empDTO.deptno}</td>
	 	</tr>
	 	</c:if>
	 	
	 </tbody>
	</table>
<input type="submit" value="선택 조회">
</form>
	
	
<!-- 	<table border="1"> -->
<!-- 	 <thead> -->
<!-- 	 	<tr> -->
<!-- 	 		<th>empno</th> -->
<!-- 	 		<th>ename</th> -->
<!-- 	 		<th>job</th> -->
<!-- 	 		<th>mgr</th> -->
<!-- 	 		<th>hiredate</th> -->
<!-- 	 		<th>sal</th> -->
<!-- 	 		<th>comm</th> -->
<!-- 	 		<th>deptno</th> -->
<!-- 	 	</tr> -->
<!-- 	 </thead> -->
<!-- 	 <tbody> -->
	 	
<!-- 	 </tbody> -->
<!-- 	</table> -->
	
	<a href="http://localhost:8080/human4/list">emp 전체보기</a>
	<a href="http://localhost:8080/human4/one">emp 하나</a>
	
	<div class="map-view"></div>
	<a href="http://localhost:8080/human4/map">emp map</a>
	<button class="map">map</button>
	
	
	<script>
		const btn = document.querySelector(".map")
		btn.addEventListener('click',async()=>{
		const response = await fetch("/human4/map",{
			method: 'GET'
		});
		
		const result = await response.json();
		const map = document.querySelector(".map-view");
		
		console.log(result)
		
        map.innerHTML = "ENAME: " + result.ENAME + " Empno: " + result.EMPNO + " JOB: " + result.JOB + " SAL: " + result.SAL + 
        " MGR: " + result.MGR + " DEPTNO: " + result.DEPTNO+'<br>' ;
		
		})
		
	
	</script>
</body>
</html>