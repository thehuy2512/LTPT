/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuyendoan;

import static java.lang.System.out;

/**
 *
 * @author Dell
 */
public class frmTuyendoan2 extends javax.swing.JFrame {

    /**
     * Creates new form frmTuyendoan2
     */
    int C(int k, int n) {
    if (k == 0 || k == n) return 1;
    if (k == 1) return n;
    return C(k-1,n-1) + C(k,n-1);
    }
    
    int s1=0,s2=0,s3=0,s4=0,s=0; 
    boolean kt1=false,kt2=false,kt3=false,kt4=false;
    public class Lop extends Thread{
        int i,k,n;
        public Lop(int i,int k,int n){
            this.i=i;
            this.k=k;
            this.n=n;
        }
        public void run(){
        if(i==1){
        s1 =C(k,n-2);
        kt1=true;
        }
        if(i==2){
        s2 =C(k-1,n-2);
        kt2=true;
        }
        if(i==3){
        s3 = C(k-1,n-2);
        kt3=true;
        }
        if(i==4) {
        s4 = C(k-2,n-2);
        kt4=true;
        }
    }
}
    public frmTuyendoan2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbln = new javax.swing.JLabel();
        lblk = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtk = new javax.swing.JTextField();
        lblkq1 = new javax.swing.JLabel();
        lblkq2 = new javax.swing.JLabel();
        lblkq3 = new javax.swing.JLabel();
        lblkq4 = new javax.swing.JLabel();
        txtkq1 = new javax.swing.JTextField();
        txtkq2 = new javax.swing.JTextField();
        txtkq3 = new javax.swing.JTextField();
        txtkq4 = new javax.swing.JTextField();
        txttong = new javax.swing.JTextField();
        lbltong = new javax.swing.JLabel();
        btntinh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbln.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbln.setText("Nhập n:");

        lblk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblk.setText("Nhập k:");

        lblkq1.setText("KQ1:");

        lblkq2.setText("KQ2:");

        lblkq3.setText("KQ3:");

        lblkq4.setText("KQ4:");

        txtkq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkq2ActionPerformed(evt);
            }
        });

        txttong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttongActionPerformed(evt);
            }
        });

        lbltong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbltong.setText("Kết quả tổng:");

        btntinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntinh.setText("Tính");
        btntinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btntinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntinhActionPerformed(evt);
            }
        });

        jLabel1.setText("số lần chạy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttong)
                        .addGap(18, 18, 18)
                        .addComponent(btntinh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbln)
                                .addGap(18, 18, 18)
                                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblkq2)
                                        .addComponent(lblkq1)
                                        .addComponent(lblkq3))
                                    .addComponent(lblkq4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkq4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(txtkq3)
                                    .addComponent(txtkq2)
                                    .addComponent(txtkq1))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblk)
                                .addGap(26, 26, 26)
                                .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 98, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln)
                    .addComponent(lblk)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkq1)
                    .addComponent(txtkq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkq2)
                    .addComponent(txtkq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkq3)
                    .addComponent(txtkq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkq4)
                    .addComponent(txtkq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltong)
                    .addComponent(btntinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkq2ActionPerformed

    private void txttongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttongActionPerformed

    private void btntinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntinhActionPerformed
        // TODO add your handling code here:
      String tamk = txtk.getText();
      String tamn = txtn.getText();
      int k = Integer.parseInt(tamk);
      int n = Integer.parseInt(tamn);
    
        Lop l1 = new Lop(1,k,n);
        l1.start();
        Lop l2 = new Lop(2,k,n);
        l2.start();
        Lop l3 = new Lop(3,k,n);
        l3.start();
        Lop l4 = new Lop(4,k,n);
        l4.start();
        int demtg=0;
        while(true){
            System.out.println("Dang doi............");
          if(kt1==true&&kt2==true&&kt3==true&&kt4==true){
            s=s1+s2+s3+s4; 
          // System.out.println("s1="+s1);
          // System.out.println("s2="+s2);
          // System.out.println("s3="+s3);
          // System.out.println("s4="+s4);
          // System.out.println("s="+s);
          txtkq1.setText(String.valueOf(s1));
          txtkq2.setText(String.valueOf(s2));
          txtkq3.setText(String.valueOf(s3));
          txtkq4.setText(String.valueOf(s4));
          txttong.setText(String.valueOf(s));
          //out.print(demtg);
          txttime.setText(String.valueOf(demtg));
          break;
        }
          demtg++;
    }//GEN-LAST:event_btntinhActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTuyendoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTuyendoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTuyendoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTuyendoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTuyendoan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblk;
    private javax.swing.JLabel lblkq1;
    private javax.swing.JLabel lblkq2;
    private javax.swing.JLabel lblkq3;
    private javax.swing.JLabel lblkq4;
    private javax.swing.JLabel lbln;
    private javax.swing.JLabel lbltong;
    private javax.swing.JTextField txtk;
    private javax.swing.JTextField txtkq1;
    private javax.swing.JTextField txtkq2;
    private javax.swing.JTextField txtkq3;
    private javax.swing.JTextField txtkq4;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txttong;
    // End of variables declaration//GEN-END:variables
}
