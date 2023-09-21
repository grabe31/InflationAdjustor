<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Box Office Inflation Adjustor</title>
</head>
<body>
<h1>Box Office Inflation Adjustor</h1>
Enter the Box Office Gross for a movie.  Then enter a year of release to see an <br>
approximately how many tickets the movie would need to sell to make the same amount of money.
<br>
<br>
<form action="getUserDataServlet" method="post">
Enter the Box Office Gross for a movie.&#160&#160&#160
<input type="text" name="userGross" size="10"> <i>(No Commas)</i>
<br>
Enter the year you would like to adjust to.  
<input type="text" name="userYear" size="10">
<input type="submit" value="Calculate Box Office" />
</form>
<br>
<hr>
<br>
<br>
<a href = "https://en.wikipedia.org/wiki/List_of_highest-grossing_films" target="_blank">
Find Historical Box Office Data Here</a>
</body>
</html>