<%-- 
    Document   : ChuyenTien
    Created on : Dec 10, 2021, 3:03:47 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chuyển tiền</title>
    </head>
    <body>
        <a href="TrangChu.jsp" style="font-size: 25px">Quay về trang chủ</a>
        <br>
        <a href="DangXuat" style="font-size: 25px">Đăng xuất</a>
        <h1 align="center" style="font-family: monospace;color: coral;">Chuyển tiền</h1>
        <h2 align="center" style="font-family: monospace;color: blue;">Số tài khoản: ${sessionScope.tk.getSoTaiKhoan()}</h2>
        <h2 align="center" style="font-family: monospace;color: blue;">Tên tài khoản: ${sessionScope.tk.getHoten()}</h2>
        <div align="center">
            <form action="KiemTra" method="POST"
                  style="border: 1px solid;width: 500px;padding: 25px;font-size: 25px; display: flex; flex-direction: column; justify-content: flex-start">
                    <div style="text-align: left;color: blue;">Nhập số tài khoản nhận:</div>
                    <input type="text" name="sotaikhoannhan" style="font-size: inherit;text-align: left" required="">
                    
                    <input type="submit" value="Kiểm tra" name="butKiemTra" style="font-size: inherit;color: blue;">
                    <div style="color: red; margin-top: 15px">${mes1}</div>
            </form>
        </div>
        <div align="center">
            <form action="ChuyenTien" method="POST"
                  style="border: 1px solid;width: 500px;padding: 25px;font-size: 25px; display: flex; flex-direction: column; justify-content: flex-start">
                <input type="number" name="sotaikhoannhan1" value="${stknhan}" style="font-size: inherit;text-align: right" required="">
                    <div style="text-align: left;color: blue;">Nhập số tiền chuyển: (VNĐ)</div>
                    <input type="number" name="sotienchuyen" style="font-size: inherit;text-align: right" required="">
                    <div style="text-align: left; margin-top: 10px;color: blue;">Nhập mật khẩu:</div>
                    <input type="password" name="matkhau" style="font-size: inherit;" required=""><br>
                    <div style="text-align: left; margin-top: 10px;color: blue;">Nhập lý do:</div>
                    <input type="text" name="lydo" style="font-size: inherit;" required=""><br>
                    <input type="submit" value="Chuyển tiền" name="butRutTien" style="font-size: inherit;color: blue;">
                    <div style="color: red; margin-top: 15px">${mes}</div>
            </form>
        </div>
    </body>
</html>
