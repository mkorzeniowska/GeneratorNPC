<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rezultat operacji</title>
</head>
<body>
	<%
	Person p= (Person)request.getAttribute("person");
	%>
	
		
		<h2><%=  p.getAge() %> <%=  p.getName() %> <%=  p.getSurname() %></h2>
		<p>
		Płeć: <%=  p.getSex() %><br/>
		Rasa: <%=  p.getSubrace() %> <%=  p.getRace() %><br/>
		Charakter:  <%=  p.getCharacter() %><br/>
		Osobowość: <%=  p.getPersonality() %>
	</p>
	
		<table style="width:50%" border="1">
	<tr>
		<th>ID</th>
		<th>Siła</th>
		<th>Zręczność</th>
		<th>Kondycja</th>
		<th>Inteligencja</th>
		<th>Wiedza</th>
		<th>Charyzma</th>
	</tr>
	
	
	<tr>
			<td><%= p.getId() %></td>
			<td><%= p.getStrength() %></td>
			<td><%= p.getDexterity() %></td>
			<td><%= p.getConstitution() %></td>
			<td><%= p.getIntelligence() %></td>
			<td><%= p.getWisdom() %></td>
			<td><%= p.getCharisma() %></td>	
	</tr>
	
	</table>

</body>
</html>