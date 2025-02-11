   
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mahesh
 */
public class CustomerCheckOut extends javax.swing.JFrame {
         PreparedStatement pst=null;
        ResultSet rs=null;
        Connection con=null;
    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        SimpleDateFormat obj=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        outdate.setText(obj.format(date));
        
         try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3309/hotelmsr", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Registration_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
         showdataintable();
    }
    
    public void showdataintable(){
        
             try {
                 pst=con.prepareStatement(" select * from customer_details where status=?");
                 pst.setString(1, "Available");
                 rs=pst.executeQuery();
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int n=rsmd.getColumnCount();
                 DefaultTableModel df=(DefaultTableModel) jTable1.getModel();
                 df.setRowCount(0);
                 while(rs.next()){
                     Vector v= new Vector();
                     for(int i=1;i<=n;i++){
                         v.add(rs.getString("Username"));
                         v.add(rs.getString("Mobile_no"));
                         v.add(rs.getString("id_proof_type"));
                         v.add(rs.getString("id_no"));
                         v.add(rs.getString("room_no"));
                         v.add(rs.getString("Bed_type"));
                         v.add(rs.getString("room_type"));
                         v.add(rs.getString("in_date"));
                         v.add(rs.getString("Price"));
                         v.add(rs.getString("address"));
                         
                     }
                     df.addRow(v);
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
             }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roomno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cidtype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        indate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        outdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdays = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        totalamount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-out.png"))); // NOI18N
        jLabel1.setText("Customer Check-Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 348, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 108, 142, 37));

        roomno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnoActionPerformed(evt);
            }
        });
        getContentPane().add(roomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 109, 165, 37));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Customer Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 192, 155, -1));

        cname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 231, 224, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Customer Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        cmono.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(cmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 219, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ID Proof Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 169, -1));

        cidtype.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cidtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cidtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 198, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("ID Proof Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 168, -1));

        cidno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cidno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidnoActionPerformed(evt);
            }
        });
        getContentPane().add(cidno, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 151, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Price Per Day ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 318, 174, -1));

        price.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 357, 200, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Check In Date ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 170, -1));

        indate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        indate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indateActionPerformed(evt);
            }
        });
        getContentPane().add(indate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 200, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Check Out Date (Today)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        outdate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        outdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdateActionPerformed(evt);
            }
        });
        getContentPane().add(outdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 198, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Total Days Of Stay");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, -1, -1));

        txtdays.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdaysActionPerformed(evt);
            }
        });
        getContentPane().add(txtdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 151, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Total Amount To Pay");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 418, 224, -1));

        totalamount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        totalamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalamountActionPerformed(evt);
            }
        });
        getContentPane().add(totalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 457, 174, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        jButton3.setText("CHECKOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 437, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tool.png"))); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 437, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Name ", "Mobile Number", "ID Proof Type", "ID Number", "Room Number", "Bed Type", "Room Type ", "Check IN Date", "Room Price", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1010, 250));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/htnm.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 340, 180));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgm.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnoActionPerformed

    private void cidtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidtypeActionPerformed

    private void cidnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidnoActionPerformed

    private void indateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indateActionPerformed

    private void outdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             try {
                 pst=con.prepareStatement("update customer_details set status=? where room_no=? and  in_date=?");
                 pst.setString(1, "Check Out");
                 pst.setString(2, roomno.getText());
                 pst.setString(3,indate.getText());
                 pst.executeUpdate();
                 
                 pst=con.prepareStatement("update room_details set status=? where roomno=?");
                 pst.setString(1, "Available");
                 pst.setString(2, roomno.getText());
                 pst.executeUpdate();
                 
                 
                    PreparedStatement pst = con.prepareStatement("INSERT INTO check_out_details (out_date, total_days, total_price, room_no,status) VALUES (?, ?, ?, ?,?)");
                    pst.setString(1, outdate.getText());
                    pst.setString(2, txtdays.getText());
                    pst.setString(3, totalamount.getText());
                    pst.setString(4, roomno.getText());
                    pst.setString(5, "Check_Out");
                  
                     
                    pst.executeUpdate();
                    
                 
                  JOptionPane.showMessageDialog(this, "Customer Successfully Check-Out \n Room Is Available For Booking");
                   showdataintable();
                           cname.setText(" ");
                            cmono.setText(" ");
                            cidno.setText(" ");
                            cidtype.setText(" ");
                             roomno.setText(" ");
                             price.setText(" ");
                              indate.setText(" "); 
                             txtdays.setText(" ");
                             totalamount.setText(" ");
             } catch (SQLException ex) {
                 Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdaysActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         cname.setText(" ");
       cmono.setText(" ");
       cidno.setText(" ");
        cidtype.setText(" ");
        roomno.setText(" ");
        price.setText(" ");
        indate.setText(" "); 
         txtdays.setText(" ");
         totalamount.setText(" ");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
             try {
                 pst=con.prepareStatement(" select * from customer_details where room_no=? and status=?");
                 pst.setString(1, roomno.getText());
                 pst.setString(2, "Available");
                 rs=pst.executeQuery();
                 if(rs.next()){
                   cname.setText(rs.getString("Username"));
                   cmono.setText(rs.getString("Mobile_no"));
                    cidtype.setText(rs.getString("id_proof_type"));
                     cidno.setText(rs.getString("id_no"));
                      price.setText(rs.getString("Price"));
                       indate.setText(rs.getString("in_date"));
                 }
                  
                 String s1,s2;
                 s1=outdate.getText();
                 s2=rs.getString("in_date");
                 SimpleDateFormat day=new SimpleDateFormat("yyyy-MM-dd");
                 Date d1=day.parse(s1);
                 Date d2=day.parse(s2);
                 
                 long diff=d1.getTime()-d2.getTime();
                 int days=(int)diff/(24*60*60*1000);
                 if(days==0)
                     days=1;
                     
                     txtdays.setText(String.valueOf(days));
                     double rate=Double.parseDouble(rs.getString("Price"))*days;
                     totalamount.setText(String.valueOf(rate));
                     
                     

                 
                 

             } catch (SQLException ex) {
                 Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ParseException ex) {
                 Logger.getLogger(CustomerCheckOut.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalamountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cidno;
    private javax.swing.JTextField cidtype;
    private javax.swing.JTextField cmono;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField indate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField outdate;
    private javax.swing.JTextField price;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField totalamount;
    private javax.swing.JTextField txtdays;
    // End of variables declaration//GEN-END:variables
}
