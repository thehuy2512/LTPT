/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bean.ChiTietTaiKhoanbean;
import bean.TaiKhoanbean;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public interface IBank extends Remote{
    public ArrayList<TaiKhoanbean> getTaiKhoan(String stk) throws Exception;
    public ArrayList<TaiKhoanbean> ktdn(String SoTaiKhoan,String MatKhau) throws Exception;
    public boolean updateSodu(String SoTaiKhoan,long sotien) throws Exception;
    
    public ArrayList<ChiTietTaiKhoanbean> getLichSuTaiKhoan(String SoTaiKhoan) throws Exception;
    public boolean insertRutTien(String stk,long sotienrut) throws Exception;
    public boolean insertChuyenTien(String stk,long sotienrut,String ghichu) throws Exception;
}
