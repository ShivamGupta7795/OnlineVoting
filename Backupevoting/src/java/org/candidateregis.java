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
import java.io.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;

/**
 *
 * @author shivam.gupta7795
 */
@MultipartConfig

public class candidateregis extends HttpServlet {

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
            out.println("<title>Servlet candidateregis</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet candidateregis at " + request.getContextPath() + "</h1>");
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
        String name=request.getParameter("name");
        String voterid=request.getParameter("voterid");
        String branch=request.getParameter("branch");
        String year=request.getParameter("year");
        String enroll=request.getParameter("ccode")+request.getParameter("ebranch")+request.getParameter("rollno");
        String gender=request.getParameter("gender");
        String birthday=request.getParameter("date")+request.getParameter("month")+request.getParameter("year");
        String address=request.getParameter("address");
        String contact=request.getParameter("contact");
        String email=request.getParameter("email");
        
        String pointers=request.getParameter("pointers");
        
        String extra=request.getParameter("extra");
        String about=request.getParameter("about");
        String reasons =request.getParameter("reasons");
        
        InputStream input= null;
        InputStream inputone=null;
        Part filePart= request.getPart("profile");
        if(filePart!=null){
            System.out.println("file name: "+filePart.getName());
            System.out.println("file size:"+filePart.getSize());
            System.out.println("file type:"+filePart.getContentType());
            input= filePart.getInputStream();
        }
         
        Part filePartOne= request.getPart("recomm");
        if(filePart!=null){
            System.out.println("file name of recomm: "+filePartOne.getName());
            System.out.println("file size of recomm:"+filePartOne.getSize());
            System.out.println("file type of recomm:"+filePartOne.getContentType());
            inputone = filePartOne.getInputStream();
           
        }
       
        
       
       
        PrintWriter out=response.getWriter();
        try{
        
        dbconnect ob=new dbconnect();
        Connection con=ob.init();
        PreparedStatement ps=con.prepareStatement("insert into candidate(Name,Branch,Year,Enrollment,dateofbirth,Gender,Address,Contact,Email,Pointers,Extra,About,Reasons,profile,recommendation) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        PreparedStatement psone= con.prepareStatement("select voter_id from candidate");
        ResultSet rs=psone.executeQuery();
       
       String character="^\\p{L}+(?: \\p{L}+)*$";
       if(name.matches(character)){ 
       if(name!=null)
        ps.setString(1, "name");
       }
       else{
           out.println("<h2>Enter valid name</h2>");
       }
 
        boolean b1=false;
        x: while(rs.next())
        {
            if(voterid.equals(rs.getString("voter_id"))){
                b1=true;
                break x;
            }
        }
        
        if(b1==false){
            out.println("<h2>Please enter valid voter id</h2>");
        }
        
        ps.setString(2, branch);
        ps.setString(3, year);
       
        ps.setString(4, enroll);
         ps.setString(5, birthday);
        ps.setString(6, gender);
        
        
        if(address!=null)
        ps.setString(7, address);
        else{
            out.println("<h2>Please enter address</h2>");
        }
        
        String digits= "[0-9]*(\\.[0-9]{1,2})?";
        if(contact.matches(digits)){
        if(contact.length()==10)
        ps.setString(8, contact);
        }
        else{
            out.println("<h2>Please enter valid contact details</h2>");
        }
        
         String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
             Boolean b = email.matches(EMAIL_REGEX);
             if(b==true)
             {
                 ps.setString(9,email);
             }
             else{
              out.println("<h2>WARNING: Please enter valid email id</h2>"); 
             }
        
        if(pointers.matches(digits)){     
        ps.setString(10, pointers);
        }
        else{
            out.println("<h2>please enter valid pointers</h2>");
        }
       
        if(extra!=null)
        ps.setString(11,extra); 
        else{
            out.println("<h2>please enter extra curricular activity field</h2>");
        }
       
        if(about!=null)
        ps.setString(12,about);
       else{
            out.println("<h2>please fill the \"about\" field</h2>");
        }
        if(reasons!=null)
        ps.setString(13, reasons);
        else{
            out.println("<h2>please fill \"Why do you want to be a candidate and what can you do for students in campus\" field</h2>");
        }
        
        if(input!=null){
            ps.setBlob(14,input);
        }
        if(inputone!=null){
            ps.setBlob(15,inputone);
        }
        
        
        ps.executeUpdate();
        
        response.sendRedirect("http://localhost:8080/BackUpEvoting/welcomeone.jsp");
        
        
        
        }
        catch(Exception ex){
            out.println("<h2>Error Encountered</h2>"+ex);
            System.out.println("EXCEPTION IN candidate REGISTRATION"+ex);
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
