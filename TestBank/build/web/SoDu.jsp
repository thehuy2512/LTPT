<%-- 
    Document   : SoDu
    Created on : Dec 10, 2021, 1:29:38 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Số dư</title>
    </head>
    <body>
        <a href="TrangChu.jsp" style="font-size: 25px">Quay về trang chủ</a>
        <br>
        <a href="DangXuat" style="font-size: 25px">Đăng xuất</a>
        <h1 align="center" style="font-family: monospace;color: coral;">Số dư</h1>
        <h2 align="center" style="font-family: monospace;color: blue;">Số tài khoản: ${sessionScope.tk.getSoTaiKhoan()}</h2>
        <h2 align="center" style="font-family: monospace;color: blue;">Tên tài khoản: ${sessionScope.tk.getHoten()}</h2>
        <h2 align="center" style="font-family: monospace;color: black;">Số dư tài khoản: ${sessionScope.tk.getSoTien()} VNĐ</h2>
    </body>
</html>
