/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author shivam.gupta7795
 */

public class SendEmail {
    
    static PreparedStatement ps;
     
     static ResultSet rs;
    public static void init(){
        try{
        dbconnect ob=new dbconnect();
        Connection con=ob.init();
        ps=con.prepareStatement("select *from candidate");
        rs=ps.executeQuery();
        }
        catch(Exception ex){
            System.out.println("ERROR IN CONNECTION::"+ex);
        }
}

    static void email(String mail){
    
         String to=mail;//change accordingly  
  init();
  //Get the session object  
  Properties props = new Properties();  
  props.put("mail.smtp.host", "smtp.gmail.com");  
  props.put("mail.smtp.socketFactory.port", "465");  
  props.put("mail.smtp.socketFactory.class",  
            "javax.net.ssl.SSLSocketFactory");  
  props.put("mail.smtp.auth", "true");  
  props.put("mail.smtp.port", "465");  
   
  Session session;  
        session = Session.getDefaultInstance(props,  
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("StudentOnlineVoting@gmail.com","onlinevoting");//change accordingly
                    }  
                });
   
  //compose message  
  try {  
   MimeMessage message = new MimeMessage(session);  
   message.setFrom(new InternetAddress("StudentOnlineVoting@gmail.com"));//change accordingly  
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
   message.setSubject("VOTER_ID");  
   boolean b1=false;
   String voterid=null;
   String pass=null;
   x: while(rs.next())
   {
       if(to.equalsIgnoreCase(rs.getString(8))){
           b1=true;
          voterid=rs.getString(1);
          pass=rs.getString(7);
          
           break x;
        
       }
   }
   if(b1==true){
       String msg="Here is your voter id and password: "+voterid+" "+pass;
        message.setText(msg);  
     
   //send message  
   Transport.send(message);  
  
   System.out.println("message sent successfully");
   }
   
    
   
  } catch (Exception e) {System.out.println("error in message sending:"+e);}  
   
 }  
    }
    

