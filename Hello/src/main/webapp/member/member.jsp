<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h1>여기는 멤버 페이지입니다.</h1></div>
		<div>
			<%
				String id = request.getParameter("id");
				String password = request.getParameter("password");
			%>
			
			당신의 아이디는 <%= id %> <br>
			당신의 패스워드는 <%= password %>
		</div>
	</div>	
</body>
</html>