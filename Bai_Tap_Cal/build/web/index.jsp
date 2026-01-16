<%-- 
    Document   : newjsp
    Created on : Jan 16, 2026, 5:41:47 PM
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
        <form method="POST" action="select">
            Nhap so 1: <input type="number" name="num1" value="" /><br>
            <br>
            Nhap so 2: <input type="number" name="num2" value="" /><br>
            <br>
            <select name="op">
                <option value="+">Cong</option>
                <option value="-">Tru</option>
                <option value="*">Nhan</option>
                <option value="/">Chia</option>
            </select><br>
            <br>
            <input type="submit" value="Tinh toan" />
        </form>
    </body>
</html>
