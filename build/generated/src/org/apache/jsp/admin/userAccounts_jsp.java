package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class userAccounts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/Adminheader.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Realestate CST group I </title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/style.css\"/>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"assets/script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Owl stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/owl-carousel/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/owl-carousel/owl.theme.css\">\n");
      out.write("        <script src=\"assets/owl-carousel/owl.carousel.js\"></script>\n");
      out.write("        <!-- Owl stylesheet -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- slitslider -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/slitslider/css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/slitslider/css/custom.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/slitslider/js/modernizr.custom.79639.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/slitslider/js/jquery.ba-cond.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/slitslider/js/jquery.slitslider.js\"></script>\n");
      out.write("        <!-- slitslider -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Header Starts -->\n");
      out.write("        <div class=\"navbar-default\">\n");
      out.write("\n");
      out.write("            <div class=\"navbar-inverse\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Nav Starts -->\n");
      out.write("                    <div class=\"navbar-collapse  collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"userAccounts.jsp\">User Accounts</a></li>         \n");
      out.write("                            <li><a href=\"MyAccount.jsp\">My Account</a></li>\n");
      out.write("                            <li><a href=\"Messages.jsp\">Messages</a></li>\n");
      out.write("                            <li><div class=\"col-lg-5 col-lg-offset-1 col-sm-6 \">\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                                        ");
 if (session.getAttribute("uid") != null) {
      out.write("\n");
      out.write("\n");
      out.write("                                         <a href=\"logout.jsp\" class=\"btn btn-info\" > Logout</a>\n");
      out.write("\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <a href=\"../login.jsp\" class=\"btn btn-info\" > Login</a>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- #Nav Ends -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- #Header Starts -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Header Starts -->\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"Realestate\"></a>\n");
      out.write("\n");
      out.write("                <ul class=\"pull-right\">\n");
      out.write("                    <li><a href=\"buy.jsp\">Buy</a></li>\n");
      out.write("                    <li><a href=\"sell.jsp\">Sell</a></li>         \n");
      out.write("\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("            <!-- #Header Starts -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"C:\\Users\\SachithrE\\Documents\\NetBeansProjects\\bootstrap.min.css\"> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"> \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>User Accounts</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
            Statement stmt = con.createStatement();
            // Statement stmt = con.createStatement();
            String query2 = "SELECT * FROM admin, login WHERE admin.id = login.id ";
            String query1 = "SELECT * FROM customer, login WHERE customer.id = login.id ";
        
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"inside-banner\">\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <span class=\"pull-right\"><a href=\"#\">Home</a> / User Account Details</span>\n");
      out.write("            <h2>User Account Details</h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"spacer\">\n");
      out.write("            <div class=\"row register\">\n");
      out.write("                <div class=\"col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12 \">\n");
      out.write("                    <h1>Customer Account Details</h1>\n");
      out.write("                    <table class=\"table table-bordered table-hover\" >\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Username</th>\n");
      out.write("                                <th>Customer Name</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>NIC</th>\n");
      out.write("                                <th>Telephone Number</th>\n");
      out.write("                                <th>email</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Edit</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

                            ResultSet rs1 = stmt.executeQuery(query1);
                            while (rs1.next()) {

                                out.println("<tr>");
                                out.println("<td>" + rs1.getString("login.id") + "</td>");
                                out.println("<td>" + rs1.getString("userName") + "</td>");
                                out.println("<td>" + rs1.getString("customerName") + "</td>");
                                out.println("<td>" + rs1.getString("address") + "</td>");
                                out.println("<td>" + rs1.getString("NIC") + "</td>");
                                out.println("<td>" + rs1.getInt("telNo") + "</td>");
                                out.println("<td>" + rs1.getString("email") + "</td>");

                                int act = rs1.getInt("activated");

                                if (act == 1) {
                                    out.println("<td>Activated</td>");
                                    String id = rs1.getString("login.id");
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <td><a  href=\"deactivate.jsp?id=");
out.println(id);
      out.write("\"><button class=\"btn btn-success\">Deactivate</button></a></td>\n");
      out.write("\n");
      out.write("                        ");

                        } else if (act == 0) {
                            out.println("<td>deactivated</td>");
                            String id = rs1.getString("login.id");
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <td><a  href=\"activate.jsp?id=");
out.println(id);
      out.write("\"><button class=\"btn btn-success\">Activate</button></a></td>\n");
      out.write("\n");
      out.write("                        ");

                                }

                                out.println("</tr>");

                            }
                            rs1.close();
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"spacer\">\n");
      out.write("            <div class=\"row register\">\n");
      out.write("                <div class=\"col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12\" >\n");
      out.write("\n");
      out.write("                    <h1>Admin Account Details</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <table class=\"table table-bordered table-hover\" >\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Username</th>\n");
      out.write("                                <th>Admin Name</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>NIC</th>\n");
      out.write("                                <th>Telephone Number</th>\n");
      out.write("                                <th>email</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Edit</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        ");

                            ResultSet rs2 = stmt.executeQuery(query2);
                            while (rs2.next()) {

                                out.println("<tr>");
                                out.println("<td>" + rs2.getString("login.id") + "</td>");
                                out.println("<td>" + rs2.getString("userName") + "</td>");
                                 out.println("<td>" + rs2.getString("adminName") + "</td>");
                                out.println("<td>" + rs2.getString("address") + "</td>");
                                out.println("<td>" + rs2.getString("NIC") + "</td>");
                                out.println("<td>" + rs2.getInt("telNo") + "</td>");
                                out.println("<td>" + rs2.getString("email") + "</td>");

                                int act = rs2.getInt("activated");

                                if (act == 1) {
                                    out.println("<td>Activated</td>");
                                    String id = rs2.getString("login.id");
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <td><a  href=\"deactivate.jsp?id=");
out.println(id);
      out.write("\"><button class=\"btn btn-success\">Deactivate</button></a></td>\n");
      out.write("\n");
      out.write("                        ");

                        } else if (act == 0) {
                            out.println("<td>deactivated</td>");
                            String id = rs2.getString("login.id");
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <td><a  href=\"activate.jsp?id=");
out.println(id);
      out.write("\"><button class=\"btn btn-success\">Activate</button></a></td>\n");
      out.write("\n");
      out.write("                        ");

                                }
                                out.println("</tr>");
                            }

                            rs2.close();
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12\" >\n");
      out.write("                    <a  href=\"addAdmin.jsp\"><button class=\"btn btn-success\" >Add a new Admin Account</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                   <h4>Information</h4>\r\n");
      out.write("                   <ul class=\"row\">\r\n");
      out.write("                <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("                <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"agents.jsp\">Agents</a></li>         \r\n");
      out.write("                <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"blog.jsp\">Blog</a></li>\r\n");
      out.write("                <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("           <!-- <div class=\"col-lg-3 col-sm-3\">\r\n");
      out.write("                    <h4>Newsletter</h4>\r\n");
      out.write("                    <p>Get notified about the latest properties in our marketplace.</p>\r\n");
      out.write("                    <form class=\"form-inline\" role=\"form\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Your email address\" class=\"form-control\">\r\n");
      out.write("                                <button class=\"btn btn-success\" type=\"button\">Notify Me!</button></form>\r\n");
      out.write("            </div> -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                    <h4>Follow us</h4>\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/facebook.png\" alt=\"facebook\"></a>\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/twitter.png\" alt=\"twitter\"></a>\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/linkedin.png\" alt=\"linkedin\"></a>\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/instagram.png\" alt=\"instagram\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("             <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                    <h4>Contact us</h4>\r\n");
      out.write("                    <p><b>RAD CST group I</b><br>\r\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\"></span> Uva Wellassa University, Badulla <br>\r\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"></span> realEstateSriLanka@gmail.com<br>\r\n");
      out.write("<span class=\"glyphicon glyphicon-earphone\"></span> 0110944552</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("<p class=\"copyright\">Copyright 2017. All rights reserved.\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"loginpop\" class=\"modal fade\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-6 login\">\r\n");
      out.write("        <h4>Login</h4>\r\n");
      out.write("          <form class=\"\" role=\"form\" name=\"form2\" action=\"loginCodeJsp.jsp\" method=\"POST\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label class=\"sr-only\" for=\"exampleInputEmail2\">User Name</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail2\" name=\"loginUN\" placeholder=\"Enter userName\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" name=\"loginPW\" placeholder=\"Password\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\"> Remember me\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\r\n");
      out.write("      </form>          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-6\">\r\n");
      out.write("          <h4>New User Sign Up</h4>\r\n");
      out.write("          <p>Join today and get updated with all the properties deal happening around.</p>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-info\"  onclick=\"window.location.href='register.jsp'\">Join Now</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
