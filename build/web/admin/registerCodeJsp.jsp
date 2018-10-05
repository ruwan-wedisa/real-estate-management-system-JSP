<%-- 
    Document   : registerCodeJsp
    Created on : Nov 14, 2017, 2:34:02 PM
    Author     : DellWD
--%>
<%@include file="adminHeader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="assets/style.css"/>
    </head>

    <body>
        <%
            String name = request.getParameter("form_name");
            String nic = request.getParameter("form_NIC");
            String email = request.getParameter("form_email");
            int tel = Integer.parseInt(request.getParameter("form_tel"));
            String username = request.getParameter("form_Username");
            String password = request.getParameter("form_pw");
            String address = request.getParameter("form_address");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                Statement stmt = con.createStatement();
                String query = "INSERT INTO login(userName,password,activated,userCategory) VALUES('" + username + "','" + password + "','1','1')";

                int a = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                if (a > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    rs.next();//refer the next ROW
                    int id = rs.getInt(1);
                    Statement stmt2 = con.createStatement();
                    String query2 = "INSERT INTO admin(id,adminName,address,NIC,telNo,email) VALUES('" + id + "','" + name + "','" + address + "','" + nic + "','" + tel + "','" + email + "')";
                    int b = stmt2.executeUpdate(query2);
                    if (b > 0) {
                        out.println("<div class ='container'>");
                        out.println("<div class ='alert alert-success'>");
                        out.println("<strong>Registration Successfull!</strong>");
                        out.println("</div>");
                        out.println("</div>");

                    }
                    else{
                        out.println("<div class ='container'>");
                        out.println("<div class ='alert alert-warning'>");
                        out.println("<strong>Registration Failed!</strong>");
                        out.println("</div>");
                        out.println("</div>");
                    }
                }

            } catch (Exception e) {
                out.println("<p> ERROR: " + e.getMessage() + "</p>");
            }
        %>


    </body>
</html>
<%@include file="footer.jsp" %>