<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login-Project2</title>
</head>
<body bgcolor="green">
<div>
	<div background-color="aqua">	
	<h1>
	Hello world!  
	</h1>
	</div>
	<div align="center"><img src="http://blog.karachicorner.com/wp-content/uploads/2012/07/timeline-covers/fb-cover-image-3.jpg"></div>
</div>
<!-- <P>  The time on the server is ${serverTime}. </P> -->
<div align="center" >
<form action="home" name="home" id="form" method="get" style="border:2px sloid black" >
	<div style="background-color:white;border:2px solid black;width:250px;height:120px;" align="left">
		<b>password:</b><input type="password" id="password" value="enter password" name="password"></input>
		<br></br>
		<b>email-id:&nbsp;&nbsp;</b><input type="text" id="email" value="enter e-mail" name="emailid" ></input>
		<br></br>
		
		<input type="submit" value="SUBMIT" class="btn" />
	</div>
</div>
</form>

</body>
</html>
