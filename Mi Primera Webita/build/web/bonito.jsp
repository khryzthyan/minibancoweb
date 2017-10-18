<%-- 
    Document   : bonito
    Created on : 11-oct-2017, 20:09:47
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
        <form action="registrar" method="POST">
            <div>
                    <label for="txtNombre">Nombre</label>
                    <input type="text" name="txtNombre" placeholder="Nombre" id="txtNombre"/>
                </div>
                <div>
                    <label for="txtDireccion">Direccion</label>
                    <input type="text" value="" name="txtDireccion" placeholder="Direccion" id="txtDireccion"/>
                </div>
                <div>
                    <label for="txtTelefono">Telefono</label>
                    <input type="text" value="" name="txtTelefono" placeholder="Correo" id="txtTelefono"/>
                </div>
                <div>
                    <input type="submit" value="Aceptar">
                </div>
        </form>
    </body>
</html>
