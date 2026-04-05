<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="empDTO.EmpDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List list = (List) request.getAttribute("list");
	
	%>
	<br>
	<table border="1">
	
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
		<%
		for (int i = 0; i < list.size(); i++) {
			EmpDTO dto = (EmpDTO) list.get(i);
		
		%>


		<tr>
			<td><%=dto.getEmpno()%></td>
			<td><%=dto.getEname()%></td>
			<td><%=dto.getJob()%></td>
			
			   	<% 	if(dto.getMgr()==0) { %>
					<td> <%= "null" %></td>
				 <% } else { %>
					<td> <%= dto.getMgr() %> </td>
					<% } %>
					
			<td><%=dto.getHiredate()%></td>
			<td><%=dto.getSal()%></td>
			
			   	<% 	if(dto.getComm()==0) { %>
					<td> <%= "null" %></td>
				 <% } else { %>
					<td> <%= dto.getComm() %> </td>
					<% } %>
					
			<td><%=dto.getDeptno()%></td>
		</tr>
		<%
		}
		%>
	</table>







</body>
</html>