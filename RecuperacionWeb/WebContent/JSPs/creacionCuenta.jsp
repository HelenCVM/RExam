<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link href="/css/estilos.css" rel="stylesheet" type="text/css" />
</head>
<body style="background-color:powderblue;">
<c:set var="usuario" value="${requestScope['pedido']}"/>
<div class="container col-lg-3">
 <form action="/CompanioniHelen/CreacionPedido" style="padding: 30px;margin-top:20px;">
   <div class="form-group">
     <h1 style="color:black;font-family: verdana;text-align:center;border: 1px solid black;">Realizar Pedido</h1>
    </div>
    
    <div class="form-group">
    <div class="form-group">
    <label >Cliente:</label>
	<input class="form-control" type="text" name="cliente"  value="${pedido.cliente}"   >
	</div>
	
	 <div class="form-group">
	<label >Observaciones:</label>
    <input class="form-control" type="text" name="observaciones"  value="${pedido.observaciones}" >
     </div>

    <div class="form-group">
     <h1 style="color:black;font-family: verdana;text-align:center;border: 1px solid black;">Ingresar Tarjeta Credito</h1>
    </div>
    
    <div class="form-group">
    <label >Numero de tarjeta:</label>
    <input class="form-control" type="text" minlength="10" maxlength="10" name="numero"  required>
    </div>
    

   <div class="form-group">
     <h1 style="color:black;font-family: verdana;text-align:center;border: 1px solid black;">Ingresar Comida</h1>
    </div>
    
    <div class="form-group">
    <label >Nombre:</label>
    <input class="form-control" type="text" minlength="10" maxlength="10" name="nombre"  required>
    </div>
    
    <div class="form-group">
    <label >Precio Unitario:</label>
	<input class="form-control" type="text" name="precio"   required>
	</div>
	
	
   
    <div class="form-group">
    <label >¿Deseas finalizar la compra?</label>
     <label >SI:</label><input type="radio" id="si" name="opcion" value="si">
      <label >NO:</label><input type="radio" id="no" name="opcion" value="no">
    </div>
	
	<input  class="btn btn-info btn-block" type="submit" value="Enviar">

</form>


</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>