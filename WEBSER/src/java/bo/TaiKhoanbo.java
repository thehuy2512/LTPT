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
    //TaiKhoandao tk = new TaiKhoandao();
    //public TaiKhoan KtDn(String un, String pass) throws Exception{
     //      for(TaiKhoan tk: tkd.getTaiKhoan())
     //          if(tk.getTendn().equals(un)&&tk.getPass().equals(pass))
     //             return tk;
     //     return null;
    //}  
    TaiKhoandao tkd= new TaiKhoandao();
    public TaiKhoanbean getTaiKhoan(String stk) throws Exception{
        return tkd.getTaiKhoan(stk);
    }
    public TaiKhoanbean ktdn(String SoTaiKhoan,String MatKhau) throws Exception{  
        return tkd.ktdn(SoTaiKhoan, MatKhau);
    }
    public boolean updateSodu(String SoTaiKhoan,long sotien) throws Exception{
        return tkd.updateSodu(SoTaiKhoan, sotien);
    }    
    
}
