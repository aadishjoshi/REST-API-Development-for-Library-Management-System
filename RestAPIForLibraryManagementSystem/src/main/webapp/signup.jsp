<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>

<div style="padding-left:10px">
<form action="/Library_Management_System/MainServlet" method="post">

Email:<br/>
<input type="text" name="email"/>
<br/><br/>
Preferred UserName:<br/>
<input type="text" name="username"/>
<br/><br/>
Password:<br/>
<input type="password" name="password"/>
<br/><br/>
RePassword:<br/>
<input type="password" name="password"/>
<br/><br/>

<input type="Submit" value="signup"/>

</form>
</div>


</body>
</html>