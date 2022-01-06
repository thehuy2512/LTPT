<%-- 
    Document   : XemLichSu
    Created on : Dec 10, 2021, 10:37:43 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lịch sử</title>
    </head>
    <body>
        <a href="TrangChu.jsp" style="font-size: 25px">Quay về trang chủ</a>
        <br>
        <a href="DangXuat" style="font-size: 25px">Đăng xuất</a>
        <h1 align="center" style="font-family: monospace;color: coral;">Xem lịch sử</h1>
        <h2 align="center" style="font-family: monospace;color: blue;">Số tài khoản: ${sessionScope.tk.getSoTaiKhoan()}</h2>
        <h2 align="center" style="font-family: monospace;color: blue;">Tên tài khoản: ${sessionScope.tk.getHoten()}</h2>
        <table border="1" width=100%>
            <thead style="background-color: pink;text-align: center;">
                <tr>
                    <td width="10px" height="50px" style="font-weight: bold; text-align: center; color: blue">STT</td>
                    <td width="300px" height="50px" style="font-weight: bold; text-align: center; color: blue">Ngày rút tiền</td>
                    <td width="300px" height="50px" style="font-weight: bold; text-align: center; color: blue">Số tiền rút ra (VNĐ)</td>
                    <td width="600px" height="50px" style="font-weight: bold; text-align: center; color: blue">Ghi chú</td>
                </tr>
            </thead>
            <tbody>
                <c:set var="stt" value="${1}"/>
                <c:forEach items="${dsls}" var="s">
                    <tr>
                        <td width="10px" height="50px" style="font-weight: bold; text-align: center;">${stt}</td>
                        <td width="300px" height="50px" style="font-weight: bold; text-align: center;">${s.getNgayRutTien()}</td>
                        <td width="300px" height="50px" style="font-weight: bold; text-align: center;">${s.getSoTienRutRa()}</td>
                        <td width="600px" height="50px" style="font-weight: bold; text-align: left;padding-left: 20px">${s.getGhiChu()}</td>
                    </tr>
                <c:set var="stt" value="${stt+1}"/>   
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
