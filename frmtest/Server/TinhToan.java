/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class TinhToan implements ITinhToan{

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
        System.out.println("Tong: "+ s);
        return s;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	@Override
    public int Tru(int a,int b) throws Exception{
	return a-b;
	}
	@Override
    public int Chia(int a,int b) throws Exception{
	return a/b;
}
    
}
