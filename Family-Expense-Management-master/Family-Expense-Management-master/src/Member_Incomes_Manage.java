
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class Member_Incomes_Manage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;

    ResultSet rs;

    public Member_Incomes_Manage() {
        initComponents();
        con = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        FetchBut = new javax.swing.JButton();
        txtAmt = new javax.swing.JTextField();
        txtIid = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
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

        txtAmt.setBackground(new java.awt.Color(255, 255, 242));
        txtAmt.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmtActionPerformed(evt);
            }
        });

        txtIid.setBackground(new java.awt.Color(255, 255, 242));
        txtIid.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtIid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIidActionPerformed(evt);
            }
        });

        txtDate.setBackground(new java.awt.Color(255, 255, 242));
        txtDate.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("AMOUNT :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("IID :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("DATE :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("TYPE :");

        txtType.setBackground(new java.awt.Color(255, 255, 242));
        txtType.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
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
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel8)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtIid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FetchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FetchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("INCOME FORM");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 300, 69));

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
            String IID = txtIid.getText();
            pst = con.prepareStatement("select * from incomes where iid=? and user=?");
            pst.setString(1, IID);
            pst.setString(2, Login.usern);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtType.setText(rs.getString(3));
                txtAmt.setText(rs.getString(4));
                txtDate.setText(rs.getString(5));
                JOptionPane.showMessageDialog(this, "Fetched Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "IID not found!");
                txtType.setText("");
                txtAmt.setText("");
                txtDate.setText("");
                txtIid.setText("");
                txtType.requestFocus();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void txtAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmtActionPerformed

    private void txtIidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIidActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String type, amount, date, iid;
        type = txtType.getText();
        amount = txtAmt.getText();
        date = txtDate.getText();
        iid = txtIid.getText();

        try {
            if (!iid.trim().isEmpty() || !type.trim().isEmpty() || !amount.trim().isEmpty() || !date.trim().isEmpty()) {
                pst = con.prepareStatement("select * from incomes where iid=? and user=?");
                pst.setString(1, iid);
                pst.setString(2, Login.usern);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("update incomes set type=?,amount=?,date=? where iid=? and user=?");
                    pst.setString(1, type);
                    pst.setString(2, amount);
                    pst.setString(3, date);
                    pst.setString(4, iid);
                    pst.setString(5, Login.usern);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Updated Successfully");
                    txtType.setText("");
                    txtAmt.setText("");
                    txtDate.setText("");
                    txtIid.setText("");
                    txtType.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No income found with IID=" + iid);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all the details !");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String username = Login.usern;
            String type, amount, date;

            type = txtType.getText();
            amount = txtAmt.getText();
            date = txtDate.getText();
            if (!type.trim().isEmpty() || !amount.trim().isEmpty() || !date.trim().isEmpty()) {
                pst = con.prepareStatement("insert into incomes(user,type,amount,date)values(?,?,?,?)");
                pst.setString(1, username);
                pst.setString(2, type);
                pst.setString(3, amount);
                pst.setString(4, date);

                pst.executeUpdate();

                txtType.setText("");
                txtAmt.setText("");

                txtDate.setText("");
                txtType.requestFocus();

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
            String iid = txtIid.getText();
            if (iid.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a valid IID ");
            } else {
                pst = con.prepareStatement("select * from incomes where iid=? and user=?");
                pst.setString(1, iid);
                pst.setString(2, Login.usern);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("delete from incomes where  iid=? and user=? ");
                    pst.setString(2, Login.usern);
                    pst.setString(1, iid);
                    pst.executeUpdate();
                    txtIid.setText("");
                    JOptionPane.showMessageDialog(this, "Record Deleted!");
                    txtType.setText("");
                    txtAmt.setText("");
                    txtDate.setText("");
                    txtType.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No income found with IID = " + iid);
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Please try again!");
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
            java.util.logging.Logger.getLogger(Member_Incomes_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Incomes_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Incomes_Manage().setVisible(true);
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
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtIid;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
