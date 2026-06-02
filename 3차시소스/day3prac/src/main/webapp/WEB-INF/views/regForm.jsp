<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> 회원가입 </h2>

<form action="<%=request.getContextPath()%>/regPross" method ="post">
	<input type="text" name="id">
	<input type="text" name="pwd">
	<input type="text" name="name">
	<button>회원가입</button>
</form>

</body>
</html>