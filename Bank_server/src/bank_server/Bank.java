/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_server;

import bean.ChiTietTaiKhoanbean;
import bean.TaiKhoanbean;
import bo.ChiTietTaiKhoanbo;
import bo.TaiKhoanbo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Bank extends UnicastRemoteObject implements IBank{
    private ChiTietTaiKhoanbo cttkbo;
    private TaiKhoanbo tkbo;
    public Bank() throws RemoteException{
        cttkbo = new ChiTietTaiKhoanbo();
        tkbo = new TaiKhoanbo();
    }
    
    @Override
    public ArrayList<TaiKhoanbean> getTaiKhoan(String stk) throws Exception {
        return tkbo.getTaiKhoan(stk);
    }

    @Override
    public ArrayList<TaiKhoanbean> ktdn(String SoTaiKhoan, String MatKhau) throws Exception {
        return tkbo.ktdn(SoTaiKhoan, MatKhau);
    }

    @Override
    public boolean updateSodu(String SoTaiKhoan, long sotien) throws Exception {
        return tkbo.updateSodu(SoTaiKhoan, sotien);
    }

    @Override
    public ArrayList<ChiTietTaiKhoanbean> getLichSuTaiKhoan(String SoTaiKhoan) throws Exception {
        return cttkbo.getLichSuTaiKhoan(SoTaiKhoan);
    }

    @Override
    public boolean insertRutTien(String stk, long sotienrut) throws Exception {
        return cttkbo.insertRutTien(stk, sotienrut);
    }

    @Override
    public boolean insertChuyenTien(String stk, long sotienrut, String ghichu) throws Exception {
        return cttkbo.insertChuyenTien(stk, sotienrut, ghichu);
    }
    
}
