
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mahesh
 */
public class Registration_Page extends javax.swing.JFrame {


    /**
     * Creates new form Registration_Page
     */
  public int flag=0;
  public int flags=0;
    public Registration_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        seqq = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        lblhide = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 233, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NAME OF USER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 128, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 95, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 83, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("SECURITY QUESTION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 168, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ANSWER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 71, -1));

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 255, -1));

        ans.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 256, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
        jButton1.setText("SIGN UP ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 325, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jButton2.setText("BACK TO LOGIN PAGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 325, 234, -1));

        seqq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seqq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Which Is Your Favourite Sport ?", "Which Is Your Favourite Subject ?", "Name Of Your Childhood Best Freind", "What Is Your Pet's Name?", "Which Is Your Favourite Place?" }));
        seqq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seqqActionPerformed(evt);
            }
        });
        jPanel1.add(seqq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 250, -1));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 255, -1));

        lblhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        lblhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhideMouseClicked(evt);
            }
        });
        jPanel1.add(lblhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sgup.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 700, 410));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 80, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SIGNUP_BACK.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(name.getText().equals("")){
        JOptionPane.showMessageDialog(this, "All The Feilds Should Not Be Empty");
        name.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    else if(email.getText().equals("")){
        JOptionPane.showMessageDialog(this, "All The Feilds Should Not Be Empty");
        email.requestFocus();
// TODO add your handling code here:
    }                                        
    else if(pass.getText().equals("")){
        JOptionPane.showMessageDialog(this, "All The Feilds Should Not Be Empty");
        pass.requestFocus();
// TODO add your handling code here:
    }  
    else if(ans.getText().equals("")){
        JOptionPane.showMessageDialog(this, "All The Feilds Should Not Be Empty");
        ans.requestFocus();
// TODO add your handling code here:
    }   
    else{
   Connection con =DatabaseConnection.con();
   ResultSet rs=null;
   PreparedStatement pst=null;
        try {
            pst=con.prepareStatement("Select * from login_details where Email_Id=?");
            pst.setString(1, email.getText());
            rs=pst.executeQuery();
            if(rs.next()){
               JOptionPane.showMessageDialog(this, "Email Id Already Exists !"); 
            }
            else{
               pst=con.prepareStatement("Insert into login_details(Username,Email_Id,Password,Serurity_Question,Ans)values(?,?,?,?,?)");
               pst.setString(1, name.getText());
               pst.setString(2, email.getText());
               pst.setString(3, pass.getText());
               pst.setString(4, seqq.getItemAt(seqq.getSelectedIndex()));
               pst.setString(5, ans.getText());
               pst.executeUpdate();
               JOptionPane.showMessageDialog(this, "Thankyou For Registrating With Us !!\n Login Now !"); 

            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
            new Login_page().setVisible(true);
    
}
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login_page().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      int yes=JOptionPane.showConfirmDialog(this, "Are You Sure To Leave The Application ","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(yes==JOptionPane.YES_OPTION)
        System.exit(0);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void lblhideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhideMouseClicked
        // TODO add your handling code here:
        if(flag==0){
            lblhide.setIcon(new ImageIcon("C:\\Users\\Mahesh\\OneDrive\\Documents\\NetBeansProjects\\Hotel Management\\src\\images\\hidden.png"));
        flag=1;
       pass.setEchoChar('*');
        }
        else{
           lblhide.setIcon(new ImageIcon("C:\\Users\\Mahesh\\OneDrive\\Documents\\NetBeansProjects\\Hotel Management\\src\\images\\show.png"));
           flag=0;
           pass.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_lblhideMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void seqqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seqqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seqqActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
  
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Registration_Page().setVisible(true);
        }
    });
}

     



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblhide;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox<String> seqq;
    // End of variables declaration//GEN-END:variables

}