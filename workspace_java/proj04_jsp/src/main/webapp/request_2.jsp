<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"
		 import='forward.TodoDTO'
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	forward로 전달 받은 request에서 
	num, map을 뽑아서
	syso도, html로도 출력하세요 
 -->
 <%
 	int num = (int) request.getAttribute("num");
 	Map map = (Map) request.getAttribute("map");
 	String[] arr = (String[]) request.getAttribute("arr");
 	TodoDTO dto = (TodoDTO) request.getAttribute("todoDTO");
 	List list = (List) request.getAttribute("list");
 	System.out.println("jsp > num :" + num);
 	System.out.println("jsp > map :" + map);
 	
 	Map map2 = (Map)list.get(2);
 	// map2.get("점심");
 	
 	out.print("map : " + map);
 
 %>
 <br>
 <%= num %><br>
 <%= map %><br>
 <%= dto %><br>
 <% for(int i=0; i<arr.length; i++) {
	 out.println("arr: " +arr[i]+"<br>");
 }
	 %>
<%= list %>
  
 
</body>
</html>