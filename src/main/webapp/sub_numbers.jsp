<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Numbers</title>
</head>
<body>

<form action="sub" method="post">
<h2> Add the numbers here!!!!!</h2>
Number 1<input type="text" name="num1"/>
Number 2<input type="text" name="num2"/>
<input type="submit" value="Sub_Numbers"/>


<%-- using scriplet tag to show the data which is coming from controller layer 

we use this code because as we run this page so on browser it also run the scriplet tag and that time it shows null value so via this it will not print the null value
--%>
<% 

if(request.getAttribute("res")!=null){   
	
out.println(request.getAttribute("res"));
}
%>


</form>
</body>
</html>