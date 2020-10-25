<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="Design.css">
<link rel="stylesheet" href="form.css">
<title>Statement Success</title>
</head>
<body>


<div class="header">
  <h1>ABC Bank</h1>
  <p>Grow with Us...</p>
</div>


<div class="topnav">
  <a href="Home.html" style="float:right">Home</a>
  <a href="Logout" style="float:right">Logout</a>
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
      <h2 style="color: chocolate;">VIEW STATEMENT...</h2>
      <h5>Your Account Balance statement is below.</h5>
      
      <%
		session = request.getSession();
		out.println("From account number 	:	" + session.getAttribute("sal"));
		out.println("<br>");
		out.println("To account numbers 		:	" + session.getAttribute("ral"));
		out.println("<br>");
		out.println("Amount Transfered is 	:	" + session.getAttribute("al") + " in rupees.");
		
	
	
	%>
    </div>    
  </div>  
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<div class="footer">
  <h3>&copy Copy Rights Reserved</h3>
</div>
	

	

</body>
</html>