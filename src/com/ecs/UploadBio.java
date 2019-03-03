
package com.ecs;

import static com.ecs.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.capture.*;
import com.digitalpersona.onetouch.capture.event.*;
import com.digitalpersona.onetouch.processing.*;
import java.io.File;
import java.io.FileOutputStream;

public class UploadBio extends javax.swing.JInternalFrame {

    /**
     * Creates new form UploadCourses1
     */
    
    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    public StaffAccInfo p;
    private DPFPTemplate template;
    
    public UploadBio(StaffAccInfo p) {
        this.p = p;
        DBConnection.connect();
        initComponents();
        init();
        start();
    }
    
    protected void init(){
        capturer.addDataListener(new DPFPDataAdapter() {
            @Override public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint sample was captured.");
                    setPrompt("Scan the same fingerprint again.");
                    process(e.getSample());
                }});
            }
        });
        capturer.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was connected.");
                }});
            }
            @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was disconnected.");
                }});
            }
        });
        capturer.addSensorListener(new DPFPSensorAdapter() {
            @Override public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was touched.");
                }});
            }
            @Override public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The finger was removed from the fingerprint reader.");
                }});
            }
        });
        capturer.addImageQualityListener(new DPFPImageQualityAdapter() {
            @Override public void onImageQuality(final DPFPImageQualityEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    if (e.getFeedback().equals(DPFPCaptureFeedback.CAPTURE_FEEDBACK_GOOD))
                        makeReport("The quality of the fingerprint sample is good.");
                    else
                        makeReport("The quality of the fingerprint sample is poor.");
                }});
            }
        });
    }

    protected void process(DPFPSample sample)
    {
        // Draw fingerprint sample image.
        drawPicture(convertSampleToBitmap(sample));
        
        // Process the sample and create a feature set for the enrollment purpose.
        DPFPFeatureSet features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

        // Check quality of the sample and add to enroller if it's good
        if (features != null) try
        {
            makeReport("The fingerprint feature set was created.");
            enroller.addFeatures(features);		// Add feature set to template.
        }
        catch (DPFPImageQualityException ex) { }
        finally {
            updateStatus();

            // Check if template has been created.
            switch(enroller.getTemplateStatus())
            {
                case TEMPLATE_STATUS_READY:	// report success and stop capturing
                    stop();
                    insert1.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "Finger print enrolment completed, click next to continue registration", "Information", JOptionPane.INFORMATION_MESSAGE);
                    setTemplate(enroller.getTemplate());
                    setPrompt("Click Close, and then click Fingerprint Verification.");
                    break;

                case TEMPLATE_STATUS_FAILED:	// report failure and restart capturing
                    enroller.clear();
                    stop();
                    updateStatus();
                    //((MainForm)getOwner()).setTemplate(null);
                    JOptionPane.showMessageDialog(this, "The fingerprint template is not valid. Repeat fingerprint enrollment.", "Fingerprint Enrollment", JOptionPane.ERROR_MESSAGE);
                    start();
                    break;
            }
        }
    }

    public DPFPTemplate getTemplate() {
        return template;
    }
    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
    }
    
    protected void start()
    {
        capturer.startCapture();
        setPrompt("Using the fingerprint reader, scan your fingerprint.");
        JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint.");
    }

    protected void stop()
    {
        capturer.stopCapture();
    }

    public void setStatus(String string) {
        //status.setText(string);
        System.out.println(string);
    }
    public void setPrompt(String string) {
        //prompt.setText(string);
        System.out.println(string);
    }
    public void makeReport(String string) {
        //log.append(string + "\n");
        System.out.println(string);
    }

    public void drawPicture(Image image) {
        picture.setIcon(new ImageIcon(
        image.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_DEFAULT)));
    }

    protected Image convertSampleToBitmap(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    protected DPFPFeatureSet extractFeatures(DPFPSample sample, DPFPDataPurpose purpose)
    {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
                return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
                return null;
        }
    }
    
    private void updateStatus()
	{
            int count = enroller.getFeaturesNeeded();
            
            if(count > 0){
                JOptionPane.showMessageDialog(this, "Please scan thesame finger again, "+count+" more samples needed","Information", JOptionPane.INFORMATION_MESSAGE);
            } 
            setStatus(String.format("Fingerprint samples needed: %1$s", enroller.getFeaturesNeeded()));
	}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        insert = new javax.swing.JButton();
        insert1 = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Biometric Upload");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Add24.gif"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(428, 460));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Quit");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel5.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, 30));

        insert1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert1.setText("Insert the Information");
        insert1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert1ActionPerformed(evt);
            }
        });
        jPanel5.add(insert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 370, 80));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 240, 280));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("UPLOAD BIOMETRIC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insert() throws Exception{
        p.insert();
        
        String address = "staff_files\\";
        File f = new File(address);
        
        if(!f.exists()){
            f.mkdir();
        }

        File file = new File(address+p.getStaffID()+ ".fpt");

        FileOutputStream stream = new FileOutputStream(file);
        stream.write(getTemplate().serialize());
        stream.close();

        String sql = "insert into staff_bio_info (staff_id, bio) values (?,?)";
        PreparedStatement st;
        st = DBConnection.con.prepareStatement(sql);

        st.setInt(1,  p.getStaffID());
        st.setString(2,  ""+p.getStaffID()+ ".fpt");

        st.executeUpdate();
        System.out.println("Done6");
    }
    
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        stop();
    }//GEN-LAST:event_formInternalFrameClosed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        stop();
        this.dispose();
        this.hide();
    }//GEN-LAST:event_insertActionPerformed

    private void insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert1ActionPerformed
        try{
            if(picture.getIcon()==null){
                JOptionPane.showMessageDialog(this, "Student finger print has not been captured");
            }else{
                this.dispose();
                this.hide();
                
                DBConnection.con.setAutoCommit(false);

                insert();
                
                DBConnection.con.commit();
                JOptionPane.showMessageDialog(UploadBio.this, "Staff Successfully Registered","Staff Registered", JOptionPane.INFORMATION_MESSAGE);
                
                Thread runner = new Thread() {

                    public void run() {
                        StaffPersInfo upload = new StaffPersInfo();
                        desktop1.add(upload);
                        try {
                            upload.setSelected(true);
                        } catch (java.beans.PropertyVetoException e) {
                        }
                    }
                };
                runner.start(); 
            }   
        }catch(Exception ex){
            try{
                DBConnection.con.rollback();
            }catch(Exception exc){
                JOptionPane.showMessageDialog(this, "Issue","Error executing query", JOptionPane.OK_OPTION);
                System.err.println(exc.getMessage());
            }
            JOptionPane.showMessageDialog(this, "Issue","Error executing query", JOptionPane.OK_OPTION);
            System.err.println(ex.getMessage());
        }finally{
            try{
                DBConnection.con.setAutoCommit(true);
            }catch(Exception exc){
                JOptionPane.showMessageDialog(this, "Issue","Error executing query", JOptionPane.OK_OPTION);
                System.err.println(exc.getMessage());
            }
        }
    }//GEN-LAST:event_insert1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insert;
    private javax.swing.JButton insert1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
