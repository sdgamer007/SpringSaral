<html>

<head>
<title>First Web Application</title>
</head>

<body>
	
	<form method="post">
		<font color="red">${nameErrorMessage}</font>
		Name : <input type="text" name="name" />
		<font color="red">${passwordErrorMessage}</font>
		Password : <input type="password" name="password" /> 
		<font color="red">${errorMessage}</font>
		<input type="submit" />
	</form>
</body>

</html>