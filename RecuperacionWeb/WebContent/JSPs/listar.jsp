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
<div class="container col-lg-3">
 <form action="/CompanioniHelen/CreacionLista" style="padding: 30px;margin-top:20px;">
   <div class="form-group">
     <h1 style="color:black;font-family: verdana;text-align:center;border: 1px solid black;">Listar</h1>
    </div>
    
     <div class="form-group">
    <label >Opciones:</label><select name="op" id="op"> <option value="porNumeroTarjeta">Buscar por numero tarjeta</option><option value="porNombreComida">Buscar por nombre Comida</option></select>
	<input class="form-control" type="text" name="caja"   required>
	</div> 
	<input  class="btn btn-info btn-block" type="submit" value="Enviar">
</form>

<div id="divTablas" class="container" >
	<br>
		<table id="tablax" class="table table-striped table-bordered">
			<thead>
				<th>CLiente</th>
				<th>Fecha</th>				
				<th>Total</th>
				
				
			</thead>
			<tbody>

				<c:forEach  items="${pedidos}" var="pedido">
				
					<tr>
						<td>${pedido.cliente}</td>
						<td>${pedido.fecha}</td>
						<td>${pedido.total}</td>
					</tr>
				
				</c:forEach>

				
			</tbody>
		</table>
	</div>




</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>