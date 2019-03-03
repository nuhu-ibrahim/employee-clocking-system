/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecs;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author SHANMA
 */
public class EducationInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form EducationInfo
     */
    KinInfo p;
    public EducationInfo(KinInfo k) {
        this.p = k;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        course = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        certificate = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        schoolAtt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        postGradCert = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        yy = new com.toedter.calendar.JYearChooser();
        next = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        prof_cert = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancel = new javax.swing.JButton();

        setClosable(true);
        setTitle("Educational Information");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/user32.jpg"))); // NOI18N
        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Educational Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 0, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        course.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 190, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("  Certification");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Year of Certification");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("  School attended");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));

        certificate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        certificate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select...", "FSLC", "SSCE", "ND", "NCE", "HND", "BSC" }));
        jPanel1.add(certificate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Course of Study");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("*");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 10, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("*");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 10, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("*");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 10, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("*");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 10, 20));

        schoolAtt.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel1.add(schoolAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 280, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText(" Post Grad Certs");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        postGradCert.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel1.add(postGradCert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("*");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 10, 20));
        jPanel1.add(yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, -1));

        next.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        next.setText("Next");
        next.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("          Address of School");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 30));

        address.setColumns(20);
        address.setRows(2);
        address.setTabSize(4);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 280, 50));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setText("*");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 10, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Professional Certificates");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        prof_cert.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        jPanel1.add(prof_cert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 320));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("STAFF INFORMATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 520, 10));

        cancel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private StaffAccInfo healthInfo;
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(yy.getYear()==0 || schoolAtt.getText().equals("") || certificate.getSelectedIndex()==0 || address.getText().equals("") || course.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                Thread runner = new Thread() {

                public void run() {
                    healthInfo = new StaffAccInfo(EducationInfo.this);
                    MainMenu.desktop1.add(healthInfo);
                try {
                    healthInfo.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
                }
                    };
                runner.start();
                this.dispose();
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Irregular Year",
                "Incorrect Year", JOptionPane.OK_OPTION);     
            }catch(Exception ex){

            }
        }
    }//GEN-LAST:event_nextActionPerformed

    public int getStaffID(){
        return p.getStaffID();
    }
    
    public void insert() throws Exception{
        p.insert();

        PreparedStatement st;

        String sql="insert into staff_education_info (staff_id, certification, year, sch_attended, address, course_of_study, post_grad_certs) values (?,?,?,?,?,?,?)";
        st= DBConnection.con.prepareStatement(sql);
        st.setString(1, ""+getStaffID());
        st.setString(2, ""+certificate.getSelectedItem());
        st.setString(3, ""+yy.getYear());
        st.setString(4, schoolAtt.getText());
        st.setString(5, address.getText());
        st.setString(6, ""+course.getText());
        st.setString(7, ""+postGradCert.getText());

        st.executeUpdate();
        System.out.println("Done4");
    }
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton cancel;
    public static javax.swing.JComboBox certificate;
    public static javax.swing.JTextField course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next;
    public static javax.swing.JTextField postGradCert;
    public static javax.swing.JTextField prof_cert;
    public static javax.swing.JTextField schoolAtt;
    private com.toedter.calendar.JYearChooser yy;
    // End of variables declaration//GEN-END:variables
}
