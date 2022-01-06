<%-- 
    Document   : Login
    Created on : Dec 10, 2021, 12:19:07 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
    </head>
    <body>
        <h1 align="center" style="font-family: monospace;color: coral;">Đăng nhập hệ thống!</h1>
        <div align="center">
            <form  action="Login" method="POST"
                   style="border: 1px solid;width: 500px;padding: 25px;font-size: 25px; display: flex; flex-direction: column; justify-content: flex-start">
                
                <div style="text-align: left;color: blue;">Số tài khoản:</div>
                <input type="text" name="stk" style="font-size: inherit;" required="">
                <div style="text-align: left; margin-top: 10px;color: blue;">Mật khẩu:</div>
                <input type="password" name="mk" style="font-size: inherit;" required=""><br>
                <input type="submit" value="Log in" name="butLogin" style="font-size: inherit;color: blue;">
                <div style="color: red; margin-top: 15px">${mes}</div>
            </form>
        </div>
    </body>
</html>
