/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecs;

import com.dataStructures.MyTable;
import com.dataStructures.ResultSetTableModel;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
public class StaffSignOut extends javax.swing.JInternalFrame {

    /**
     * Creates new form PersonalDetails
     */
    public StaffSignOut() {
        DBConnection.connect();
        initComponents();
        createTable();
        
    }
    
    private void createTable(){
        String sql="SELECT staff_pers_info.staff_id, fname, mname, lname, sign_in_time, in_time from staff_pers_info, staff_sign_in where status = 'IN' AND staff_sign_in.staff_id = staff_pers_info.staff_id";
        
        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Staff ID","Firstname", "Middlename", "Lastname","Sign In Date", "Sign In Time"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(540, 300));
        scrollPane = new JScrollPane(table);
        table.setToolTipText("Click on row to sign out staff.");
        for (int i = 0; i < 6; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 0) //MemberID
                    column.setPreferredWidth(6);
            if (i == 1) //ID
                    column.setPreferredWidth(30);
            if (i == 2) //ID
                    column.setPreferredWidth(30);
            if (i == 3) //ID
                    column.setPreferredWidth(60);
            if (i == 4) //ID
                    column.setPreferredWidth(10);
            if (i == 5) //ID
                    column.setPreferredWidth(10);
        }
        
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try{
                    Date date = new Date();
                    int row= table.getSelectedRow();
                    String table_click1=table.getModel().getValueAt(row, 0).toString();
                    String table_click2=table.getModel().getValueAt(row, 1).toString();
                    String table_click4=table.getModel().getValueAt(row, 3).toString();

                    int result = JOptionPane.showConfirmDialog(StaffSignOut.this, "Do you want to sign out "+table_click2+" "+table_click4+" with Staff ID "+table_click1+"?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if(result== JOptionPane.YES_OPTION){
                        PreparedStatement st;
                        String sql = "select * from staff_acct_info, staff_acct_bal, staff_sign_in where staff_acct_info.staff_id = ? AND staff_acct_info.staff_id = staff_sign_in.staff_id AND staff_acct_info.staff_id = staff_acct_bal.staff_id AND status = 'IN'";
                        st = DBConnection.con.prepareStatement(sql);
                        st.setString(1, table_click1);
                        
                        DBConnection.rs = st.executeQuery();
                        DBConnection.rs.next();
                        double salary = DBConnection.rs.getDouble("staff_hourly_pay");
                        
                        String t = DBConnection.rs.getString("sign_in_time").replaceAll("-", "/");
                        Date sign_in_time = new Date(t.substring(0, t.length()-2));
                        double bal = DBConnection.rs.getDouble("balance");
                        //System.out.println("Sign In: "+sign_in_time);
                        //System.out.println("Sign Out: "+date);
                        
                        //System.out.println("Sign In M: "+sign_in_time.getMinutes());
                        //System.out.println("Sign Out M: "+date.getMinutes());
                        
                        long mins = (date.getTime() - sign_in_time.getTime()) / 1000 / 60;
                        //System.out.println("Minutes: "+mins);
                        double due = mins * salary / 60;
                        //System.out.println("Due: "+due);
                        double cur_bal = bal + due;
                        String end_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
                        String end_time = new SimpleDateFormat("HH:mm:ss").format(date);
                       
                        sql = "update staff_sign_in set sign_out_time = ?, status = ?, out_time = ?  where staff_id = ? AND status = 'IN'";
                        st = DBConnection.con.prepareStatement(sql);
                        st.setString(1, end_date);
                        st.setString(2, "OUT");
                        st.setString(3, end_time);
                        st.setString(4, table_click1);

                        st.executeUpdate();
                        
                        sql = "update staff_acct_bal set balance = ? where staff_id = ?";
                        st = DBConnection.con.prepareStatement(sql);
                        st.setDouble(1, Double.parseDouble(String.format("%.2f", bal+due)));
                        st.setString(2, table_click1);

                        st.executeUpdate();
                        
                        sql = "insert into staff_acct_trans (staff_id, amount_in, amount_out, balance, description, date) values (?,?,?,?,?,?)";
                        st = DBConnection.con.prepareStatement(sql);
                        st.setString(1, table_click1);
                        st.setDouble(2, Double.parseDouble(String.format("%.2f", due)));
                        st.setDouble(3, 0);
                        st.setDouble(4, Double.parseDouble(String.format("%.2f", cur_bal)));
                        st.setString(5, "Credit for Service");
                        st.setString(6, end_date);

                        st.executeUpdate();

                        JOptionPane.showMessageDialog(StaffSignOut.this, "Staff signed out successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                        refresh();
                    }
                }catch(SQLException ex){
                    ex.printStackTrace();
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));
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

        jPanel1 = new javax.swing.JPanel();
        validate1 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Staffs Sign Out");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(713, 419));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validate1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        validate1.setText("Close");
        validate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        validate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validate1ActionPerformed(evt);
            }
        });
        jPanel1.add(validate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 180, 30));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 300));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STAFFS ALREADY SIGNED IN");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 440, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refresh(){
        createTable();
    }
    
    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        this.hide();
        this.dispose();
    }//GEN-LAST:event_formInternalFrameDeactivated

    private void validate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validate1ActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_validate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton validate1;
    // End of variables declaration//GEN-END:variables
}
