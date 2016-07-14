<%-- 
    Document   : hola
    Created on : 24/06/2016, 08:07:08 PM
    Author     : vacax
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo....</h1>
        <%
            //codigo interpretado en el servidor...
            String nombre = request.getParameter("nombre");
            if( nombre !=null){
                out.print("Recibiendo el nombre: "+nombre);
            }
        %>
    </body>
</html>
