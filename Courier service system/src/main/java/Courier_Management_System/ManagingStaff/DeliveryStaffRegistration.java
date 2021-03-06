/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courier_Management_System.ManagingStaff;


import Courier_Management_System.DeliveryStaff.delivery;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class DeliveryStaffRegistration extends javax.swing.JFrame {

    
    
    public DeliveryStaffRegistration() {
        initComponents();
    
        
        
    }
 
    public int generateId() throws IOException {
        
        int maxId = 4410;
        String s;
        BufferedReader br; 
        StringTokenizer st;
        File deliveryStaffFile = new File("DeliveryStaffFile.txt");
        br = new BufferedReader(new FileReader(deliveryStaffFile));
        if (deliveryStaffFile.exists()) {
            while((s=br.readLine())!=null) {
                st = new StringTokenizer(s, ",");
                
                String i = st.nextToken();
                int uId = Integer.parseInt(i);
                if(maxId<uId) {
                    maxId=uId;
                }
            }
        }
        else {
            maxId+=1;
            
        }
        
        br.close();
        
        return maxId+1;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_massage1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Deliverystaff_Name = new javax.swing.JTextField();
        jTextField1_Address1 = new javax.swing.JTextField();
        jTextField1_Email = new javax.swing.JTextField();
        jButton1_save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_ContactNumber1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1_massage1 = new javax.swing.JLabel();
        jButton_reset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1_age = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DeliveryStaff_username = new javax.swing.JTextField();
        jButton_Deliveryformexit = new javax.swing.JButton();
        DeliveryStaff_gender = new javax.swing.JComboBox<>();
        Deliverystaff_password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1_massage1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setText("Full Name:");

        jLabel6.setText("Address:");

        jLabel7.setText("Contact Number:");

        Deliverystaff_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deliverystaff_NameActionPerformed(evt);
            }
        });

        jTextField1_Email.setToolTipText("");
        jTextField1_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_EmailActionPerformed(evt);
            }
        });

        jButton1_save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1_save.setText("Save");
        jButton1_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_saveActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        jTextField1_ContactNumber1.setToolTipText("");
        jTextField1_ContactNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_ContactNumber1ActionPerformed(evt);
            }
        });

        jLabel1_massage1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1_massage1.setForeground(new java.awt.Color(0, 0, 153));

        jButton_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jLabel10.setText("Gender:");

        jLabel11.setText("Age:");

        jTextField1_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_ageActionPerformed(evt);
            }
        });

        jLabel12.setText("Username:");

        jLabel13.setText("Password:");

        DeliveryStaff_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryStaff_usernameActionPerformed(evt);
            }
        });

        jButton_Deliveryformexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Deliveryformexit.setText("Back");
        jButton_Deliveryformexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeliveryformexitActionPerformed(evt);
            }
        });

        DeliveryStaff_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        javax.swing.GroupLayout jPanel1_massage1Layout = new javax.swing.GroupLayout(jPanel1_massage1);
        jPanel1_massage1.setLayout(jPanel1_massage1Layout);
        jPanel1_massage1Layout.setHorizontalGroup(
            jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel1_massage1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_massage1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                        .addComponent(jButton1_save)
                        .addGap(61, 61, 61)
                        .addComponent(jButton_reset)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Deliverystaff_password, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(153, 153, 153))
                        .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(51, 51, 51)
                            .addComponent(DeliveryStaff_username, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(161, 161, 161))))
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jButton_Deliveryformexit))
                .addGap(60, 60, 60)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deliverystaff_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_ContactNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_age, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeliveryStaff_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel1_massage1Layout.setVerticalGroup(
            jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_massage1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deliverystaff_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeliveryStaff_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliveryStaff_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Deliverystaff_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(jTextField1_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_ContactNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1_massage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Deliveryformexit)
                        .addComponent(jButton_reset)
                        .addComponent(jButton1_save)))
                .addGap(17, 17, 17)
                .addComponent(jLabel1_massage1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Tuki");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Courier");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Delivery Staff Registration Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(132, 132, 132)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_massage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1_massage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_saveActionPerformed
   
        FileWriter  fw;
        BufferedWriter bw;
        delivery dr =new delivery();
        
        
        String username = this.DeliveryStaff_username.getText();
        String password = this.Deliverystaff_password.getText();
        String fullname = this.Deliverystaff_Name.getText();
        String gender = DeliveryStaff_gender.getSelectedItem().toString();
        String age = this.jTextField1_age.getText();
        String address = this.jTextField1_Address1.getText();
        String contactNo = this.jTextField1_ContactNumber1.getText();
        String email = this.jTextField1_Email.getText();
        dr.setUsern(username);
        dr.setPassd(password);
        dr.setFullname(fullname);
        
        dr.setAge(age);
        dr.setAddress(address);
        dr.setContact(contactNo);
        dr.setEmail(email);
        
        File deliveryStaffFile = new File("DeliveryStaffFile.txt");
        if(!deliveryStaffFile.exists())
        {
            try{

            deliveryStaffFile.createNewFile();
            
            fw = new FileWriter(deliveryStaffFile, true);
            bw = new BufferedWriter(fw);
            
            int id = generateId();
            String uID = String.valueOf(id);
            bw.write(uID+","+dr.getUsern()+","+ dr.getPassd() +","+ dr.getFullname() +","+ gender+","+dr.getAge()+","+ dr.getAddress() +","+ dr.getContact() +","+ dr.getEmail());
            bw.newLine();
            bw.flush();
            bw.close();
            JOptionPane.showMessageDialog(null, "Successfully Submit");
            this.hide();
            ManagingStaffHome Mstaff = new ManagingStaffHome();
            Mstaff.setVisible(true);
            }   catch (IOException ex) {
                Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try{
                fw = new FileWriter(deliveryStaffFile, true);
            bw = new BufferedWriter(fw);
            int id = generateId();
            String uID = String.valueOf(id);
            bw.write(uID+","+dr.getUsern()+","+ dr.getPassd() +","+ dr.getFullname() +","+ gender+","+dr.getAge()+","+ dr.getAddress() +","+ dr.getContact() +","+ dr.getEmail());
            bw.newLine();
            bw.flush();
            bw.close();
            JOptionPane.showMessageDialog(null, "Successfully Submit");
            this.hide();
            ManagingStaffHome Mstaff = new ManagingStaffHome();
            Mstaff.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1_saveActionPerformed
    
    private void Deliverystaff_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deliverystaff_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Deliverystaff_NameActionPerformed

    private void jTextField1_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_ageActionPerformed

    private void DeliveryStaff_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryStaff_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeliveryStaff_usernameActionPerformed

    private void jButton_DeliveryformexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeliveryformexitActionPerformed
        // TODO add your handling code here:
        this.hide();
        ManagingStaffHome Ds = new ManagingStaffHome();
        Ds.setVisible(true);
        
        
    }//GEN-LAST:event_jButton_DeliveryformexitActionPerformed

    private void jTextField1_ContactNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_ContactNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_ContactNumber1ActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        // TODO add your handling code here:
        
        DeliveryStaff_username.setText("");
        Deliverystaff_password.setText("");
        Deliverystaff_Name.setText("");

        jTextField1_age.setText("");
        jTextField1_Address1.setText("");
        jTextField1_ContactNumber1.setText("");
        jTextField1_Email.setText("");
        
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jTextField1_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_EmailActionPerformed

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
            java.util.logging.Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryStaffRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DeliveryStaff_gender;
    private javax.swing.JTextField DeliveryStaff_username;
    private javax.swing.JTextField Deliverystaff_Name;
    private javax.swing.JPasswordField Deliverystaff_password;
    private javax.swing.JButton jButton1_save;
    private javax.swing.JButton jButton_Deliveryformexit;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel1_massage1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1_massage1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1_Address1;
    private javax.swing.JTextField jTextField1_ContactNumber1;
    private javax.swing.JTextField jTextField1_Email;
    private javax.swing.JTextField jTextField1_age;
    // End of variables declaration//GEN-END:variables

    private BufferedWriter BufferedWriter(FileWriter fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
