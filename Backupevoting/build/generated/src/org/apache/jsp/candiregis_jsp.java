package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candiregis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel='stylesheet' href='http://localhost:8080/BackUpEvoting/candiregis.css' />\n");
      out.write("        <title>Candidate Registration form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Candidate Registration Form</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"regiswebpage\">\n");
      out.write("            <form action=\"candidateregis\" method= \"post\" enctype=\"multipart/form-data\" >\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div  class='registrationform'>\n");
      out.write("                <h3>Name</h3> <input type=\"text\" name=\"name\" value=\"\" size=\"60\"  maxlength=\"30\"/>\n");
      out.write("                \n");
      out.write("                <h3>Voter-ID</h3><input type=\"text\" name=\"voterid\" value=\"\" size=\"60\" />\n");
      out.write("                \n");
      out.write("                <h3>Branch</h3>\n");
      out.write("                 &nbsp;<input type=\"radio\" name=\"branch\" value=\"CSE\" /> CSE<br> <br>\n");
      out.write("                 &nbsp;<input type=\"radio\" name=\"branch\" value=\"CIVIL\" /> CIVIL <br> <br>\n");
      out.write("                 &nbsp;<input type=\"radio\" name=\"branch\" value=\"IT\" /> IT <br> <br>\n");
      out.write("                &nbsp;<input type=\"radio\" name=\"branch\" value=\"EC\" />  EC<br> <br>\n");
      out.write("                &nbsp;<input type=\"radio\" name=\"branch\" value=\"EI\" /> EI <br> <br>\n");
      out.write("                 &nbsp;<input type=\"radio\" name=\"branch\" value=\"MECH\" /> MECH<br>\n");
      out.write("                 \n");
      out.write("                 <h3>Year</h3>\n");
      out.write("                 <input type=\"radio\" name=\"year\" value=\"2\" /> 2nd <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"year\" value=\"2\" /> 3rd <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"year\" value=\"2\" /> 4th <br>\n");
      out.write("                 <h3>Enrollment No.</h3>\n");
      out.write("                 <input type=\"text\" name=\"ccode\" value=\"0802\" size=\"10\" readonly=\"readonly\" />\n");
      out.write("                 <select name=\"ebranch\">\n");
      out.write("                     <option>CS</option>\n");
      out.write("                     <option>IT</option>\n");
      out.write("                     <option>ME</option>\n");
      out.write("                     <option>EC</option>\n");
      out.write("                     <option>EI</option>\n");
      out.write("                     <option>CE</option>\n");
      out.write("                 </select>\n");
      out.write("                 <input type=\"text\" name=\"rollno\" value=\"\" size=\"30\" maxlength=\"6\"/>\n");
      out.write("                 \n");
      out.write("                 <h3>Gender</h3>\n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"M\" /> Male <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"F\" /> Female\n");
      out.write("                \n");
      out.write("                 <h3>D.O.B.</h3>\n");
      out.write("                 <select name=\"date\">\n");
      out.write("                     ");

                         for(int i=1;i<=31;i++){
                        
                     
      out.write("\n");
      out.write("                     <option>");
      out.print(i);
      out.write("</option>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                 </select>\n");
      out.write("                    <select name=\"month\">\n");
      out.write("                      ");

                    for(int i=1;i<=12;i++){
                    
      out.write("\n");
      out.write("                        <option>");
      out.print(i);
      out.write("</option>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <select name=\"year\">\n");
      out.write("                        ");

                        for(int i=1992;i<=1997;i++){
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <option>");
      out.print(i);
      out.write("</option>\n");
      out.write("                        ");

                        }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <h3>Address</h3>\n");
      out.write("                    <textarea name=\"address\" rows=\"5\" cols=\"51\"  maxlength=\"80\">\n");
      out.write("                    </textarea>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 <h3>Contact</h3>\n");
      out.write("                 <input type=\"text\" name=\"contact\" value=\"\" size=\"60\" maxlength=\"10\" />\n");
      out.write("                 \n");
      out.write("                 <h3>email</h3>\n");
      out.write("                 <input type=\"text\" name=\"email\" value=\"\" size=\"60\" maxlength=\"30\" />\n");
      out.write("                 <br><br><br>\n");
      out.write("                  \n");
      out.write("            </div>\n");
      out.write("                    <div class=\"registrationformone\">\n");
      out.write("                        <h3>Recommendation Letter</h3>\n");
      out.write("                        <input type=\"file\" name=\"recomm\"   />\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        <br><br><br>\n");
      out.write("                  \n");
      out.write("                <h3>Profile Picture</h3>\n");
      out.write("                <input type=\"file\" name=\"profile\" />\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                <br><br><br>\n");
      out.write("                \n");
      out.write("                <h3>Current CGPA</h3>\n");
      out.write("                <input type=\"text\" name=\"pointers\" value=\"\" size=\"50\"  maxlength=\"6\"/><br><br>\n");
      out.write("                 \n");
      out.write("                 <h3>Extra Curricular activities or other qualifications</h3>\n");
      out.write("                 <textarea name=\"extra\" rows=\"5\" cols=\"51\" maxlength=\"500\">\n");
      out.write("                 </textarea><br><br>\n");
      out.write("                 \n");
      out.write("                 <h3>About Yourself</h3>\n");
      out.write("                 <textarea name=\"about\" rows=\"5\" cols=\"51\" maxlength=\"500\">\n");
      out.write("                 </textarea><br><br>\n");
      out.write("                 \n");
      out.write("                 <h3>Why do you want to be a candidate and what can you do <br> for students in campus?</h3>\n");
      out.write("                 <textarea name=\"reasons\" rows=\"5\" cols=\"51\">\n");
      out.write("                 </textarea><br><br><br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    </div>       \n");
      out.write("                    <input type=\"submit\" value=\"Submit\" class=\"submitbutton\" /> \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                     </div>\n");
      out.write("           \n");
      out.write("                           \n");
      out.write("                    \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
