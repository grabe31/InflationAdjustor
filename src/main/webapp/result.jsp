<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<p>This movie would need to sell ${userResult.getTicketCount()} tickets <br />
in ${userResult.getYear() } when tickets cost $${userResult.getTicketPrice() } <br>
to make that same amount as it did when in the year it was released.
</p>
<a href="index.jsp">Adjust another movie's box office</a>
</body>
</html>
