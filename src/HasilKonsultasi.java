/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZULFA
 */

import java.awt.List;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.sql.*;
import java.util.Collections;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class HasilKonsultasi extends javax.swing.JFrame {

    /**
     * Creates new form HasilKonsultasi
     */
    
   String resultDiagnosa = null;
   Statement st;
   ResultSet rs;
   Connection cn = database.kerusakandb.configDB();
    
    public HasilKonsultasi(String resultHasilDiagnosa ) {
        initComponents();
        resultDiagnosa = resultHasilDiagnosa;
        labelResult.setText(resultDiagnosa);
    }

    HasilKonsultasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelResult = new javax.swing.JLabel();
        btnPrintResult = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnUlangiKonsultasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(labelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 211, 520, 39));

        btnPrintResult.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPrintResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        btnPrintResult.setText("Print report");
        btnPrintResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintResultActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrintResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 381, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Hasil Diagnosa Kerusakan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 98, -1, -1));

        jPanel1.setBackground(new java.awt.Color(243, 242, 246));

        jPanel3.setBackground(new java.awt.Color(116, 118, 97));

        btnUlangiKonsultasi.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnUlangiKonsultasi.setText("Ulangi konsultasi");
        btnUlangiKonsultasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUlangiKonsultasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUlangiKonsultasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnUlangiKonsultasi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 625, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 977, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1245, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintResultActionPerformed
        // TODO add your handling code here:
        try {
          JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\ZULFA\\Documents\\NetBeansProjects\\taSistemPakarKerusakan\\src\\reportKerusakan.jrxml");
          Map<String, Object> parameters = new HashMap<>();
          JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, cn);
          JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPrintResultActionPerformed

    private void btnUlangiKonsultasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUlangiKonsultasiActionPerformed
        // TODO add your handling code here:
            int confirm = JOptionPane.showConfirmDialog(null, "Jika anda mengulangi konsultasi maka hasil report sebelumnya akan hilang, Anda yakin ingin mengulangi konsultasi?");
            if(confirm == 0){
            try {
            String sql = "DELETE FROM konsultasi";
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI DELETE");
//            resetResult(resultDiagnosa);
            Konsultasi konsultasi = new Konsultasi();
            konsultasi.setVisible(true);
            this.dispose();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
            }
       
    }//GEN-LAST:event_btnUlangiKonsultasiActionPerformed

//    public void resetResult(String resetDiagnosa){
//        resetDiagnosa = "";
//    }
    
    
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
            java.util.logging.Logger.getLogger(HasilKonsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HasilKonsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HasilKonsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HasilKonsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HasilKonsultasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintResult;
    private javax.swing.JButton btnUlangiKonsultasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel labelResult;
    // End of variables declaration//GEN-END:variables
}