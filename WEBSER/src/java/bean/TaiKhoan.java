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
public class TaiKhoan implements Serializable{
    private String tendn;
    private String pass;
    private String hoten;

    public TaiKhoan(String tendn, String pass, String hoten) {
        this.tendn = tendn;
        this.pass = pass;
        this.hoten = hoten;
    }

    public TaiKhoan() {
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
}
