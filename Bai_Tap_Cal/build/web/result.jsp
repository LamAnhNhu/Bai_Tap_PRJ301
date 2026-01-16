<%-- 
    Document   : result
    Created on : Jan 16, 2026, 6:34:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>KET QUA PHEP TOAN</h1>

    <h3>Number 1 = <%= request.getAttribute("num1") %></h3><br>
    
    <h3>Operator = <%= request.getAttribute("op") %></h3><br>
    
    <h3>Number 2 = <%= request.getAttribute("num2")%></h3><br>
    
    <h3>Result = <%= request.getAttribute("value") %></h3><br>
    
    <h3>Error = <%= request.getAttribute("error") %></h3><br>
    
        <h2><a href="index.jsp">Quay lại</a></h2>
    </body>
</html>
