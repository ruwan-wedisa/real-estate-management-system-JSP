package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class MyAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
            String un="";
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/adminHeader.jsp");
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
      response.setContentType("text/html");
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
      out.write("        <div class=\"navbar-default\" navbar-fixed-top>\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>My Account/Update Account</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String name = request.getParameter("name");
            String NIC = request.getParameter("NIC");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String user = request.getParameter("username");

            try {
                Connection conn = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");

                Statement stmt = conn.createStatement();
                String query = "Select * from login ";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()) {
                     un = rs.getString("userName");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div class=\"w3-sidebar w3-light-grey w3-bar-block\" style=\"width:25%;margin-top:auto\">\n");
      out.write("            <br><br>\n");
      out.write("            <h3>\n");
      out.write("                <a href=\"MyAccount.jsp\" class=\"w3-bar-item w3-button\">Update Account</a>\n");
      out.write("                <a href=\"#\" class=\"w3-bar-item w3-button\">Manage My Adds</a>\n");
      out.write("            </h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div style=\"margin-left:25%\">\n");
      out.write("\n");
      out.write("            <div class=\"w3-container w3-teal\">\n");
      out.write("                <h1>Update Account</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"w3-container\">\n");
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <div class=\"container\">Settings</div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"container\"><b>Change Details</b></div>\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("        </div>\t\t \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\" w3-card\" style=\"margin-top:40px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form name=\"form1\" action=\"sell.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <table border=\"0\" class=\"w3-table-all w3-hoverable table-bordered\">\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>User Name</td>\n");
      out.write("                                <td><input class=\"form-control\" value=\"");
out.println(un);
      out.write("\" name=\"name\" rows=\"4\" cols=\"28\" disabled/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Name</td>\n");
      out.write("                                <td><input class=\"form-control\" name=\"name\" rows=\"4\" cols=\"28\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Address</td>\n");
      out.write("                                <td><input class=\"form-control\" name=\"address\" rows=\"4\" cols=\"28\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"submit\" class=\"w3-btn w3-block w3-teal \" value=\"Update Details\" name=\"btn1\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div class=\"container\"><b>Change Password</b></div>\n");
      out.write("                <br>\n");
      out.write("                <form name=\"form2\" action=\"sell.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <table border=\"0\" class=\"w3-table-all w3-hoverable table-bordered\">\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Currunt Password</td>\n");
      out.write("                                <td><input class=\"form-control\" type =\"password\" name=\"pw\" rows=\"4\" cols=\"28\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>New Password</td>\n");
      out.write("                                <td><input class=\"form-control\" type =\"password\" name=\"rpw\" rows=\"4\" cols=\"28\" required/></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"submit\" class=\"w3-btn w3-block w3-teal \" value=\"Change Password\" name=\"btn1\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                <h4>Information</h4>\r\n");
      out.write("                <ul class=\"row\">\r\n");
      out.write("                    <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("                    <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"agents.jsp\">Agents</a></li>         \r\n");
      out.write("                    <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"blog.jsp\">Blog</a></li>\r\n");
      out.write("                    <li class=\"col-lg-12 col-sm-12 col-xs-3\"><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- <div class=\"col-lg-3 col-sm-3\">\r\n");
      out.write("                     <h4>Newsletter</h4>\r\n");
      out.write("                     <p>Get notified about the latest properties in our marketplace.</p>\r\n");
      out.write("                     <form class=\"form-inline\" role=\"form\">\r\n");
      out.write("                             <input type=\"text\" placeholder=\"Enter Your email address\" class=\"form-control\">\r\n");
      out.write("                                 <button class=\"btn btn-success\" type=\"button\">Notify Me!</button></form>\r\n");
      out.write("             </div> -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                <h4>Follow us</h4>\r\n");
      out.write("                <a href=\"#\"><img src=\"images/facebook.png\" alt=\"facebook\"></a>\r\n");
      out.write("                <a href=\"#\"><img src=\"images/twitter.png\" alt=\"twitter\"></a>\r\n");
      out.write("                <a href=\"#\"><img src=\"images/linkedin.png\" alt=\"linkedin\"></a>\r\n");
      out.write("                <a href=\"#\"><img src=\"images/instagram.png\" alt=\"instagram\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-4\">\r\n");
      out.write("                <h4>Contact us</h4>\r\n");
      out.write("                <p><b>RAD CST group I</b><br>\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-map-marker\"></span> Uva Wellassa University, Badulla <br>\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-envelope\"></span> realEstateSriLanka@gmail.com<br>\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-earphone\"></span> 0110944552</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"copyright\">Copyright 2017. All rights reserved.\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"loginpop\" class=\"modal fade\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6 login\">\r\n");
      out.write("                    <h4>Login</h4>\r\n");
      out.write("                    <form class=\"\" role=\"form\" name=\"form2\" action=\"loginCodeJsp.jsp\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"sr-only\" for=\"exampleInputEmail2\">User Name</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail2\" name=\"loginUN\" placeholder=\"Enter userName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" name=\"loginPW\" placeholder=\"Password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"checkbox\">\r\n");
      out.write("                            <label>\r\n");
      out.write("                                <input type=\"checkbox\"> Remember me\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\r\n");
      out.write("                    </form>          \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <h4>New User Sign Up</h4>\r\n");
      out.write("                    <p>Join today and get updated with all the properties deal happening around.</p>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-info\"  onclick=\"window.location.href = 'register.jsp'\">Join Now</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
