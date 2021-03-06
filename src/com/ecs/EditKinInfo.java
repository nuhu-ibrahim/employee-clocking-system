/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecs;

import static com.ecs.MainMenu.desktop1;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SHANMA
 */
public class EditKinInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form KinInfo
     */
    public EditKinInfo() {
        DBConnection.connect();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Firstname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        Lastname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rstate = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        streetName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        plotNo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        staffId = new javax.swing.JFormattedTextField();
        validate = new javax.swing.JButton();
        select5 = new javax.swing.JButton();
        select2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Next of Kin Information");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/user32.jpg"))); // NOI18N
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("STAFF INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Next of Kin Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Firstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Firstname.setForeground(new java.awt.Color(0, 102, 51));
        Firstname.setText("Firstname");
        jPanel2.add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, 30));

        fname.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Middlename");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, -1, 30));

        mname.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, 20));

        Lastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lastname.setForeground(new java.awt.Color(0, 102, 51));
        Lastname.setText("Lastname");
        jPanel2.add(Lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setText("Mobile No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, -1, 30));

        mobile.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText(" State of Res.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, -1, 30));

        rstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rstate.setForeground(java.awt.Color.darkGray);
        rstate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select...", "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo ", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Kastina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara" }));
        rstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstateActionPerformed(evt);
            }
        });
        jPanel2.add(rstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("*");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 10, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setText("*");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 10, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("*");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 10, 20));

        lname.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("House Plot No");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 51, 51));
        jLabel36.setText("*");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 10, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Street Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 30));

        streetName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(streetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 260, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("*");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 10, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 51));
        jLabel38.setText("*");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 10, 20));

        update.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        update.setText("Update the Information");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 220, 30));

        plotNo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(plotNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 570, 250));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 610, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Search Staff", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Staff ID");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        staffId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        staffId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(staffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 25, 160, 30));

        validate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        validate.setText("Validate");
        validate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel3.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, 30));

        select5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        select5.setText("Refresh");
        select5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        select5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select5ActionPerformed(evt);
            }
        });
        jPanel3.add(select5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 100));

        select2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        select2.setText("Cancel");
        select2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });
        jPanel1.add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rstateActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(staffId.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql="select * from staff_kin_info where staff_id=?";
                st=DBConnection.con.prepareStatement(sql);
                st.setString(1, staffId.getText().trim());
                DBConnection.rs=st.executeQuery();
                if(DBConnection.rs.next()){
                    fname.setText(DBConnection.rs.getString("fname"));
                    mname.setText(DBConnection.rs.getString("mname"));
                    lname.setText(DBConnection.rs.getString("lname"));
                    rstate.setSelectedItem(DBConnection.rs.getString("state"));
                    mobile.setText(DBConnection.rs.getString("mobile"));
                    plotNo.setText(""+DBConnection.rs.getString("house_no"));
                    streetName.setText(DBConnection.rs.getString("street_name"));
                    
                    this.staffId.setEnabled(false);
                    validate.setEnabled(false);
                    update.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Staff ID does not exist","Issues!", JOptionPane.OK_OPTION);
                }
            }catch(SQLException sqlEx){
                JOptionPane.showMessageDialog(this, "Issues excecuting query","Issues!", JOptionPane.OK_OPTION);
                System.err.println(sqlEx.getMessage());
                refresh();
            }
        }
    }//GEN-LAST:event_validateActionPerformed

    public void refresh(){
        Thread runner = new Thread() {

            public void run() {
                EditKinInfo mandate1 = new EditKinInfo();
                desktop1.add(mandate1);
                try {
                    mandate1.setSelected(true);
                }catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
        
        this.dispose();
        this.hide();
    }
    
    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        refresh();
    }//GEN-LAST:event_select5ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fname.getText().equals("") || lname.getText().equals("") || mobile.getText().equals("") || rstate.getSelectedIndex()==0 || streetName.getText().equals("")|| plotNo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql="update staff_kin_info set fname=?, mname=?, lname=?, mobile=?, house_no=?, street_name=?, state=? where staff_id=?";
                st= DBConnection.con.prepareStatement(sql);
                
                st.setString(1, fname.getText());
                st.setString(2, mname.getText());
                st.setString(3, lname.getText());
                st.setString(4, mobile.getText());
                st.setString(5, plotNo.getText());
                st.setString(6, streetName.getText());
                st.setString(7, ""+rstate.getSelectedItem());
                st.setString(8, staffId.getText());
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Staff Information Updated","Success!", JOptionPane.INFORMATION_MESSAGE);
                //Refresh page
                st.executeUpdate();
                refresh();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Issues excecuting query","Issues!", JOptionPane.OK_OPTION);
                System.err.println(ex.getMessage());
            }finally{
                DBConnection.rs=null;
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_select2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Lastname;
    public static javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField lname;
    public static javax.swing.JTextField mname;
    public static javax.swing.JTextField mobile;
    public static javax.swing.JTextField plotNo;
    public static javax.swing.JComboBox rstate;
    private javax.swing.JButton select2;
    private javax.swing.JButton select5;
    public static javax.swing.JFormattedTextField staffId;
    public static javax.swing.JTextField streetName;
    private javax.swing.JButton update;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
