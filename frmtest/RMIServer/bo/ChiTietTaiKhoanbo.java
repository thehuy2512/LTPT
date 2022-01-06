/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.ChiTietTaiKhoanbean;
import dao.ChiTietTaiKhoandao;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ChiTietTaiKhoanbo {
    ChiTietTaiKhoandao cttkd = new ChiTietTaiKhoandao();
//    public ArrayList<ChiTietTaiKhoanbean> getChiTietTaiKhoan(){
//        return cttkd.getChiTietTaiKhoan();
//    }
    public ArrayList<ChiTietTaiKhoanbean> getLichSuTaiKhoan(String SoTaiKhoan) throws Exception{
       
        return cttkd.getLichSuGiaoDichbySTK(SoTaiKhoan);
    }
    public boolean insertRutTien(String stk,long sotienrut) throws Exception{
        return cttkd.insertRutTien(stk, sotienrut);
    }
    public boolean insertChuyenTien(String stk,long sotienrut,String ghichu) throws Exception{
        return cttkd.insertChuyenTien(stk, sotienrut, ghichu);
    }
}
