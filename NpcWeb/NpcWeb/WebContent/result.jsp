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
	<div class="main_box">
		<div class="inbox">
			<% Person p= (Person)request.getAttribute("person"); %> <!-- Pobranie atrybutu z servlertu -->
		<h4>[#<%= p.getId() %>] <- to by było ID delikwenta</h4>	
		<h2><%=  p.getAge() %> <%=  p.getName() %> <%=  p.getSurname() %></h2>
		<b>Rasa:</b> <%=  p.getSubrace() %> <%=  p.getRace() %>
		<b>Charakter:</b>  <%=  p.getCharacter() %><br/>
		<hr/>
		<p>
		Szybkość: milion<br/>
		Klasa pancerza: pierwsza! <br/>
		Punkty wytrzymałości: niewiele<br/>
		<hr/>
		
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
		Umiejętności: <%=  p.getSkill() %><br/>
		Płeć: <%=  p.getSex() %><br/>
		</p>
		</div>
		<div class="inbox2">	
		Osobowość: <%=  p.getPersonality() %><br/>
		<hr/>
		Wygląd: <%=  p.getApperance() %>
		</div>
	</div>
</body>
</html>