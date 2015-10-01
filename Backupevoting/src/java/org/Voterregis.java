/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shivam.gupta7795
 */
@WebServlet("/Voterregis")
public class Voterregis extends HttpServlet {
     
     Connection con;
    PreparedStatement ps;
    //PrintWriter out;
    public void init(){
        try {
            dbconnect ob=new dbconnect();
        Connection con=ob.init();
             ps=con.prepareStatement("insert into candidate(name,branch,year,gender,enrollment,password,email,contact,address) values(?,?,?,?,?,?,?,?,?)");
            
            
        } catch (Exception ex) {
            //Logger.getLogger(candis.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR IN CONNECTION"+ex);
        }
    }
        
     
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet candis</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet candis at " + request.getContextPath() + "</h1>");
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
       String s1=request.getParameter("name");
       String s2=request.getParameter("branch");
       PrintWriter out= response.getWriter();
       String enroll=request.getParameter("collegeid")+request.getParameter("bname")+request.getParameter("rollno");
       String year=request.getParameter("year");
       String gender=request.getParameter("gender");
       String pass=request.getParameter("pass");
       String passone=request.getParameter("passone");
       String contact=request.getParameter("code")+request.getParameter("contact");
       String email=request.getParameter("email");
       String address=request.getParameter("address");
        //out.println("entered cnadis.java");
       /* out.println("<h1> hello"+ s1+s2+"</h1>");
         out.println("<h1>"+ year+"</h1>");
         out.println("<h1>"+ gender+"</h1>");
         out.println("<h1>"+ enroll+"</h1>");
         out.println("<h1>"+ pass+"</h1>");
         out.println("<h1>"+ passone+"</h1>");
         out.println("<h1>"+ email+"</h1>");
         out.println("<h1>"+ contact+"</h1>");
         out.println("<h1>"+ address+"</h1>");*/
         
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet candis</title>");    
            out.println("<link rel=\"stylesheet\" href=\"http://localhost:8080/BackUpEvoting/messageone.css\" />");
            out.println("</head>");
            out.println("<body class=\"candispage\">");
           
            
         try{
             //Connect conn=new Connect();
            
             init();
             ps.setString(1, s1);
             ps.setString(2, s2);
             ps.setString(3, year);
             ps.setString(4, gender);
             
             if(enroll.length()==12)
             {
                 ps.setString(5, enroll);
             }
             else{
             out.println("<h2>WARNING: Please enter valid enrollment no.</h2>"); 
             }
             if(pass.equals(passone))
             {
                 ps.setString(6, pass);
             }
             else{
              out.println("<h2>WARNING: Please enter valid matching password</h2>"); 
             }
         
             
             String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
             Boolean b = email.matches(EMAIL_REGEX);
             if(b==true)
             {
                 ps.setString(7,email);
             }
             else{
              out.println("<h2>WARNING: Please enter valid email id</h2>"); 
             }
             
             
             if(contact.length()==12)
             {
                 ps.setString(8, contact);
             }
             else{
              out.println("<h2>WARNING: Please enter valid contact details</h2>"); 
             }
             
             ps.setString(9, address);
             ps.executeUpdate();
             //out.println("<h1>Thank you for registering");
             response.sendRedirect("http://localhost:8080/BackUpEvoting/messageone.jsp");
             SendEmail sm=new SendEmail();
             sm.email(email);
             
         }
          catch(Exception ex){ 
           out.println("<h2> ERROR ENCOUNTERED :( </h2>"+ex);
           System.out.println("error encoutered in registration:"+ex);
           out.println("<div class=\"goback\">");
              out.println("<a href=\"http://localhost:8080/BackUpEvoting/registration.jsp\"> Click Here To go to Home Page </a> ");
              out.println("</div>");
          }    
        out.println("</body>");
        out.println("</html>");
         
         
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
