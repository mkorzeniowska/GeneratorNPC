<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>Bohaterowie!</h1>
	<form action="NpcController" method="post">
		Pokaz kompletnie losowego<input type="radio" name="option" value="random"> 
		szukaj <input type="radio" name="option" value="search">
		<br>
		<input type="submit" value="Wyślij">
	</form>

</body>
</html>