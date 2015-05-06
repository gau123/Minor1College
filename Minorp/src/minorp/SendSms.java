/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minorp;

import java.util.Properties;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;
//import javax.activation.*;

public class SendSms {

    public SendSms() {
    }
   //create an account on ipipi.com with the given username and password
    public void msgsend() {
        String username = "gau123";  //Your Credentials
        String password = "laptop123";
        String smtphost = "ipipi.com";      //Ip/Name of Server
        String compression = "None";       //I dont want any compression 
        String from = "gau123@ipipi.com";    //ur userid@ipipi.com
        String to = "+919958808872@sms.ipipi.com";    //mobile number where u want to send sms
        String body = "Hi This Msg is sent through Java Code";
        Transport tr = null;

        try {
         Properties props = System.getProperties();
         props.put("mail.smtp.auth", "true");

         // Get a Session object
         Session mailSession = Session.getDefaultInstance(props, null);

         // construct the message
         Message msg = new MimeMessage(mailSession);

         //Set message attributes
         msg.setFrom(new InternetAddress(from));
         InternetAddress[] address = {new InternetAddress(to)};
         msg.setRecipients(Message.RecipientType.TO, address);
         msg.setSubject(compression);
         msg.setText(body);
         msg.setSentDate(new Date());

         tr = mailSession.getTransport("smtp");
         //try to connect
         tr.connect(smtphost, username, password);
         msg.saveChanges();
         //send msg to all recipients
         tr.sendMessage(msg, msg.getAllRecipients());
         tr.close();
         } catch (Exception e) {
             e.printStackTrace();
         }
    }

      public static void main(String[] argv) {
         SendSms sms = new SendSms();
          sms.msgsend();
          System.out.println("Successfull");
      }
}
