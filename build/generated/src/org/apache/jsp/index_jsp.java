package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio de Aplicación</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilo_1.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write(" <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write(" </head>\n");
      out.write(" <style>\n");
      out.write("     p{\n");
      out.write("         color:blue;\n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <header>\n");
      out.write("        <h1>BlockChain y Transporte</h1>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("        <div id=\"contenedor\">\n");
      out.write("        <div id=\"descripcion\">\n");
      out.write("         <h2><hr>DESCRIPCIÓN:</h2>\n");
      out.write("         \n");
      out.write("        <p id=\"parrafo1\">Esta Aplicacion ayudara a todas las a las personas y empresas\n");
      out.write("        en proceso de trasporte y entrega de diversos Productos\n");
      out.write("        sus respectivos lugares de manera mas rapida y segura, \n");
      out.write("        esta aplicacion tendra una comunicacion directa entre \n");
      out.write("        todas las partes del proceso de entrega de cualquier \n");
      out.write("        producto.<hr>\n");
      out.write("        </p>\n");
      out.write("        <br>\n");
      out.write("        <aside id=\"rigth\">\n");
      out.write("            <a type=\"submit\" href=\"Login.jsp\" class=\"btn btn1 btn-lg\">Login Cliente</a><br><br>\n");
      out.write("            <a type=\"submit\" href=\"Registro.jsp\"class=\"btn btn1 btn-lg\">Register Cliente</a><br><br>\n");
      out.write("            <a type=\"submit\" href=\"#\" class=\"btn btn2 btn-lg\">Login Empresa</a><br><br>\n");
      out.write("            <a type=\"submit\" href=\"#\" class=\"btn btn2 btn-lg\">Registro Empresa</a><br><br>\n");
      out.write("        </aside>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min_1.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
