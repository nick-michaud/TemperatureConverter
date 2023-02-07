<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
	<h1> Temperature Converter</h1>
	<form action = "getTemperatureServlet" method ="post">
	Enter a temperature (in fahrenheit):
	<input type = "text" name ="userTemp" size ="10">
	<input type = "submit" value = "Calculate Temp" />
	</form>
</body>
</html>