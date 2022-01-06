/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class TaiKhoanbean implements Serializable{
    String SoTaiKhoan;
    String Hoten;
    Long SoTien;
    String MatKhau;
    public TaiKhoanbean(){
    }
    public TaiKhoanbean(String SoTaiKhoan, String Hoten, Long SoTien, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.Hoten = Hoten;
        this.SoTien = SoTien;
        this.MatKhau = MatKhau;
    }
    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Long getSoTien() {
        return SoTien;
    }

    public void setSoTien(Long SoTien) {
        this.SoTien = SoTien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    
    
}
