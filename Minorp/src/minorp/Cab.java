/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minorp;
import javax.swing.JOptionPane;
/**
 *
 * @author gaurav
 */
public class Cab extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Cab() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        adcb = new javax.swing.JButton();
        updcb = new javax.swing.JButton();
        dltcb = new javax.swing.JButton();
        bck = new javax.swing.JButton();
        vwcb = new javax.swing.JButton();
        lgot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minorp/cabs.jpg"))); // NOI18N

        adcb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        adcb.setText("Add Cab");
        adcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcbActionPerformed(evt);
            }
        });

        updcb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        updcb.setText("Update Cab");
        updcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updcbActionPerformed(evt);
            }
        });

        dltcb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        dltcb.setText("Delete Cab");
        dltcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltcbActionPerformed(evt);
            }
        });

        bck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bck.setText("Back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        vwcb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vwcb.setText("View Cabs");
        vwcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vwcbActionPerformed(evt);
            }
        });

        lgot.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lgot.setText("Logout");
        lgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgotActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("CAB MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(lgot))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(updcb)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dltcb))
                    .addComponent(bck)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(vwcb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(adcb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lgot)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(70, 70, 70)
                .addComponent(adcb)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dltcb)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(updcb)
                                .addGap(90, 90, 90)))))
                .addComponent(vwcb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bck))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcbActionPerformed
    AddCab ab=new AddCab();
    ab.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_adcbActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        Manager mg=new Manager();
        mg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bckActionPerformed

    private void dltcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltcbActionPerformed
        DelCab dc=new DelCab();
        dc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dltcbActionPerformed

    private void updcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updcbActionPerformed
      UpdateCab uc=new UpdateCab();
      uc.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_updcbActionPerformed

    private void vwcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vwcbActionPerformed
       ViewCab vc=new ViewCab();
       vc.viewcab1("manager");
       vc.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_vwcbActionPerformed

    private void lgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgotActionPerformed
       Login lg=new Login();
        int dialogbt=JOptionPane.YES_NO_OPTION;
        dialogbt=JOptionPane.showConfirmDialog(null,"Do you want to Logout?","Confirmation",dialogbt);
        if(dialogbt==JOptionPane.YES_NO_OPTION)
        {
            lg.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(true);
        }
    }//GEN-LAST:event_lgotActionPerformed

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
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cab().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcb;
    private javax.swing.JButton bck;
    private javax.swing.JButton dltcb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lgot;
    private javax.swing.JButton updcb;
    private javax.swing.JButton vwcb;
    // End of variables declaration//GEN-END:variables
}
