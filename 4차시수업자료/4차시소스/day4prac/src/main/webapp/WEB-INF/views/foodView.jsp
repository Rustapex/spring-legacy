<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function getData(){
	//alert("dkdkk");
	$.ajax({
		type:"GET",
		url:"/prac4/data4",
		success: function(data){
			console.log(data);
			//화면에 보여주기
			renderData(data);
		},
		error: function(err){
			console.log(err);
		}
	});
}

function renderData(response){
	console.log(response);
	
	const result = document.getElementById("result");
	
	let str="<ul>";
	for(let i = 0; i<response.length; i++){
		console.log(response[i]);
		let item = response[i];
		str += "<li>" + item.name + item.price + "</li>";
	}
	
	str +="</ul>";
	//alert(str);
	
	result.innerHTML = str;
	
}

function regData(){
	alert("asdf");
	
	let food = {name : "탕수육", price : "28000"};
	console.log(food);
	
	// 객체 -> String (json)
	let sendData = JSON.stringify(food);
	console.log(sendData);
	
	// ajax로 서버에 등록 요청
	$.ajax({
		type: "POST",
		url :"/prac4/regData/data",
		data : sendData,
		contentType : "application/json",
		success : function(data){
			console.log(data);
		},
		error: function(err){
			console.log(err);
		}
	})
	
}

</script>
</head>
<body>

	<h2>음식목록</h2>

	<div id="result"></div>

	<button onclick="getData()">더보기</button>

	<h2>food 등록</h2>
	
	<button onclick="regData()">food 등록하기</button>

</body>
</html>