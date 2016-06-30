package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regester_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\n");
      out.write("<br>\n");
if (request.getAttribute("success") != null) {
      out.write("\n");
      out.write("<p class=\"bg-success btn-lg\">");
      out.print(request.getAttribute("success"));
      out.write("</p>\n");
} else if (request.getAttribute("error") != null) {
      out.write("\n");
      out.write("<p class=\"bg-danger btn-lg\">");
      out.print(request.getAttribute("error"));
      out.write("</p>\n");
}
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" action=\"regester\" method=\"POST\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <div id=\"legend\">\n");
      out.write("                        <legend class=\"\">Register</legend>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"username\">Username</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"\" class=\"form-control input-lg\">\n");
      out.write("                            <p class=\"help-block\">Username can contain any letters or numbers, without spaces</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"password\">Password</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"\" class=\"form-control input-lg\">\n");
      out.write("                            <p class=\"help-block\">Password should be at least 6 characters</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <label class=\"control-label\" for=\"password_confirm\">Password (Confirm)</label>\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <input type=\"password\" id=\"password_confirm\" name=\"password_confirm\" placeholder=\"\" class=\"form-control input-lg\">\n");
      out.write("                            <p class=\"help-block\">Please confirm password</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">\n");
      out.write("                        <!-- Button -->\n");
      out.write("                        <div class=\"controls\">\n");
      out.write("                            <button class=\"btn btn-success\">Register</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<a class=\"btn btn-danger\" href=\"\">Delete</a>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
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
