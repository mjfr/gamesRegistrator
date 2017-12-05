<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a game</title>
</head>
<body>

	<h1>Add a game using the form below</h1>
	<form action="addGame" method="post">
		Game name: <input type="text" name="gameTitle"/><br/>
		Developer: <input type="text" name="developer"/><br/>
		Game Category: <input type="text" name="gameCategory"/><br/>
		Release Year: <input type="text" name="releaseYear"/><br/>
		<input type="submit" value="Submit"/>
	</form>
	
</body>
</html>