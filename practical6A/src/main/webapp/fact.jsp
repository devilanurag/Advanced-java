<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int n=Integer.parseInt(request.getParameter("number"));
	
	
	int fact = 1, i;
	for (i=2; i<=n; i++){
	 fact *= i;
	}


	out.println("<h1>factorial of given no is: ="+fact+"</h1>");
%>

</body>
</html>