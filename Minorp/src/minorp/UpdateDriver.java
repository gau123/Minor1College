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
public class UpdateDriver extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDriver
     */
    public UpdateDriver() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        doj = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        ag = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        updt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        slry = new javax.swing.JTextField();
        lgot = new javax.swing.JButton();
        lbdid = new javax.swing.JLabel();
        lbdnam = new javax.swing.JLabel();
        lbadrs = new javax.swing.JLabel();
        lbdoj = new javax.swing.JLabel();
        lbpno = new javax.swing.JLabel();
        lbag = new javax.swing.JLabel();
        lbexp = new javax.swing.JLabel();
        lbslry = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Driver Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 87, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Driver Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Date Of Joining");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 216, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Phone No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 262, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Age");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 308, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Experience");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 354, -1, -1));

        did.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        did.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                didFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                didFocusLost(evt);
            }
        });
        jPanel1.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 82, 145, -1));

        dname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dnameFocusLost(evt);
            }
        });
        jPanel1.add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 121, 145, -1));

        adres.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adresFocusLost(evt);
            }
        });
        jPanel1.add(adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 167, 145, -1));

        doj.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dojFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dojFocusLost(evt);
            }
        });
        jPanel1.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 213, 145, -1));

        pno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnoFocusLost(evt);
            }
        });
        jPanel1.add(pno, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 259, 145, -1));

        ag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agFocusLost(evt);
            }
        });
        jPanel1.add(ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 305, 145, -1));

        exp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expFocusLost(evt);
            }
        });
        jPanel1.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 351, 145, -1));

        updt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updt.setText("Update");
        updt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtActionPerformed(evt);
            }
        });
        jPanel1.add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 431, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("Salary");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 400, -1, -1));

        slry.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        slry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                slryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                slryFocusLost(evt);
            }
        });
        jPanel1.add(slry, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 397, 145, -1));

        lgot.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lgot.setText("Logout");
        lgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgotActionPerformed(evt);
            }
        });
        jPanel1.add(lgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 0, -1, -1));

        lbdid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdid.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 82, -1, -1));

        lbdnam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdnam.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbdnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 121, -1, -1));

        lbadrs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbadrs.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbadrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 167, -1, -1));

        lbdoj.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbdoj.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbdoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 213, -1, -1));

        lbpno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbpno.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 259, -1, -1));

        lbag.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbag.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 305, -1, -1));

        lbexp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbexp.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 351, -1, -1));

        lbslry.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbslry.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.add(lbslry, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 397, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 153));
        jLabel9.setText("UPDATE DRIVER DETAILS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

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
public int dru;
class validationdrvu
{
    private void namematchu()
    {
        String a;
        int n;
        n=dname.getText().length();
        a = dname.getText();
        String pattern = "[a-zA-Z]*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((2<n) && (n<40)))
            {
                lbdnam.setText("Invalid");
                dru++;
            }
        } 
        else 
        {
            lbdnam.setText("Invalid");
            dru++;
        }
    }
    private void adrsmatchu()
    {
        String a;
        int n;
        n=adres.getText().length();
        a = adres.getText();
        String pattern = "[a-zA-Z]*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((2<n) && (n<40)))
            {
                lbadrs.setText("Invalid");
                dru++;
            }
        } 
        else 
        {
            lbadrs.setText("Invalid");
            dru++;
        }
    }
    private void datechecku() 
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
                dru++;
            }
            if (g==1 && f!=0)
            {
           // JOptionPane.showMessageDialog(null,"Valid date");
            }
        }
        else
        {
            lbdoj.setText("Invalid");
            dru++;        
        }
    }
    private void phnomatchu()
    {
        String a;
        a = pno.getText();
        String pattern = "(\\d{10})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            //System.out.println("Found value: ");
        } 
        else 
        {
            lbpno.setText("Invalid");
            dru++;
        }
    }
    private void agematchu()
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
                dru++;
            }
        } 
        else 
        {
            lbag.setText("Invalid");
            dru++;
        }
    }
    private void expmatchu()
    {
        String a;
        int n;
        n=Integer.parseInt(exp.getText());
        a = ag.getText();
        String pattern = "(\\d{2})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((n>2) && (n<33)))
            {
                lbexp.setText("Invalid");
                dru++;
            }
        } 
        else 
        {
            lbexp.setText("Invalid");
            dru++;
        }
    }
    private boolean dridmatchu()
    {
        String a;
        a = did.getText();
        String pattern = "^dr"+"(\\d{3})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            //System.out.println("Found value: ");
            return false;
        } 
        else 
        {
            lbdid.setText("Invalid");
            dru++;
            return true;
        }
    }
    private void slrymatchu()
    {
        String a;
        int n;
        n=Integer.parseInt(slry.getText());
        a = slry.getText();
        String pattern = "(\\d{4})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(a);
        if (m.matches( )) 
        {
            if(!((3000<n) && (n<9000)))
            {
                lbslry.setText("Invalid");
                dru++;
            }
        } 
        else 
        {
            lbslry.setText("Invalid");
            dru++;
        }
    }
}
class update
{
    long phn;
    int age,expn,sal;
    String dnam,dojn,ads,qry,id;
    void show()
    {
        try
        {
            id=did.getText();
            Connection cn;
            Statement st;
            ResultSet rs;
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
            st=cn.createStatement();
            qry="select * from driver where did='"+id+"'";
            rs=st.executeQuery(qry);
            while(rs.next())
            {
                dname.setText(rs.getString(2));
                adres.setText(rs.getString(3));
                doj.setText(rs.getString(4));
                pno.setText(rs.getString(5));
                ag.setText(rs.getString(6));
                exp.setText(rs.getString(7));
                slry.setText(rs.getString(8));
            }
            cn.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error : "+ex);
        }
    }
    void updt()
    {
        int a;
        id=did.getText();
        dnam=dname.getText();
        ads=adres.getText();
        dojn=doj.getText();
        phn=Long.parseLong(pno.getText());
        age=Integer.parseInt(ag.getText());
        expn=Integer.parseInt(exp.getText());
        sal=Integer.parseInt(slry.getText());
        try
        {
            Connection cn;
            Statement st;
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root","GAUsing@2011");
            st=cn.createStatement();
            qry = "update driver set dname='"+ dnam +"',address='"+ads +"',doj='"+ dojn +"'"
            + ",phno="+phn+",age="+age+",experience="+expn+",salary="+sal+" where did='"+id+"'";
            int re=st.executeUpdate(qry);
            if(re>0)
            {
                JOptionPane.showMessageDialog(null, "Driver details Updated Successfully");
            }
            cn.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error : "+ex);
        }
    }
    void clear()
    {
        did.setText("");
        dname.setText("");
        adres.setText("");
        doj.setText("");
        pno.setText("");
        ag.setText("");
        exp.setText("");
        slry.setText("");
    }
}
    private void updtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtActionPerformed
        update ob=new update();
        int dialogbt=JOptionPane.YES_NO_OPTION;
                dialogbt=JOptionPane.showConfirmDialog(null,"Do you want to confirm ?","Confirmation",dialogbt);
                if(dialogbt==JOptionPane.YES_NO_OPTION)
                {
                    
                        ob.updt();
                        this.setVisible(true);
                        ob.clear();
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Driver Details not updated");
                    this.setVisible(true);
                    ob.clear();
                }
    }//GEN-LAST:event_updtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Driver drv=new Driver();
        drv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void dojFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusLost
        if(doj.getText().length()==0)
        {
            lbdoj.setText("Required");
            dru++;
        }    
        else
        {
            validationdrvu vr=new validationdrvu();
            vr.datechecku();
        }
        
    }//GEN-LAST:event_dojFocusLost

    private void pnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnoFocusLost
      if(pno.getText().length()==0)
      {
          lbpno.setText("Required");
          dru++;
      }     
      else 
      {
          validationdrvu vdrv=new validationdrvu();
          vdrv.phnomatchu();
      }
        
    }//GEN-LAST:event_pnoFocusLost

    private void agFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agFocusLost
        if(ag.getText().length()==0)
        {
            lbag.setText("");
            dru++;
       }    
        else 
        {
            validationdrvu vdr=new validationdrvu();
            vdr.agematchu();
        }
        
    }//GEN-LAST:event_agFocusLost

    private void expFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expFocusLost
        if(exp.getText().length()==0)
        {
            lbexp.setText("");
            dru++;
        }    
        else 
        {
            validationdrvu vd=new validationdrvu();
            vd.expmatchu();
        }
        
    }//GEN-LAST:event_expFocusLost

    private void didFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_didFocusGained
        lbdid.setText("");
        dru=0;
    }//GEN-LAST:event_didFocusGained

    private void didFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_didFocusLost
        update ob=new update();
        if(did.getText().length()==0)
        {
            lbdid.setText("Required");
            dru++;
        }
        else
        {
            validationdrvu vdu=new validationdrvu();
            if(vdu.dridmatchu())
            {
                
            }
            else
            {
                ob.show();
                did.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_didFocusLost

    private void dnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnameFocusGained
        lbdnam.setText("");
        dru=0;
    }//GEN-LAST:event_dnameFocusGained

    private void dnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnameFocusLost
        if(dname.getText().length()==0)
        {
            lbdnam.setText("Required");
            dru++;
        }
        else
        {
            validationdrvu vr=new validationdrvu();
            vr.namematchu();
        }
    }//GEN-LAST:event_dnameFocusLost

    private void adresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adresFocusGained
        lbadrs.setText("");
        dru=0;
    }//GEN-LAST:event_adresFocusGained

    private void adresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adresFocusLost
        if(adres.getText().length()==0)
        {
            lbadrs.setText("Required");
            dru++;
        }
        else
        {
            validationdrvu vr=new validationdrvu();
            vr.adrsmatchu();
        }
    }//GEN-LAST:event_adresFocusLost

    private void dojFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dojFocusGained
        lbdoj.setText("");
        dru=0;
    }//GEN-LAST:event_dojFocusGained

    private void pnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnoFocusGained
        lbpno.setText("");
        dru=0;
    }//GEN-LAST:event_pnoFocusGained

    private void agFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agFocusGained
        lbag.setText("");
        dru=0;
    }//GEN-LAST:event_agFocusGained

    private void expFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expFocusGained
        lbexp.setText("");
        dru=0;
    }//GEN-LAST:event_expFocusGained

    private void slryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slryFocusGained
        lbslry.setText("");
        dru=0;
    }//GEN-LAST:event_slryFocusGained

    private void slryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slryFocusLost
        if(slry.getText().length()==0)
        {
            lbslry.setText("Required");
            dru++;
        }
        else
        {
            validationdrvu vr=new validationdrvu();
            vr.slrymatchu();
        }
    }//GEN-LAST:event_slryFocusLost

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
            java.util.logging.Logger.getLogger(UpdateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDriver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adres;
    private javax.swing.JTextField ag;
    private javax.swing.JTextField did;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField exp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbadrs;
    private javax.swing.JLabel lbag;
    private javax.swing.JLabel lbdid;
    private javax.swing.JLabel lbdnam;
    private javax.swing.JLabel lbdoj;
    private javax.swing.JLabel lbexp;
    private javax.swing.JLabel lbpno;
    private javax.swing.JLabel lbslry;
    private javax.swing.JButton lgot;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField slry;
    private javax.swing.JButton updt;
    // End of variables declaration//GEN-END:variables
}