/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minorp;
import java.sql.*;
import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.io.*;
/**
 *
 * @author gaurav
 */
public class Availability extends javax.swing.JFrame  {

    /**
     * Creates new form Availability
     */
    /*class Abc extends Thread
    {
        public void run()
        {
            Date dt;
            while(true)
            {
                dt=new Date();
                lb.setText(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
                try
                {
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                
                }
            }
        }
    }*/
    public Availability() {
        
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
        dt = new javax.swing.JTextField();
        chckavail = new javax.swing.JButton();
        pob = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lgot = new javax.swing.JButton();
        bck = new javax.swing.JButton();
        lbdoj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Date");

        dt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dtFocusLost(evt);
            }
        });

        chckavail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        chckavail.setText("Check Availability");
        chckavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckavailActionPerformed(evt);
            }
        });

        pob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pob.setText("Proceed To Booking");
        pob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pobActionPerformed(evt);
            }
        });

        lgot.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lgot.setText("Logout");
        lgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgotActionPerformed(evt);
            }
        });

        bck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bck.setText("Back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        lbdoj.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdoj.setForeground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("CHECK AVAILABILITY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(chckavail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pob))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbdoj)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bck)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106)
                .addComponent(lgot))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lgot)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbdoj))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chckavail)
                    .addComponent(pob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
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
public int aval;
class availability
{
    private void datecheck() 
    {
        int f=1,g=1,yr;
        String a,year,month,day;
        a =dt.getText();
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
                aval++;
            }
            if (g==1 && f!=0)
            {
           // JOptionPane.showMessageDialog(null,"Valid date");
            }
        }
        else
        {
            lbdoj.setText("Invalid");
            aval++;        
        }
    }
    void setdid()
    {
        String dte;
        int cnt=0;
        dte=dt.getText();
        try 
        {
            Connection cn;
            Statement st;
            ResultSet rs;
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cab", "root", "GAUsing@2011");
            st = cn.createStatement();
            String query;
            query = "select count(did) from driver where did not in (select did from booking where bdate='"+dte+"')";
            rs = st.executeQuery(query);
            while (rs.next()) 
            {
               cnt=cnt+Integer.parseInt(rs.getString(1));
            }
            if(cnt>0)
                JOptionPane.showMessageDialog(null,"Cab Available");
            else if(cnt<=0)
                JOptionPane.showMessageDialog(null,"Cab not Available");
            cn.close();
        } catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Error : " + ex);
        }
    }
    void cler()
    {
        dt.setText("");
    }
}
    private void chckavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckavailActionPerformed
        availability av=new availability();
        if(aval!=0)
        {
            JOptionPane.showMessageDialog(null,"Invalid Field Input");
        }
        else
        {
            av.setdid();
            av.cler();
        }
        this.setVisible(true);
    }//GEN-LAST:event_chckavailActionPerformed

    private void pobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pobActionPerformed
        Booking bk=new Booking();
        bk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pobActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        CustMan cm=new CustMan();
        cm.setVisible(true);
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

    private void dtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dtFocusLost
        if(dt.getText().length()==0)
        {
            lbdoj.setText("Required");
            aval++;
        }
        else
        {
            availability avl=new availability();
            avl.datecheck();
        }
    }//GEN-LAST:event_dtFocusLost

    private void dtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dtFocusGained
        lbdoj.setText("");
        aval=0;
    }//GEN-LAST:event_dtFocusGained

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
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Availability().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JButton chckavail;
    private javax.swing.JTextField dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbdoj;
    private javax.swing.JButton lgot;
    private javax.swing.JButton pob;
    // End of variables declaration//GEN-END:variables
}