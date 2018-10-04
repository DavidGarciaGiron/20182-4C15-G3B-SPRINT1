<%-- 
    Document   : Login
    Created on : 02-oct-2018, 6:43:42
    Author     : DIEGO
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilo_2.css">
<link rel="stylesheet" href="css/animate.css">
 <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<title>Registro Cliente</title>
<script>
function validate()
{
var fullname = document.form.fullname.value;
var email = document.form.email.value;
var username = document.form.username.value;
var password = document.form.password.value;
var conpassword= document.form.conpassword.value;
if (fullname==null || fullname=="")
{
alert("Full Name can't be blank");
return false;
}
else if (email==null || email=="")
{
alert("Email can't be blank");
return false;
}
else if (username==null || username=="")
{
alert("Username can't be blank");
return false;
}
else if(password.length<6)
{
alert("Password must be at least 6 characters long.");
return false;
}
else if (password!=conpassword)
{
alert("Confirm Password should match with the Password");
return false;
}
}
</script>

</head>
    <body>
    <header>
        <h1>BlockChain y Transporte</h1>
        
    </header>
        <div id="contenedor">
        <div id="descripcion">
            <center>
            <div id="formulario">
            <h2>REGISTRO CLIENTE</h2>
            <hr>
            <br>
            <form name="form" action="RegistroServlet" method="post" onsubmit="return validate()">
<table align="center">
<tr>
    <td><label>Nombre Completo</label></td>
    <td><input type="text" name="fullname" class="form-control input1"/></td>
</tr>
<tr>
    <td><label>Correo Electronico</label></td>
    <td><input type="text" name="email" class="form-control input1"/></td>
</tr>
<tr>
    <td><label>Usuario:</label></td>
    <td><input type="text" name="username" class="form-control input1"/></td>
</tr>
<tr>
    <td><label>Contraseña</label></td>
    <td><input type="password" name="password" class="form-control input1"/></td>
</tr>
<tr>
    <td><label>Confirmar Contraseña</label></td>
    <td><input type="password" name="conpassword" class="form-control input1"/></td>
</tr>
<tr>
    <td><%=(request.getAttribute("errMessage") == null) ? ""
    : request.getAttribute("errMessage")%></td>
</tr>
<tr>
    <td colspan="2"><input type="submit" value="Register" class="btn btn1 btn-lg"></input><br><br>
           <a href="index.jsp" class="btn btn2 btn-lg">Volver</a><br><br>
</tr>
</table>
</form>                        </div>
        </center>
       <script src="js/jquery-3.3.1.min_1.js"></script>
        <script src="js/main.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>