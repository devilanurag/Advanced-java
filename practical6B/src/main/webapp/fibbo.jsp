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
	
	int i=1,f1=0,f2=1,f3;
	while(i<=n)
	{
	  out.println(f1);
	  f3=f1+f2;
	  f1=f2;
	  f2=f3;
	  i=i+1; 
	}


	//out.println("<h1>Fibbonacci series of given no is: ="+fact+"</h1>");
%>

</body>
</html>