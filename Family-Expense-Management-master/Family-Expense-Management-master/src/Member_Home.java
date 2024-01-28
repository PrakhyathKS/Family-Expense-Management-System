
import javax.swing.JOptionPane;


public class Member_Home extends javax.swing.JFrame {

    public Member_Home() {
        initComponents();
        labUsername.setText(Login.usern);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(540, 540, 540))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2030, -1));

        jPanel1.setBackground(new java.awt.Color(255, 253, 248));
        jPanel1.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(163, 224, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel5.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel5.setPreferredSize(new java.awt.Dimension(640, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labUsername.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jPanel5.add(labUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 190, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 241));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(26, 69, 124));
        jButton1.setText("LOANS");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 320, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 241));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton2.setForeground(new java.awt.Color(26, 69, 124));
        jButton2.setText("LOGOUT");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 320, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 241));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton3.setForeground(new java.awt.Color(26, 69, 124));
        jButton3.setText("INCOMES");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, 70));

        jButton4.setBackground(new java.awt.Color(255, 255, 241));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton4.setForeground(new java.awt.Color(26, 69, 124));
        jButton4.setText("EXPENSES");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, 70));

        jButton6.setBackground(new java.awt.Color(255, 255, 241));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton6.setForeground(new java.awt.Color(26, 69, 124));
        jButton6.setText("INFO");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, 70));

        jButton5.setBackground(new java.awt.Color(255, 255, 241));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton5.setForeground(new java.awt.Color(26, 69, 124));
        jButton5.setText("SAVINGS");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 320, 70));

        jButton7.setBackground(new java.awt.Color(255, 255, 241));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 21)); // NOI18N
        jButton7.setForeground(new java.awt.Color(26, 69, 124));
        jButton7.setText("GOALS");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 69, 124), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 320, 70));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Welcome");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 710));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fam3.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 1030, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 100, 2080, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
      Member_Loans.main(null);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            Login.main(null); 
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           dispose();
           Member_Incomes.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
      Member_Expenses.main(null);
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 
        Member_Info.main(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Member_Savings.main(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        Member_Goals.main(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labUsername;
    // End of variables declaration//GEN-END:variables
}
