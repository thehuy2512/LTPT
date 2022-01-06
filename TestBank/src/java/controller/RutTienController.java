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
@WebServlet(name = "RutTienController", urlPatterns = {"/RutTien"})
public class RutTienController extends HttpServlet {

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
        HttpSession session = request.getSession();
        String matkhau = request.getParameter("matkhau");
        TaiKhoanbean tk1 = (TaiKhoanbean) session.getAttribute("tk");
        
        if (tk1==null)
            response.sendRedirect("Login");
        else{
            if(tk1.getMatKhau().equals(matkhau))
            {
                
                long tienrut = Long.parseLong(request.getParameter("sotienrut"));
                if(tienrut>0){
                    long tienhientai= getTaiKhoan(tk1.getSoTaiKhoan()).getSoTien();
                    if(tienrut<=tienhientai){
                        long sodu = tienhientai - tienrut;
                        if(sodu>50000) {
                            String ghichu="Rút tiền";
                            if(updateSodu(tk1.getSoTaiKhoan(), sodu)&&insertChuyenTien(tk1.getSoTaiKhoan(), -tienrut, ghichu)){
                                request.setAttribute("mes", "Rút thành công!");
                                RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                                rd.forward(request, response); 
                            }else{
                                request.setAttribute("mes", "Lỗi csdl!");
                                RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                                rd.forward(request, response); 
                            }
                        }else{
                            request.setAttribute("mes", "Rút quá hạn mức!");
                            RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                            rd.forward(request, response); 
                        }
                    }else{
                        request.setAttribute("mes", "Số tiền rút lớn hơn số dư!");
                        RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                        rd.forward(request, response); 
                    }
                }
                else{
                    request.setAttribute("mes", "Số tiền rút không âm!");
                    RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                    rd.forward(request, response);  
                }
            }
            else{
                request.setAttribute("mes", "Mật khẩu không đúng!");
                RequestDispatcher rd = request.getRequestDispatcher("RutTien.jsp");
                rd.forward(request, response);
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

    private static Boolean insertRutTien(java.lang.String soTaiKhoan, long soTienRut) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.insertRutTien(soTaiKhoan, soTienRut);
    }

    private static Boolean updateSodu(java.lang.String soTaiKhoan, long soTien) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.updateSodu(soTaiKhoan, soTien);
    }

    private static Boolean insertChuyenTien(java.lang.String soTaiKhoan, long soTienRut, java.lang.String ghiChu) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.insertChuyenTien(soTaiKhoan, soTienRut, ghiChu);
    }

}
