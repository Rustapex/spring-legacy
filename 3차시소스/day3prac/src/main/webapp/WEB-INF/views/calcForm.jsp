<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/calcResult" method="post">
숫자 1 : <input type="text" name = "num1">
숫자 2 : <input type = "text" name = "num2"> 
<button type="submit" name =operator value="add">+</button>
<button type="submit" name =operator value="minus">-</button>
<button type="submit" name =operator value="mul">*</button>
<button type="submit" name =operator value="div">/</button>

</form>


</body>
</html>