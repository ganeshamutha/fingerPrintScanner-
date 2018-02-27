/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isense.scanner;

import MFS100.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ganesh
 */
public class fingerPrintScannerUI extends javax.swing.JFrame {

    private MFS100              scannerDevice;
    private mfsDeviceHandler    deviceEventHandler;
    private DeviceInfo          deviceInfo;
    private String              repoPath;
    private repositoryHandler   repoHandler;
    /**
     * Creates new form FingerPrintScanner
     * @throws java.lang.Exception
     */
    public fingerPrintScannerUI() throws Exception {
        
        initComponents();
        
        welcomePanel.setVisible(true);
        registrarPanel.setVisible(false);
        searchPanel.setVisible(false);
        infoPersonPanel.setVisible(false);
        
        //Clear Repo
        repoPath = "";
        
        //Find device and update Status.
        devStatusValLabel.setText("Off");

        //Device Handler
        deviceEventHandler = new mfsDeviceHandler();
        
        //Scanner Device Instance.
        scannerDevice = new MFS100(deviceEventHandler, "");
        
        //Repository 
        repoHandler   = new repositoryHandler();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanel = new javax.swing.JPanel();
        regButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        devStatusLabel = new javax.swing.JLabel();
        devStatusValLabel = new javax.swing.JLabel();
        infoPersonPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leftCombo = new javax.swing.JComboBox<>();
        rightCombo = new javax.swing.JComboBox<>();
        nameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        fingerNumLabel = new javax.swing.JLabel();
        infoBackButton = new javax.swing.JButton();
        infoDoneButton = new javax.swing.JButton();
        sexInputCombo = new javax.swing.JComboBox<>();
        registrarPanel = new javax.swing.JPanel();
        scannedImageLabel = new javax.swing.JLabel();
        scanButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        scannedImageLabel1 = new javax.swing.JLabel();
        ansiFileButton = new javax.swing.JButton();
        backSearchButton = new javax.swing.JButton();
        scanButton2 = new javax.swing.JButton();
        isoFileButton = new javax.swing.JButton();
        appMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        settingMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        welcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        welcomePanel.add(regButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 100, -1));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        welcomePanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, -1));

        devStatusLabel.setText("Device Status :");
        welcomePanel.add(devStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        devStatusValLabel.setText("Off");
        welcomePanel.add(devStatusValLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        infoPersonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setText("Finger Number");
        infoPersonPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel2.setText("Name");
        infoPersonPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, -1));

        jLabel3.setText("Age");
        infoPersonPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        jLabel4.setText("Sex");
        infoPersonPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, -1));

        leftCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEFT Hand", "L_Thumb", "L_Index", "L_Middle", "L_Ring", "L_Pinky" }));
        infoPersonPanel.add(leftCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        rightCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RIGHT Hand", "R_Thumb", "R_Index", "R_Middle", "R_Ring", "R_Pinky", " " }));
        infoPersonPanel.add(rightCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        infoPersonPanel.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, -1));

        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        infoPersonPanel.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, -1));
        infoPersonPanel.add(fingerNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, -1));

        infoBackButton.setText("Back");
        infoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBackButtonActionPerformed(evt);
            }
        });
        infoPersonPanel.add(infoBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        infoDoneButton.setText("Done");
        infoDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDoneButtonActionPerformed(evt);
            }
        });
        infoPersonPanel.add(infoDoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        sexInputCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", " " }));
        infoPersonPanel.add(sexInputCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        welcomePanel.add(infoPersonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 279));

        getContentPane().add(welcomePanel, "card2");

        registrarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scannedImageLabel.setBackground(new java.awt.Color(255, 255, 255));
        scannedImageLabel.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        scannedImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scannedImageLabel.setText("Scanned Image");
        scannedImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registrarPanel.add(scannedImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 120));

        scanButton.setText("Start Scan");
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        registrarPanel.add(scanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        registrarPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, -1));

        getContentPane().add(registrarPanel, "card3");

        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scannedImageLabel1.setBackground(new java.awt.Color(255, 255, 255));
        scannedImageLabel1.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        scannedImageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scannedImageLabel1.setText("Scanned Image");
        scannedImageLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchPanel.add(scannedImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 120));

        ansiFileButton.setText("ANSI-FILE");
        ansiFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansiFileButtonActionPerformed(evt);
            }
        });
        searchPanel.add(ansiFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        backSearchButton.setText("Back");
        backSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSearchButtonActionPerformed(evt);
            }
        });
        searchPanel.add(backSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 110, -1));

        scanButton2.setText("Start Scan");
        scanButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButton2ActionPerformed(evt);
            }
        });
        searchPanel.add(scanButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        isoFileButton.setText("ISO-FILE");
        isoFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isoFileButtonActionPerformed(evt);
            }
        });
        searchPanel.add(isoFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, -1));

        getContentPane().add(searchPanel, "card4");

        fileMenu.setText("File");

        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        appMenuBar.add(fileMenu);

        settingMenu.setText("Settings");

        jMenuItem2.setText("SetRepository");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        settingMenu.add(jMenuItem2);

        appMenuBar.add(settingMenu);

        helpMenu.setText("Help");
        appMenuBar.add(helpMenu);

        setJMenuBar(appMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed

        if(repoPath.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please set the Repository through settings");
            return;
        }

        //scannerDevice.
        int retValue  = scannerDevice.Init();
        
        if(retValue == 0) {
            
            deviceInfo = scannerDevice.GetDeviceInfo();
            
            //TODO: Intialized but no Udev setup done.

            devStatusValLabel.setText("On");
            welcomePanel.setVisible(false);

            //Show Register Panel.    
            registrarPanel.setVisible(true);
        }
        else {
            //Device Initiliazation failed.
            JOptionPane.showMessageDialog(rootPane, "Error:  " + scannerDevice.GetLastError() + " (" + String.valueOf(retValue) + ")");
        }
    }//GEN-LAST:event_regButtonActionPerformed

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        
        FingerData  fData;
        int         fQuality = 60;  //Quality 
        int         fTimeOut = 1500 ; //Milliseconds
        boolean     fShowPreview = false;
        int         fRetValue = 0;
        
        if(scannerDevice.IsConnected()) {
            System.out.println("The Device is connected");
        }else {
            System.out.println("The Device is NOT connected");
            return;
        }
        
        fData = new FingerData();
        
        //fRetValue = scannerDevice.StartCapture(fQuality, fTimeOut, fShowPreview);
        
        //if(fRetValue == 0) {
        //    System.out.println("Scanning started successfully ");
        //}
        
        //TODO:
        //Try for 4 time for best Quality and Nfiq  
        //The best Quality > 65 and Nfiq 1,2,3.
        
        fRetValue = scannerDevice.AutoCapture(fData, fQuality, fTimeOut, fShowPreview);
        
        if(fRetValue == 0) {
            
            System.out.println("The Quality Level : " + String.valueOf(fData.Quality()));
            System.out.println("The Nfig    Level : " + String.valueOf(fData.Nfiq()));
            
            //Data in Acceptable range.
            //deviceEventHandler.storeData(fData);
            
        }else {
             JOptionPane.showMessageDialog(rootPane, "Error:  " + scannerDevice.GetLastError() + " (" + String.valueOf(fRetValue) + ")");
             return;
        }
        
        //Show Register Panel.    
        registrarPanel.setVisible(false);
        infoPersonPanel.setVisible(true);
        welcomePanel.setVisible(false);


    }//GEN-LAST:event_scanButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         welcomePanel.setVisible(true);
         registrarPanel.setVisible(false);

    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(repoPath.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please set the Repository through settings");
            return;
        }
         welcomePanel.setVisible(false);
         searchPanel.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void ansiFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansiFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansiFileButtonActionPerformed

    private void backSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSearchButtonActionPerformed
        // TODO add your handling code here:
         welcomePanel.setVisible(true);
         searchPanel.setVisible(false);
    }//GEN-LAST:event_backSearchButtonActionPerformed

    private void scanButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanButton2ActionPerformed

    private void isoFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isoFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isoFileButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        if(!repoPath.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Repo Already Configured to : " + repoPath);
            return;
        }
            
        JFileChooser jfc = new JFileChooser();
        
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int retValue =jfc.showOpenDialog(this);  
        
        if(retValue == JFileChooser.APPROVE_OPTION) {
            File repo = jfc.getSelectedFile();
            repoPath = repo.getAbsolutePath();
            
            //set Path
            repoHandler.setRepoPath(repoPath);
            
            JOptionPane.showMessageDialog(rootPane, "Repo Configured to : " + repoPath);
        }
        else {
            //Not Set !
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void infoDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDoneButtonActionPerformed

        infoPerson pInfo = new infoPerson();
        
        //TODO Validate Input.
        
        pInfo.setAge(Integer.valueOf(ageText.getText()));
        pInfo.setName(nameText.getText());
        pInfo.setSex(sexInputCombo.getSelectedItem().toString());
        
        if(leftCombo.getSelectedIndex() > 0)
        {
            pInfo.setFingerNumber(leftCombo.getSelectedItem().toString());
            fingerNumLabel.setText(rightCombo.getSelectedItem().toString());
        }
        else {
            pInfo.setFingerNumber(rightCombo.getSelectedItem().toString());
            fingerNumLabel.setText(rightCombo.getSelectedItem().toString());
        }
        
        registrarPanel.setVisible(true);
        infoPersonPanel.setVisible(false);
        welcomePanel.setVisible(false);
        
    }//GEN-LAST:event_infoDoneButtonActionPerformed

    private void infoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBackButtonActionPerformed
        // TODO add your handling code here:
        registrarPanel.setVisible(true);
        infoPersonPanel.setVisible(false);
        welcomePanel.setVisible(false);
    }//GEN-LAST:event_infoBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(fingerPrintScannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fingerPrintScannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fingerPrintScannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fingerPrintScannerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fingerPrintScannerUI scannerUI;
                
                try {
                    scannerUI = new fingerPrintScannerUI();
                }
                catch(Exception e){
                    System.out.println("Exception " + e.getMessage());
                    return;
                }
                scannerUI.setLocationRelativeTo(null);
                scannerUI.setResizable(false);
                scannerUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JButton ansiFileButton;
    private javax.swing.JMenuBar appMenuBar;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backSearchButton;
    private javax.swing.JLabel devStatusLabel;
    private javax.swing.JLabel devStatusValLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fingerNumLabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton infoBackButton;
    private javax.swing.JButton infoDoneButton;
    private javax.swing.JPanel infoPersonPanel;
    private javax.swing.JButton isoFileButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JComboBox<String> leftCombo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton regButton;
    private javax.swing.JPanel registrarPanel;
    private javax.swing.JComboBox<String> rightCombo;
    private javax.swing.JButton scanButton;
    private javax.swing.JButton scanButton2;
    private javax.swing.JLabel scannedImageLabel;
    private javax.swing.JLabel scannedImageLabel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JMenu settingMenu;
    private javax.swing.JComboBox<String> sexInputCombo;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
