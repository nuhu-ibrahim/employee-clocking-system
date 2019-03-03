/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecs;

import com.sun.jmx.snmp.tasks.Task;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.Painter;
import javax.swing.SwingUtilities;

/**
 *
 * @author SHANMA
 */
public class Splash extends javax.swing.JFrame {
    private Image img2;
    Task task;
    String me= "false";
    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
    }
    public void me(){
        if(me.equals("true")){
            this.dispose();
            this.hide();
            this.setCursor(Cursor.DEFAULT_CURSOR);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        outPutTextarea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outPutTextarea.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        outPutTextarea.setForeground(new java.awt.Color(255, 255, 255));
        outPutTextarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outPutTextarea.setText("Please Wait,  Program Loading...");
        jPanel1.add(outPutTextarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ajax-loader5.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/images2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        /*if(me.equals("true")){
            this.dispose();
            this.hide();
            this.setCursor(Cursor.DEFAULT_CURSOR);
        }
        
        Thread runner = new Thread() {

        public void run() {
        try {
            me();
        } catch (Exception e) {
        }
        }
            };
        runner.start();
        */
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Task().start();
    }//GEN-LAST:event_formWindowOpened
    public class MyPainter implements Painter<JProgressBar> {
        Color color;
        public MyPainter(Color c1){
            this.color=c1;
        }
        @Override
        public void paint(Graphics2D gd, JProgressBar t, int i, int i1) {
            gd.setColor(color);
            gd.fillRect( 0, 0,i, i1);
            //throw new UnsupportedOperationException("Not supported yet.");
            
        }
}
private class Task extends Thread{
    int i;
    String check="false";
    public Task(){
         
    }
    public void run(){
        Random rand = new Random(); 
        int val = 4;
        for(i=0; i<=100; i+=val){
            val = rand.nextInt(50);
            final int progress=i;
            SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                try{
                    if(i==100){
                        outPutTextarea.setForeground(Color.GRAY);
                        outPutTextarea.setText(String.format("Loading Completed, Opening Project...", progress));
                        check= "true";
                    }else{
                        outPutTextarea.setText(String.format("Loading Project, %d%% Completed ", progress));
                        check= "false";
                    }
                    
                }catch(Exception ex){
                    
                }
                
            }
            });
            try{
                if(check.equals("false")){
                    Thread.sleep(440);
                }else if(check.equals("true")){
                    Thread.sleep(4000);
                }
                
            }catch(Exception e){
            
            }
            
        }
        me= "true";
        new MainMenu().setVisible(true);
        me();
   }
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
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outPutTextarea;
    // End of variables declaration//GEN-END:variables
}
