<%-- 
    Document   : segundon
    Created on : 11-oct-2017, 19:59:58
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
            <%
                //Obtener los valores enviados por el formulario
                String nombre = request.getParameter("nombre");
                String correo = request.getParameter("correo");
             if (nombre != null || correo != null) 
            {  
            %>
               <div>
                <h3><%="Hola "+nombre+"tu correo es "+correo%></h3>
            </div>
            <%}
            %>
    </body>
</html>
