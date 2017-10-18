<%-- 
    Document   : salida
    Created on : 12-oct-2017, 20:14:26
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
            for (int i =0; i < Integer.parseInt(request.getAttribute("valor_total").toString()) ; i++) {
        %>
        <form>
            <div>
                <label for="final">Resultado</label>
                <input type="text" name="final" placeholder=i id="final" required/>
            </div>
        </form>
        <% 
            }
        %>
    </body>
</html>