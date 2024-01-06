<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Add Movie</h2>
	
	<form action="savemovie" method="post" enctype="multipart/form-data">
		movieid<input type="text" name="movieid"><br>
		moviename<input type="text" name="moviename"><br>
		movieprice<input type="text" name="movieprice"><br>
		movierating<input type="text" name="movierating"><br>
		moviegenre<input type="text" name="moviegenre"><br>
		movielanguage<input type="text" name="movielanguage"><br>
		movieimage<input type="file" name="movieimage"><br>
		<input type="submit">
	</form>
	
	
	
	
	
	
</body>
</html>