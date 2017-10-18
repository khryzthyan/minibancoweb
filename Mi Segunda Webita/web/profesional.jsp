<%-- 
    Document   : profesional
    Created on : 12-oct-2017, 19:47:37
    Author     : Capacitaciones_pc30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- Se realiza la apretura de las sesiones --%>
        <h2>Informacion actual del usuario</h2>
        <p>${sessionScope.correo}</p>
        <p>${sessionScope.contrasena}</p>
        <p>${sessionScope.documento}</p>
        <p>${sessionScope.telefono}</p>
        <p>${sessionScope.direccion}</p>
        <p>${sessionScope.edad}</p>
    </body>
</html>
