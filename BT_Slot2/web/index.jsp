<%-- 
    Document   : index
    Created on : Jan 16, 2026, 3:49:27 PM
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
        <h1>Register</h1>
        <form method="POST" action="process">
            Username: <input type="text" name="name" value="" /><br>
            Password: <input type="password" name="pass" value="" /><br>
            Confirm Password: <input type="password" name="confPass" value="" /><br>
            <input type="submit" value="Done" /><br>
            <% 
                String error = (String) request.getAttribute("Error");
                if(error != null && error.length()>0){%>
                    <%= error%>
                <%}else{
                    error = null;
                }
            %>
            
            
        </form>
    </body>
</html>
