import java.sql.*;
import Project.ConnectionProvider;
import java.awt.FlowLayout;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class NewStudent extends javax.swing.JFrame {
    
    private String Student_id;
    private int allotment_id;
    private boolean ship;
    
    public void Account_clear()
    {
        jTextField42.setText("");
        jTextField38.setText("");
        jTextField44.setText("");
        jTextField40.setText("");
    
    }
    
    public void set_Account_Tab()
    {
        jTextField42.setText(Student_id);
        jTextField42.setEditable(false);
        
        jTextField38.setText(allotment_id+"");
        jTextField38.setEditable(false);
        
        jTextField44.setText("24000");
        jTextField44.setEditable(false);
        
        jTextField40.setText("24000");
        jTextField40.setEditable(false);
        
    
    }
    
    public void allotment_clear()
    {
    jTextField41.setEditable(true);
    jTextField41.setText("");
    jTextField39.setEditable(true);   
    jTextField39.setText("");
    jTextField37.setEditable(true);
    jTextField37.setText("");
    }
   
    public void make_back_trans(){
        
    jPanel4.setOpaque(false);
    jPanel3.setOpaque(false);
    jPanel2.setOpaque(false);
    jPanel5.setOpaque(false);
    //panel1.setOpaque(false);;
    }
    
    public void gaurdian_clear()
    {
        jTextField32.setText("");
        jTextField12.setText("");
        jTextField33.setText("");
        jTextField16.setText("");
        jTextField34.setText("");
        jTextField29.setText("");
        jTextField35.setText("");
        jTextField30.setText(""); 
        
      
    }
   
    public void personal_clear()
    {
        jTextField46.setText("");
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField50.setText("");
        jTextField51.setText("");
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField54.setText("");
        jTextField55.setText("");
        jCheckBox4.setSelected(false);  
        
      
    }

    public void set_Hostels()
    {
  try{

  Connection con=ConnectionProvider.getCon();
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select hostel_name from Hostels");
  while(rs.next())
  { 
      jComboBox3.addItem(rs.getString(1));     
  }
  }
  catch(Exception e)
  {
      JOptionPane.showMessageDialog(null, e);
  }

}

    public void Set_roomNumber()
    {
  String Hostel = jComboBox3.getSelectedItem().toString();
  String Hostel_id="BH-1";
  if(Hostel.equals("B-Hostel 1"))
      Hostel_id = "BH-1";
  else if(Hostel.equals("B-Hostel 2"))
      Hostel_id = "BH-2";
  else if(Hostel.equals("G-Hostel 1"))
      Hostel_id = "GH-1";
  else 
      Hostel_id = "GH-2";


  if(!Hostel.equals(""))
  {
      try{
          Connection con=ConnectionProvider.getCon();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select room_id from Rooms where students_living <= 3 and booking_status=0 and hostel_id ='" + Hostel_id + "'");
          while(rs.next())
          {jComboBox4.addItem(rs.getString(1));}

      }catch(Exception e)
      {JOptionPane.showMessageDialog(null, e);}

}

}

    public String next_allotment_id()
    {
    String id = "";
    try{
          Connection con=ConnectionProvider.getCon();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from Room_allotments");
          while(rs.next())
          {
              if(rs.getString(2)==null)
                  break;
          }

          id=rs.getString(1);

    } catch (Exception e) {

      JOptionPane.showMessageDialog(null, e);

  }

     return id;               

}

    public void set_Allotment_Tab()
    {
  this.set_Hostels();
  jTextField41.setText(Student_id);
  jTextField41.setEditable(false);
  SimpleDateFormat dFormat=new SimpleDateFormat("DD-MMM-YYYY");
  Date date=new Date();
  String dat=dFormat.format(date);
  String datee=date.toString();
  String dateee=datee.substring(4,10);
  String dateee2=datee.substring(23, 28);
  jTextField39.setText(dateee+dateee2);
  jTextField39.setEditable(false);   
  jTextField37.setText(next_allotment_id());
  jTextField37.setEditable(false);
}
      
   
    public NewStudent() {
       
        initComponents();
        this.make_back_trans();
        jTabbedPane1.setEnabled(false);
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextField46 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField37 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jTextField38 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 13, 29, 29));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 76, 160, -1));
        jPanel4.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 115, 160, -1));
        jPanel4.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 155, 160, -1));
        jPanel4.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 195, 160, -1));

        jButton20.setBackground(new java.awt.Color(255, 0, 0));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cleaning (1).png"))); // NOI18N
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 30, 30));

        jButton21.setBackground(new java.awt.Color(0, 102, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (1).png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 30, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel59.setText("Religion");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 195, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel60.setText("Gender");
        jPanel4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 158, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel61.setText("CNIC");
        jPanel4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 118, 40, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel63.setText("Last Name");
        jPanel4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 79, -1, -1));

        jTextField51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField51ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 76, 180, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel64.setText("First Name");
        jPanel4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 79, -1, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel65.setText("Student ID");
        jPanel4.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 118, -1, -1));
        jPanel4.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 115, 180, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel66.setText("Department ID");
        jPanel4.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));

        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 180, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel67.setText("Phone");
        jPanel4.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, -1, -1));
        jPanel4.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 195, 180, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel68.setText("Email");
        jPanel4.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 239, 40, -1));

        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 236, 180, -1));

        jCheckBox4.setText("Schoolarship");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, 160, -1));

        jTabbedPane1.addTab("Personal Details ", jPanel4);

        jButton14.setBackground(new java.awt.Color(255, 0, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cleaning (1).png"))); // NOI18N
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 102, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (1).png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel21.setText("Monthly Income");

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel37.setText("CNIC");

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel38.setText("Designation");

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel39.setText("Last Name");

        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel40.setText("First Name");

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel41.setText("Relationship");

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel42.setText("Contact No");

        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel43.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel43)
                            .addGap(44, 44, 44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(168, 168, 168))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel42)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel40))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(170, 170, 170)
                                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(67, 67, 67)
                                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(63, 63, 63)
                                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel38)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel39)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Guardian Details", jPanel2);

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 102, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (1).png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel47.setText("Date");

        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel48.setText("Room");

        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel49.setText("Allotment ID");

        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel50.setText("Student ID");

        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel51.setText("Hostel No");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(264, 264, 264)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel50))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox3, 0, 180, Short.MAX_VALUE)
                                    .addComponent(jTextField39))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        jTabbedPane1.addTab("Allotment Details", jPanel3);

        jButton24.setBackground(new java.awt.Color(0, 102, 255));
        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (1).png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel53.setText("Current Amount");

        jLabel55.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel55.setText("Allotment ID");

        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel56.setText("Student ID");

        jLabel70.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel70.setText("Due Amount");

        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField44, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel70)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel70)))
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Account Details", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 650, 360));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel45.setText("Personal Details");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pages background (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String first_name = jTextField32.getText().trim();
        String last_name = jTextField12.getText();
        String relation = jTextField33.getText().trim();
        String Designation = jTextField16.getText();
        String phone = jTextField34.getText();
        String CNIC = jTextField29.getText();
        String Email = jTextField35.getText();
        int income= Integer.valueOf(jTextField30.getText());
        if (first_name.equals("") || last_name.equals("")|| Email.equals("") || phone.equals("") || Designation.equals("") || CNIC.equals("")) {
            {

                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
        }else{
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("insert into guardian_details values(?,?,?,?,?,?,?,?)");

            st.setString(1, Student_id);
            st.setString(2, first_name+" "+last_name);
            st.setString(3, relation);
            st.setString(4, Designation);
            st.setString(5, phone);
            st.setString(6, Email);
            st.setInt(7, income);
            st.setString(8, CNIC);
            

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                personal_clear();
               
                
               
                this.set_Allotment_Tab();
                gaurdian_clear();
                jLabel45.setText("Allotment Details");
                jTabbedPane1.setSelectedIndex(2);

            } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        this.personal_clear();
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        String first_name = jTextField51.getText().trim();
        String last_name = jTextField46.getText();
        Student_id = jTextField52.getText().trim();
        String Dept = jTextField53.getText().trim();
        String CNIC = jTextField48.getText();
        String phone = jTextField54.getText();
        String Gender = jTextField49.getText();
        String Email = jTextField55.getText();
        String Religion= jTextField50.getText();
        int scholarship = (jCheckBox4.isSelected()) ? 1 : 0;
        ship=(scholarship ==1)? true:false;
        if (first_name.equals("") || last_name.equals("")|| Email.equals("") || phone.equals("") || Student_id.equals("") || Dept.equals("") || CNIC.equals("") || Religion.equals("") || Gender.equals("")) {
            {

                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
        }else{
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?,?,?)");

            st.setString(1, Student_id);
            st.setString(2, first_name);
            st.setString(3, last_name);
            st.setString(4, Dept);
            st.setString(5, phone);
            st.setString(6, Email);
            st.setString(7, CNIC);
            st.setString(8, Gender);
            st.setString(9, Religion);
            st.setInt(10, Integer.valueOf(scholarship));

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                personal_clear();
                jTabbedPane1.setSelectedIndex(1);
                jLabel45.setText("Gaurdian Details");

            } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField51ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        allotment_id = Integer.valueOf(jTextField37.getText());
        int room_id = Integer.valueOf(jComboBox4.getSelectedItem().toString());
        String Date = jTextField39.getText();
        
        
        
        try {
            
            Connection con1 = ConnectionProvider.getCon();
            Statement st3 = con1.createStatement();
            ResultSet rs = st3.executeQuery("select * from rooms where room_id = "+room_id+";");
           
            rs.next();
            int count = rs.getInt(6);
            count++;
            
           Connection con2 = ConnectionProvider.getCon();
            PreparedStatement st2 = con2.prepareStatement("update rooms SET students_living =? where room_id =? ;");
            
            st2.setInt(1, count);
            st2.setInt(2,room_id);
            st2.executeUpdate();
            
            
            
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("update room_allotments SET student_id = ?, room_id = ?, allotment_date = ?, vecant_date = null , allotment_status = 'YES' where allotment_id ="+allotment_id+"");

            
            st.setString(1, Student_id);
            st.setInt(2, room_id);
            st.setString(3, Date);
            

                st.executeUpdate();
                
               
       
               
                

            } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        
                if(ship)
                {
                    JOptionPane.showMessageDialog(null, "Student Enrolled Succesfully");
                    this.setVisible(false);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                this.set_Account_Tab();
                this.allotment_clear();
                jLabel45.setText("Account Details");
                jTabbedPane1.setSelectedIndex(3);
                }
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        
        int due = Integer.valueOf(jTextField44.getText());
        int current = Integer.valueOf(jTextField40.getText());
        
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("insert into student_accounts values(?,?,?,?,?)");

            
            st.setString(1, Student_id);
            st.setInt(2, allotment_id);
            st.setInt(3, due);
            st.setInt(4, current);
            st.setInt(5, current);
            

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Enrolled Successfully");
                setVisible(false);
               
       
               
                

            } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        jComboBox4.removeAllItems();
        this.Set_roomNumber();
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    // End of variables declaration//GEN-END:variables
}
