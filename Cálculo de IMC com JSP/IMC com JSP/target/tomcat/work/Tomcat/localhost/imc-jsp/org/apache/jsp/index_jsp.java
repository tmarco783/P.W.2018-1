/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-23 01:35:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>IMC com JSP</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- CSS do Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("            <h3>Calcular o IMC</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <blockquote class=\"blockquote mb-0\">\n");
      out.write("\n");
      out.write("            <!-- Form do IMC -->\n");
      out.write("            <form>\n");
      out.write("                <!-- Peso -->\n");
      out.write("                <div class=\"form-group\" id=\"peso\">\n");
      out.write("                  <label for=\"peso\">Peso</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"inputPeso\" aria-describedby=\"entrar com o peso\" placeholder=\"Digite o peso\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Altura -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"altura\">Altura</label>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"inputAltura\" placeholder=\"Digite a altura\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
 
                
                String peso = request.getParameter("inputPeso");
                String altura = request.getParameter("inputAltura");
                
                float imc = Float.parseFloat(inputPeso) / (Float.parseFloat(inputAltura) * Float.parseFloat(inputAltura));
                String condicaoAtual;
                
                if(imc < 18){
                    condicaoAtual = "VocÃª estÃ¡ abaixo do peso.";
                }else if(imc >= 18 && imc < 25){
                    condicaoAtual = "Seu peso estÃ¡ normal.";
                }else if(imc >= 25 && imc < 30){
                    condicaoAtual = "VocÃª estÃ¡ obeso.";
                }else{
                    condicaoAtual = "VocÃª estÃ¡ obeso.";
                }

                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-- BotÃ£o calcular -->\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Calcular</button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("          </blockquote>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Javascript do Bootstrap -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
