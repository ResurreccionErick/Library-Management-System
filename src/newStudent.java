import java.sql.*;
import javax.swing.JOptionPane;
public class newStudent extends javax.swing.JFrame {

 
    public newStudent() {
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
        jTextField_studentid = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jComboBox_level = new javax.swing.JComboBox<>();
        jComboBox_course = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Student ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 133, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Level:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Course:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 219, -1, -1));

        jTextField_studentid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 87, 251, -1));

        jTextField_name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 130, 251, -1));

        jComboBox_level.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLLEGE", "SHS" }));
        getContentPane().add(jComboBox_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 173, 251, -1));

        jComboBox_course.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSBA", "BSTM", "BSHM", "BSCPE", "BSCS" }));
        getContentPane().add(jComboBox_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 216, 251, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 259, 113, 39));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 259, 113, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/114931904-white-sheet-of-paper-texture-for-background-with-clipping-path-image_1.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       try{
       String sql = "INSERT INTO `student`(`student_id`, `name`, `level`, `course`) VALUES (?,?,?,?)";
      
        conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem?useUnicode=true&useJDBCCompliantTimezoneShift=tr"
               + "ue&useLegacyDatetimeCode=false&serverTimezone=UTC","dev","123");
       ps = conn.prepareStatement(sql);
       
       ps.setString(1, jTextField_studentid.getText());
       ps.setString(2, jTextField_name.getText());
       ps.setString(3, jComboBox_level.getSelectedItem().toString());
       ps.setString(4, jComboBox_course.getSelectedItem().toString());
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null, "Data inserted");
       
       jTextField_name.setText("");
       jTextField_studentid.setText("");
       jComboBox_level.setSelectedIndex(-1);
       jComboBox_course.setSelectedIndex(-1);
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
    private javax.swing.JComboBox<String> jComboBox_course;
    private javax.swing.JComboBox<String> jComboBox_level;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_studentid;
    // End of variables declaration//GEN-END:variables
}
