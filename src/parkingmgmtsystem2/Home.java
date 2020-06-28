/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmgmtsystem2;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import parkingmgmtsystem2.Dao.ParkingDao;
import parkingmgmtsystem2.model.Parking;

/**
 *
 * @author dell
 */

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    public Home() {
        initComponents();
        currentDate();
        this.setLocationRelativeTo(null);
    }
    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        lbl_date.setText((month+1)+"/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+":"+(minute)+":"+second);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        panelEntry = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfVehicle = new javax.swing.JTextField();
        tfMobile = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        tfStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnEntry = new javax.swing.JButton();
        labelminimize = new javax.swing.JLabel();
        labelClose = new javax.swing.JLabel();
        btnBike = new javax.swing.JToggleButton();
        btnCar = new javax.swing.JToggleButton();
        lbl_log = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_report = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelEntry.setBackground(new java.awt.Color(18, 110, 169));

        jLabel1.setText("Vehicle no.");

        jLabel2.setText("Mobile no.");

        tfVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVehicleActionPerformed(evt);
            }
        });

        tfMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMobileActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(106, 26, 210));
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        tfStatus.setForeground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(82, 6, 145));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEntry.setBackground(new java.awt.Color(14, 8, 241));
        btnEntry.setForeground(new java.awt.Color(255, 255, 255));
        btnEntry.setText("ENTRY");
        btnEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntryActionPerformed(evt);
            }
        });

        labelminimize.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelminimize.setForeground(new java.awt.Color(255, 255, 255));
        labelminimize.setText("-");
        labelminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelminimizeMouseClicked(evt);
            }
        });

        labelClose.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelClose.setForeground(new java.awt.Color(255, 255, 255));
        labelClose.setText("X");
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClose)
                    .addComponent(labelminimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntry)
                    .addComponent(btnExit))
                .addGap(39, 39, 39))
        );

        btnGroup.add(btnBike);
        btnBike.setForeground(new java.awt.Color(255, 255, 255));
        btnBike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b.png"))); // NOI18N
        btnBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBikeActionPerformed(evt);
            }
        });

        btnGroup.add(btnCar);
        btnCar.setForeground(new java.awt.Color(255, 255, 255));
        btnCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c_1.png"))); // NOI18N
        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        lbl_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.jpg"))); // NOI18N
        lbl_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logMouseClicked(evt);
            }
        });

        lbl_date.setText("date");

        lbl_time.setText("time");

        lbl_report.setForeground(new java.awt.Color(204, 204, 255));
        lbl_report.setText("Report");
        lbl_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEntryLayout = new javax.swing.GroupLayout(panelEntry);
        panelEntry.setLayout(panelEntryLayout);
        panelEntryLayout.setHorizontalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btnBike)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                        .addComponent(lbl_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_report, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_log)
                        .addContainerGap())))
        );
        panelEntryLayout.setVerticalGroup(
            panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntryLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(btnEnter)
                        .addGap(18, 18, 18)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_log, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntryLayout.createSequentialGroup()
                                .addComponent(lbl_report)
                                .addGap(14, 14, 14))))
                    .addGroup(panelEntryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_date)
                            .addComponent(lbl_time))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        
        Exit e=new Exit();
        e.setVisible(true);
        e.pack();
        e.setLocationRelativeTo(null);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       
        
        
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntryActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        Parking p=new Parking();
        boolean status=true; 
        
//        if(tfVehicletype.getText().equals("")){
//            JOptionPane.showMessageDialog(null,"please enter vehicle type","Failed",JOptionPane.WARNING_MESSAGE);
//            status=false;
//           
//        }
//        else{
//            
//            p.setVehicle_type(tfVehicletype.getText());
//        }

        if(btnBike.isSelected()){
            p.setVehicle_type("Bike");
        }
        else if(btnCar.isSelected()){
            p.setVehicle_type("car");
        }
        else{
            status=false;
            JOptionPane.showMessageDialog(null, "please select vehivle type","Failed",JOptionPane.WARNING_MESSAGE);
        }
        
        if(tfVehicle.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter Vehicle number","Failed",JOptionPane.WARNING_MESSAGE);
         
        status=false;
           
       
    }                                        
        else{
             p.setVehicle_no((tfVehicle.getText()));
        }
        
        try{
        if(tfMobile.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter mobile number","Failed",JOptionPane.WARNING_MESSAGE);
             
            status=false;
            
        }
        
        else{
           p.setMobile(Long.parseLong(tfMobile.getText()));
            
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter valid phone number","Failed",JOptionPane.WARNING_MESSAGE);
            status=false;
        }
        
        p.setStartDate(LocalTime.now());
        p.setTokenValue("unexpired");
        p.setParkingDate(LocalDate.now());
        p.setParkingDuration(0);
        p.setAmount(0);
//        p.setExitDate(null);
//System.out.println(p.getExitDate());
            //perform databse operation if fields are filled up properly
            if(status){
                if(new ParkingDao().addEntry(p)){
                    tfStatus.setText("");
                    long mobile=p.getMobile();
                    String tkValue="unexpired";
                   Parking pk=ParkingDao.selectToken(mobile,tkValue);
                    int s=pk.getToken();
                    JOptionPane.showMessageDialog(null,"token is: "+s,"Success",JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                   JOptionPane.showMessageDialog(null,"Server Failed","Failed",JOptionPane.WARNING_MESSAGE);
                }
            }
            if(status){
                btnCar.setSelected(false);
                btnBike.setSelected(false);
                tfVehicle.setText("");
                tfMobile.setText("");
            }
            
    }//GEN-LAST:event_btnEnterActionPerformed

    private void tfVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVehicleActionPerformed

    private void labelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_labelCloseMouseClicked

    private void labelminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelminimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_labelminimizeMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBikeActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarActionPerformed

    private void tfMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMobileActionPerformed

    private void lbl_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logMouseClicked
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_lbl_logMouseClicked

    private void lbl_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reportMouseClicked
        // TODO add your handling code here:
        Report r=new Report();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lbl_reportMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBike;
    private javax.swing.JToggleButton btnCar;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEntry;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelminimize;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_log;
    private javax.swing.JLabel lbl_report;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JPanel panelEntry;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JLabel tfStatus;
    private javax.swing.JTextField tfVehicle;
    // End of variables declaration//GEN-END:variables
}
