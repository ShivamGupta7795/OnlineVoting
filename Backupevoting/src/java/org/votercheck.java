package org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shivam.gupta7795
 */

public class votercheck extends HttpServlet {
     Connection con;
     PreparedStatement ps;
     ResultSet rs;
    public void initone(){
        try{
            dbconnect ob=new dbconnect();
        Connection con=ob.init();
        ps=con.prepareStatement("select *from candidate");
       
        rs=ps.executeQuery();
         System.out.println("query executed");
        }
        catch(Exception ex){
            System.out.println("ERROR IN CONNECTION:"+ex);
        }
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        initone();
       PrintWriter out=response.getWriter();
       String voterid = request.getParameter("voter_id");
       String pass=request.getParameter("password");
       out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Check_Voter</title>");            
            out.println("<link rel=\"stylesheet\" href=\"http://localhost:8080/BackUpEvoting/messageone.css\" />");
            out.println("</head>");
            out.println("<body class=\"errorvoter\">");
            
      
       try {
           //rs.first();
            String s1=null;
            String s2=null;
            String s3=null;
            boolean b1=false;
            x:  while(rs.next())
             {
                 s1=rs.getString("voter_id");
                 s2=rs.getString("password");
                 s3=rs.getString("name");
               if(voterid.equals(s1) && pass.equals(s2))
               {
                   //out.println(voterid+"<br>"+s1+"its bizzare");
                   
                  b1=true; 
                  break x;
               }  
             }
            if(b1==true){
                //String voter_id=null,Name=null;
                request.setAttribute("voter", voterid);
                request.setAttribute("name",s3);
                request.getRequestDispatcher("electionone.jsp").forward(request, response);
               //response.sendRedirect("http://localhost:8080/BackUpEvoting/electionone.jsp");
               
            }
            else{
                out.println("<h2>Sorry, you are not a registered voter!!</h2>");
                 out.println("<div class=\"goback\"><a href=\"http://localhost:8080/BackUpEvoting/welcomeone.jsp\"><h3>Click here to go to voting page</h3></a></div> " );
                out.println("<img src=\"http://localhost:8080/BackUpEvoting/images.jpg\" class='image' >");
               
            }
         } 
         catch (SQLException ex) {
             out.println("<h2>voter not found"+ex+"</h2>");
         }
       out.println("</body>");
       out.println("</html>");
       
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        
    
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
