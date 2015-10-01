<%@page import="org.dbconnect"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype>

<html>
    <head>
        <title>Welcome voter</title>
        <link rel="stylesheet" href="http://localhost:8080/BackUpEvoting/electionone.css" />
    </head>
    <body>
        <%!
         Connection con;
         PreparedStatement ps;
         ResultSet rs;
         HttpServletResponse response;
         
        public void init(){
            try{
                
          dbconnect ob=new dbconnect();
         Connection con=ob.init();
            ps=con.prepareStatement("Select *from candidate");
            System.out.println("connection created and query executed");
            rs=ps.executeQuery();
            }
            
            catch(Exception ex){
            System.out.println("ERROR FOUND IN CONNECTION:"+ex);
            }
          }
        %>
        <h1>  Welcome to Voting Portal</h1>
        
       <form action="countvote" method="get">     
       
           <div class="voterinfo">
               <%
               String voterid=(String)request.getAttribute("voter");
               String name=(String)request.getAttribute("name");
               
               %>
               <input id="display" type="text" name="voterid" value="<%=voterid%>" size="20" readonly="readonly" />
               <input id="display" type="text" name="votername" value="<%=name%>" size="20" readonly="readonly" />
           </div>
           
           
           <table class="candidatevote" border="2">
            
            <tr>
                <th>  </th>
                <th>Candidate ID</th>
                <th>Name</th>
                <th>Branch</th>
                <th>Year</th>
            </tr>
           
           
            <% init();
            int i=1;
                while(rs.next()){ 
                   String s1= rs.getString("voter_id");
                    String s2=rs.getString("name");
                    String s3=rs.getString("branch");
                    String s4=rs.getString("year");
            
            %>
            <tr> 
                <td><input type="radio" name="votecount" value=<%=i++%> /></td>
                <td><%=s1%></td>
                <td> <%=s2%> </td>
                <td> <%=s3%></td>
                <td><%=s4%></td>
                <td><input type="submit"  name="vote"  value="VOTE" />
           
                </td>
            
            </tr>
            
            <% } %>
            
            
        </table> 
        </form>
             
           
        
    </body>
</html>