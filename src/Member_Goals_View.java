
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class Member_Goals_View extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;

    public Member_Goals_View() {
        initComponents();
        con = ConnectSQL.createC();
        table_update();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IncomeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        IncomeTable.setBackground(new java.awt.Color(192, 223, 241));
        IncomeTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        IncomeTable.setForeground(new java.awt.Color(42, 68, 146));
        IncomeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        IncomeTable.setToolTipText("");
        IncomeTable.setAlignmentX(2.0F);
        IncomeTable.setAlignmentY(2.0F);
        IncomeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        IncomeTable.setAutoscrolls(false);
        IncomeTable.setFocusCycleRoot(true);
        IncomeTable.setIntercellSpacing(new java.awt.Dimension(3, 3));
        IncomeTable.setRowHeight(40);
        IncomeTable.setSelectionBackground(new java.awt.Color(42, 68, 146));
        IncomeTable.setSelectionForeground(new java.awt.Color(255, 255, 242));
        IncomeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        IncomeTable.setShowGrid(true);
        IncomeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(IncomeTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 980, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("GOAL TABLE ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 260, 69));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed
public void table_update()
    {
      
        try{
            pst =con.prepareStatement("Select gid,goal,startdate,enddate from goals where User=?");
            pst.setString(1,Login.usern);
            ResultSet rs = pst.executeQuery();
            
            
           while(rs.next())
           {
               String gid,goal,sdate,edate;
               gid = String.valueOf(rs.getInt("gid"));
               goal = rs.getString("goal");
               sdate=rs.getString("startdate");
               edate= rs.getString("enddate");
            
               String tbData[] = {gid,goal,sdate,edate};
               DefaultTableModel tblModel = (DefaultTableModel)IncomeTable.getModel();
               tblModel.addRow(tbData);
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(() -> {
            new Member_Goals_View().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTable IncomeTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
