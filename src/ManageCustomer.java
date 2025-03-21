/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author priti
 */
import dao.ConnectionProvider;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.sql.*;
public class ManageCustomer extends javax.swing.JFrame {
    private int customerPk=0;
    /**
     * Creates new form ManageCustomer
     */
    public ManageCustomer() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private  boolean validateFields()
    {
        if(!txtName.getText().equals("") && !txtMobileNumber.getText().equals("") && !txtEmail.getText().equals("") && !txtAddress.getText().equals(""))
        {
            return false;
        }
        else
        {
            return true;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        addrss = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Manage Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 16, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 579, 101, -1));

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email", "Address"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 79, 421, 494));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 120, 95, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 152, 350, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 209, 113, -1));

        txtMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 243, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 297, 123, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 330, 350, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        addrss.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addrss.setText("Address");
        getContentPane().add(addrss, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 340, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All_page_Background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String mobileNumber=txtMobileNumber.getText();
        String email=txtEmail.getText();
        String address=txtAddress.getText();
        
        if(validateFields())
        {
            JOptionPane.showMessageDialog(null,"All fields are required !!");
        }
        else
        {
            try
            {
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("insert into customer(name,mobileNumber,email,address) values(?,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,mobileNumber);
                ps.setString(3,email);
                ps.setString(4,address);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Customer added successfully !!");
                setVisible(false);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here
        DefaultTableModel model=(DefaultTableModel) tableCustomer.getModel();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select* from customer");
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("customer_pk"),rs.getString("name"),rs.getString("mobileNumber"),rs.getString("email"),rs.getString("address")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        // TODO add your handling code here:
        int index=tableCustomer.getSelectedRow();
        TableModel model=tableCustomer.getModel();
        
        String id=model.getValueAt(index,0).toString();
        customerPk=Integer.parseInt(id);
        
        String name=model.getValueAt(index,1).toString();
        txtName.setText(name);
        
        String mobileNumber=model.getValueAt(index,2).toString();
        txtMobileNumber.setText(mobileNumber);
        
        String email=model.getValueAt(index,3).toString();
        txtEmail.setText(email);
        
        String address=model.getValueAt(index,4).toString();
        txtAddress.setText(address);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String mobileNumber=txtMobileNumber.getText();
        String email=txtEmail.getText();
        String address=txtAddress.getText();
        
        if(validateFields())
        {
            JOptionPane.showMessageDialog(null,"All fields are required !!");
        }
        else
        {
            try
            {
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("update Customer set name=?,mobileNumber=?,email=?,address=? where customer_pk=?");
                ps.setString(1,name);
                ps.setString(2,mobileNumber);
                ps.setString(3,email);
                ps.setString(4,address);
                ps.setInt(5,customerPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Customer updated successfully !!");
                setVisible(false);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrss;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
