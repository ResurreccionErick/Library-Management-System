import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class newBook extends javax.swing.JFrame {

 
    public newBook() {
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
        jTextField_bookID = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Publisher = new javax.swing.JTextField();
        jTextField_bookName = new javax.swing.JTextField();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Book ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Book Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Publisher:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Price:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jTextField_bookID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 251, -1));

        jTextField_price.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 251, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 113, 39));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 113, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Date Published:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jTextField_Publisher.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_Publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 251, -1));

        jTextField_bookName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 251, -1));

        jDateChooser_date.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jDateChooser_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 251, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/114931904-white-sheet-of-paper-texture-for-background-with-clipping-path-image_1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
       try{
       String sql = "INSERT INTO `book`(`book_id`, `name`, `publisher`, `price`, `publisher_year`) VALUES (?,?,?,?,?)";
      
        conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem?useUnicode=true&useJDBCCompliantTimezoneShift=tr"
               + "ue&useLegacyDatetimeCode=false&serverTimezone=UTC","dev","123");
       ps = conn.prepareStatement(sql);
       
       ps.setString(1, jTextField_bookID.getText());
       ps.setString(2, jTextField_bookName.getText());
       ps.setString(3, jTextField_Publisher.getText());
       ps.setString(4, jTextField_price.getText());
       ps.setString(5, String.valueOf(dFormat.format(jDateChooser_date.getDate())));

       ps.executeUpdate();
       JOptionPane.showMessageDialog(null, "Book inserted");
       
       jTextField_price.setText("");
       jTextField_bookID.setText("");
       jTextField_bookName.setText("");
       jTextField_Publisher.setText("");
       jDateChooser_date.setDateFormatString("");
       
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_Publisher;
    private javax.swing.JTextField jTextField_bookID;
    private javax.swing.JTextField jTextField_bookName;
    private javax.swing.JTextField jTextField_price;
    // End of variables declaration//GEN-END:variables
}
