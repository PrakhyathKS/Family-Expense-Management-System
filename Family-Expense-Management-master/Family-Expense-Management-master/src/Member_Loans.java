
import javax.swing.JOptionPane;


public class Member_Loans extends javax.swing.JFrame {

    public Member_Loans() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(26, 69, 124));
        jPanel4.setForeground(new java.awt.Color(255, 255, 241));
        jPanel4.setMaximumSize(new java.awt.Dimension(1980, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(1980, 100));
        jPanel4.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 241));
        jLabel3.setText("FAMILY EXPENSE MANAGER");

        ExitBut.setBackground(new java.awt.Color(26, 69, 124));
        ExitBut.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ExitBut.setForeground(new java.awt.Color(255, 255, 255));
        ExitBut.setText("CLOSE");
        ExitBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        ExitBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBut.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 773, Short.MAX_VALUE)
                .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(529, 529, 529))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2030, -1));

        jPanel3.setBackground(new java.awt.Color(255, 253, 248));
        jPanel3.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel3.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel3.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(163, 224, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel7.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel7.setPreferredSize(new java.awt.Dimension(640, 500));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOANS");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 360, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 241));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton4.setForeground(new java.awt.Color(26, 69, 124));
        jButton4.setText("LOGOUT");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 60));

        jButton6.setBackground(new java.awt.Color(255, 255, 241));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton6.setForeground(new java.awt.Color(26, 69, 124));
        jButton6.setText("MANAGE LOANS");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 70));

        jButton8.setBackground(new java.awt.Color(255, 255, 241));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton8.setForeground(new java.awt.Color(26, 69, 124));
        jButton8.setText("BACK");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, 70));

        jButton9.setBackground(new java.awt.Color(255, 255, 241));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton9.setForeground(new java.awt.Color(26, 69, 124));
        jButton9.setText("VIEW");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, 80));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 720));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loans.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 1040, 720));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 100, 2080, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
        Login.main(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Member_Loans_Manage.main(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            Member_Loans_View.main(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         dispose();   
        Member_Home.main(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButActionPerformed

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
            java.util.logging.Logger.getLogger(Member_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Loans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
