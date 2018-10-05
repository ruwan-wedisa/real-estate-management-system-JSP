<%-- 
    Document   : registerCodeJsp
    Created on : Nov 14, 2017, 2:34:02 PM
    Author     : DellWD
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<html>
    <head>
        <title>Real Estate CST group I </title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="assets/style.css"/>


    </head>

    <body>
        <%

            String username = request.getParameter("loginUN");
            String password = request.getParameter("loginPW");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                Statement stmt = con.createStatement();
                String query = "SELECT * FROM login WHERE userName='" + username + "' AND password='" + password + "'";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()) {

                    session.setAttribute("uid", rs.getString("id"));
                    session.setAttribute("userName", rs.getString("userName"));
                    int userCategory = Integer.parseInt(rs.getString("userCategory"));
                    int activated = Integer.parseInt(rs.getString("activated"));
                    if (userCategory == 1) {
                        if (activated == 1) {
                            response.sendRedirect("admin/index.jsp?user=" + rs.getString("userName"));
                        } else {
                            out.println("<div class ='container'>");
                            out.println("<div class ='alert alert-warning'>");
                            out.println("<strong>Warning!</strong> Your Account is not Activated.");
                            out.println("</div>");
                            out.println("</div>");
                        }

                    } else {
                        if (activated == 1) {
                            response.sendRedirect("customer/index.jsp?user=" + rs.getString("userName"));
                        } else {
                            out.println("<div class ='container'>");
                            out.println("<div class ='alert alert-warning'>");
                            out.println("<strong>Warning!</strong> Your Account is not Activated.");
                            out.println("</div>");
                            out.println("</div>");
                        }

                    }
                } else {
                    //out.println("<p> Invalid Login, Try with Correct Username and Password </p>");
                    out.println("<div class ='container'>");
                    out.println("<div class ='alert alert-danger'>");
                    out.println("<strong>Invalid Login!</strong> Try with Correct Username and Password.");
                    out.println("</div>");
                    out.println("</div>");
                }

            } catch (Exception e) {
                out.println("<p> ERROR: " + e.getMessage() + "</p>");
            }
        %>
    </body>
</html>
<%@include file="footer.jsp" %>
