/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecs;

import com.dataStructures.MyTable;
import com.dataStructures.MyVisitor;
import com.dataStructures.ResultSetTableModel;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SHANMA
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
public class ViewClocking extends javax.swing.JInternalFrame {

    /**
     * Creates new form PersonalDetails
     */
    public ViewClocking() {
        DBConnection.connect();
        initComponents();
    }

    private JTable table;
    private TableColumn column = null;
    private JScrollPane scrollPane;
    private ResultSetTableModel tableModel;
    
    private void createTable(){
        String fromDate = new SimpleDateFormat("yyyy-MM-dd").format(this.fromDate.getDate());
        String toDate = new SimpleDateFormat("yyyy-MM-dd").format(this.toDate.getDate());

        String sql="SELECT staff_acct_trans.staff_id, sign_in_time, in_time, sign_out_time, out_time, amount_in from staff_sign_in, staff_acct_trans where sign_in_time between '"+fromDate+"' and '"+toDate+"' AND amount_out = 0 AND staff_sign_in.staff_id = staff_acct_trans.staff_id AND staff_sign_in.sign_out_time = staff_acct_trans.date AND status = 'OUT' ORDER BY sign_in_time DESC";
        
        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Staff ID", "Sign In Date", "Sign In Time", "Sign Out Date", "Sign Out Time", "Amount(N)"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(570, 200));
        scrollPane = new JScrollPane(table);
      
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 200));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        compute1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        uDemo16 = new javax.swing.JLabel();
        uDemo17 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        toDate = new com.toedter.calendar.JDateChooser();
        fromDate = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Clocking Timing");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/user32.jpg"))); // NOI18N
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(588, 418));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 590, 200));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 102, 0));
        jLabel5.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("STAFFS CLOCKING INFORMATION");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REPORT");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 590, -1));

        compute1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        compute1.setText("Close");
        compute1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        compute1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compute1ActionPerformed(evt);
            }
        });
        jPanel2.add(compute1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 170, 35));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uDemo16.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        uDemo16.setForeground(new java.awt.Color(0, 0, 102));
        uDemo16.setText("From (Date)");
        jPanel6.add(uDemo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        uDemo17.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        uDemo17.setForeground(new java.awt.Color(0, 0, 102));
        uDemo17.setText("To (Date)");
        jPanel6.add(uDemo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        generate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        generate.setText("Generate Report");
        generate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel6.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, 35));
        jPanel6.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));
        jPanel6.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 460, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        this.hide();
        this.dispose();
    }//GEN-LAST:event_formInternalFrameDeactivated

    private void compute1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compute1ActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_compute1ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        if(this.toDate.getDate()==null || this.fromDate.getDate()==null){
            JOptionPane.showMessageDialog(this, "Empty Fields", "Issue!", JOptionPane.OK_OPTION, new javax.swing.ImageIcon(getClass().getResource("/com/images/glyphicons-197-exclamation-sign.png")));
        }else{
            try{
                String fromDate = new SimpleDateFormat("yyyy-MM-dd").format(this.fromDate.getDate());
                String toDate = new SimpleDateFormat("yyyy-MM-dd").format(this.toDate.getDate());
                PreparedStatement st;
                String sql="select * from staff_sign_in where sign_in_time between ? and ? AND status = 'OUT'";
                st=DBConnection.con.prepareStatement(sql);
                st.setString(1, fromDate);
                st.setString(2, toDate);
                
                DBConnection.rs=st.executeQuery();

                if(DBConnection.rs.next()){
                    createTable();
                }else{
                    JOptionPane.showMessageDialog(this, "No record exist for the period specified","Information!", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/com/images/glyphicons-196-info-sign.png")));
                    createTable();
                }
            }catch(SQLException sqlEx){
                JOptionPane.showMessageDialog(this, "Issues excecuting query","Issue!", JOptionPane.OK_OPTION, new javax.swing.ImageIcon(getClass().getResource("/com/images/glyphicons-197-exclamation-sign.png")));
                createTable();
            }
        }
    }//GEN-LAST:event_generateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compute1;
    public static javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JLabel uDemo16;
    private javax.swing.JLabel uDemo17;
    // End of variables declaration//GEN-END:variables
}