<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.util.* %>
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
<h1> emp 목록</h1>


<table border="1">
	<thead>
		<tr>
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
			<c:forEach var="dto" items="${map.list }">
		<tr>
			<td>${dto.empno }</td>
			<td>${dto.ename }</td>
			<td>${dto.job }</td>
			<td>${dto.mgr }</td>
			<td>${dto.hiredate }</td>
			<td>${dto.sal }</td>
			<td>${dto.comm }</td>
			<td>${dto.deptno }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<%
		Map map = (Map) request.getAttribute("map");
		int total = (int)map.get("totalCount");
		int size = (int)map.get("size");
		
		int totalPage = (int)Math.ceil((double)total / size );
		
		int section = 5; // 한번에 보여줄 페이지들의 수 
		int pageNum = (int)map.get("page");
		
		int end_section = (int) Math.ceil((double) pageNum / section) * section;
		int start_section = end_section- (section-1);
	
		if (end_section > totalPage) {
			end_section =totalPage;
		}
	
	%>
	
	이전
	<c:forEach var="i" begin="<%=start_section%>"  end="<%= end_section %>">
		<c:if test="${map.page eq i }">
	<strong> <a href="list?page=${i }&size=10">${i}</a> </strong>
		</c:if>
	</c:forEach> 
	<a href="list?page=2&&size=10">2</a> 
	3 4 다음 

</body>
</html>