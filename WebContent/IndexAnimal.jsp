<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IndexAnimal</title>
</head>
<body>
<h2>Choose an animal you like most:</h2>
<br/>
<form action ="<%= request.getContextPath() %>/animalServlet" method="post">
	<input type="radio" name="animal" value="cat"> cat<br>
	<input type="radio" name="animal" value="dog"> dog<br>
	<input type="radio" name="animal" value="hamster"> hamster<br>
	<input type="radio" name="animal" value="parrot"> parrot<br>
	<br/>
	<input type="submit" value="submit">
</form>
</body>
</html>