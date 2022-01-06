/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.TaiKhoanbean;
import dao.TaiKhoandao;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class TaiKhoanbo {
    TaiKhoandao tkd= new TaiKhoandao();
    public ArrayList<TaiKhoanbean> getTaiKhoan(String stk) throws Exception{
        return tkd.getTaiKhoan(stk);
    }
    public ArrayList<TaiKhoanbean> ktdn(String SoTaiKhoan,String MatKhau) throws Exception{  
        return tkd.ktdn(SoTaiKhoan, MatKhau);
    }
    public boolean updateSodu(String SoTaiKhoan,long sotien) throws Exception{
        return tkd.updateSodu(SoTaiKhoan, sotien);
    }
}
