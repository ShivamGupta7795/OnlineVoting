package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeone_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Evoting Portal</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400' rel='stylesheet' />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/BackUpEvoting/welcomeone.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"head\">Welcome to EVoting Portal for Student Community</h1> \n");
      out.write("    <marquee class=\"mar\">IMPORTANT: The Elections for student body is going to be held on 16th April,2015!! Don't forget to give your valuable vote to candidates..!! </marquee>\n");
      out.write("        \n");
      out.write("        <div class=\"college\">\n");
      out.write("            <img src=\"http://localhost:8080/BackUpEvoting/college.jpg\"/>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"regilink\">\n");
      out.write("           \n");
      out.write("            <ul class=\"tags\">\n");
      out.write("                <li id=\"tags\"><a href=\"http://localhost:8080/BackUpEvoting/welcomeone.jsp\" >Home</a> </li>\n");
      out.write("                <li id=\"tags\"><a href=\"http://localhost:8080/BackUpEvoting/registration.jsp\" >Voter Registration</a> </li>\n");
      out.write("                <li id=\"tags\"><a href=\"http://localhost:8080/BackUpEvoting/candiregis.jsp\" >Candidate Registration</a> </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <div class='arti'>\n");
      out.write("            <article>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                Representative elections <br><br>\n");
      out.write("\n");
      out.write("                Welcome to college elections voting site. This site has been developed to provide \n");
      out.write("                online service of voting. It is more facile way to vote as compared to the \n");
      out.write("                cumbersome process of current voting system.<br><br>\n");
      out.write("                Every year the student council president has been chosen. One of the student out \n");
      out.write("                of three candidates will be chosen with maximum vote and also having faculty \n");
      out.write("                recommendation.<br>\n");
      out.write("                Please enter user id that is your enrollment number and passcode below. \n");
      out.write("                <br><br>\n");
      out.write("                This internet service is available 24hours a day until midnight on Friday \n");
      out.write("                16th April 2015.\n");
      out.write("                \n");
      out.write("                <h3>Don't Forget to Vote ;)</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"voting\">\n");
      out.write("            <form action=\"votercheck\" method=\"post\">\n");
      out.write("                <h3> Voter ID: </h3> <input type=\"text\" name=\"voter_id\"  size=\"25\" />\n");
      out.write("                <h3> Password: </h3> <input type=\"password\" name=\"password\"  size=\"25\" />\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <div class=\"bone\"><input type=\"submit\" value=\"Submit\" /></div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("       </div>\n");
      out.write("    <div  class=\"fpass\">\n");
      out.write("        <a href=\"http://localhost:8080/BackUpEvoting/forgotpass.jsp\">forgot password</a>\n");
      out.write("    </div>\n");
      out.write("        </body>\n");
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
