/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-13 07:48:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Transaction</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">Banking System</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"customer.jsp\">Customer</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"transfer.jsp\">Transfer\r\n");
      out.write("						Money</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"container-sm constainer-md position-absolute top-50 start-50 translate-middle text-center\">\r\n");
      out.write("		<h1 class=\"text-center\">Transfer Money</h1>\r\n");
      out.write("		<form action=\"transfer.jsp\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row mb-3 mx-auto w-25\">\r\n");
      out.write("				<label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">From</label>\r\n");
      out.write("				<select class=\"form-select\" aria-label=\"Default select example\"\r\n");
      out.write("					name=\"from\">\r\n");
      out.write("					<option selected>From</option>\r\n");
      out.write("					<option value=\"Jash Patel\">Jash Patel</option>\r\n");
      out.write("					<option value=\"Aelis Patel\">Aelis Patel</option>\r\n");
      out.write("					<option value=\"Neel Patel\">Neel Patel</option>\r\n");
      out.write("					<option value=\"Karan Buha\">Karan Buha</option>\r\n");
      out.write("					<option value=\"Smit Dungarani\">Smit Dungarani</option>\r\n");
      out.write("					<option value=\"Sagar Gajera\">Sagar Gajera</option>\r\n");
      out.write("					<option value=\"Dhrumit Patel\">Dhrumit Patel</option>\r\n");
      out.write("					<option value=\"Preet Marakana\">Preet Marakana</option>\r\n");
      out.write("					<option value=\"Bhavya Soni\">Bhavya Soni</option>\r\n");
      out.write("					<option value=\"Jayesh Prajapati\">Jayesh Prajapati</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row mb-3 mx-auto w-25\">\r\n");
      out.write("				<label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">To</label>\r\n");
      out.write("				<select class=\"form-select\" aria-label=\"Default select example\"\r\n");
      out.write("					name=\"to\">\r\n");
      out.write("					<option selected>To</option>\r\n");
      out.write("					<option value=\"Jash Patel\">Jash Patel</option>\r\n");
      out.write("					<option value=\"Aelis Patel\">Aelis Patel</option>\r\n");
      out.write("					<option value=\"Neel Patel\">Neel Patel</option>\r\n");
      out.write("					<option value=\"Karan Buha\">Karan Buha</option>\r\n");
      out.write("					<option value=\"Smit Dungarani\">Smit Dungarani</option>\r\n");
      out.write("					<option value=\"Sagar Gajera\">Sagar Gajera</option>\r\n");
      out.write("					<option value=\"Dhrumit Patel\">Dhrumit Patel</option>\r\n");
      out.write("					<option value=\"Preet Marakana\">Preet Marakana</option>\r\n");
      out.write("					<option value=\"Bhavya Soni\">Bhavya Soni</option>\r\n");
      out.write("					<option value=\"Jayesh Prajapati\">Jayesh Prajapati</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row mb-3 mx-auto w-25\">\r\n");
      out.write("				<label for=\"inputPassword3\"\r\n");
      out.write("					class=\"col-sm-2 col-form-label text-center\"\r\n");
      out.write("					style=\"margin-right: 10px;\">Transfer</label>\r\n");
      out.write("				<div class=\"col-sm-15\">\r\n");
      out.write("					<input type=\"text\" class=\"form-control\" name=\"money\"\r\n");
      out.write("						id=\"inputPassword3\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"container mx-auto w-50 text-center \">\r\n");
      out.write("\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">Transfer</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	");

		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String amount = request.getParameter("money");
		if (from != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");

				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root",
						"root");
				Statement st = con.createStatement();

				String sql = "update banking.customer set balance=balance+" + amount + " where Name='" + to + "' ";
				String sql1 = "update banking.customer set balance=balance-" + amount + " where Name='" + from
						+ "' ";
				int i = st.executeUpdate(sql);
				int j = st.executeUpdate(sql1);
			} catch (Exception e) {
				System.out.print(e);
				e.printStackTrace();
			}
			out.println("<script>alert('Successfully Transaction Completed')</script>");
		}
	
      out.write("\r\n");
      out.write("	<footer class=\"footer mt-auto py-3 bg-light\">\r\n");
      out.write("	<div class=\"container text-center\">\r\n");
      out.write("		<span class=\"text-muted text-center\">This is made by Jash Patel</span>\r\n");
      out.write("	</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
