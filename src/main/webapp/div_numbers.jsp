<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Divide Numbers</title>
</head>
<body>

<form action="div" method="post">
<h2> Add the numbers here!!!!!</h2>
Number 1<input type="text" name="num1"/>
Number 2<input type="text" name="num2"/>
<input type="submit" value="Div_Numbers"/>

<%
if(request.getAttribute("res")!=null){
	out.println(request.getAttribute("res"));
}

%>
<%
if(request.getAttribute("resul")!=null){
	out.println(request.getAttribute("resul"));
}

%>



</form>
</body>
</html>