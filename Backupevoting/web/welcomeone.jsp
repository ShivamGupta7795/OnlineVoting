<%-- 
    Document   : votekaro
    Created on : Mar 20, 2015, 12:50:17 PM
    Author     : shivam.gupta7795
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evoting Portal</title>
        <link href='http://fonts.googleapis.com/css?family=Roboto:400' rel='stylesheet' />
        <link rel="stylesheet" href="http://localhost:8080/BackUpEvoting/welcomeone.css" />
    </head>
    <body>
        <h1 class="head">Welcome to EVoting Portal for Student Community</h1> 
    <marquee class="mar">IMPORTANT: The Elections for student body is going to be held on 16th April,2015!! Don't forget to give your valuable vote to candidates..!! </marquee>
        
        <div class="college">
            <img src="http://localhost:8080/BackUpEvoting/college.jpg"/>
            
        </div>
        <div class="regilink">
           
            <ul class="tags">
                <li id="tags"><a href="http://localhost:8080/BackUpEvoting/welcomeone.jsp" >Home</a> </li>
                <li id="tags"><a href="http://localhost:8080/BackUpEvoting/registration.jsp" >Voter Registration</a> </li>
                <li id="tags"><a href="http://localhost:8080/BackUpEvoting/candiregis.jsp" >Candidate Registration</a> </li>
            </ul>
            
             
        </div>
        
    <div class='arti'>
            <article>
               
                
                Representative elections <br><br>

                Welcome to college elections voting site. This site has been developed to provide 
                online service of voting. It is more facile way to vote as compared to the 
                cumbersome process of current voting system.<br><br>
                Every year the student council president has been chosen. One of the student out 
                of three candidates will be chosen with maximum vote and also having faculty 
                recommendation.<br>
                Please enter user id that is your enrollment number and passcode below. 
                <br><br>
                This internet service is available 24hours a day until midnight on Friday 
                16th April 2015.
                
                <h3>Don't Forget to Vote ;)</h3>


            </article>
        </div>
        <div class="voting">
            <form action="votercheck" method="post">
                <h3> Voter ID: </h3> <input type="text" name="voter_id"  size="25" maxlength="8" />
                <h3> Password: </h3> <input type="password" name="password"  size="25" />
                
               
                <div class="bone"><input type="submit" value="Submit" /></div>
                
            
            </form>
            
       </div>
    <div  class="fpass">
        <a href="http://localhost:8080/BackUpEvoting/forgotpass.jsp">forgot password</a>
    </div>
        </body>
</html>
