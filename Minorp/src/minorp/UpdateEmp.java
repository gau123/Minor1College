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
public class UpdateEmp extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmp
     */
    public UpdateEmp() {
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
        jLabel2 = new javax.swing.JLabel();
        enam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ag = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        doj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        updt = new javax.swing.JButton();
        lbeid = new javax.swing.JLabel();
        lbnam = new javax.swing.JLabel();
        lbag = new javax.swing.JLabel();
        lbdoj = new javax.swing.JLabel();
        lbpas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bck.setText("Back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });
        jPanel1.add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 409, -1, -1));

        lgot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lgot.setText("Logout");
        lgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgotActionPerformed(evt);
            }
        });
        jPanel1.add(lgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Employee Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 129, -1, -1));

        eid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eidFocusLost(evt);
            }
        });
        jPanel1.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 126, 150, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 175, -1, -1));

        enam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enamFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enamFocusLost(evt);
            }
        });
        jPanel1.add(enam, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 172, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 221, -1, -1));

        ag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agFocusLost(evt);
            }
        });
        jPanel1.add(ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 218, 150, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Date Of Joining");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 267, -1, -1));

        doj.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dojFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dojFocusLost(evt);
            }
        });
        jPanel1.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 264, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 313, -1, -1));

        pass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 310, 150, -1));

        updt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updt.setText("Update");
        updt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtActionPerformed(evt);
            }
        });
        jPanel1.add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 356, -1, -1));

        lbeid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbeid.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 126, -1, -1));

        lbnam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbnam.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 172, -1, -1));

        lbag.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbag.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 218, -1, -1));

        lbdoj.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdoj.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbdoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 264, -1, -1));

        lbpas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbpas.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("UPDATE EMPLOYEE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

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
public int au;
class validateemp
{
    private boolean valdeidu()
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
                au++;
                return true;
            }
            else
                return false;
        } 
        else 
        {
            lbeid.setText("Invalid");
            au++;
            return true;
        }
    }
    private void valdenameu()
    {
        String a;
        int n;
        n=enam.getText().length();
        a = enam.getText();
        String pattern = "[a-zA-Z]*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((2<n) && (n<40)))
            {
                lbnam.setText("Invalid");
                au++;
            }
        } 
        else 
        {
            lbnam.setText("Invalid");
            au++;
        }
    }
    private void valdpasswordu()
    {
        String a;
        a = pass.getText();
        String pattern = "(\\S{3,})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( ))
        {
          //System.out.println("Found value: ");
        }
        else
        {
            lbpas.setText("Invalid");
            au++;
        }
    }
    private void valddateu() 
    {
        int f=1,g=1,yr;
        String a,year,month,day;
        a =doj.getText();
        if(a.charAt(4)=='-' && a.charAt(7)=='-')
        {
            year=a.substring(0,4);
            month=a.substring(5,7);
            day=a.substring(8);
            yr=Integer.parseInt(year);
        
       /* else
        {
            f=0;
        } */
            if (month.equals("04")||month.equals("06")||month.equals("07")||month.equals("09")||
              month.equals("11"))
            {
                g=1;
                String patternd = "^((0|1|2)(0|1|2|3|4|5|6|7|8|9))$";
                Pattern r1 = Pattern.compile(patternd);
                Matcher m1 = r1.matcher(day);
                if (m1.matches( )||day.equals("30"))
                {
                    g=1;
                }
                 else
                {
                    f=0;
                }
          // 30 days
            }
            else if (month.equals("01")||month.equals("03")||month.equals("05")||month.equals("07")
              ||month.equals("08")||month.equals("10")||month.equals("12"))
            {
                g=1;
                String patternd = "^((0|1|2)(0|1|2|3|4|5|6|7|8|9))$";
                Pattern r1 = Pattern.compile(patternd);
                Matcher m1 = r1.matcher(day);
                if (m1.matches( )||day.equals("30")||day.equals("31"))
                {
                    g=1;
                }
                else
                {
                    f=0;
                }
          //31 days
            }
            else if (month.equals("02"))
            {
                g=1;
                int c;
                c=Integer.parseInt(year);
                if ((c%4==0 && c%100==0)||(c%400)==0)
                {
                    String patternd = "^((0|1|2)(0|1|2|3|4|5|6|7|8|9))$";
                    Pattern r1 = Pattern.compile(patternd);
                    Matcher m1 = r1.matcher(day);
                    if (m1.matches( ))
                    {
                        g=1;
                    }
                    else
                    {
                        f=0;
                    }
                }
                else
                {
                    String patternd = "^((0|1|2)(0|1|2|3|4|5|6|7|8))$";
                    Pattern r1 = Pattern.compile(patternd);
                    Matcher m1 = r1.matcher(day);
                    if (m1.matches( )||day.equals("09")||day.equals("19"))
                    {
                  //  JOptionPane.showMessageDialog(null,"Valid Day");
                    }
                    else
                    {
                        f=0;
                    }
                }
            }
            else
            {
                f=0;
            }
            String patterny = "^((20)\\d{2})$";
            Pattern r = Pattern.compile(patterny);
            Matcher m = r.matcher(year);
            if (m.matches( ))
            {
                if(!(yr<=2020))
                {
                    f=0;
                }
                else
                    g=1;
            }
            else
            {
                f=0;
            }
            if (f==0)
            {
                lbdoj.setText("Invalid");
                au++;
            }
            if (g==1 && f!=0)
            {
           // JOptionPane.showMessageDialog(null,"Valid date");
            }
        }
        else
        {
            lbdoj.setText("Invalid");
            au++;        
        }
    }
    private void valdageu()
    {
        String a;
        int n;
        n=Integer.parseInt(ag.getText());
        a = ag.getText();
        String pattern = "(\\d{2})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((18<n) && (n<60)))
            {
                lbag.setText("Invalid");
                au++;
            }
        } 
        else 
        {
            lbag.setText("Invalid");
            au++;
        }
    }
}
class update
{
    int ed,age;
    String enm,pas,qry,dojn;
    void show()
    {
        ed=Integer.parseInt(eid.getText());
        try
        {
            Connection cn;
            Statement st;
            ResultSet rs;
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
            st=cn.createStatement();
            qry="Select * from employee where eid="+ed+"";
            rs=st.executeQuery(qry);
            if(rs.next())
            {
                enam.setText(rs.getString(2));
                ag.setText(rs.getString(3));
                doj.setText(rs.getString(4));
                pass.setText(rs.getString(5));
            }
            cn.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error : "+ex);
        }
    }
    void updt()
    {
        ed=Integer.parseInt(eid.getText());
        enm=enam.getText();
        dojn=doj.getText();
        age=Integer.parseInt(ag.getText());
        pas=pass.getText();
        try
        {
            Connection cn;
            Statement st;
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
            st=cn.createStatement();
            String query;
            query = "update employee set ename='"+enm+"',eage="+age+",Doj='"+dojn+"',pass='"+pas+"' where eid="+ed+"";
            int re=st.executeUpdate(query);
            if(re>0)
            {
                JOptionPane.showMessageDialog(null,"Employee details updated successfully");
            }
            cn.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error : "+ex);
            System.out.println(""+ex);
        }
    }
    void clear()
    {
        eid.setText("");
        enam.setText("");
        ag.setText("");
        doj.setText("");
        pass.setText("");
    }
}
    private void updtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtActionPerformed
        update ob=new update();
        int dialogbt=JOptionPane.YES_NO_OPTION;
                dialogbt=JOptionPane.showConfirmDialog(null,"Do you want to confirm ?","Confirmation",dialogbt);
                if(dialogbt==JOptionPane.YES_NO_OPTION)
                {
                    if(au!=0)
                    {
                        JOptionPane.showMessageDialog(null,"One or more field is invalid");
                    }
                    else
                    {
                        ob.updt();
                        ob.clear();
                    }
                        this.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Employee Details not updated");
                    this.setVisible(true);
                    ob.clear();
                }
    }//GEN-LAST:event_updtActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        EmpMan em=new EmpMan();
        em.setVisible(true);
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

    private void agFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agFocusLost
        if(ag.getText().length()==0)
        {
            lbag.setText("Required");
            au++;
        }            
        else
        {
            validateemp ve=new validateemp();
            ve.valdageu();
        }        
    }//GEN-LAST:event_agFocusLost

    private void dojFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusLost
        if(doj.getText().length()==0)
        {
            lbdoj.setText("Required");
            au++;
        }       
        else
        {
            validateemp v=new validateemp();
            v.valddateu();
        }        
    }//GEN-LAST:event_dojFocusLost

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        if(pass.getText().length()==0)
        {
            lbpas.setText("Required");
        }            
        else
        {
            validateemp vem=new validateemp();
            vem.valdpasswordu();
        }      
    }//GEN-LAST:event_passFocusLost

    private void eidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusGained
        lbeid.setText("");
        au=0;
    }//GEN-LAST:event_eidFocusGained

    private void eidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusLost
        update ob=new update();
        if(eid.getText().length()==0)
        {
            lbeid.setText("Required");
            au++;
        }
        else
        {
            validateemp vdu=new validateemp();
            if(vdu.valdeidu())
            {
                
            }
            else
            {
                ob.show();
                eid.setEditable(false);
            }
        } 
    }//GEN-LAST:event_eidFocusLost

    private void enamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enamFocusGained
        lbnam.setText("");
        au=0;
    }//GEN-LAST:event_enamFocusGained

    private void enamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enamFocusLost
        if(enam.getText().length()==0)
        {
            lbnam.setText("Required");
            au++;
        }     
        else
        {
            validateemp ve=new validateemp();
            ve.valdenameu();
        } 
    }//GEN-LAST:event_enamFocusLost

    private void agFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agFocusGained
        lbag.setText("");
        au=0;
    }//GEN-LAST:event_agFocusGained

    private void dojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusGained
        lbdoj.setText("");
        au=0;
    }//GEN-LAST:event_dojFocusGained

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        lbpas.setText("");
        au=0;
    }//GEN-LAST:event_passFocusGained

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
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ag;
    private javax.swing.JButton bck;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField enam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbag;
    private javax.swing.JLabel lbdoj;
    private javax.swing.JLabel lbeid;
    private javax.swing.JLabel lbnam;
    private javax.swing.JLabel lbpas;
    private javax.swing.JButton lgot;
    private javax.swing.JTextField pass;
    private javax.swing.JButton updt;
    // End of variables declaration//GEN-END:variables
}
