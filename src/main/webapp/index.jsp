<%-- 
    Document   : index
    Created on : 2015-11-11, 14:21:53
    Author     : Maxim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Caesar Cipher Challenge</title>
    </head>
    <body>
        <h1>Caesar Cipher Challenge</h1>
        <form action="./index">
            <input name="intValue" type="text" placeholder="Saisir la clé" value="<%= (String) (request.getParameter("intValue") != null ? request.getParameter("intValue") : "")%>"/>
            <br />
            <label></label>

            <textarea name="txtValue" type="text" ><%= (String) (request.getParameter("txtValue") != null ? request.getParameter("txtValue") : "Text à <<enchiper>>")%>
            </textarea>
             <br />
            <button>Encipher</button>

        </form>
        <textarea><%= (String) (request.getAttribute("encipher") != null ? request.getAttribute("encipher") : "")%></textarea>
    </body>
</html>
