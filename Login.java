
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    static String Username="";
    static String Password="";
    
     public void make_back_trans(){
        
        jPasswordField1.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        jTextField6.setBackground(new java.awt.Color(0,0,0,1));
        jTextField7.setBackground(new java.awt.Color(0,0,0,1));
        jTextField8.setBackground(new java.awt.Color(0,0,0,1));
    
    
    }
    

    public Login() {
    try{
        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\SE\\logdb.jpg")))));
    
    }catch(IOException e)
    {
        e.printStackTrace();
       
    }
    this.setLayout(new FlowLayout());
    this.setResizable(false);
    
        initComponents();
        this.make_back_trans();
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        this.pack();
        this.setVisible(true);
        
        
       //getContentPane().setBackground(Color.GRAY);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        P1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        P2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        P1.setBackground(new java.awt.Color(153, 153, 153));
        P1.setOpaque(false);
        P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Hostel Managment System");
        P1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Admin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        P1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 273, 60));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Student");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        P1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 273, 60));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("New Student");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        P1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 273, 60));

        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 930, 170));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Developed By:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 649, -1, -1));

        jLabel15.setText("Amjad Ali ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 671, -1, -1));

        jLabel16.setText("Bhomika Kumari");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 694, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 790));

        P4.setBackground(java.awt.Color.gray);
        P4.setOpaque(false);
        P4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        P4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setText("Student ID");
        P4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 153, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setText("Department");
        P4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 153, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setText("Password");
        P4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 245, 80, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setText("Username");
        P4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 245, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel12.setText("Hostel No:");
        P4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 61, 80, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        P4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 148, 180, 32));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        P4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 56, 180, 32));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField5.setOpaque(false);
        P4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 148, 190, 32));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField6.setOpaque(false);
        P4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 240, 190, 32));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField7.setOpaque(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        P4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 56, 188, 32));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField8.setOpaque(false);
        P4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 180, 32));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        P4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 164, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Student Details");
        P4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 13, -1, -1));

        getContentPane().add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 1330, 340));

        P3.setBackground(java.awt.Color.gray);
        P3.setEnabled(false);
        P3.setOpaque(false);
        P3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Username:");
        P3.add(jLabel1);
        jLabel1.setBounds(258, 70, 100, 25);

        jTextField1.setBackground(java.awt.Color.gray);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        P3.add(jTextField1);
        jTextField1.setBounds(386, 68, 232, 34);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        P3.add(jLabel2);
        jLabel2.setBounds(260, 140, 100, 25);

        jPasswordField1.setBackground(java.awt.Color.gray);
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        P3.add(jPasswordField1);
        jPasswordField1.setBounds(386, 138, 232, 33);

        jCheckBox1.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        P3.add(jCheckBox1);
        jCheckBox1.setBounds(438, 180, 110, 25);

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        P3.add(jButton1);
        jButton1.setBounds(460, 220, 81, 40);

        getContentPane().add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 950, 270));

        P2.setBackground(java.awt.Color.gray);
        P2.setOpaque(false);
        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Please Enter Password ");
        P2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 82));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("LOGIN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        P2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 107, 34));

        jCheckBox2.setText("Show Password");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        P2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jPasswordField2.setBackground(java.awt.Color.gray);
        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPasswordField2.setOpaque(false);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        P2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 284, 37));

        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 960, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            Username = jTextField1.getText();
            Password = jPasswordField1.getText();
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from login_Details where Username='" + Username + "' and Password='" + Password + "'");
                if (rs.next()) {
                    
                    new HomeForStudent().setVisible(true);
                    setVisible(false);

                } else {

                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                   jTextField1.setText("");
                   jPasswordField1.setText("");
                   
                }

            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);

            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do want to exit application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else
            jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        P3.setVisible(false);
        P2.setVisible(false);
        P4.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Name = jTextField7.getText().trim();
        String Username = jTextField6.getText();
        String Department = jTextField3.getText();
        String ID = jTextField5.getText();
        String Password = jTextField8.getText();
        String Hostel_No= jTextField4.getText();
        if (jTextField7.getText().equals("") || jTextField4.getText().equals("") || Username.equals("") || ID.equals("") || Department.equals("") || Password.equals("") || Hostel_No.equals("")) {
            {

                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
        }else{
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("insert into login_details values(?,?,?,?,?,?)");

            st.setString(1, ID);
            st.setString(2, Name);
            st.setString(3, Username);
            st.setString(4, Password);
            st.setString(5, Department);
            st.setInt(6, Integer.valueOf(Hostel_No));

            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select *from login_details where Username='" + Username + "'");
            if (rs1.next()) {

                JOptionPane.showMessageDialog(null, "username already taken ");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                
                
                

            } else {
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Invalid Studnet ID");

        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            jPasswordField2.setEchoChar((char) 0);
        } else
            jPasswordField2.setEchoChar('*');
                                      
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        P3.setVisible(false);
        P4.setVisible(false);
        P2.setVisible(true);
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        P2.setVisible(false);
        P4.setVisible(false);
        P3.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (jPasswordField2.getText().equals("2672")) {
            
            new Home().setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Password");
            jPasswordField2.setText("");
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
