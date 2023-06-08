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
	int no1=Integer.parseInt(request.getParameter("number1"));
	int no2=Integer.parseInt(request.getParameter("number2"));
	int no3=Integer.parseInt(request.getParameter("number3"));
	
	int sum = no1+no2+no3;
	double avg = sum/3;
	out.println("<h1>- Sum of number is ="+sum+"</h1>");
	
	out.println("<h1>Average of number ="+avg+"</h1>");
%>
</body>
</html>