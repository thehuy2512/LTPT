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
import java.util.Scanner;

public class MyClient {
    static int C(int k, int n) {
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return C(k-1,n-1) + C(k,n-1);
    }
    static int s1=0,s2=0,s3=0,s4=0; 
    static boolean kt1=false,kt2=false;
    static int kqmay1;
    static int k,n;
    public static class Tinh1_Huy extends Thread{
        int i,k,n;
        public  Tinh1_Huy(int i,int k,int n){
            this.i=i;
            this.k=k;
            this.n=n;
        }
        public void run(){
            if(i==1){
                s1 =C(k,n-1);
                kt1=true;
            }
            if(i==2){
                s2 =C(k-1,n-1);
                kt2=true;
            }
       
        }
    }
    public static void ToHop1() throws Exception{
                
                Tinh1_Huy t1 = new Tinh1_Huy(1, k-1, n-1);
                t1.start();
                Tinh1_Huy t2 = new Tinh1_Huy(2, k-1, n-1);
                t2.start();
                 while(true){
                        
                        System.out.println("Dang doi............");
                        if(kt1==true && kt2==true){
                        int s=s1+s2; 
                       // txtmay1.setText(String.valueOf(s));
                       // kq_m1 = s;
                       // txtmay2.setText(String.valueOf(kq_m2));
                       // txttong.setText(String.valueOf(kq_m1+kq_m2));
                      //  kt = false;
                        
                        kqmay1=s;
                        break;
                        }
                    
                    }
             
    }
    public static void main(String[] args) {
          
          try {
                 ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
              // System.out.println(tt.Tong(10, 4));
              // System.out.println( tt.Nhan(10, 4));
               
               
              Scanner sc = new Scanner(System.in);
                System.out.print("Nhập k: ");
               k = sc.nextInt();
                System.out.print("Nhập n: ");
                n = sc.nextInt();
                int kqmay2 = tt.ToHop(k, n);
                //int kqmay1;
                // int kt==false;
                ToHop1();
                int tong = kqmay1 + kqmay2;
                System.out.print("kqmay2 ="+kqmay2);
                System.out.print("kqmay1 ="+kqmay1);
                System.out.print("tong la= "+tong);
       } catch (Exception e) {
           e.printStackTrace();
        }

       
        
    }
}
