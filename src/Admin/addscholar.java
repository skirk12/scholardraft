/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.config;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class addscholar extends javax.swing.JFrame {

   

    // PLACE IT HERE (Right at the top, before the constructor)
    public int itemId = 0; 

   
    public addscholar() {      
    // Check if the user is logged in before showing the UI

    
    initComponents();
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        addU = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Scholar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Category = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD SCHOLAR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 330, 104));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 130));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Catergory");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        addU.setBackground(new java.awt.Color(51, 153, 255));
        addU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addUMouseExited(evt);
            }
        });
        addU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD SCHOLAR");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        addU.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, -1));

        jPanel4.add(addU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 50));

        Scholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScholarActionPerformed(evt);
            }
        });
        jPanel4.add(Scholar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Scholar Name");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Description");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        jPanel4.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 240, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });
        jPanel4.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 240, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 920, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setColor(JPanel p){
        p.setBackground(new Color(240, 240, 240));
    }
    
    public void resetColor(JPanel p2){
        p2.setBackground(new Color(102, 102, 102));
    }
    
    private void addUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseEntered
        setColor(addU);
    }//GEN-LAST:event_addUMouseEntered

    private void addUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseExited
        resetColor(addU);
    }//GEN-LAST:event_addUMouseExited

    private void addUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUMouseClicked
                                  
config conf = new config();
    
    // Mapping your UI fields to variables
    String itemName = Scholar.getText();          // Scholar Name field
    String categoryStr = Category.getText();       // Category field
    String description = Description.getText();   // Description field (currently named timedate)
    
    // Since you don't have a "Deadline" field in the image, 
    // we'll set a default or use a placeholder to avoid SQL errors.
    String deadline = "Not Set"; 

    // 1. Validation: Ensure important fields aren't empty
    if (itemName.isEmpty() || categoryStr.isEmpty() || description.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in Name, Category, and Description!");
    } else {

        if (jLabel11.getText().equals("UPDATE")) {
            // --- UPDATE LOGIC ---
            // SQL order: s_name, s_category, s_status, s_description, s_deadline WHERE s_id
            String sql = "UPDATE tbl_scholarship SET s_name = ?, s_category = ?, s_status = ?, "
                       + "s_description = ?, s_deadline = ? WHERE s_id = ?";

            conf.updateRecord(sql, itemName, categoryStr, "Active", description, deadline, itemId);
            JOptionPane.showMessageDialog(null, "Scholarship Updated Successfully!");

        } else { 
            // --- INSERT LOGIC ---
            // Matches columns: s_name, s_category, s_status, s_description, s_deadline
            String sql = "INSERT INTO tbl_scholarship (s_name, s_category, s_status, s_description, s_deadline) "
                       + "VALUES (?, ?, ?, ?, ?)";

            conf.addRecord(sql, itemName, categoryStr, "Active", description, deadline);
            JOptionPane.showMessageDialog(null, "Scholarship Successfully Registered!");
        }

        // Return and Refresh
        new ManageScholar().setVisible(true);
        this.dispose();
    }

    

    }//GEN-LAST:event_addUMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
                                           
    addUMouseClicked(evt); // This tells the label to do whatever the panel does

    }//GEN-LAST:event_jLabel11MouseClicked

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void ScholarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScholarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScholarActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

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
            java.util.logging.Logger.getLogger(addscholar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addscholar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addscholar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addscholar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addscholar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Category;
    public javax.swing.JTextField Description;
    public javax.swing.JTextField Scholar;
    private javax.swing.JPanel addU;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
