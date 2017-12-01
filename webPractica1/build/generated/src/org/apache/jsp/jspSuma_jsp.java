package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jspSuma_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("            function Calcular(Signo) {\n");
      out.write("                switch (Signo)\n");
      out.write("                {\n");
      out.write("                    case '+':\n");
      out.write("                        document.form1.resultado.value = eval(document.form1.Numero1.value) + eval(document.form1.Numero2.value);\n");
      out.write("                        break\n");
      out.write("                    case '-':\n");
      out.write("                        document.form1.resultado.value = eval(document.form1.Numero1.value) - eval(document.form1.Numero2.value);\n");
      out.write("                        break\n");
      out.write("                    case '*':\n");
      out.write("                        document.form1.resultado.value = eval(document.form1.Numero1.value) * eval(document.form1.Numero2.value);\n");
      out.write("                        break\n");
      out.write("                    case '/':\n");
      out.write("                        document.form1.resultado.value = eval(document.form1.Numero1.value) / eval(document.form1.Numero2.value);\n");
      out.write("                        break\n");
      out.write("                    default:\n");
      out.write("                         document.form1.resultado.value = \"Error\"   \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"form1\">\n");
      out.write("            <p>Numero 1: <input type=\"text\" name=\"Numero1\" size=\"5\"></p>\n");
      out.write("            <p><select name=\"Signo\">\n");
      out.write("                    <option value=\"+\">+</option>\n");
      out.write("                    <option value=\"-\">-</option>\n");
      out.write("                    <option value=\"*\">*</option>\n");
      out.write("                    <option value=\"/\">/</option>\n");
      out.write("               </select></p>\n");
      out.write("             <p>Numero 2: <input type=\"text\" name=\"Numero2\" size=\"5\"></p>\n");
      out.write("             <input type=\"button\" value=\"Calcular\" name=\"btnIngresar\" onclick=\"Calcular(Signo.value)\"/>\n");
      out.write("             <p>Resultado: <input type=\"text\" name=\"resultado\" size=\"5\"></p>\n");
      out.write("        </form>\n");
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
