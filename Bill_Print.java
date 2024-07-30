import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mahesh
 */
public class Bill_Print extends javax.swing.JFrame {
    private String id;
    private String nm;
    private String mobile;
    private String email;
    private String roomno;
    private String bed;
    private String type;
    private String indate;
    private String outdate;
    private String price;
    private String days;
    private String amount;

    
    /**
     * Creates new form Bill_Print
     */
    public Bill_Print(String id) {
        this.id = id; // Set the id passed to the constructor
        initComponents();
        connect();
        generateBill();
    }

    public Bill_Print() {
        initComponents();
    }

    private void connect() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3309/hotelmsr", "root", "");

            // Fetch customer details
            pst = con.prepareStatement("SELECT * FROM customer_details WHERE Bill_Id = ?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                email = rs.getString("Email");
                nm = rs.getString("Username");
                mobile = rs.getString("Mobile_no");
                roomno = rs.getString("room_no");
                bed = rs.getString("Bed_type");
                type = rs.getString("room_type");
                indate = rs.getString("in_date");
                price = rs.getString("Price");

                System.out.println("Customer details retrieved successfully:");
                System.out.println("Name: " + nm + ", Mobile: " + mobile + ", Email: " + email);
            }

            // Fetch check-out details
            pst = con.prepareStatement("SELECT * FROM check_out_details WHERE room_no = ?");
            pst.setString(1, roomno);
            rs = pst.executeQuery();
            if (rs.next()) {
                outdate = rs.getString("out_date");
                days = rs.getString("total_days");
                amount = rs.getString("total_price");

                System.out.println("Check-out details retrieved successfully:");
                System.out.println("Out Date: " + outdate + ", Days: " + days + ", Amount: " + amount);
            }

            rs.close();
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Bill_Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generateBill() {
        if (txtbill == null) {
            System.out.println("txtbill is not initialized properly");
            return;
        }

        txtbill.setText("\t\t          ** HOTEL MSR EXECUTIVE **\n");
        txtbill.setText(txtbill.getText() + "==============================================================================\n");
        txtbill.setText(txtbill.getText() + "\nBill ID :- " + id + "\n");
        txtbill.setText(txtbill.getText() + "Customer Details \n");
        txtbill.setText(txtbill.getText() + "Name:- " + nm + "\n");
        txtbill.setText(txtbill.getText() + "Mobile Number:- " + mobile + "\n");
        txtbill.setText(txtbill.getText() + "Email ID:- " + email + "\n");
        txtbill.setText(txtbill.getText() + "\n==============================================================================\n");
        txtbill.setText(txtbill.getText() + "\nRoom Details \n");
        txtbill.setText(txtbill.getText() + "Room Number:- " + roomno + "\n");
        txtbill.setText(txtbill.getText() + "Room Type:- " + type + "\n");
        txtbill.setText(txtbill.getText() + "Bed Type:- " + bed + "\n");
        txtbill.setText(txtbill.getText() + "Price:- " + price + "\n");
        txtbill.setText(txtbill.getText() + "Check IN Date :- " + indate + "\n");
        txtbill.setText(txtbill.getText() + "Check Out Date:- " + outdate + "\n");
        txtbill.setText(txtbill.getText() + "Number Of Stay Days:- " + days + "\n");
        txtbill.setText(txtbill.getText() + "\n\t\t\t                                         Total Amount:- " + amount + "/-only \n");
        txtbill.setText(txtbill.getText() + "\n==============================================================================\n");
        txtbill.setText(txtbill.getText() + "\n\t\t\t" + "                                    Thank You Must Visit Again !!\n");
        txtbill.setText(txtbill.getText() + "\t\t\t" + "                                      Regards Team MSR Executive !!\n");
    }

//    // Initialize GUI components
//    private void initComponents() {
//        // Assuming you're using NetBeans GUI builder, initialize txtbill here
//        txtbill = new javax.swing.JTextArea();
//        // Initialize other components and add them to the frame
//    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, 607, 444));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 557, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgm.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            txtbill.print();        // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(Bill_Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bill_Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}
