/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minorp;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author gaurav
 */
public class DelRoute extends javax.swing.JFrame {

    /**
     * Creates new form DelRoute
     */
    public DelRoute() {
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
        jLabel1 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        dlt = new javax.swing.JButton();
        bck = new javax.swing.JButton();
        lgot = new javax.swing.JButton();
        lbrid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Route Id");

        rid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });
        rid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ridFocusLost(evt);
            }
        });

        dlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dlt.setText("Delete");
        dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltActionPerformed(evt);
            }
        });

        bck.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bck.setText("Back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        lgot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lgot.setText("Logout");
        lgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgotActionPerformed(evt);
            }
        });

        lbrid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbrid.setForeground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("DELETE ROUTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbrid))
                    .addComponent(bck)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(dlt)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(130, 130, 130)
                .addComponent(lgot))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lgot)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbrid))
                .addGap(49, 49, 49)
                .addComponent(dlt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
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

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed
public int rd;
class valddelrt
{
    private void validaterid()
    {
        String a;
        int n;
        n=Integer.parseInt(rid.getText());
        a = rid.getText();
        String pattern = "(\\d{3})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((200<n) && (n<299)))
            {
                lbrid.setText("Invalid");
                rd++;
            }
        } 
        else 
        {
            lbrid.setText("Invalid");
            rd++;
        }
    }
}
    class delete
    {
        int rd,rs;
        String qry;
        void dlt()
        {
            rd=Integer.parseInt(rid.getText());
            try
            {
                Connection cn;
                Statement st;
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
                st=cn.createStatement();
                qry="delete from route where rid="+rd+"";
                rs=st.executeUpdate(qry);
                if(rs>0)
                {
                    JOptionPane.showMessageDialog(null,"Route Removed Successfully");
                }
                cn.close();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error : "+ex);
            }
        }
        void clear()
        {
            rid.setText("");
        }
        
    }
    private void dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltActionPerformed
        delete ob=new delete();
        int dialogbt=JOptionPane.YES_NO_OPTION;
                dialogbt=JOptionPane.showConfirmDialog(null,"Do you want to confirm ?","Confirmation",dialogbt);
                if(dialogbt==JOptionPane.YES_NO_OPTION)
                {
                    if(rd!=0)
                    {
                        JOptionPane.showMessageDialog(null,"One or more Fields are Invalid");
                    }
                    else
                    {
                        ob.dlt();
                        ob.clear();
                    }
                     this.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Cab Not Removed");
                    this.setVisible(true);
                    ob.clear();
                }
    }//GEN-LAST:event_dltActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        Route rt=new Route();
        rt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bckActionPerformed

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

    private void ridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ridFocusGained
        lbrid.setText("");
        rd++;
    }//GEN-LAST:event_ridFocusGained

    private void ridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ridFocusLost
        if(rid.getText().length()==0)
        {
            lbrid.setText("Required");
            rd++;
        }
        else
        {
            valddelrt vl=new valddelrt();
            vl.validaterid();
        }
    }//GEN-LAST:event_ridFocusLost

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
            java.util.logging.Logger.getLogger(DelRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelRoute().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JButton dlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbrid;
    private javax.swing.JButton lgot;
    private javax.swing.JTextField rid;
    // End of variables declaration//GEN-END:variables
}
