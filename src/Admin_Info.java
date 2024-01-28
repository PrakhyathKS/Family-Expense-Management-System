
import java.sql.*;
import Backend.*;

public class Admin_Info extends javax.swing.JFrame {

    Connection con;
    Statement pst1,pst2,pst3,pst4,pst5,pst6;
    ResultSet rs1,rs2,rs3,rs4,rs5,rs6;
    public Admin_Info() {
        initComponents();
        con = ConnectSQL.createC();
        update_info();
    }

    

    public void update_info() {
        int c = 0,gc=0;
        float income=0, loan=0, expense=0, saving=0;
        try {
            pst1 = con.createStatement();
             rs1= pst1.executeQuery("select count(*) from members");
              pst2 = con.createStatement();
              rs2 = pst2.executeQuery("select sum(amount) from expenses");
              pst3 = con.createStatement();
              rs3 = pst3.executeQuery("select sum(amount) from incomes");
              pst4 = con.createStatement();
              rs4 = pst4.executeQuery("select sum(amount) from savings");
              pst5 = con.createStatement();
              rs5 = pst5.executeQuery("select count(gid) from goals");
               pst6 = con.createStatement();
              rs6 = pst6.executeQuery("select sum(amount) from loans");
              
           if(rs1.next())
               c=rs1.getInt(1);
           if(rs2.next())
                expense=rs2.getInt(1);
           if(rs3.next())
                income=rs3.getInt(1);
           if(rs4.next())
                saving=rs4.getInt(1);
           if(rs5.next())
                gc=rs5.getInt(1);
           if(rs6.next())
                loan=rs6.getInt(1);
            
            count.setText(String.valueOf(c));
            Expenses.setText(String.valueOf(expense));
            Incomes.setText(String.valueOf(income));
            GC.setText(String.valueOf(gc));
            Savings.setText(String.valueOf(saving));
            Loans.setText(String.valueOf(loan));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Savings = new javax.swing.JLabel();
        Incomes = new javax.swing.JLabel();
        GC = new javax.swing.JLabel();
        Expenses = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Loans = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMinimumSize(new java.awt.Dimension(925, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(925, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 26, -1, 319));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 36, 51));
        jLabel4.setText("Member Count :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 330, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 36, 51));
        jLabel5.setText("Total Income :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 36, 51));
        jLabel6.setText("Total Expenses :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 310, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 36, 51));
        jLabel7.setText("Total Goal Count :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 370, -1));

        count.setBackground(new java.awt.Color(255, 255, 242));
        count.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        count.setText("0");
        jPanel3.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 300, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 36, 51));
        jLabel8.setText("Total Savings :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 330, -1));

        Savings.setBackground(new java.awt.Color(255, 255, 242));
        Savings.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Savings.setText("0 ");
        jPanel3.add(Savings, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 300, -1));

        Incomes.setBackground(new java.awt.Color(255, 255, 242));
        Incomes.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Incomes.setText("0");
        jPanel3.add(Incomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 300, -1));

        GC.setBackground(new java.awt.Color(255, 255, 242));
        GC.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        GC.setText("0");
        jPanel3.add(GC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 300, -1));

        Expenses.setBackground(new java.awt.Color(255, 255, 242));
        Expenses.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Expenses.setText("0");
        jPanel3.add(Expenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 300, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 36, 51));
        jLabel9.setText("Total Loans :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 330, -1));

        Loans.setBackground(new java.awt.Color(255, 255, 242));
        Loans.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Loans.setText("0");
        jPanel3.add(Loans, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 300, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setText("₹");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 40, 40));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel10.setText("₹");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 40, 40));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel11.setText("₹");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 40, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel12.setText("₹");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 900, 460));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 16, 108));
        jLabel2.setText("FAMILY INFO ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 370, 80));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel Expenses;
    private javax.swing.JLabel GC;
    private javax.swing.JLabel Incomes;
    private javax.swing.JLabel Loans;
    private javax.swing.JLabel Savings;
    private javax.swing.JLabel count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
