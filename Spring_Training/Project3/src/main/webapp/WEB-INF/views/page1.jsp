<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Page1</title>
</head>
<body>
<h1>
	This is page 1 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div align="center" >
	<form action="page2" name="page1" id="form" style="border:2px sloid black" method="post" >
	<div style="background-color:white;border:2px solid black;width:250px;height:120px;" align="left">
		<b>home-town:</b><input type="password" id="password" value="enter password" name="password"></input>
		<br></br>
		<b>papa:&nbsp;&nbsp;</b><input type="text" id="email" value="enter e-mail" name="emailid" ></input>
		<br></br>
		
		<input type="submit" value="SUBMIT" class="btn" />
	</div>
	<p>${HELLO}</p>
	</form>
	</div>
</body>
</html>
