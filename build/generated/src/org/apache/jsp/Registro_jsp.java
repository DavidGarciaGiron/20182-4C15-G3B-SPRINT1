package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<pre>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilo_2.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write(" <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Registro</title>\n");
      out.write("<script>\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("var fullname = document.form.fullname.value;\n");
      out.write("var email = document.form.email.value;\n");
      out.write("var username = document.form.username.value;\n");
      out.write("var password = document.form.password.value;\n");
      out.write("var conpassword= document.form.conpassword.value;\n");
      out.write("if (fullname==null || fullname==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Full Name can't be blank\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (email==null || email==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Email can't be blank\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (username==null || username==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Username can't be blank\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(password.length<6)\n");
      out.write("{\n");
      out.write("alert(\"Password must be at least 6 characters long.\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (password!=conpassword)\n");
      out.write("{\n");
      out.write("alert(\"Confirm Password should match with the Password\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>BlockChain y Transporte</h1>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("<center><h2>Registro de Usuario</h2></center>\n");
      out.write("<form name=\"form\" action=\"RegistroServlet\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("    <td>Full Name</td>\n");
      out.write("    <td><input type=\"text\" name=\"fullname\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Email</td>\n");
      out.write("    <td><input type=\"text\" name=\"email\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Username</td>\n");
      out.write("    <td><input type=\"text\" name=\"username\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Password</td>\n");
      out.write("    <td><input type=\"password\" name=\"password\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Confirm Password</td>\n");
      out.write("    <td><input type=\"password\" name=\"conpassword\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print((request.getAttribute("errMessage") == null) ? ""
    : request.getAttribute("errMessage"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td><input type=\"submit\" value=\"Register\"></input><input\n");
      out.write("    type=\"reset\" value=\"Reset\"></input></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("  <script src=\"js/jquery-3.3.1.min_1.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
