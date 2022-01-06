<%-- 
    Document   : TrangChu
    Created on : Dec 10, 2021, 12:26:49 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <h1 align="center" style="font-family: monospace;color: coral;">Dịch vụ</h1>
        <h2 align="center" style="font-family: monospace;color: blue;">Số tài khoản: ${sessionScope.tk.getSoTaiKhoan()}</h2>
        <h2 align="center" style="font-family: monospace;color: blue;">Tên tài khoản: ${sessionScope.tk.getHoten()}</h2>
        <div align="center">
            <div align="center" style="border: 1px solid;padding: 20px;width: 500px;font-size: 25px">
                <a href="SoDu?stk=${sessionScope.tk.getSoTaiKhoan()}">Số dư</a>
                <br>
            </div>
            <div align="center" style="border: 1px solid;padding: 20px;width: 500px;font-size: 25px">
                <a href="RutTien.jsp">Rút tiền</a>
                <br>
            </div>
            <div align="center" style="border: 1px solid;padding: 20px;width: 500px;font-size: 25px">
                <a href="ChuyenTien.jsp">Chuyển tiền</a>
                <br>
            </div>
            <div align="center" style="border: 1px solid;padding: 20px;width: 500px;font-size: 25px">
                <a href="XemLichSu">Xem lịch sử</a>
                <br>
            </div>
            <div align="center" style="border: 1px solid;padding: 20px;width: 500px;font-size: 25px">
                <a href="DangXuat">Đăng xuất</a>
                <br>
            </div>
        </div>
    </body>
</html>
