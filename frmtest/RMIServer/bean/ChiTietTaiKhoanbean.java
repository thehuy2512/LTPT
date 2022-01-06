/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;



import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Dell
 */
public class ChiTietTaiKhoanbean implements Serializable{
    String Id;
    Date NgayRutTien;
    long SoTienRutRa;
    String SoTaiKhoan;
    String GhiChu;

    public ChiTietTaiKhoanbean() {
    }

    public ChiTietTaiKhoanbean(String Id, Date NgayRutTien, long SoTienRutRa, String SoTaiKhoan, String GhiChu) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRutRa = SoTienRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public long getSoTienRutRa() {
        return SoTienRutRa;
    }

    public void setSoTienRutRa(long SoTienRutRa) {
        this.SoTienRutRa = SoTienRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
