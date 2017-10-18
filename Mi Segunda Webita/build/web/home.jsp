<%-- 
    Document   : home
    Created on : 12-oct-2017, 18:54:49
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
        <div>
        <%--    <h3>Correo: <%=request.getAttribute("correo_usuario")%></h3>  envio de datos cargados por memoria
        
        La siguiente etiqueta usa Request Dispatcher usando Expresion Languaje (EL)--%>
            <h3>Correo: ${correo_usuario}</h3>
        </div>
        <div>
        <%--    <h4>Contraseña: <%=request.getAttribute("contrasena_usuario")%></h4> --%>
            <h4>Contraseña: ${contrasena_usuario}</h4>
        </div>
        <div>
         <%--   <h5>Documento: <%=request.getAttribute("documento_usuario")%></h5> --%>
            <h5>Documento: ${documento_usuario}</h5>
        </div>
        <form action="rellenar" method="POST">
            <div>
                <label for="txtTelefono">Telefono</label>
                <input type="tel" name="telefono" id="txtTelefono" required/>
            </div><div>
                <label for="txtDireccion">Direccion</label>
                <input type="text" name="direccion" id="txtDireccion" required/>
            </div><div>
                <label for="txtEdad">Edad</label>
                <input type="number" name="edad" id="txtEdad" required/>
            </div>
            <input type="hidden" value="${correo_usuario}" name="correo"/>
            <input type="hidden" value="${contrasena_usuario}" name="contrasena"/>
            <input type="hidden" value="${edad_usuario}" name="edad"/>
            <div>
                <button type="submit">Enviar Información</button>
            </div>
        </form>
    </body>
</html>
