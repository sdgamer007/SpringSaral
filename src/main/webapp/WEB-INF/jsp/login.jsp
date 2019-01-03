<html>

<head>
<title>First Web Application</title>

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Saral Reporting Login Page</title>
		<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/md5.min.js"></script> --%>
		<script type="text/javascript" src="http://www.myersdaily.org/joseph/javascript/md5.js"></script>
		<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
		<script type="text/javascript">
	        MyFunction = function(){
	        	 var passwrd = $("#pass").val();
	        	 var newpass = md5(passwrd);
	        	 $("#pass").val(newpass);
	        }
	        </script>
</head>

<body>
	
	<form method="post">
		<font color="red">${nameErrorMessage}</font>
		Name : <input type="text" name="signNo" />
		<font color="red">${passwordErrorMessage}</font>
		Password : <input type="password"  id="pass" name="password" /> 
		<font color="red">${errorMessage}</font>
		<input type="submit" value="Login" onclick="javascript:MyFunction()"/>
	</form>
</body>

</html>