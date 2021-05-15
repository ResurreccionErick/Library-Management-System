
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Resurreccion
 */
public class returnBook extends javax.swing.JFrame {

    /**
     * Creates new form returnBook
     */
    public returnBook() {
        initComponents();
    }

   Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_bookId = new javax.swing.JTextField();
        jTextField_studentID = new javax.swing.JTextField();
        jTextfield_issuedate = new javax.swing.JTextField();
        jTextfield_duedate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Book ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 71, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 114, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Issue date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 159, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Due date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 202, -1, -1));

        jTextField_bookId.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 68, 253, -1));

        jTextField_studentID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 111, 253, -1));

        jTextfield_issuedate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextfield_issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 156, 253, -1));

        jTextfield_duedate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextfield_duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 199, 253, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 68, 110, 70));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("RETURN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 113, 39));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 113, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/114931904-white-sheet-of-paper-texture-for-background-with-clipping-path-image_1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String bookIDs = jTextField_bookId.getText();
     String studentIDs = jTextField_studentID.getText();
     
     
        try{
           String sql = "UPDATE `issuebook` SET returned='YES' WHERE book_id="+bookIDs+" AND student_id="+studentIDs;
           conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem?useUnicode=true&useJDBCCompliantTimezoneShift=tr"
                + "ue&useLegacyDatetimeCode=false&serverTimezone=UTC","dev","123");
           ps = conn.prepareStatement(sql);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "BOOK SUCCESSFULLY RETURNED");
            setVisible(false);
            new returnBook().setVisible(true);
            
           
           
           
           
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bookID = jTextField_bookId.getText();
        String studentID = jTextField_studentID.getText();
        try{
           String sql = "SELECT * FROM `issuebook` WHERE book_id="+bookID+" AND student_id="+studentID;
           conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem?useUnicode=true&useJDBCCompliantTimezoneShift=tr"
                + "ue&useLegacyDatetimeCode=false&serverTimezone=UTC","dev","123");
           Statement st = conn.createStatement();
           rs = st.executeQuery(sql);
           if(rs.next()){
               jTextfield_issuedate.setText(rs.getString(3));
               jTextfield_duedate.setText(rs.getString(4));
               jTextField_bookId.setEditable(false);
               jTextField_studentID.setEditable(false);
               
           }else{
               JOptionPane.showMessageDialog(null, "Wrong info");
               setVisible(false);
               new returnBook().setVisible(true);
           }
           
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
                           setVisible(false);
               new returnBook().setVisible(true);
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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_bookId;
    private javax.swing.JTextField jTextField_studentID;
    private javax.swing.JTextField jTextfield_duedate;
    private javax.swing.JTextField jTextfield_issuedate;
    // End of variables declaration//GEN-END:variables
}
