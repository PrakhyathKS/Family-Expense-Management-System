
import Backend.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String usern;
    Connection con;
    Statement pst;
    ResultSet rs;

    public Login() {
        initComponents();
        con = ConnectSQL.createC();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        butLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPw = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 253, 248));
        jPanel1.setMaximumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setMinimumSize(new java.awt.Dimension(1980, 920));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 920));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(163, 224, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(555, 980));
        jPanel3.setMinimumSize(new java.awt.Dimension(555, 980));
        jPanel3.setPreferredSize(new java.awt.Dimension(555, 980));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fam1.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 980));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        jPanel4.setBackground(new java.awt.Color(163, 224, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 69, 124));
        jLabel2.setText("PASSWORD :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 69, 124));
        jLabel4.setText("USERNAME :");

        txtUser.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        txtUser.setForeground(new java.awt.Color(26, 69, 124));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        butLogin.setBackground(new java.awt.Color(255, 255, 241));
        butLogin.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        butLogin.setForeground(new java.awt.Color(26, 69, 124));
        butLogin.setText("LOGIN");
        butLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 37, 96));
        jLabel3.setText("LOGIN");

        txtPw.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        txtPw.setForeground(new java.awt.Color(26, 69, 124));
        txtPw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPw.setBorder(null);
        txtPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(163, 224, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jRadioButton1.setPreferredSize(new java.awt.Dimension(20, 20));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 69, 124));
        jLabel5.setText("Show password : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtPw))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(butLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtUser))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 650, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1970, 980));

        jPanel2.setBackground(new java.awt.Color(26, 69, 124));
        jPanel2.setForeground(new java.awt.Color(255, 255, 241));
        jPanel2.setMaximumSize(new java.awt.Dimension(1980, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(1980, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(1980, 100));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 241));
        jLabel1.setText("FAMILY EXPENSE MANAGER");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 757, Short.MAX_VALUE)
                .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(495, 495, 495))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void butLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLoginActionPerformed

        usern = txtUser.getText();
        String password, username;
        username = txtUser.getText();

        password = String.valueOf(txtPw.getPassword());

        if ("admin".equals(username) && "admin".equals(password)) {
            dispose();
            Admin_Home.main(null);
        } else {
            try {
                pst = con.createStatement();
                rs = pst.executeQuery("select  username,pw from members where username='" + username + "' and pw= '" + password + "'");
                rs.next();
                if (rs.getString("username") != null && rs.getString("pw") != null) {
                    dispose();
                    Member_Home.main(null);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "User does not exist! Please try again!");
                txtUser.setText("");
                txtPw.setText("");
            }
        }
    }//GEN-LAST:event_butLoginActionPerformed

    private void txtPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            txtPw.setEchoChar((char) 0);
        } else {
            txtPw.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
 
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton butLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
