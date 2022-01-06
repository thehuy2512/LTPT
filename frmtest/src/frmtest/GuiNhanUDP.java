/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmtest;

import java.io.DataOutputStream;
import static java.lang.System.out;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 *
 * @author Dell
 */
public class GuiNhanUDP {
    DatagramSocket Sserver;
    public void MoCong(int cong) throws Exception {
        Sserver = new DatagramSocket(cong);
        System.out.println("Da mo cong: "+cong);
    }
    public void Gui(String data, String ipserver, int cong) throws Exception{
        Sserver = new DatagramSocket();
        
        byte bodem[]= new byte[256];
        
        bodem=data.getBytes();
        InetAddress ip = InetAddress.getByName(ipserver);
        DatagramPacket dr = new DatagramPacket(bodem, bodem.length, ip, cong);
        Sserver.send(dr);
        
    }  
    public String nhan() throws Exception{
        byte bodem[] = new byte[256];
        DatagramPacket dr = new DatagramPacket(bodem, bodem.length);
        Sserver.receive(dr);
        return new String(dr.getData());
    }
}
