/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2024-07-03 13:41:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complexForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.25.RELEASE.jar", Long.valueOf(1719600918947L));
    _jspx_dependants.put("jar:file:/A:/SpringMVC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/spring-webmvc-5.2.25.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1689214426000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	String s = request.getParameter("error"); 
	if(s!=null){

      out.write('\r');
      out.write('\n');
      out.print( s );
      out.write('\r');
      out.write('\n');
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form  class=\"container row g-3 mt-5\" action=\"complex-form-submit\" method=\"post\" >\r\n");
      out.write("\r\n");
      out.write("	<div id=\"spring-error\">\r\n");
      out.write("		");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      boolean _jspx_th_form_005ferrors_005f0_reused = false;
      try {
        _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005ferrors_005f0.setParent(null);
        // /WEB-INF/views/complexForm.jsp(25,2) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005ferrors_005f0.setPath("p.*");
        int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
          if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_form_005ferrors_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
        _jspx_th_form_005ferrors_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_form_005ferrors_005f0_reused);
      }
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("  <div class=\"col-md-6\">\r\n");
      out.write("    <label for=\"inputEmail4\" class=\"form-label\">Email</label>\r\n");
      out.write("    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail4\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-md-6\">\r\n");
      out.write("    <label for=\"inputPassword4\" class=\"form-label\">Password</label>\r\n");
      out.write("    <input type=\"password\" name=\"pass\" class=\"form-control\" id=\"inputPassword4\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("    <label for=\"inputAddress\" class=\"form-label\">Address</label>\r\n");
      out.write("    <input type=\"text\" name=\"addr1\" class=\"form-control\" id=\"inputAddress\" placeholder=\"1234 Main St\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("    <label for=\"inputAddress2\" class=\"form-label\">Address 2</label>\r\n");
      out.write("    <input type=\"text\" name=\"addr2\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"Apartment, studio, or floor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-md-6\">\r\n");
      out.write("    <label for=\"inputCity\" class=\"form-label\">City</label>\r\n");
      out.write("    <input type=\"text\" name=\"city\" class=\"form-control\" id=\"inputCity\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("    <label for=\"inputState\" class=\"form-label\">State</label>\r\n");
      out.write("    <select id=\"inputState\" name=\"state\" class=\"form-select\">\r\n");
      out.write("      <option selected>Choose...</option>\r\n");
      out.write("      <option>madhya pradesh</option>\r\n");
      out.write("      <option>uttar pradesh</option>\r\n");
      out.write("      <option>himachal pradesh</option>\r\n");
      out.write("      \r\n");
      out.write("    </select>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-md-2\">\r\n");
      out.write("    <label for=\"inputZip\" class=\"form-label\">Zip</label>\r\n");
      out.write("    <input type=\"text\" name=\"zip\" class=\"form-control\" id=\"inputZip\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("    <div class=\"form-check\">\r\n");
      out.write("      <input class=\"form-check-input\" name=\"check\" type=\"checkbox\" id=\"gridCheck\">\r\n");
      out.write("      <label class=\"form-check-label\" for=\"gridCheck\">\r\n");
      out.write("        Check me out\r\n");
      out.write("      </label>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"col-12\">\r\n");
      out.write("    <label for=\"inputAddress2\" class=\"form-label\">Date</label>\r\n");
      out.write("    <input type=\"text\" name=\"date\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"dd-mm-yyyy\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("    <label for=\"inputAddress2\" class=\"form-label\">College</label>\r\n");
      out.write("    <input type=\"text\" name=\"college.collegeName\" class=\"form-control\" placeholder=\"College Name\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
