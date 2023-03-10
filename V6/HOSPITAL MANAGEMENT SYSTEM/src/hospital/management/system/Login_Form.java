package hospital.management.system;

import Admin.Admin;
import Admin.Admin_Panel;
import java.sql.*;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Login_Form extends javax.swing.JFrame {

    private final String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=HMS;" + "user=sa;password=12345;";
    
    int mousepx;
    int mousepy;

    public Login_Form() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Cannot Load JDBC Driver !!!!");
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

        jPanel1 = new javax.swing.JPanel();
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Username_Filed = new javax.swing.JTextField();
        Password_Filed = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Login_Label = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        Username_Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Username_Label.setForeground(new java.awt.Color(153, 153, 153));
        Username_Label.setText("Username");

        Password_Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Password_Label.setForeground(new java.awt.Color(153, 153, 153));
        Password_Label.setText("Password");

        Username_Filed.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        Username_Filed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Username_FiledFocusGained(evt);
            }
        });
        Username_Filed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Username_FiledMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Username_FiledMouseExited(evt);
            }
        });
        Username_Filed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_FiledActionPerformed(evt);
            }
        });

        Password_Filed.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        Password_Filed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Password_FiledMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Password_FiledMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Login_Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        Login_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Label.setText("Login");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close_1.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/setappoinment.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 51, 255));
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Username_Label)
                                    .addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(Login_Label)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_Label)
                .addGap(49, 49, 49)
                .addComponent(Username_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_Filed, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 344, 545);

        setSize(new java.awt.Dimension(344, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        //ImageIcon image = new ImageIcon(getClass().getResource("Icon/cross.png"));
        //close.setIcon(image);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/closec.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void Username_FiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_FiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_FiledActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel3.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel3.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(Color.WHITE);
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel2.setBackground(Color.WHITE);
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPanel1MouseExited

    private void Username_FiledMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_FiledMouseEntered
        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel3.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_Username_FiledMouseEntered

    private void Username_FiledMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_FiledMouseExited
        jPanel2.setBackground(Color.WHITE);
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_Username_FiledMouseExited

    private void Password_FiledMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_FiledMouseEntered
        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel3.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_Password_FiledMouseEntered

    private void Password_FiledMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_FiledMouseExited
        jPanel2.setBackground(Color.WHITE);
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_Password_FiledMouseExited


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String Username = Username_Filed.getText();
        String Password = String.valueOf(Password_Filed.getPassword());
        Connection con = null;
        Statement stmt = null;
        String query;
        String au;

        
        //checing if text box is embty
        if (Username.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please enter your Username");
            return;
        }
        if (Password.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please enter your Password");
            return;
        }
        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            

            query = "SELECT * FROM users3 where username = '" + Username + " ' and password = '" + Password + "'";
                    
            ResultSet rs = stmt.executeQuery(query);            
            if (rs.next()) {
                au = rs.getString(5);                
                if (au.trim().equals("ad")) {                    
                    Admin_Panel ad = new Admin_Panel();                    
                    ad.setVisible(true);
                    ad.welcome.setText("Welcome ! " + rs.getNString(3));
                    this.dispose();
                    
                } else if (au.trim().equals("dc")) {
                    Doctor dc = new Doctor();
                    dc.setVisible(true);
                    //dc.welcome.setText(rs.getNString(3));
                    this.dispose();
                } else if (au.trim().equals("nr")) {
                    Nurse nr = new Nurse();
                    nr.setVisible(true);
                    this.dispose();
                } else if (au.trim().equals("rp")) {
                    Reception rp = new Reception();
                    rp.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter right Data");
                return;

            }

            /*while (rs.next()) {
                // retrieve and print the values for the current row
                String pw = rs.getString("Password");
                String au = rs.getNString("Authorized");
                String un = rs.getString("Username");
                
                
                System.out.println("ROW = "  + " " + un + " " + pw + au);
            }
             
            if (rs.next()) {

                JOptionPane.showMessageDialog(this, "Successful Registration !!!");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Username and Password. !!!");
            }*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ex) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int kx = evt.getXOnScreen();
        int ky = evt.getYOnScreen();
        this.setLocation(kx - mousepx, ky - mousepy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mousepx = evt.getX();
        mousepy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void Username_FiledFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username_FiledFocusGained
        
    }//GEN-LAST:event_Username_FiledFocusGained

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close_1.png")));
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_Label;
    private javax.swing.JPasswordField Password_Filed;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JTextField Username_Filed;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
