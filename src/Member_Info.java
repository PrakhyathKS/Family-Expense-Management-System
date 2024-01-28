


import java.sql.*;
import Backend.*;

public class Member_Info extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst1,pst2,pst3, pst4,pst5;
    
    ResultSet rs1,rs2,rs3,rs4,rs5;
    public Member_Info() {
        initComponents();
        con = ConnectSQL.createC();
        update_info();
    }

    

    public void update_info() {
      
        int gc=0;
        float income=0, loan=0, expense=0, saving=0;
        try {
              pst1 = con.prepareStatement("select sum(amount) from expenses where user= '"+Login.usern+"'");
              rs1 = pst1.executeQuery();    
              
              pst2 = con.prepareStatement("select sum(amount) from savings where user= '"+Login.usern+"'");
              rs2 = pst2.executeQuery();
              
              pst3 = con.prepareStatement("select sum(amount) from incomes where user= '"+Login.usern+"'");
              rs3 = pst3.executeQuery();

              pst4 = con.prepareStatement("select sum(amount) from loans where user= '"+Login.usern+"'");
              rs4 = pst4.executeQuery();
              
              pst5 = con.prepareStatement("select count(gid) from goals where user= '"+Login.usern+"'");
              rs5 = pst5.executeQuery();
              
        
           if(rs5.next())
               gc=rs5.getInt(1);
           if(rs1.next())
                expense=rs1.getInt(1);
           if(rs3.next())
                income=rs3.getInt(1);
           if(rs2.next())
                saving=rs2.getInt(1);
           if(rs4.next())
                loan=rs4.getInt(1);
           
            Expense.setText(String.valueOf(expense));
            Income.setText(String.valueOf(income));
            GC.setText(String.valueOf(gc));
            Saving.setText(String.valueOf(saving));
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Saving = new javax.swing.JLabel();
        Income = new javax.swing.JLabel();
        GC = new javax.swing.JLabel();
        Expense = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Loans = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 36, 51));
        jLabel5.setText("Total Income :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 36, 51));
        jLabel6.setText("Total Expenses :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 310, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 36, 51));
        jLabel7.setText("Total Goal Count :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 300, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 36, 51));
        jLabel8.setText("Total Savings :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 290, -1));

        Saving.setBackground(new java.awt.Color(255, 255, 242));
        Saving.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Saving.setText("0 ");
        jPanel3.add(Saving, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 310, -1));

        Income.setBackground(new java.awt.Color(255, 255, 242));
        Income.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Income.setText("0");
        jPanel3.add(Income, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 310, -1));

        GC.setBackground(new java.awt.Color(255, 255, 242));
        GC.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        GC.setText("0");
        jPanel3.add(GC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 310, -1));

        Expense.setBackground(new java.awt.Color(255, 255, 242));
        Expense.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Expense.setText("0");
        jPanel3.add(Expense, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 310, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 36, 51));
        jLabel9.setText("Total Loan :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 330, -1));

        Loans.setBackground(new java.awt.Color(255, 255, 242));
        Loans.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        Loans.setText("0");
        jPanel3.add(Loans, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 310, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel10.setText("₹");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 40, 40));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel11.setText("₹");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 40, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel12.setText("₹");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setText("₹");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 900, 470));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 16, 108));
        jLabel2.setText("MEMBER INFO ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 430, 80));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel Expense;
    private javax.swing.JLabel GC;
    private javax.swing.JLabel Income;
    private javax.swing.JLabel Loans;
    private javax.swing.JLabel Saving;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
