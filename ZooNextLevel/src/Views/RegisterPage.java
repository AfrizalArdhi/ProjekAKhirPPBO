/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Connector.Connector;
import Models.ModelData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author afriz
 */
public class RegisterPage extends javax.swing.JFrame {

    private Connection conn;
    public RegisterPage() {
        initComponents();
        conn = Connector.getConnection();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_frog_face_60px_2.png"))); // NOI18N

        jLabel3.setText("Username");

        jtxUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxUsernameActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jtxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxPasswordActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(153, 255, 153));
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jtxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxUsername)
                            .addComponent(jtxPassword)
                            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxEmail))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxUsernameActionPerformed

    private void jtxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxPasswordActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        PreparedStatement statement = null;
        try{
            String username = jtxUsername.getText();
            String password = String.valueOf(jtxPassword.getPassword());
            String email = String.valueOf(jtxEmail.getText());
            final String command = "INSERT INTO `user` (nama_user, password, email) VALUES (?, ?, ?);";
            statement = conn.prepareStatement(command, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, email);
//            ResultSet result = statement.executeQuery();
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                LoginPage n = new LoginPage();
                n.setLocationRelativeTo(null);
                n.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Register successfull!");
            }else{
                 JOptionPane.showMessageDialog(null, "Register Failed!");
            }
            statement.close();
            rs.close();

        }catch(Exception exc){
            Logger.getLogger(ModelData.class.getName()).log(Level.SEVERE, null, exc);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jtxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEmailActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    public JTextField getJtxEmail() {
        return jtxEmail;
    }

    public void setJtxEmail(JTextField jtxEmail) {
        this.jtxEmail = jtxEmail;
    }
    
    

    public JButton getBtnLogin() {
        return btnRegister;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnRegister = btnLogin;
    }

    public JPasswordField getJtxPassword() {
        return jtxPassword;
    }

    public void setJtxPassword(JPasswordField jtxPassword) {
        this.jtxPassword = jtxPassword;
    }

    public JTextField getJtxUsername() {
        return jtxUsername;
    }

    public void setJtxUsername(JTextField jtxUsername) {
        this.jtxUsername = jtxUsername;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxEmail;
    private javax.swing.JPasswordField jtxPassword;
    private javax.swing.JTextField jtxUsername;
    // End of variables declaration//GEN-END:variables
}
