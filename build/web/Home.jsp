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
<link rel="stylesheet" href="css/estilo_3.css">
<link rel="stylesheet" href="css/animate.css">
 <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<title>Login Cliente</title>

</head>
    <body>
    <header>
        <h1>BlockChain y Transporte</h1>
        
    </header>
        <div id="contenedor">
        <div id="descripcion">
            <center>
            <div id="formulario">
            <h2>WELCOME APLICATIONS</h2>
            
            <hr>
            <label>Nombre Completo:
            <%=request.getAttribute("userName") %></label>
            <div style="text-align: right"><a href="LogoutServlet" class="btn btn1 btn-lg">Logout</a></div>
            <br>
           
                        </div>
        </center>
       <script src="js/jquery-3.3.1.min_1.js"></script>
        <script src="js/main.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>