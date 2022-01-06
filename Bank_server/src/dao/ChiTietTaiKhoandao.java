/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ChiTietTaiKhoandao {

    public boolean insertRutTien(String stk,long sotienrut) throws Exception{
        String sql="insert into ChiTietTaiKhoan(SoTienRutRa,SoTaiKhoan) values(?,?)";
        
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setLong(1, sotienrut);
            st.setString(2, stk);
            return st.executeUpdate()>0;
 
    }
    public boolean insertChuyenTien(String stk,long sotienrut,String ghichu) throws Exception{
        String sql="insert into ChiTietTaiKhoan(SoTienRutRa,SoTaiKhoan,Ghichu) values(?,?,?)";
        
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setLong(1, sotienrut);
            st.setString(2, stk);
            st.setString(3, ghichu);
            return st.executeUpdate()>0;
 
    }
    public ArrayList<ChiTietTaiKhoanbean> getLichSuGiaoDichbySTK(String SoTaiKhoan) throws Exception{
        ArrayList<ChiTietTaiKhoanbean> ds = new ArrayList<ChiTietTaiKhoanbean>(); 
     // ArrayList<ChiTietTaiKhoanbean> ds = null;
       String sql="select * from ChiTietTaiKhoan where SoTaiKhoan=?";
    
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setString(1, SoTaiKhoan);
            ResultSet rs = st.executeQuery();
            //if (rs.next()==false)
            //   return null;
            //else{
            while(rs.next())
            {
                ds.add(new ChiTietTaiKhoanbean(rs.getString(1), rs.getDate(2), rs.getLong(3), rs.getString(4), rs.getString(5)));
            }
            
            rs.close();
            st.close();
            dc.cn.close();
            
    
    return ds;
    }
}
