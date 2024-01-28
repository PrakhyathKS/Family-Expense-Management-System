
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class Member_Goals_Manage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    
    ResultSet rs;

    public Member_Goals_Manage() {
        initComponents();
        con = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        FetchBut = new javax.swing.JButton();
        txtEDate = new javax.swing.JTextField();
        txtGid = new javax.swing.JTextField();
        txtSDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGoal = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 242));
        jPanel7.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(192, 223, 241));

        FetchBut.setBackground(new java.awt.Color(255, 255, 242));
        FetchBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        FetchBut.setForeground(new java.awt.Color(42, 68, 146));
        FetchBut.setText("SEARCH");
        FetchBut.setToolTipText("");
        FetchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchButActionPerformed(evt);
            }
        });

        txtEDate.setBackground(new java.awt.Color(255, 255, 242));
        txtEDate.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtEDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEDate.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtEDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDateActionPerformed(evt);
            }
        });

        txtGid.setBackground(new java.awt.Color(255, 255, 242));
        txtGid.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtGid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGidActionPerformed(evt);
            }
        });

        txtSDate.setBackground(new java.awt.Color(255, 255, 242));
        txtSDate.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtSDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("END DATE :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("GID :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("START DATE :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("GOAL :");

        txtGoal.setBackground(new java.awt.Color(255, 255, 242));
        txtGoal.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtGoal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoalActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 242));
        jButton9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(42, 68, 146));
        jButton9.setText("UPDATE");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 242));
        jButton8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(42, 68, 146));
        jButton8.setText(" ADD");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 242));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(42, 68, 146));
        jButton5.setText("DELETE");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtGid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(FetchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(FetchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("GOALS FORM");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 260, 69));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
        try {

            String GID = txtGid.getText();

            pst = con.prepareStatement("select * from goals where gid=? and user= ?");
            pst.setString(1, GID);
            pst.setString(2, Login.usern);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtGoal.setText(rs.getString(3));
                txtEDate.setText(rs.getString(4));
                txtSDate.setText(rs.getString(5));
                JOptionPane.showMessageDialog(this, "Fetched Successfully");

            } else {
                JOptionPane.showMessageDialog(this, "GID not found!");
                txtGoal.setText("");
                txtEDate.setText("");
                txtSDate.setText("");
                txtGid.setText("");
                txtGoal.requestFocus();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void txtEDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDateActionPerformed

    private void txtGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGidActionPerformed

    private void txtSDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDateActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoalActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String goal, sdate, edate, gid;
        goal = txtGoal.getText();
        edate = txtEDate.getText();
        sdate = txtSDate.getText();
        gid = txtGid.getText();

        try {
            if (!gid.trim().isEmpty() || !edate.trim().isEmpty() || !sdate.trim().isEmpty() || !goal.trim().isEmpty()) {
                pst = con.prepareStatement("select * from goals where gid=? and user = ?");
                pst.setString(1, gid);
                pst.setString(2, Login.usern);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("update goals set goal=?,startdate=?,enddate=? where gid=? and user=?");
                    pst.setString(1, goal);
                    pst.setString(2, sdate);
                    pst.setString(3, edate);
                    pst.setString(4, gid);
                    pst.setString(5, Login.usern);
                    pst.executeUpdate();    
                    JOptionPane.showMessageDialog(this, "Updated Successfully");
                    txtGoal.setText("");
                    txtEDate.setText("");
                    txtSDate.setText("");
                    txtGid.setText("");
                    txtGoal.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No goal found with GID=" + gid);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all the details !");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);

        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String username = Login.usern;
            String goal, sdate, edate;

            goal = txtGoal.getText();
            sdate = txtSDate.getText();
            edate = txtEDate.getText();
            if (!edate.trim().isEmpty() || !sdate.trim().isEmpty() || !goal.trim().isEmpty()) {

                pst = con.prepareStatement("insert into goals(user,goal,startdate,enddate)values(?,?,?,?)");
                pst.setString(1, username);
                pst.setString(2, goal);
                pst.setString(3, sdate);
                pst.setString(4, edate);
                pst.executeUpdate();
                txtGoal.setText("");
                txtSDate.setText("");
                txtEDate.setText("");
                txtGoal.requestFocus();

                JOptionPane.showMessageDialog(this, "Added Successfully");
            } else {
                JOptionPane.showMessageDialog(this, " Please fill in all the details!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            String gid = txtGid.getText();
            if (gid.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a valid GID ");
            } else {
                pst = con.prepareStatement("select * from goals where gid= ? and user = ?");
                pst.setString(2, Login.usern);
                pst.setString(1, gid);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("delete from goals where  gid=? and user=? ");
                    pst.setString(2, Login.usern);
                    pst.setString(1, gid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Goal Deleted!");
                    txtGoal.setText("");
                    txtSDate.setText("");
                    txtEDate.setText("");
                    txtGoal.requestFocus();
                    txtGid.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No goal found with GID = " + gid);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Goals_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtEDate;
    private javax.swing.JTextField txtGid;
    private javax.swing.JTextField txtGoal;
    private javax.swing.JTextField txtSDate;
    // End of variables declaration//GEN-END:variables
}
