<%-- 
    Document   : RutTien
    Created on : Dec 10, 2021, 2:00:40 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rút tiền</title>
    </head>
    <body>
        <a href="TrangChu.jsp" style="font-size: 25px">Quay về trang chủ</a>
        <br>
        <a href="DangXuat" style="font-size: 25px">Đăng xuất</a>
        <h1 align="center" style="font-family: monospace;color: coral;">Rút tiền</h1>
        <h2 align="center" style="font-family: monospace;color: blue;">Số tài khoản: ${sessionScope.tk.getSoTaiKhoan()}</h2>
        <h2 align="center" style="font-family: monospace;color: blue;">Tên tài khoản: ${sessionScope.tk.getHoten()}</h2>
        <div align="center">
            <form action="RutTien" method="POST"
                  style="border: 1px solid;width: 500px;padding: 25px;font-size: 25px; display: flex; flex-direction: column; justify-content: flex-start">
                    <div style="text-align: left;color: blue;">Nhập số tiền rút: (VNĐ)</div>
                    <input type="number" name="sotienrut" style="font-size: inherit;text-align: right"" required="">
                    <div style="text-align: left; margin-top: 10px;color: blue;">Nhập mật khẩu:</div>
                    <input type="password" name="matkhau" style="font-size: inherit;" required=""><br>
                    <input type="submit" value="Rút tiền" name="butRutTien" style="font-size: inherit;color: blue;">
                    <div style="color: red; margin-top: 15px">${mes}</div>
            </form>
        </div>
    </body>
</html>
