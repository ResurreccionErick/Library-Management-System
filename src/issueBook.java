
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class issueBook extends javax.swing.JFrame {

    /**
     * Creates new form issueBook
     */
    public issueBook() {
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
        jTextField_studentID = new javax.swing.JTextField();
        jTextField_bookName = new javax.swing.JTextField();
        jDateChooser_issue = new com.toedter.calendar.JDateChooser();
        jDateChooser_due = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_bookID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_studentName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Book ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Issue Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Due Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jTextField_studentID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 250, -1));

        jTextField_bookName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 250, -1));

        jDateChooser_issue.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jDateChooser_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 250, -1));

        jDateChooser_due.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jDateChooser_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 250, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 113, 39));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 113, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Student name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTextField_bookID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 250, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Book name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jTextField_studentName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField_studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 250, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/114931904-white-sheet-of-paper-texture-for-background-with-clipping-path-image_1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String bookID = jTextField_bookID.getText();
        String studentID = jTextField_studentID.getText();

        String dateIssue = dFormat.format(jDateChooser_issue.getDate());
        String dueDate = dFormat.format(jDateChooser_due.getDate());
        try{
            String sqlstudent = "SELECT * FROM student WHERE student_id="+studentID;
            while(rs.next()) 
            {
                jTextField_studentName.setText(rs.getString("name"));
            }
            String sqlbook = "SELECT * FROM `book` WHERE book_id="+bookID;


            
            String sql = "INSERT INTO `issuebook`(`student_id`, `book_id`, `issue_Date`, `due_Date`, `returned`) VALUES (?,?,?,?,?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem?useUnicode=true&useJDBCCompliantTimezoneShift=tr"
                + "ue&useLegacyDatetimeCode=false&serverTimezone=UTC","dev","123");
            Statement st = conn.createStatement();
            rs = st.executeQuery(sqlbook);
            
            if(rs.next()){
                st = conn.createStatement();
                ResultSet rs1 = st.executeQuery(sqlstudent);
                    if(rs1.next()){
                            ps = conn.prepareStatement(sql);
                             ps.setString(1, studentID);
                             ps.setString(2, bookID);
                             ps.setString(3, dateIssue);
                             ps.setString(4, dueDate);
                             ps.setString(5, "no");
                        ps.executeUpdate();
                            
                            JOptionPane.showMessageDialog(null, "Date Issue inserted");

                            jTextField_studentID.setText("");
                            jTextField_studentID.setText("");
                            jDateChooser_issue.setDateFormatString("");
                            jDateChooser_due.setDateFormatString("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect or No Student ID");
                    }
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect or No book ID");
            }
      


        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser_due;
    private com.toedter.calendar.JDateChooser jDateChooser_issue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField_bookID;
    private javax.swing.JTextField jTextField_bookName;
    private javax.swing.JTextField jTextField_studentID;
    private javax.swing.JTextField jTextField_studentName;
    // End of variables declaration//GEN-END:variables
}
