package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>E-Voting Portal</title>\n");
      out.write("        <link  rel=\"stylesheet\"  href=\"http://localhost:8080/BackUpEvoting/registration.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"voterregis\">\n");
      out.write("        \n");
      out.write("        <h1 class=\"heading\">Welcome to Online Voting Portal</h1> <br>\n");
      out.write("        <marquee class='mar'>IMPORTANT: LAST DATE FOR REGISTRATION IS SHIFTED TO 12th APRIL, 2015..!!! REGISTER YOURSELF AS SOON AS POSSIBLE..!! </marquee>\n");
      out.write("        <div class=\"voterform\">\n");
      out.write("            <h2 class=\"cnd\">Voter Registration Form</h2>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("            <div class=\"formfill\">\n");
      out.write("            <form action=\"Voterregis\" method=\"post\" >\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                <ul>\n");
      out.write("              \n");
      out.write("                    <li> <h3> Name: <br><input type=\"text\" name=\"name\" size=\"60\" /></li><br>\n");
      out.write("                    \n");
      out.write("                    <br>\n");
      out.write("                    <li>  <h3> Branch:</h3> <br>\n");
      out.write("                     <input type=\"radio\" name=\"branch\" value=\"CSE\" />&nbsp; CSE<br><br>\n");
      out.write("                    <input type=\"radio\" name=\"branch\" value=\"IT\" />&nbsp; IT <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"branch\" value=\"Civil\" />&nbsp; CIVIL <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"branch\" value=\"Mechanical\"/>&nbsp; MECH <br><br>\n");
      out.write("                 <input type=\"radio\" name=\"branch\" value=\"EE/EI\" />&nbsp; EE/EI \n");
      out.write("                    </li><br>\n");
      out.write("                   <br>\n");
      out.write("                    <li><h3>Year:</h3><br>\n");
      out.write("                        <input type=\"radio\" name=\"year\" value=\"2nd\" /> &nbsp; 2nd <br><br>\n");
      out.write("                        <input type=\"radio\" name=\"year\" value=\"3rd\" /> &nbsp; 3rd<br><br>\n");
      out.write("                         \n");
      out.write("                        <input type=\"radio\" name=\"year\" value=\"4th\" /> &nbsp;4th<br><br>\n");
      out.write("                    </li> <br>\n");
      out.write("                    \n");
      out.write("                    <li><h3> Gender:</h3>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"M\" /> &nbsp; Male\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"F\" /> &nbsp; Female\n");
      out.write("                    </li><br>\n");
      out.write("                    <br>\n");
      out.write("                    <li><h3>Enrollment No: </h3><br>\n");
      out.write("                        <input type=\"text\" name=\"collegeid\" value=\"0802\" size=\"15\" />\n");
      out.write("                        <select name=\"bname\">\n");
      out.write("                            <option>CS</option>\n");
      out.write("                            <option>IT</option>\n");
      out.write("                            <option>CE</option>\n");
      out.write("                            <option>ME</option>\n");
      out.write("                            <option>EE</option>\n");
      out.write("                            <option>EI</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"text\" name=\"rollno\" value=\"\" size=\"35\" maxlength=\"6\" />\n");
      out.write("                    </li>\n");
      out.write("                    <br><br>\n");
      out.write("                    <li><h3>Set Password:</h3><br>\n");
      out.write("                        <input type=\"password\" name=\"pass\" value=\"\" size=\"60\" maxlength=\"128\" />\n");
      out.write("                    </li><br><br>\n");
      out.write("                    <li><h3>Confirm Password:</h3><br>\n");
      out.write("                        <input type=\"password\" name=\"passone\" value=\"\" size=\"60\" maxlength=\"128\" />\n");
      out.write("                    </li><br><br>\n");
      out.write("                    <li><h3>E-Mail ID:</h3><br>\n");
      out.write("                        <input type=\"text\" name=\"email\" value=\"\" size=\"60\" maxlength=\"128\" />\n");
      out.write("                    </li><br><br>    \n");
      out.write("                    <li><h3>Contact:</h3><br>\n");
      out.write("                        <input type=\"text\" name=\"code\" value=\"91\" size=\"1\" readonly=\"readonly\" />\n");
      out.write("                        <input type=\"text\" name=\"contact\" value=\"\" size=\"50\" maxlength=\"10\" />\n");
      out.write("                    </li><br> <br>    \n");
      out.write("                    <li><h3>Address:</h3><br>\n");
      out.write("                        <textarea name=\"address\" rows=\"4\" cols=\"60\" maxlength=\"80\">\n");
      out.write("                        </textarea>\n");
      out.write("                    </li><br><br>    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <input class=\"button\" type=\"submit\" value=\"Submit Info\" />\n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
