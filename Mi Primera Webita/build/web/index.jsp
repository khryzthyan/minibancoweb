<%-- 7
    Document   : index
    Created on : 11-oct-2017, 19:08:21
    Author     : Capacitaciones_pc30
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
       <!-- <% 
          /*  String nombre = "Mi Primera Webita";
                int numero = 3;
                Date fechaActual = new Date();
                            
               for (int i =0; i < 10; i++) {}*/
               
        %>-->
        <div>
            <form action="segundon.jsp" method="GET">
                <div>
                    <label>Nombre</label>
                    <input type="text" value="" name="nombre" placeholder="Nombre"/>
                </div>
                <div>
                    <label>Correo</label>
                    <input type="text" value="" name="correo" placeholder="Correo"/>
                </div>
                <div>
                    <button>Aceptar</button>
                </div>
            </form>
        </div>
    </body>
</html>
