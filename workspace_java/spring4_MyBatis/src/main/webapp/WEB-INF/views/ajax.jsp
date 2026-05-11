<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>

<a href="join.do">가입</a>
<hr>

<div id="searchArea">
    <select name="type" id="type">
        <option value="ename">ename</option>
        <option value="sal">sal(이상)</option>
        <option value="job">job</option>
    </select>

    <input type="text" name="keyword" id="keyword">

    <button type="button" id="search">검색</button>
</div>

<hr>

<div id="listArea">
    <table border="1">
        <thead>
        	<tr>
                <th>선택</th>
                <th>empno</th>
                <th>ename</th>
                <th>job</th>
                <th>sal</th>
                <th>mgr</th>
                <th>hiredate</th>
                <th>comm</th>
                <th>deptno</th>
        	</tr>
        </thead>

        <tbody id="tbody">
        </tbody>
    </table>

    <button type="button" id="list">선택 조회</button>
</div>

<script>
  
 document.querySelector("#search").addEventListener("click", async function(){
	console.log("search click!")
	
	const type = document.querySelector("#type").value;
	const keyword = document.querySelector("#keyword").value;
	const url = '/human4/ajax/list?type=' +type + '&keyword=' + keyword;
	const response = await fetch(url, {
		method: 'get',
		headers:{
			'Content-Type': 'application/json'
		},
	})
	
	const data = await response.json()

	console.log(data)
	
	document.getElementById("tbody").innerHTML = ''
	for(let i=0; i<data.length; i++){
		document.getElementById("tbody").innerHTML += `
			<tr>
				<td>
					<input type="checkbox" name="empnos" value="\${data[i].empno}">
				</td>
				<td>\${data[i].empno}</td>
				<td>\${data[i].ename}</td>
				<td>\${data[i].job}</td>
				<td>\${data[i].sal}</td>
				<td>\${data[i].mgr}</td>
				<td>\${data[i].hiredate}</td>
				<td>\${data[i].comm}</td>
				<td>\${data[i].deptno}</td>
			</tr>
		`
	}
})   


 
</script>

</body>
</html>