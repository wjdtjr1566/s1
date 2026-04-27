<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 커피 주문</h1>
<form action="/human3/quiz" method="get">
커피 선택:<select name="coffee">
			<option>아아</option>
			<option>얼박사</option>
		  </select> 
	개수 : <input type="number" name="count" value="">
	<br><br>
	<button type="submit" id="order">SSR 주문하기</button>
</form>
<hr>

<h3>주문한 내역</h3>
${coffee} x ${count} <br>
총액 : ${total} 원

<hr>
<hr>

<input type="text" id="newMenu" placeholder="메뉴명 입력"> 
<input type="number" id="newPrice" placeholder="가격 입력">
<button type="button" id="addMenu">메뉴 추가</button> <br><br>

커피 선택 :<select id="coffee">
			<option>아아</option>
			<option>얼박사</option>
		  </select> 
	<input type="number" id="count" value="1">
	<br><br>
	<button type="button" id="csrorder"> CSR 주문하기</button>
<h3>주문한 내역</h3>
<div id="result"></div>
<script>
document.querySelector("#csrorder").addEventListener('click', function(){
	const coffee = document.querySelector("#coffee").value
	const count = document.querySelector("#count").value
	fetch("quizorder?coffee="+ coffee + "&count=" +count)
	.then(function(response){
		return response.json()
	}).then(function(data){
		console.log(data)
		document.querySelector("#result").innerHTML =
			"커피 " + data.coffee + "<br>"+ "수량: " +data.count + "<br>"+
			"총액 " + data.total + " 원입니다"
	});
});

document.querySelector("#addMenu").addEventListener("click", function(){

    const menu = document.querySelector("#newMenu").value;
    const price = document.querySelector("#newPrice").value;

    if (!menu || !price) {
        alert("메뉴명과 가격을 입력하세요");
        return;
    }

    const select = document.querySelector("#coffee");

    const option = document.createElement("option");
    option.value = menu;
    option.innerText = menu;
    

    document.querySelector("#newMenu").value = "";
    document.querySelector("#newPrice").value = "";
});


</script>
</body>

</html>