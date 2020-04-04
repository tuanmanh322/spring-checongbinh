<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form >
	Username<input type="text" name="username"> 
	Passwork<input type="password" name="passwork"> 
	<input type="submit" name="Login"> 
	<p>sai rồi </p>
	<%response.sendRedirect("/WEB-INF/Home.jsp/"); %>
</form>
</body>
</html>