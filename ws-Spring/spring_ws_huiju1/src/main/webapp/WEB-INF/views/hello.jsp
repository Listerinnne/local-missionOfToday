<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<title>hello.jsp페이지</title>
</head>
<body>

<h2>Hello.jsp</h2>
<h3>helloController에서 넘겨준 ${msg }</h3>

<!-- 로그인을 하지 않았을 경우 -->
<c:if test="${empty loginUser }">

<a href="login">로그인페이지로 이동</a>
</c:if>

<!-- 이미 로그인이 되어 있을 경우 -->

<c:if test="${not empty loginUser }">
	<span>${loginUser }님!</span>
	<a href="/logout">로그아웃</a>
</c:if>
</body>
</html>