/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


/**
 *
 * @author Dell
 */
public class bank_server {
    public static void main(String[] args) {
        try {
            java.rmi.registry.Registry r = LocateRegistry.createRegistry(1099); 
            Bank b = new Bank();
                    
            //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
            //UnicastRemoteObject.exportObject(tt);
            
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/Bank",b);
            System.out.print("Da cho may khach goi den:");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
