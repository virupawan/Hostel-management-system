
import IMGPACKAGE.conne;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pawan
 */
public class StudentProfile extends javax.swing.JFrame {
      
    /**
     * Creates new form NewRegistration
     */
    
  
        
    public StudentProfile() {
        initComponents();
//        clear();
    }

   

    
      public void clear()
      {
         
        txt1.setText("");txtarea.setText("");
        txt2.setText("");txt9.setText("");
        txt3.setText("");txt8.setText("");
        txt4.setText("");
        txt5.setText("");txt6.setText("");
        ADHAR.setText("");
        SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_form.format(txt7.getDate());
        
        
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ADHAR = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt7 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        allot = new javax.swing.JButton();
        txt8 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID NUMBER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 71, 30));

        jLabel2.setText("JOIN DATE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 71, -1));

        jLabel3.setText("COURSE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 71, -1));

        jLabel6.setText("MOTHER'S NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        jLabel7.setText("PHONE NUMBER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, -1));

        jLabel8.setText("EMAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 71, 20));

        jLabel9.setText("FATHER'S NAME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 227, -1));
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 227, -1));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 227, -1));

        jLabel11.setText("ROOM NO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 71, -1));

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel12.setText("STUDENT PROFILE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 350, 45));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLOSE");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 30, 110, 30));

        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 406, 82, -1));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 406, 230, 70));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 39, 227, -1));

        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 71, -1));

        jLabel10.setText("ADHAR NUMBER");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, -1, -1));
        jPanel1.add(ADHAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 365, 232, -1));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        jPanel1.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 227, -1));

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        jPanel1.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 227, -1));
        jPanel1.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 220, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 142, -1));

        allot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allot.setText("ROOM ALLOT");
        allot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allotActionPerformed(evt);
            }
        });
        jPanel1.add(allot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));
        jPanel1.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 220, -1));

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        jPanel1.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 227, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        setVisible(false);
      new AdminPanel().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void allotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allotActionPerformed
        // TODO add your handling code here:
         if(txt1.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        else if(txt2.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        
        else if(txt3.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        else if(txt4.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        
        else if(txt5.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        else if(txt6.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        
        else if(txt8.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        else if(txt9.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
        else if(txtarea.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Section");
        }
            else 
            {
//            JOptionPane.showMessageDialog(null, "Room Alloted");
        
         if (evt.getSource() == allot) {
            String name = txt1.getText();
            String fname = txt2.getText();
            String mname = txt3.getText();
            String email = txt4.getText();
            String  pnumber = txt5.getText();
            String anumber = ADHAR.getText();
            String inumber= txt6.getText();
            
              SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
              String jdate = date_form.format(txt7.getDate());
            String rblock = txt8.getText();
            String  rnumber= txt9.getText();
            String  address= txtarea.getText();
            
//            String query = "insert into registation values('" +txt1+ "','" +spassword+ "','" +sconformpassword+ "')";
            try {
                Connection c =  conne.getCon();
                PreparedStatement ps = c.prepareStatement("insert into studentinfo values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                 ps.setString(4, email);
                ps.setString(5, pnumber);
                ps.setString(6, anumber);
                 ps.setString(7, inumber);
                ps.setString(8, jdate);
                ps.setString(9, rblock);
                ps.setString(10, rnumber);
                 ps.setString(11, address);
                
                
                ps.executeUpdate();
                JOptionPane.showConfirmDialog(null, "Room Alloted ");
                setVisible(false);
                new AdminPanel().setVisible(true);
//                c.s.executeUpdate(query);
//                JOptionPane.showConfirmDialog(null, "Register Successfully. ");

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
       }

       
        
    }//GEN-LAST:event_allotActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
       
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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADHAR;
    private javax.swing.JButton allot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private com.toedter.calendar.JDateChooser txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
