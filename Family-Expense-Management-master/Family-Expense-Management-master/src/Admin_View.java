
import java.sql.*;
import Backend.ConnectSQL;
import javax.swing.table.DefaultTableModel;


public class Admin_View extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    
    public Admin_View() {
        initComponents();
        con = ConnectSQL.createC();
        table_update();
    }
    

    
    public void table_update()
    {
        int cc;
        try{
            pst =con.prepareStatement("call member_table()");
            ResultSet rs = pst.executeQuery();
            String username,name,dob,age,gender,occupation,relation,pw;
            while(rs.next())
            {
                username=rs.getString("username");
                name=rs.getString("name");
                dob=rs.getString("dob");
                age=rs.getString("age");
                gender=rs.getString("gender");
                occupation=rs.getString("occupation");
                relation=rs.getString("relation");
                pw=rs.getString("pw");
                 String tbData[] = {name,dob,age,gender,occupation,relation,username,pw};
               DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
               tblModel.addRow(tbData);
                
            }
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(487, 120));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 146), 2, true));

        jTable1.setBackground(new java.awt.Color(192, 223, 241));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(42, 68, 146));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DOB", "AGE", "GENDER", "OCCUPATION", "RELATION", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAlignmentX(2.0F);
        jTable1.setAlignmentY(2.0F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setAutoscrolls(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(42, 68, 146));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 242));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 980, 530));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("FAMILY MEMBERS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 370, 69));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("BACK");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 82, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
