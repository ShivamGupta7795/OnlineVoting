<%-- 
    Document   : forgotpass
    Created on : Apr 5, 2015, 11:39:59 AM
    Author     : shivam.gupta7795
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://localhost:8080/BackUpEvoting/forgotpass.css"/>
        <title>Forgot Password</title>
    </head>
    <body>
        <div class="forpassone">
            <h2>If you don't know your Password</h2>
            <form action="forpass" method="post">
            <h3>  Voter ID: </h3>  <input type="text" name="voter_id" value="" size="30" />
            <h3>  Email-ID: </h3> <input type="text" name="email_id" value="" size="30" /><br><br>
            <input type="submit" value="Submit" />
            
        </form> 
        </div> 
        <div class="forpasstwo">
            <h2>If you don't know your Voter-ID and Password both</h2>
            <form action="forpass" method="post">
            <h3>  Enrollment-no: </h3>  <input type="text" name="enrollment" value="" size="30" />
             <h3>  Contact: </h3>  <input type="text" name="contact" value="" size="30" />
             <h3>  Email-ID: </h3> <input type="text" name="email_id" value="" size="30" /><br><br>
            <input type="submit" value="Submit" />
            
        </form> 
        </div> 
       
        
    </body>
</html>
