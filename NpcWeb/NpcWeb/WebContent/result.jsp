<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rezultat operacji</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	<div class=main_box>
			<% Person p= (Person)request.getAttribute("person"); %> <!-- Pobranie atrybutu z servlertu -->
		<h4>[#<%= p.getId() %>]</h4>	
		<h2><%=  p.getAge() %> <%=  p.getName() %> <%=  p.getSurname() %></h2>
		<hr/>
		<p>
		Szybkość: milion<br/>
		Klasa pancerza: pierwsza! <br/>
		Punkty wytrzymałości: niewiele<br/>
		<hr/>
		Umiejętności: <%=  p.getSkill() %><br/>
		</p>
			<table >
	<tr>
		<th>SI</th>
		<th>ZR</th>
		<th>KO</th>
		<th>IN</th>
		<th>WI</th>
		<th>CH</th>
	</tr>
	
	<tr>
			
			<td><%= p.getStrength() %></td>
			<td><%= p.getDexterity() %></td>
			<td><%= p.getConstitution() %></td>
			<td><%= p.getIntelligence() %></td>
			<td><%= p.getWisdom() %></td>
			<td><%= p.getCharisma() %></td>	
	</tr>
	
	</table>
		
		<p>
		Płeć: <%=  p.getSex() %><br/>
		Rasa: <%=  p.getSubrace() %> <%=  p.getRace() %><br/>
		Charakter:  <%=  p.getCharacter() %><br/>
		Osobowość: <%=  p.getPersonality() %>
	</p>
	
	</div>
</body>
</html>