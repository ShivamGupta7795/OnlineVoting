/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shivam.gupta7795
 */
public class forpass extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet forpass</title>");  
           out.println("<link rel=\"stylesheet\" href=\"http://localhost:8080/BackUpEvoting/forgotpass.css\"/>"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet forpass at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
       // processRequest(request, response);
      
        try{
        PrintWriter out=response.getWriter();
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>FORGOT PASSWORD</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet forpass at " + request.getContextPath() + "</h1>");
           // out.print("entred try");
        dbconnect ob=new dbconnect();
        Connection con=ob.init();
        
        PreparedStatement ps=con.prepareStatement("select *from candidate");
        ResultSet rs=ps.executeQuery();
       // out.println("query executed");
        String voterid=request.getParameter("voter_id");
        String email=request.getParameter("email_id");
        String contact=request.getParameter("contact");
        String enrollment=request.getParameter("enrollment");
        boolean bone=false;
       
        if(email!=null && voterid!=null){
           // out.println("entered");
            x:  while(rs.next()){
                String s1=rs.getString("voter_id");
                String s2=rs.getString("email");
                
                if(email.equalsIgnoreCase(s2) && voterid.equalsIgnoreCase(s1)){
                    bone=true;
                    break x;
                }
            }
            
            if(bone==true){
                SendEmail em=new SendEmail();
                em.email(email);
                response.sendRedirect("http://localhost:8080/BackUpEvoting/welcomeone.jsp");
            }
            
            
            if(bone==false){
                out.println("<h1>SORRY YOU HAVE ENTERED WRONG INFO</h1>");
                out.println("<a href=\"http://localhost:8080/BackUpEvoting/forgotpass.jsp\"><h2>click here to go back</h2></a>");
            }
       // out.println("exit try");
        
        }
         else{
               
        
        
        boolean btwo=false;
        if(email!=null && enrollment!=null && contact!=null){
            y:  while(rs.next()){
                String s1=rs.getString("enrollment");
                String s2=rs.getString("email");
                String s3=rs.getString("contact");
                
                if(email.equalsIgnoreCase(s2) && enrollment.equalsIgnoreCase(s1) && contact.equalsIgnoreCase(s3)){
                    btwo=true;
                    break y;
                }
            }
            
            if(btwo==true){
                SendEmail em=new SendEmail();
                em.email(email);
                response.sendRedirect("http://localhost:8080/BackUpEvoting/welcomeone.jsp");
            }
         else{
                out.println("<h1>SORRY YOU HAVE ENTERED WRONG INFO</h1>");
                out.println("<a href=\"http://localhost:8080/BackUpEvoting/forgotpass.jsp\"><h2>click here to go back</h2></a>");
            }
        
        
        }
         else{
                out.println("<h1>SORRY YOU HAVE ENTERED WRONG INFO</h1>");
                out.println("<a href=\"http://localhost:8080/BackUpEvoting/forgotpass.jsp\"><h2>click here to go back</h2></a>");
            }
        
        out.println("</body>");
            out.println("</html>");
        
       }
       }
       catch(Exception ex){
           System.out.println("EXCEPTION FOUND IN FORPASS"+ex);
       }
    
    
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
