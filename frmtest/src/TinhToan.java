import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public TinhToan() throws RemoteException{
    }
    int C(int k, int n) {
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return C(k-1,n-1) + C(k,n-1);
    }
    int s1=0,s2=0;
    boolean kt1 = false,kt2 = false;
    public class Tinh2_Huy extends Thread{
        int i,k,n;
        public Tinh2_Huy(int i,int k,int n){
            this.i=i;
            this.k=k;
            this.n=n;
        }
        public void run(){
            if(i==1){
                s1 = C(k,n-1);
                kt1=true;
            }
            if(i==2){
                s2 =C(k-1,n-1);
                kt2=true;
            }
        }
    }   
    @Override
    public int Tong(int a, int b) throws Exception {
        // 
        int s=a+b;
        System.out.println("Tong: "+ s);
        return s;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        int s=a*b;
        System.out.println("Tich: "+ s);
        return s;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int Tru(int a, int b) throws Exception {
        int s=a-b;
        System.out.println("Hieu: "+ s);
        return s;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int Chia(int a, int b) throws Exception {
        int s=a/b;
        System.out.println("Thuong: "+ s);
        return s;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int ToHop(int k, int n) throws Exception{
        while(true){
               //try{
                   // if(st != null && !st.isEmpty()){
                       // String[] ds = st.split("[;]");

                        

                        Tinh2_Huy t1 = new Tinh2_Huy(1, k, n-1);
                        t1.start();
                        Tinh2_Huy t2 = new Tinh2_Huy(2, k, n-1);
                        t2.start();

                        while(true){
                            System.out.println("Dang doi............");
                            if(kt1 && kt2){
                                int s;
                                s = s1+s2; 
                               // txtkqmay2.setText(String.valueOf(s));
                               // Send(String.valueOf(s));
                               return s;
                               // break;
                            }
                        }

                    }
               // }catch (Exception e){
              //      e.printStackTrace();
              //  }
            }
    
    }

