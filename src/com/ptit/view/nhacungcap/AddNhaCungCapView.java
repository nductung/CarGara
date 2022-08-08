/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.view.nhacungcap;

import com.ptit.dao.NhaCungCapDAO;
import com.ptit.model.NhaCungCap;
import com.ptit.model.Nhanvien;
import javax.swing.JOptionPane;

/**
 *
 * @author TUNGND
 */
public class AddNhaCungCapView extends javax.swing.JFrame {

    Nhanvien nhanvien;
    NhaCungCapDAO nhaCungCapDAO;
    NhaCungCap nhaCungCap;

    /**
     * Creates new form AddCustomerView
     */
    public AddNhaCungCapView(Nhanvien nv) {
        initComponents();
        nhaCungCapDAO = new NhaCungCapDAO();
        nhanvien = nv;
        this.setLocationRelativeTo(null);
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
        jLabelMa = new javax.swing.JLabel();
        jLabelTen = new javax.swing.JLabel();
        jLabelDiaChi = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldMa = new javax.swing.JTextField();
        jTextFieldTen = new javax.swing.JTextField();
        jTextFieldDiaChi = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabelMoTa = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMoTa = new javax.swing.JTextArea();
        jLabelDienThoai = new javax.swing.JLabel();
        jTextFieldDienThoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMa.setText("Mã*");

        jLabelTen.setText("Tên*");

        jLabelDiaChi.setText("Địa chỉ*");

        jLabelEmail.setText("Email*");

        jTextFieldMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaActionPerformed(evt);
            }
        });

        jTextFieldDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaChiActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Thêm mới");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelMoTa.setText("Mô tả");

        jButtonBack.setText("Quay lại");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextAreaMoTa.setColumns(20);
        jTextAreaMoTa.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMoTa);

        jLabelDienThoai.setText("SĐT*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMoTa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDienThoai, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAdd))
                            .addComponent(jTextFieldDienThoai, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(123, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTen)
                    .addComponent(jTextFieldTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiaChi)
                    .addComponent(jTextFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDienThoai)
                    .addComponent(jTextFieldDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonAdd))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldMaActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        nhaCungCap = new NhaCungCap();
        nhaCungCap.setMa(jTextFieldMa.getText());
        nhaCungCap.setTen(jTextFieldTen.getText());
        nhaCungCap.setDiaChi(jTextFieldDiaChi.getText());
        nhaCungCap.setEmail(jTextFieldEmail.getText());
        nhaCungCap.setDienThoai(jTextFieldDienThoai.getText());
        nhaCungCap.setMoTa(jTextAreaMoTa.getText());

        if (isNhaCungCapValid(nhaCungCap)) {
            int row = nhaCungCapDAO.createNhaCungCap(nhaCungCap);
            if (row == 0) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi");
            } else if (row == -1) {
                JOptionPane.showMessageDialog(this, "Mã nhà cung cấp đã tồn tại");
            } else {
                JOptionPane.showMessageDialog(this, "Đã thêm vào cơ sở dữ liệu");
                this.setVisible(false);
                SearchNhaCungCapView searchCustomerView = new SearchNhaCungCapView(nhanvien);
                searchCustomerView.setVisible(true);
                searchCustomerView.setTitle("Nhà cung cấp ");
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    public static boolean isNhaCungCapValid(NhaCungCap ncc) {
        if (isStringValid(ncc.getMa()) && isStringValid(ncc.getDiaChi()) && isStringValid(ncc.getDienThoai()) && isStringValid(ncc.getEmail()) && isStringValid(ncc.getTen())) {
            return true;
        }
        return false;
    }

    public static boolean isStringValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Thông báo", 1);
            return false;
        }
        if (str.length() > 255) {
            JOptionPane.showMessageDialog(null, "Không được quá 255 kí tự!", "Thông báo", 1);
            return false;
        }
        return true;
    }

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchNhaCungCapView searchCustomerView = new SearchNhaCungCapView(nhanvien);
        searchCustomerView.setVisible(true);
        searchCustomerView.setTitle("Nhà cung cấp ");
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaChiActionPerformed

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
            java.util.logging.Logger.getLogger(AddNhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNhaCungCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNhaCungCapView(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabelDiaChi;
    private javax.swing.JLabel jLabelDienThoai;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMa;
    private javax.swing.JLabel jLabelMoTa;
    private javax.swing.JLabel jLabelTen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaMoTa;
    private javax.swing.JTextField jTextFieldDiaChi;
    private javax.swing.JTextField jTextFieldDienThoai;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMa;
    private javax.swing.JTextField jTextFieldTen;
    // End of variables declaration//GEN-END:variables
}
