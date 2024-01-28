import java.sql.*;
import javax.swing.JOptionPane;
import Backend.ConnectSQL;

public class Member_Loans_Manage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Member_Loans_Manage() {
        initComponents();
        con = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        txtCategory = new javax.swing.JTextField();
        txtPeriod = new javax.swing.JTextField();
        txtLid = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        txtAmt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtInterest = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
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

        jButton8.setBackground(new java.awt.Color(255, 255, 242));
        jButton8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(42, 68, 146));
        jButton8.setText("SEARCH");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        txtCategory.setBackground(new java.awt.Color(255, 255, 242));
        txtCategory.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtCategory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategory.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        txtPeriod.setBackground(new java.awt.Color(255, 255, 242));
        txtPeriod.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtPeriod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodActionPerformed(evt);
            }
        });

        txtLid.setBackground(new java.awt.Color(255, 255, 242));
        txtLid.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtLid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLidActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 55, 135));
        jLabel3.setText("CATEGORY :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 55, 135));
        jLabel5.setText("LOAN PERIOD :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("LID :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("DATE :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("NAME :");

        txtName.setBackground(new java.awt.Color(255, 255, 242));
        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
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

        txtAmt.setBackground(new java.awt.Color(255, 255, 242));
        txtAmt.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 55, 135));
        jLabel9.setText("INTEREST :");

        txtInterest.setBackground(new java.awt.Color(255, 255, 242));
        txtInterest.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterestActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 242));
        jButton10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(42, 68, 146));
        jButton10.setText(" ADD");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPeriod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(200, 200, 200))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(txtLid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("LOAN FORM");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 250, 69));

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            String LID = txtLid.getText();
            pst = con.prepareStatement("select * from loans where lid = ? and user= ?");
            pst.setString(1, LID);
            pst.setString(2, Login.usern);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtName.setText(rs.getString(3));
                txtAmt.setText(rs.getString(5));
                txtCategory.setText(rs.getString(4));
                txtDate.setText(rs.getString(6));
                txtInterest.setText(rs.getString(7));
                txtPeriod.setText(rs.getString(8));
                JOptionPane.showMessageDialog(this, "Fetched Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "LID not found!");
                txtName.setText("");
                txtAmt.setText("");
                txtInterest.setText("");
                txtDate.setText("");
                txtCategory.setText("");
                txtPeriod.setText("");
                txtLid.setText("");
                txtName.requestFocus();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodActionPerformed

    private void txtLidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLidActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String name, amount, category, interest, date, lid, period;
        name = txtName.getText();
        amount = txtAmt.getText();
        category = txtCategory.getText();
        interest = txtInterest.getText();
        date = txtDate.getText();
        lid = txtLid.getText();
        period = txtPeriod.getText();

        try {
            if (!lid.trim().isEmpty() || !name.trim().isEmpty() || !amount.trim().isEmpty() || !category.trim().isEmpty() || !interest.trim().isEmpty() || !date.trim().isEmpty() || !period.trim().isEmpty()) {
                pst = con.prepareStatement("select * from loans where lid = ? and user= ?");
                pst.setString(1, lid);
                pst.setString(2, Login.usern);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("update loans set name=?,amount=?,category=?,date=?,interest=?,loanperiod=? where lid=? and user=?");

                    pst.setString(1, name);
                    pst.setString(2, amount);
                    pst.setString(3, category);
                    pst.setString(4, date);
                    pst.setString(5, interest);
                    pst.setString(6, period);
                    pst.setString(7, lid);
                    pst.setString(8, Login.usern);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Updated Successfully");
                    txtName.setText("");
                    txtAmt.setText("");
                    txtInterest.setText("");
                    txtDate.setText("");
                    txtCategory.setText("");
                    txtPeriod.setText("");
                    txtLid.setText("");
                    txtName.requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No loan found with LID=" + lid);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Please fill in all the details !");
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);

        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmtActionPerformed

    private void txtInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterestActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String username = Login.usern;
            String name, category, date, amount, interest, period;

            name = txtName.getText();
            category = txtCategory.getText();
            date = txtDate.getText();
            amount = txtAmt.getText();
            interest = txtInterest.getText();
            period = txtPeriod.getText();

            if (name.trim().isEmpty() || !amount.trim().isEmpty() || !category.trim().isEmpty() || !interest.trim().isEmpty() || !date.trim().isEmpty() || !period.trim().isEmpty()) {
            
            pst = con.prepareStatement("insert into loans(user,name,category,amount,date,interest,loanperiod)values(?,?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, name);
            pst.setString(3, category);
            pst.setString(5, date);
            pst.setString(4, amount);
            pst.setString(6, interest);
            pst.setString(7, period);
            pst.executeUpdate();

            txtName.setText("");
            txtAmt.setText("");
            txtDate.setText("");
            txtPeriod.setText("");
            txtCategory.setText("");
            txtInterest.setText("");
            txtName.requestFocus();

            JOptionPane.showMessageDialog(this, "Added Successfully");
            }else
            {
                JOptionPane.showMessageDialog(this, "Please fill in all the details!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            String lid = txtLid.getText();
            if (lid.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a valid LID ");
            } else {
                pst = con.prepareStatement("select * from loans where lid =? and user= ?");
                pst.setString(1, lid);
                pst.setString(2, Login.usern);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("delete from loans where  Lid=? and user=? ");
                    pst.setString(2, Login.usern);
                    pst.setString(1, lid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Record Deleted!");
                    txtLid.setText("");
                    txtName.setText("");
                    txtAmt.setText("");
                    txtDate.setText("");
                    txtPeriod.setText("");
                    txtCategory.setText("");
                    txtInterest.setText("");
                    txtName.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No loan found with LID = " + lid);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Loans_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Loans_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAmt;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtLid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPeriod;
    // End of variables declaration//GEN-END:variables
}
