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
public class DelEmp extends javax.swing.JFrame {

    /**
     * Creates new form DelEmp
     */
    public DelEmp() {
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
        bck = new javax.swing.JButton();
        lgot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        dlt = new javax.swing.JButton();
        lbeid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Employee Id");

        eid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eidFocusLost(evt);
            }
        });

        dlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dlt.setText("Delete");
        dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltActionPerformed(evt);
            }
        });

        lbeid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbeid.setForeground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("DELETE EMPLOYEE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bck)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lgot))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63)
                                .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lbeid))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(dlt)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lgot)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbeid))
                .addGap(31, 31, 31)
                .addComponent(dlt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
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
public int de;
class validdele
{
    private void valdeid()
    {
        String a;
        int n;
        n=Integer.parseInt(eid.getText());
        a = eid.getText();
        String pattern = "(\\d{4})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((1000<n) && (n<1999)))
            {
                lbeid.setText("Invalid");
                de++;
            }
        } 
        else 
        {
            lbeid.setText("Invalid");
            de++;
        }
    }
}
 class delete
 {
        int ed,rs;
        String qry;
        void dlt()
        {
            ed=Integer.parseInt(eid.getText());
            try
            {
                Connection cn;
                Statement st;
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
                st=cn.createStatement();
                qry="delete from employee where eid="+ed+"";
                rs=st.executeUpdate(qry);
                if(rs>0)
                {
                    JOptionPane.showMessageDialog(null,"Employee Removed Successfully");
                }
                cn.close();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error : "+ex);
            }
        }
        void clear()
        {
            eid.setText("");
        }
        void dltlgn()
        {
            ed=Integer.parseInt(eid.getText());
            try
            {
                Connection cn;
                Statement st;
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
                st=cn.createStatement();
                qry="delete from login where userid="+ed+"";
                rs=st.executeUpdate(qry);
                if(rs>0)
                {
                   // JOptionPane.showMessageDialog(null,"Employee Removed Successfully");
                }
                cn.close();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error : "+ex);
            }
        }
    }
    private void dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltActionPerformed
        delete ob=new delete();
        int dialogbt=JOptionPane.YES_NO_OPTION;
                dialogbt=JOptionPane.showConfirmDialog(null,"Do you want to confirm ?","Confirmation",dialogbt);
                if(dialogbt==JOptionPane.YES_NO_OPTION)
                {
                   if(de!=0)
                   {
                       JOptionPane.showMessageDialog(null,"One or more Invalid Fields");
                   }
                   else
                   {
                       ob.dlt();
                       ob.dltlgn();
                       ob.clear();
                   }
                       this.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Employee Not Removed");
                    this.setVisible(true);
                    ob.clear();
                }
    }//GEN-LAST:event_dltActionPerformed

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

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        EmpMan em=new EmpMan();
        em.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bckActionPerformed

    private void eidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusGained
        lbeid.setText("");
        de=0;
    }//GEN-LAST:event_eidFocusGained

    private void eidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusLost
        if(eid.getText().length()==0)
        {
            lbeid.setText("Required");
            de++;
        }
        else
        {
            validdele ve=new validdele();
            ve.valdeid();
        }
    }//GEN-LAST:event_eidFocusLost

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
            java.util.logging.Logger.getLogger(DelEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JButton dlt;
    private javax.swing.JTextField eid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbeid;
    private javax.swing.JButton lgot;
    // End of variables declaration//GEN-END:variables
}
