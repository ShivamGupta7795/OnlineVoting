
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='http://localhost:8080/BackUpEvoting/candiregis.css' />
        <title>Candidate Registration form</title>
    </head>
    <body>
        <h1>Candidate Registration Form</h1>
        
        <div class="regiswebpage">
            <form action="candidateregis" method= "post" enctype="multipart/form-data" >
                
                
            
            
            
            <div  class='registrationform'>
                <h3>Name</h3> <input type="text" name="name" value="" size="60"  maxlength="30"/>
                
                <h3>Voter-ID</h3><input type="text" name="voterid" value="" size="60" />
                
                <h3>Branch</h3>
                 &nbsp;<input type="radio" name="branch" value="CSE" /> CSE<br> <br>
                 &nbsp;<input type="radio" name="branch" value="CIVIL" /> CIVIL <br> <br>
                 &nbsp;<input type="radio" name="branch" value="IT" /> IT <br> <br>
                &nbsp;<input type="radio" name="branch" value="EC" />  EC<br> <br>
                &nbsp;<input type="radio" name="branch" value="EI" /> EI <br> <br>
                 &nbsp;<input type="radio" name="branch" value="MECH" /> MECH<br>
                 
                 <h3>Year</h3>
                 <input type="radio" name="year" value="2" /> 2nd <br><br>
                 <input type="radio" name="year" value="2" /> 3rd <br><br>
                 <input type="radio" name="year" value="2" /> 4th <br>
                 <h3>Enrollment No.</h3>
                 <input type="text" name="ccode" value="0802" size="10" readonly="readonly" />
                 <select name="ebranch">
                     <option>CS</option>
                     <option>IT</option>
                     <option>ME</option>
                     <option>EC</option>
                     <option>EI</option>
                     <option>CE</option>
                 </select>
                 <input type="text" name="rollno" value="" size="30" maxlength="6"/>
                 
                 <h3>Gender</h3>
                 <input type="radio" name="gender" value="M" /> Male <br><br>
                 <input type="radio" name="gender" value="F" /> Female
                
                 <h3>D.O.B.</h3>
                 <select name="date">
                     <%
                         for(int i=1;i<=31;i++){
                        
                     %>
                     <option><%=i%></option>
                    <% } %>
                 </select>
                    <select name="month">
                      <%
                    for(int i=1;i<=12;i++){
                    %>
                        <option><%=i%></option>
                    <%
                    }
                    %>
                    </select>
                    <select name="year">
                        <%
                        for(int i=1992;i<=1997;i++){
                        %>
                        
                        <option><%=i%></option>
                        <%
                        }
                        %>
                    </select>
                    <h3>Address</h3>
                    <textarea name="address" rows="5" cols="51"  maxlength="80">
                    </textarea>
                    
                    
                 
                 
                 <h3>Contact</h3>
                 <input type="text" name="contact" value="" size="60" maxlength="10" />
                 
                 <h3>email</h3>
                 <input type="text" name="email" value="" size="60" maxlength="30" />
                 <br><br><br>
                  
            </div>
                    <div class="registrationformone">
                        <h3>Recommendation Letter</h3>
                        <input type="file" name="recomm"   />
                       
                        
                        <br><br><br>
                  
                <h3>Profile Picture</h3>
                <input type="file" name="profile" />
               
                    
                
                <br><br><br>
                
                <h3>Current CGPA</h3>
                <input type="text" name="pointers" value="" size="50"  maxlength="6"/><br><br>
                 
                 <h3>Extra Curricular activities or other qualifications</h3>
                 <textarea name="extra" rows="5" cols="51" maxlength="500">
                 </textarea><br><br>
                 
                 <h3>About Yourself</h3>
                 <textarea name="about" rows="5" cols="51" maxlength="500">
                 </textarea><br><br>
                 
                 <h3>Why do you want to be a candidate and what can you do <br> for students in campus?</h3>
                 <textarea name="reasons" rows="5" cols="51">
                 </textarea><br><br><br>
                
                
                    </div>       
                    <input type="submit" value="Submit" class="submitbutton" /> 
                    
                    
                    </form>
                     </div>
           
                           
                    
        
    </body>
</html>
