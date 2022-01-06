/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dichvu.TaiKhoanbean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
@WebServlet(name = "ChuyenTienController", urlPatterns = {"/ChuyenTien"})
public class ChuyenTienController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        
        if (session.getAttribute("tk")==null){
            response.sendRedirect("Login");
        }
        else{
            
            if(request.getParameter("sotaikhoannhan1")==null){
               request.setAttribute("mes", "Chưa nhận tài khoản nhận!");
               RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
               rd.forward(request, response); 
            }
            else{
                 TaiKhoanbean tk1 = (TaiKhoanbean) session.getAttribute("tk");
                 if(tk1.getMatKhau().equals(request.getParameter("matkhau"))){
                    long sotienchuyen = Long.parseLong(request.getParameter("sotienchuyen"));
                    if (sotienchuyen>0){
                        long tienhientai = getTaiKhoan(tk1.getSoTaiKhoan()).getSoTien();
                        if(tienhientai>=sotienchuyen){
                            long sodu1 = tienhientai-sotienchuyen;
                            if(sodu1>50000){
                                
                                String tknhan= request.getParameter("sotaikhoannhan1");
                                String lydo=request.getParameter("lydo");
                                String ghichu1="Chuyển tiền đến :"+tknhan;
                                String ghichu2="Nhận tiền từ:"+tk1.getSoTaiKhoan()+" Lý do:"+lydo;
                                
                                long tienhientai2 = Long.parseLong(getTaiKhoan(tknhan).getSoTien().toString());
                                long sodu2 = tienhientai2 + sotienchuyen;
                                if(updateSodu(tk1.getSoTaiKhoan(),sodu1)&& insertChuyenTien(tk1.getSoTaiKhoan(), -sotienchuyen, ghichu1)
                                     && updateSodu(tknhan, sodu2) && insertChuyenTien(tknhan, +sotienchuyen, ghichu2)){
                                    request.setAttribute("mes", "Chuyển tiền thành công!");
                                    RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                                    rd.forward(request, response);
                                }
                                else{
                                      request.setAttribute("mes", "lỗi csdl!");
                                      RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                                      rd.forward(request, response);
                                        }
                                        
                            }
                            else{
                               request.setAttribute("mes", "Chuyển quá hạn mức!");
                               RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                               rd.forward(request, response);   
                            }
                        }else{
                            request.setAttribute("mes", "Số tiền chuyển hơn số dư!");
                            RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                            rd.forward(request, response);    
                        }
                    }
                    else{
                        request.setAttribute("mes", "Số tiền không âm!");
                        RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                        rd.forward(request, response); 
                    }
                        
                 }
                 else{
                    request.setAttribute("mes", "Mật khẩu không đúng!");
                    RequestDispatcher rd = request.getRequestDispatcher("ChuyenTien.jsp");
                    rd.forward(request, response);  
                 }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static TaiKhoanbean getTaiKhoan(java.lang.String soTaiKhoan) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.getTaiKhoan(soTaiKhoan);
    }

    private static Boolean insertChuyenTien(java.lang.String soTaiKhoan, long soTienRut, java.lang.String ghiChu) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.insertChuyenTien(soTaiKhoan, soTienRut, ghiChu);
    }

    private static Boolean updateSodu(java.lang.String soTaiKhoan, long soTien) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.updateSodu(soTaiKhoan, soTien);
    }

}
