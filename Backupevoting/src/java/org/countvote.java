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
import static java.sql.ResultSet.CONCUR_UPDATABLE;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;
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
public class countvote extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    int yash=0,shantanu=0,stuti=0,sapan=0,shivam=0,rohit=0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vote</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet vote at " + request.getContextPath() + "</h1>");
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
       //processRequest(request, response);
        dbconnect ob=new dbconnect();
        
      try{
        Connection con=ob.init();
        ResultSet rs;
        PreparedStatement psone,pstwo;
            psone=con.prepareStatement("select *from candidate");
           rs=psone.executeQuery();
          pstwo=con.prepareStatement("update candidate set vote= ? where voter_id= ?");
           
        
           
        
        PrintWriter out=response.getWriter();
        //out.println("thanks for voting");
        String countvote=request.getParameter("votecount");
        
       String voterid=request.getParameter("voterid");
        String votername=request.getParameter("votername");
       
        
        if(countvote.equals("1")){
            
                rs.absolute(1);
               
               int s1=rs.getInt("vote");
               int s2=rs.getInt("voter_id");
            
              s1++;
               pstwo.setInt(1,s1);
               pstwo.setInt(2, s2);
               pstwo.executeUpdate();
              
               
        }
    if(countvote.equals("2")){
            rs.absolute(2);
                
               int s1=rs.getInt("vote");
               int s2=rs.getInt("voter_id");
              s1++;
               pstwo.setInt(1,s1);
               pstwo.setInt(2, s2);
               pstwo.executeUpdate();
            
        }
    if(countvote.equals("3")){
         rs.absolute(3);
                
               int s1=rs.getInt("vote");
               int s2=rs.getInt("voter_id");
              s1++;
               pstwo.setInt(1,s1);
               pstwo.setInt(2, s2);
               pstwo.executeUpdate();
            
        }
    if(countvote.equals("4")){
             rs.absolute(4);
                
               int s1=rs.getInt("vote");
               int s2=rs.getInt("voter_id");
              s1++;
               pstwo.setInt(1,s1);
               pstwo.setInt(2, s2);
               pstwo.executeUpdate();
        }
    if(countvote.equals("5")){
                rs.absolute(5);
                
               int s1=rs.getInt("vote");
               int s2=rs.getInt("voter_id");
               s1++;
               pstwo.setInt(1,s1);
               pstwo.setInt(2, s2);
               pstwo.executeUpdate();
        }
      
        out.println("thanks for voting");
        SendEmail em=new SendEmail();
        em.email("");
        response.sendRedirect("http://localhost:8080/BackUpEvoting/welcomeone.jsp");
      
      }
      catch(Exception ex){
          System.out.println("exception occured"+ex);
      }
    
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
        //processRequest(request, response);
    
    
    
    
    
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
