
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class Admin_Memeber_Manage extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Admin_Memeber_Manage() {
        initComponents();
        con = ConnectSQL.createC();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FetchBut = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        UpdateBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(540, 20, 925, 625));
        setLocation(new java.awt.Point(487, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 242));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(42, 68, 146));
        jButton5.setText(" ADD");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 484, 81, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("RELATION :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        txtRelation.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtRelation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRelation.setPreferredSize(new java.awt.Dimension(200, 50));
        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });
        jPanel3.add(txtRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 315, 250, 45));

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtName.setPreferredSize(new java.awt.Dimension(200, 50));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 95, 250, 45));

        txtDOB.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtDOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDOB.setPreferredSize(new java.awt.Dimension(200, 50));
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        jPanel3.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 146, 250, 45));

        txtGender.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGender.setPreferredSize(new java.awt.Dimension(200, 50));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel3.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 250, 45));

        txtOccupation.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtOccupation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOccupation.setPreferredSize(new java.awt.Dimension(200, 50));
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });
        jPanel3.add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 203, 250, 45));

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setPreferredSize(new java.awt.Dimension(200, 50));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 42, 250, 45));

        txtPw.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        txtPw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPw.setPreferredSize(new java.awt.Dimension(200, 50));
        txtPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwActionPerformed(evt);
            }
        });
        jPanel3.add(txtPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 366, 250, 45));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("NAME :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 55, 135));
        jLabel5.setText("DOB :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("GENDER :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("OCCUPATION :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 55, 135));
        jLabel11.setText("PASSWORD :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 55, 135));
        jLabel10.setText("USERNAME :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 47, -1, -1));

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
        jPanel3.add(FetchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 42, -1, 40));

        jButton6.setBackground(new java.awt.Color(255, 255, 242));
        jButton6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(42, 68, 146));
        jButton6.setText("DELETE");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 484, -1, 50));

        UpdateBut.setBackground(new java.awt.Color(255, 255, 242));
        UpdateBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        UpdateBut.setForeground(new java.awt.Color(42, 68, 146));
        UpdateBut.setText("UPDATE");
        UpdateBut.setToolTipText("");
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 484, 118, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 560));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("MEMBER FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, 70));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String name, dob, gender, occupation, relation, username, pw;
            name = txtName.getText();
            dob = txtDOB.getText();
            gender = txtGender.getText();
            occupation = txtOccupation.getText();
            relation = txtRelation.getText();
            username = txtUsername.getText();
            pw = txtPw.getText();

            pst = con.prepareStatement("insert into members(name,dob,gender,occupation,relation,username,pw)values(?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, dob);
            pst.setString(3, gender);
            pst.setString(4, occupation);
            pst.setString(5, relation);
            pst.setString(6, username);
            pst.setString(7, pw);
            pst.executeUpdate();
            txtName.setText("");
            txtDOB.setText("");
            txtGender.setText("");
            txtOccupation.setText("");
            txtRelation.setText("");
            txtUsername.setText("");
            txtPw.setText("");
            txtUsername.requestFocus();
            JOptionPane.showMessageDialog(this, "Added Successfully\nUsername :" + username + "\nPassword:" + pw);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
        try {
            String uname = txtUsername.getText();

            pst = con.prepareStatement("select * from members where username = ?");
            pst.setString(1, uname);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtName.setText(rs.getString(2));
                txtDOB.setText(rs.getString(4));
                txtGender.setText(rs.getString(5));
                txtOccupation.setText(rs.getString(6));
                txtRelation.setText(rs.getString(7));
                txtPw.setText(rs.getString(8));
                JOptionPane.showMessageDialog(this, "Fetched Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "User not found!");
                txtName.setText("");
                txtDOB.setText("");
                txtGender.setText("");
                txtOccupation.setText("");
                txtRelation.setText("");
                txtUsername.setText("");
                txtPw.setText("");
                txtUsername.requestFocus();

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {

            String username = txtUsername.getText();
            if (username.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a valid username ");
            } else {

                pst = con.prepareStatement("select * from members where username=?");
                pst.setString(1, username);
                rs = pst.executeQuery();
                if (rs.next()) {
                    pst = con.prepareStatement("delete from members where username=?");
                    pst.setString(1, username);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Record Deleted!");
                    txtName.setText("");
                    txtDOB.setText("");
                    txtGender.setText("");
                    txtOccupation.setText("");
                    txtRelation.setText("");
                    txtUsername.setText("");
                    txtPw.setText("");
                    txtUsername.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "No user found with username=" + username);
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed

        String name, dob, gender, occupation, relation, pw;
        String uname = txtUsername.getText();
        name = txtName.getText();

        dob = txtDOB.getText();
        gender = txtGender.getText();
        occupation = txtOccupation.getText();
        relation = txtRelation.getText();
        pw = txtPw.getText();

        try {

            if (!uname.trim().isEmpty()) {

                if (!name.trim().isEmpty() || !dob.trim().isEmpty() || !gender.trim().isEmpty() || !occupation.trim().isEmpty() || !relation.trim().isEmpty() || !pw.trim().isEmpty()) {

                    pst = con.prepareStatement("select * from members where username=?");
                    pst.setString(1, uname);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        pst = con.prepareStatement("update members set name=?,dob=?,gender=?,occupation=?,relation=?,pw=? where username=?");
                        pst.setString(1, name);

                        pst.setString(2, dob);
                        pst.setString(3, gender);
                        pst.setString(4, occupation);
                        pst.setString(5, relation);
                        pst.setString(6, pw);
                        pst.setString(7, uname);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Successfully updated the record!");

                        txtName.setText("");

                        txtDOB.setText("");
                        txtGender.setText("");
                        txtOccupation.setText("");
                        txtRelation.setText("");
                        txtUsername.setText("");
                        txtPw.setText("");
                        txtUsername.requestFocus();

                    } else {
                        JOptionPane.showMessageDialog(this, "No user found with username=" + uname);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill in all the details !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill the username !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_UpdateButActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Expenses_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Memeber_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
