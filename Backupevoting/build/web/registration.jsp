<%-- 
    Document   : welcome
    Created on : Mar 15, 2015, 10:32:57 PM
    Author     : shivam.gupta7795
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting Portal</title>
        <link  rel="stylesheet"  href="http://localhost:8080/BackUpEvoting/registration.css" />
    </head>
    <body class="voterregis">
        
        <h1 class="heading">Welcome to Online Voting Portal</h1> <br>
        <marquee class='mar'>IMPORTANT: LAST DATE FOR REGISTRATION IS SHIFTED TO 12th APRIL, 2015..!!! REGISTER YOURSELF AS SOON AS POSSIBLE..!! </marquee>
        <div class="voterform">
            <h2 class="cnd">Voter Registration Form</h2>
            
         
            <div class="formfill">
            <form action="Voterregis" method="post" >
           
                
                <ul>
              
                    <li> <h3> Name: <br><input type="text" name="name" size="60" /></li><br>
                    
                    <br>
                    <li>  <h3> Branch:</h3> <br>
                     <input type="radio" name="branch" value="CSE" />&nbsp; CSE<br><br>
                    <input type="radio" name="branch" value="IT" />&nbsp; IT <br><br>
                 <input type="radio" name="branch" value="Civil" />&nbsp; CIVIL <br><br>
                 <input type="radio" name="branch" value="Mechanical"/>&nbsp; MECH <br><br>
                 <input type="radio" name="branch" value="EE/EI" />&nbsp; EE/EI 
                    </li><br>
                   <br>
                    <li><h3>Year:</h3><br>
                        <input type="radio" name="year" value="2nd" /> &nbsp; 2nd <br><br>
                        <input type="radio" name="year" value="3rd" /> &nbsp; 3rd<br><br>
                         
                        <input type="radio" name="year" value="4th" /> &nbsp;4th<br><br>
                    </li> <br>
                    
                    <li><h3> Gender:</h3>
                        <input type="radio" name="gender" value="M" /> &nbsp; Male
                        <input type="radio" name="gender" value="F" /> &nbsp; Female
                    </li><br>
                    <br>
                    <li><h3>Enrollment No: </h3><br>
                        <input type="text" name="collegeid" value="0802" size="15" />
                        <select name="bname">
                            <option>CS</option>
                            <option>IT</option>
                            <option>CE</option>
                            <option>ME</option>
                            <option>EE</option>
                            <option>EI</option>
                        </select>
                        <input type="text" name="rollno" value="" size="35" maxlength="6" />
                    </li>
                    <br><br>
                    <li><h3>Set Password:</h3><br>
                        <input type="password" name="pass" value="" size="60" maxlength="128" />
                    </li><br><br>
                    <li><h3>Confirm Password:</h3><br>
                        <input type="password" name="passone" value="" size="60" maxlength="128" />
                    </li><br><br>
                    <li><h3>E-Mail ID:</h3><br>
                        <input type="text" name="email" value="" size="60" maxlength="128" />
                    </li><br><br>    
                    <li><h3>Contact:</h3><br>
                        <input type="text" name="code" value="91" size="1" readonly="readonly" />
                        <input type="text" name="contact" value="" size="50" maxlength="10" />
                    </li><br> <br>    
                    <li><h3>Address:</h3><br>
                        <textarea name="address" rows="4" cols="60" maxlength="80">
                        </textarea>
                    </li><br><br>    
                    
                    
                </ul>
                <input class="button" type="submit" value="Submit Info" />
                
                </form>
            </div>
                
            </div>
            
       
            
            
        
        
        
        
        
        
        
        
        
    </body>
</html>
