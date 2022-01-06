package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RutTien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Rút tiền</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"TrangChu.jsp\" style=\"font-size: 25px\">Quay về trang chủ</a>\n");
      out.write("        <h1 align=\"center\" style=\"font-family: monospace;color: coral;\">Rút tiền</h1>\n");
      out.write("        <h2 align=\"center\" style=\"font-family: monospace;color: blue;\">Số tài khoản: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.tk.getSoTaiKhoan()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("        <h2 align=\"center\" style=\"font-family: monospace;color: blue;\">Tên tài khoản: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.tk.getHoten()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form action=\"RutTien\" method=\"POST\"\n");
      out.write("                  style=\"border: 1px solid;width: 500px;padding: 25px;font-size: 25px; display: flex; flex-direction: column; justify-content: flex-start\">\n");
      out.write("                    <div style=\"text-align: left;color: blue;\">Nhập số tiền rút: (VNĐ)</div>\n");
      out.write("                    <input type=\"number\" name=\"sotienrut\" style=\"font-size: inherit;text-align: right\"\" required=\"\">\n");
      out.write("                    <div style=\"text-align: left; margin-top: 10px;color: blue;\">Nhập mật khẩu:</div>\n");
      out.write("                    <input type=\"password\" name=\"matkhau\" style=\"font-size: inherit;\" required=\"\"><br>\n");
      out.write("                    <input type=\"submit\" value=\"Rút tiền\" name=\"butRutTien\" style=\"font-size: inherit;color: blue;\">\n");
      out.write("                    <div style=\"color: red; margin-top: 15px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
