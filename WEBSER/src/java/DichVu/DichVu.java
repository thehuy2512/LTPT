/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DichVu;

import bean.ChiTietTaiKhoanbean;
import bean.TaiKhoanbean;
import bo.ChiTietTaiKhoanbo;
import bo.TaiKhoanbo;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dell
 */
@WebService(serviceName = "DichVu")
public class DichVu {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "ktdn")
    public TaiKhoanbean ktdn(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan,@WebParam(name = "MatKhau")  String MatKhau) {
        try {
            TaiKhoanbo tkbo = new TaiKhoanbo();
            return tkbo.ktdn(SoTaiKhoan, MatKhau);
        } catch (Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "getTaiKhoan")
    public TaiKhoanbean getTaiKhoan(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan) {
        try {
            TaiKhoanbo tkbo = new TaiKhoanbo();
            return tkbo.getTaiKhoan(SoTaiKhoan);
        } catch (Exception e) {
            return null;
        }
    }
    @WebMethod(operationName = "updateSodu")
    public Boolean updateSodu(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan,@WebParam(name = "SoTien")  long SoTien) {
        try {
            TaiKhoanbo tkbo = new TaiKhoanbo();
            return tkbo.updateSodu(SoTaiKhoan, SoTien);
        } catch (Exception e) {
            return false;
        }
    }
    @WebMethod(operationName = "getLichSuTaiKhoan")
    public ArrayList<ChiTietTaiKhoanbean> getLichSuTaiKhoan(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan) {
        try {
            ChiTietTaiKhoanbo cttkbo = new ChiTietTaiKhoanbo();
            return cttkbo.getLichSuTaiKhoan(SoTaiKhoan);
        } catch (Exception e) {
            return null;
        }
    }
    @WebMethod(operationName = "insertRutTien")
    public Boolean insertRutTien(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan,@WebParam(name = "SoTienRut")  long  SoTienRut) {
        try {
            ChiTietTaiKhoanbo cttkbo = new ChiTietTaiKhoanbo();
            return cttkbo.insertRutTien(SoTaiKhoan, SoTienRut);
        } catch (Exception e) {
            return null;
        }
    }
    @WebMethod(operationName = "insertChuyenTien")
    public Boolean insertChuyenTien(@WebParam(name = "SoTaiKhoan")  String SoTaiKhoan,@WebParam(name = "SoTienRut")  long  SoTienRut,@WebParam(name = "GhiChu")  String  GhiChu) {
        try {
            ChiTietTaiKhoanbo cttkbo = new ChiTietTaiKhoanbo();
            return cttkbo.insertChuyenTien(SoTaiKhoan, SoTienRut, GhiChu);
        } catch (Exception e) {
            return null;
        }
    }
}
