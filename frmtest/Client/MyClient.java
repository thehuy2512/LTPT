/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
//          try {
//                 ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
//               System.out.println(tt.Tong(10, 4));
//               System.out.println( tt.Nhan(10, 4));
//        } catch (Exception e) {
//           e.printStackTrace();
//        }

        FrmHienthi frm = new FrmHienthi();
	frm.setVisible(true);
    }
}
