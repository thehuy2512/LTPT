/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class TaiKhoandao {
    
    public ArrayList<TaiKhoanbean> getTaiKhoan(String stk) throws Exception{
    ArrayList<TaiKhoanbean> ds = new ArrayList<TaiKhoanbean>();
    String sql ="select * from TaiKhoan where SoTaiKhoan=?";
     
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setString(1,stk);
            ResultSet rs = st.executeQuery();
            if (rs.next()==false)
            {
                return null;
            }
            else{
                ds.add(new TaiKhoanbean(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getString(4)));
            }
            rs.close();
            st.close();
            dc.cn.close();
        
    return ds;
    }
    
    public ArrayList<TaiKhoanbean> ktdn(String SoTaiKhoan,String MatKhau) throws Exception{
    ArrayList<TaiKhoanbean> ds = new ArrayList<TaiKhoanbean>();
    
    String sql ="select * from TaiKhoan where SoTaiKhoan=? and MatKhau=?";
    
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setString(1,SoTaiKhoan);
            st.setString(2,MatKhau);
            ResultSet rs = st.executeQuery();
            if (rs.next()==false)
            {
                return null;
            }
            else{
                ds.add(new TaiKhoanbean(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getString(4)));
            }
            rs.close();
            st.close();
            dc.cn.close();
    
    return ds;
    }
    public boolean updateSodu(String SoTaiKhoan,long sotien) throws Exception{
        String sql ="update TaiKhoan set SoTien=? where SoTaiKhoan=?";
            
            DungChung dc = new DungChung();
            dc.KetNoi();
            PreparedStatement st = dc.cn.prepareStatement(sql);
            st.setLong(1,sotien);
            st.setString(2,SoTaiKhoan);
            return st.executeUpdate()>0;
    }
}
