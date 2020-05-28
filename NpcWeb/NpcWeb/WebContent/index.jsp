<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
<div id=home >
<h1 style="text-align: center">Bohaterowie!</h1>
	<form action="NpcController" method="post">
		Pokaz kompletnie losowego<input type="radio" name="option" value="random"> 
		szukaj <input type="radio" name="option" value="search">
		<br>
		<input type="submit" value="Wyślij">
	</form>
</div>
</body>
</html>