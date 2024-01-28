
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin_Member_Info extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Admin_Member_Info() {
        initComponents();
        con = ConnectSQL.createC();
        visibility();
        update_combo();

    }

    public void visibility() {
        GoalPane.setVisible(false);
        ExpensePane.setVisible(false);
        IncomePane.setVisible(false);
        LoanPane.setVisible(false);
        SavingPane.setVisible(false);
    }

    public void update_combo() {
        try {

            pst = con.prepareStatement("select username from members");
            rs = pst.executeQuery();
            if (rs.next()) {

                while (rs.next()) {

                    String name;
                    name = rs.getString(1);
                    jComboBox2.addItem(name);
                }
            } else {
                JOptionPane.showMessageDialog(this, "There are no users added. Please add users!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SearchBut = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Back_button = new javax.swing.JButton();
        GoalPane = new javax.swing.JScrollPane();
        Goal = new javax.swing.JTable();
        ExpensePane = new javax.swing.JScrollPane();
        Expense = new javax.swing.JTable();
        LoanPane = new javax.swing.JScrollPane();
        Loan = new javax.swing.JTable();
        IncomePane = new javax.swing.JScrollPane();
        Income = new javax.swing.JTable();
        SavingPane = new javax.swing.JScrollPane();
        Saving = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1010, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("MEMBER INFO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 290, 69));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(42, 55, 135));
        jLabel12.setText("TABLE:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 120, 60));

        SearchBut.setBackground(new java.awt.Color(255, 255, 242));
        SearchBut.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        SearchBut.setForeground(new java.awt.Color(42, 68, 146));
        SearchBut.setText("SEARCH");
        SearchBut.setToolTipText("");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });
        jPanel3.add(SearchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 110, 40));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(42, 55, 135));
        jLabel13.setText("USERNAME :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, 60));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 229));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expenses", "Loans", "Goals", "Savings", "Incomes" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 180, 40));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 229));
        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIL" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, 40));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        GoalPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        Goal.setBackground(new java.awt.Color(192, 223, 241));
        Goal.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Goal.setForeground(new java.awt.Color(42, 68, 146));
        Goal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GID", "GOAL", "START DATE", "END DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Goal.setToolTipText("");
        Goal.setAlignmentX(2.0F);
        Goal.setAlignmentY(2.0F);
        Goal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Goal.setAutoscrolls(false);
        Goal.setIntercellSpacing(new java.awt.Dimension(3, 3));
        Goal.setRowHeight(40);
        Goal.setSelectionBackground(new java.awt.Color(42, 68, 146));
        Goal.setSelectionForeground(new java.awt.Color(255, 255, 242));
        Goal.setShowGrid(true);
        Goal.getTableHeader().setReorderingAllowed(false);
        GoalPane.setViewportView(Goal);

        jPanel3.add(GoalPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 970, 500));

        ExpensePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        Expense.setBackground(new java.awt.Color(192, 223, 241));
        Expense.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Expense.setForeground(new java.awt.Color(42, 68, 146));
        Expense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "NAME", "AMOUNT", "CATEGORY", "DATE", "MODE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Expense.setToolTipText("");
        Expense.setAlignmentX(2.0F);
        Expense.setAlignmentY(2.0F);
        Expense.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Expense.setAutoscrolls(false);
        Expense.setIntercellSpacing(new java.awt.Dimension(3, 3));
        Expense.setRowHeight(40);
        Expense.setSelectionBackground(new java.awt.Color(42, 68, 146));
        Expense.setSelectionForeground(new java.awt.Color(255, 255, 242));
        Expense.setShowGrid(true);
        Expense.getTableHeader().setReorderingAllowed(false);
        ExpensePane.setViewportView(Expense);

        jPanel3.add(ExpensePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 970, 500));

        LoanPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        Loan.setBackground(new java.awt.Color(192, 223, 241));
        Loan.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Loan.setForeground(new java.awt.Color(42, 68, 146));
        Loan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LID", "CATEGORY", "AMOUNT", "DATE", "INTEREST", "LOAN PERIOD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Loan.setToolTipText("");
        Loan.setAlignmentX(2.0F);
        Loan.setAlignmentY(2.0F);
        Loan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Loan.setAutoscrolls(false);
        Loan.setIntercellSpacing(new java.awt.Dimension(3, 3));
        Loan.setRowHeight(40);
        Loan.setSelectionBackground(new java.awt.Color(42, 68, 146));
        Loan.setSelectionForeground(new java.awt.Color(255, 255, 242));
        Loan.setShowGrid(true);
        Loan.getTableHeader().setReorderingAllowed(false);
        LoanPane.setViewportView(Loan);

        jPanel3.add(LoanPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 970, 500));

        IncomePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        Income.setBackground(new java.awt.Color(192, 223, 241));
        Income.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Income.setForeground(new java.awt.Color(42, 68, 146));
        Income.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IID", "TYPE", "AMOUNT", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Income.setToolTipText("");
        Income.setAlignmentX(2.0F);
        Income.setAlignmentY(2.0F);
        Income.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Income.setAutoscrolls(false);
        Income.setIntercellSpacing(new java.awt.Dimension(3, 3));
        Income.setRowHeight(40);
        Income.setSelectionBackground(new java.awt.Color(42, 68, 146));
        Income.setSelectionForeground(new java.awt.Color(255, 255, 242));
        Income.setShowGrid(true);
        Income.getTableHeader().setReorderingAllowed(false);
        IncomePane.setViewportView(Income);

        jPanel3.add(IncomePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 970, 500));

        SavingPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        Saving.setBackground(new java.awt.Color(192, 223, 241));
        Saving.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Saving.setForeground(new java.awt.Color(42, 68, 146));
        Saving.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "TYPE", "AMOUNT", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Saving.setToolTipText("");
        Saving.setAlignmentX(2.0F);
        Saving.setAlignmentY(2.0F);
        Saving.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Saving.setAutoscrolls(false);
        Saving.setIntercellSpacing(new java.awt.Dimension(3, 3));
        Saving.setRowHeight(40);
        Saving.setSelectionBackground(new java.awt.Color(42, 68, 146));
        Saving.setSelectionForeground(new java.awt.Color(255, 255, 242));
        Saving.setShowGrid(true);
        Saving.getTableHeader().setReorderingAllowed(false);
        SavingPane.setViewportView(Saving);

        jPanel3.add(SavingPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 970, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        DefaultTableModel tblModelExpense = (DefaultTableModel) Expense.getModel();
        tblModelExpense.setRowCount(0);
        DefaultTableModel tblModelSaving = (DefaultTableModel) Saving.getModel();
        tblModelSaving.setRowCount(0);
        DefaultTableModel tblModelLoan = (DefaultTableModel) Loan.getModel();
        tblModelLoan.setRowCount(0);
        DefaultTableModel tblModelGoal = (DefaultTableModel) Goal.getModel();
        tblModelGoal.setRowCount(0);
        DefaultTableModel tblModelIncome = (DefaultTableModel) Income.getModel();
        tblModelIncome.setRowCount(0);
        try {
            String table = (String) jComboBox1.getSelectedItem();
            String username = (String) jComboBox2.getSelectedItem();
            System.out.print(table);
            pst = con.prepareStatement("select *  from " + table + " where user = ?");

            pst.setString(1, username);
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.print(table);

                switch (table) {
                    case "Expenses":
                        ExpensePane.setVisible(true);
                        GoalPane.setVisible(false);
                        IncomePane.setVisible(false);
                        LoanPane.setVisible(false);
                        SavingPane.setVisible(false);
                        do {
                            String eid, name, amount, category, date, mode;
                            eid = String.valueOf(rs.getInt("eid"));
                            name = rs.getString("name");
                            amount = rs.getString("amount");
                            category = rs.getString("category");
                            date = rs.getString("date");
                            mode = rs.getString("mode");

                            String tbData[] = {eid, name, amount, category, date, mode};
                            tblModelExpense.addRow(tbData);
                        } while (rs.next());
                        break;
                    case "Loans":
                        ExpensePane.setVisible(false);
                        GoalPane.setVisible(false);
                        IncomePane.setVisible(false);
                        LoanPane.setVisible(true);
                        SavingPane.setVisible(false);
                        do {
                            String lid, amount, category, date, interest, loanperiod;
                            lid = String.valueOf(rs.getInt("lid"));
                            amount = rs.getString("amount");
                            category = rs.getString("category");
                            date = rs.getString("date");
                            interest = rs.getString("interest");
                            loanperiod = rs.getString("loanperiod");
                            String tbData[] = {lid, category, amount, date, interest, loanperiod};
                            tblModelLoan.addRow(tbData);
                        } while (rs.next());
                        break;
                    case "Goals":
                        ExpensePane.setVisible(false);
                        GoalPane.setVisible(true);
                        IncomePane.setVisible(false);
                        LoanPane.setVisible(false);
                        SavingPane.setVisible(false);
                        do {
                            String gid, goal, sdate, edate;
                            gid = String.valueOf(rs.getInt("gid"));
                            goal = rs.getString("goal");
                            sdate = rs.getString("startdate");
                            edate = rs.getString("enddate");
                            String tbData[] = {gid, goal, sdate, edate};
                            tblModelGoal.addRow(tbData);
                        } while (rs.next());
                        break;
                    case "Savings":
                        ExpensePane.setVisible(false);
                        GoalPane.setVisible(false);
                        IncomePane.setVisible(false);
                        LoanPane.setVisible(false);
                        SavingPane.setVisible(true);
                        do {
                            String sid, type, amount, date;
                            sid = String.valueOf(rs.getInt("sid"));
                            type = rs.getString("type");
                            amount = rs.getString("amount");
                            date = rs.getString("date");
                            String tbData[] = {sid, type, amount, date};
                            tblModelSaving.addRow(tbData);
                        } while (rs.next());

                        break;
                    case "Incomes":
                        ExpensePane.setVisible(false);
                        GoalPane.setVisible(false);
                        IncomePane.setVisible(true);
                        LoanPane.setVisible(false);
                        SavingPane.setVisible(false);
                        do {
                            String iid, type, amount, date;
                            iid = String.valueOf(rs.getInt("iid"));
                            type = rs.getString("type");
                            amount = rs.getString("amount");
                            date = rs.getString("date");
                            String tbData[] = {iid, type, amount, date};
                            tblModelIncome.addRow(tbData);
                        } while (rs.next());

                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Select a valid table");
                }

            } else {
                ExpensePane.setVisible(false);
                GoalPane.setVisible(false);
                IncomePane.setVisible(false);
                LoanPane.setVisible(false);
                SavingPane.setVisible(false);
                JOptionPane.showMessageDialog(this, "No data found !");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Member_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Member_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTable Expense;
    private javax.swing.JScrollPane ExpensePane;
    private javax.swing.JTable Goal;
    private javax.swing.JScrollPane GoalPane;
    private javax.swing.JTable Income;
    private javax.swing.JScrollPane IncomePane;
    private javax.swing.JTable Loan;
    private javax.swing.JScrollPane LoanPane;
    private javax.swing.JTable Saving;
    private javax.swing.JScrollPane SavingPane;
    private javax.swing.JButton SearchBut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
