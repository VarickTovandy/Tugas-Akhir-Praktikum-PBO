/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dist;

import java.awt.Cursor;

/**
 *
 * @author inter
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAddAdmin = new javax.swing.JLabel();
        btnShowAdmin = new javax.swing.JLabel();
        btnEditAdmin = new javax.swing.JLabel();
        AddAdmin = new javax.swing.JLabel();
        EditAdmin = new javax.swing.JLabel();
        ShowAdmin = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(74, 170, 155));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addGap(428, 428, 428))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnAddAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAddAdminMouseMoved(evt);
            }
        });
        btnAddAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAdminMouseClicked(evt);
            }
        });

        btnShowAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnShowAdminMouseMoved(evt);
            }
        });
        btnShowAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowAdminMouseClicked(evt);
            }
        });

        btnEditAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEditAdminMouseMoved(evt);
            }
        });
        btnEditAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditAdminMouseClicked(evt);
            }
        });

        AddAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Praktikum PBO\\src\\Pictures\\AdminAdd.png")); // NOI18N
        AddAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddAdminMouseMoved(evt);
            }
        });
        AddAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAdminMouseClicked(evt);
            }
        });

        EditAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Praktikum PBO\\src\\Pictures\\AdminEdit.png")); // NOI18N
        EditAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EditAdminMouseMoved(evt);
            }
        });
        EditAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAdminMouseClicked(evt);
            }
        });

        ShowAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Praktikum PBO\\src\\Pictures\\AdminShow.png")); // NOI18N
        ShowAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ShowAdminMouseMoved(evt);
            }
        });
        ShowAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowAdminMouseClicked(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Praktikum PBO\\src\\Pictures\\StudentRegistrationSystem.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(515, 515, 515))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddAdmin)
                        .addGap(31, 31, 31)
                        .addComponent(btnEditAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddAdmin))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnShowAdmin))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(EditAdmin)
                        .addGap(70, 70, 70)
                        .addComponent(ShowAdmin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnShowAdmin)
                    .addComponent(btnEditAdmin)
                    .addComponent(btnAddAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowAdmin)
                    .addComponent(EditAdmin)
                    .addComponent(AddAdmin))
                .addGap(122, 122, 122))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 1380, 680));

        jPanel6.setBackground(new java.awt.Color(74, 170, 155));

        btnBack.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBackMouseMoved(evt);
            }
        });
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnLogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLogoutMouseMoved(evt);
            }
        });
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(74, 170, 155));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Prak PBO\\TugasAkhir\\src\\Icons\\IconBack.png")); // NOI18N

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(74, 170, 155));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Logout");

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\inter\\OneDrive\\Documents\\Semester 4\\Tugas Akhir Prak PBO\\TugasAkhir\\src\\Icons\\IconLogout.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel20))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 976, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(btnLogout))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addContainerGap(77, Short.MAX_VALUE)
                            .addComponent(btnBack)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnEditAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAdminMouseClicked

    private void btnEditAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditAdminMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAdminMouseMoved

    private void btnShowAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowAdminMouseClicked

    private void btnShowAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowAdminMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowAdminMouseMoved

    private void btnAddAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAdminMouseClicked

    private void btnAddAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAdminMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAdminMouseMoved

    private void AddAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAdminMouseClicked
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        AddAdmin.setCursor(curl);
        this.dispose();
        AddAdmin a = new AddAdmin();
        a.setVisible(true);
    }//GEN-LAST:event_AddAdminMouseClicked

    private void AddAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAdminMouseMoved
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        AddAdmin.setCursor(curl);
    }//GEN-LAST:event_AddAdminMouseMoved

    private void EditAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAdminMouseClicked
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        EditAdmin.setCursor(curl);
        this.dispose();
        EditAdmin a = new EditAdmin();
        a.setVisible(true);
    }//GEN-LAST:event_EditAdminMouseClicked

    private void EditAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAdminMouseMoved
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        EditAdmin.setCursor(curl);
    }//GEN-LAST:event_EditAdminMouseMoved

    private void ShowAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAdminMouseClicked
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        ShowAdmin.setCursor(curl);
        this.dispose();
        ShowAdmin a = new ShowAdmin();
        a.setVisible(true);
    }//GEN-LAST:event_ShowAdminMouseClicked

    private void ShowAdminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAdminMouseMoved
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        ShowAdmin.setCursor(curl);
    }//GEN-LAST:event_ShowAdminMouseMoved

    private void btnBackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseMoved

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnLogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseMoved

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        btnBack.setCursor(curl);
        this.dispose();
        ProfileOption a = new ProfileOption();
        a.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        jPanel2.setCursor(curl);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        jPanel7.setCursor(curl);
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        Cursor curl = new Cursor(Cursor.HAND_CURSOR);
        jPanel7.setCursor(curl);
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseExited

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAdmin;
    private javax.swing.JLabel EditAdmin;
    private javax.swing.JLabel ShowAdmin;
    private javax.swing.JLabel btnAddAdmin;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnEditAdmin;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnShowAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
