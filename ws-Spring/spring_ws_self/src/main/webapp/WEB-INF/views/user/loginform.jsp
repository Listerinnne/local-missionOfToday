<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>loginform.jsp페이지</title>
</head>
<body>
<h2>로그인 페이지</h2>
<span>${msg2 }</span>

<form action="/login" method="post">
	id : <input type="text" name="id">
	pw : <input type="password" name="pw">
	<button>로그인</button>
</form>

</body>
</html>