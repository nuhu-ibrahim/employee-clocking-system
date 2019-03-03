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
public class EditContactInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ContactInfo
     */
    public EditContactInfo() {
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
        mobileNumb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        town = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        phoneNumb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        streetName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        plotNmb = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        staffId = new javax.swing.JFormattedTextField();
        validate = new javax.swing.JButton();
        select5 = new javax.swing.JButton();
        select2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Contact Information");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/user35.jpg"))); // NOI18N
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("STAFF INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Contact Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mobileNumb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(mobileNumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Street Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText(" City/Town");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        town.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(town, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Mobile No");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("   State");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));

        state.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        state.setForeground(java.awt.Color.darkGray);
        state.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select...", "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo ", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Kastina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara" }));
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        jPanel2.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("*");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 10, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setText("*");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 10, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setText("*");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 10, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setText("*");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 10, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("*");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 10, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("*");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 10, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("House Plot No");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText(" Phone No");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        phoneNumb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(phoneNumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Email Address");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        emailAddress.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 20));

        streetName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(streetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 260, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("*");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 10, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 51));
        jLabel38.setText("*");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 10, 20));

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

        plotNmb.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel2.add(plotNmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 560, 260));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 600, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Search Staff", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Staff ID");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 26, -1, 20));

        staffId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        staffId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(staffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 25, 160, -1));

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
        jPanel1.add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed
    private EditKinInfo kin;
    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(staffId.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql="select * from staff_contact_info where staff_id=?";
                st=DBConnection.con.prepareStatement(sql);
                st.setInt(1, Integer.parseInt(staffId.getText().trim()));
                DBConnection.rs=st.executeQuery();
                if(DBConnection.rs.next()){
                    plotNmb.setText(""+DBConnection.rs.getString("house_no"));
                    streetName.setText(DBConnection.rs.getString("street_name"));
                    state.setSelectedItem(DBConnection.rs.getString("state"));
                    mobileNumb.setText(DBConnection.rs.getString("mobile"));
                    phoneNumb.setText(""+DBConnection.rs.getString("phone"));
                    emailAddress.setText(DBConnection.rs.getString("email"));
                    town.setText(DBConnection.rs.getString("city"));
                    
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(plotNmb.getText().equals("") || streetName.getText().equals("") ||
                state.getSelectedIndex()==0 || town.getText().equals("")||
                mobileNumb.getText().equals("") || phoneNumb.getText().equals("") ||
                emailAddress.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql="update staff_contact_info set house_no=?, street_name=?, city=?, state=?, mobile=?, phone =?, email =? where staff_id=?";
                st= DBConnection.con.prepareStatement(sql);
                st.setString(1, plotNmb.getText());
                st.setString(2, streetName.getText());
                st.setString(3, town.getText());
                st.setString(4, ""+state.getSelectedItem());
                st.setString(5, mobileNumb.getText());
                st.setString(6, phoneNumb.getText());
                st.setString(7, emailAddress.getText());
                st.setString(8, staffId.getText());
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Staff Information Updated","Success!", JOptionPane.INFORMATION_MESSAGE);
                //Refresh page
                refresh();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Issues excecuting query","Issues!", JOptionPane.OK_OPTION);
            }finally{
                DBConnection.rs=null;
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        refresh();
    }//GEN-LAST:event_select5ActionPerformed

    public void refresh(){
        Thread runner = new Thread() {

            public void run() {
                EditContactInfo mandate1 = new EditContactInfo();
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
    
    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_select2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField emailAddress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField mobileNumb;
    public static javax.swing.JTextField phoneNumb;
    public static javax.swing.JTextField plotNmb;
    private javax.swing.JButton select2;
    private javax.swing.JButton select5;
    public static javax.swing.JFormattedTextField staffId;
    public static javax.swing.JComboBox state;
    public static javax.swing.JTextField streetName;
    public static javax.swing.JTextField town;
    private javax.swing.JButton update;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}