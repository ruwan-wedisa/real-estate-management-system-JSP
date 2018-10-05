<%@include file="adminHeader.jsp" %>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%-- 
    Document   : useraccounts
    Created on : Nov 16, 2017, 8:01:13 AM
    Author     : SachithrE
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <!-- <link rel="stylesheet" href="C:\Users\SachithrE\Documents\NetBeansProjects\bootstrap.min.css"> -->
        <        <link rel="stylesheet" href="assets/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="assets/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="assets/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="assets/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



        <title>User Accounts</title>



        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
            Statement stmt = con.createStatement();
            // Statement stmt = con.createStatement();
            String query2 = "SELECT * FROM admin, login WHERE admin.id = login.id ";
            String query1 = "SELECT * FROM customer, login WHERE customer.id = login.id ";
        %>

    <div class="inside-banner">
        <div class="container"> 
            <span class="pull-right"><a href="#">Home</a> / User Account Details</span>
            <h2>User Account Details</h2>
        </div>
    </div>


    <div class="container">
        <div class="spacer">
            <div class="row register">
                <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12 ">
                    <h1>Customer Account Details</h1>
                    <table class="table table-bordered table-hover" >
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Username</th>
                                <th>Customer Name</th>
                                <th>Address</th>
                                <th>NIC</th>
                                <th>Telephone Number</th>
                                <th>email</th>
                                <th>Status</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <%
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
                        %>

                        <td><a  href="deactivate.jsp?id=<%out.println(id);%>"><button class="btn btn-success">Deactivate</button></a></td>

                        <%
                        } else if (act == 0) {
                            out.println("<td>deactivated</td>");
                            String id = rs1.getString("login.id");
                        %>

                        <td><a  href="activate.jsp?id=<%out.println(id);%>"><button class="btn btn-success">Activate</button></a></td>

                        <%
                                }

                                out.println("</tr>");

                            }
                            rs1.close();
                        %>


                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="spacer">
            <div class="row register">
                <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12" >

                    <h1>Admin Account Details</h1>




                    <table class="table table-bordered table-hover" >
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Username</th>
                                <th>Admin Name</th>
                                <th>Address</th>
                                <th>NIC</th>
                                <th>Telephone Number</th>
                                <th>email</th>
                                <th>Status</th>
                                <th>Edit</th>
                            </tr>
                        </thead>

                        <%
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
                        %>

                        <td><a  href="deactivate.jsp?id=<%out.println(id);%>"><button class="btn btn-success">Deactivate</button></a></td>

                        <%
                        } else if (act == 0) {
                            out.println("<td>deactivated</td>");
                            String id = rs2.getString("login.id");
                        %>

                        <td><a  href="activate.jsp?id=<%out.println(id);%>"><button class="btn btn-success">Activate</button></a></td>

                        <%
                                }
                                out.println("</tr>");
                            }

                            rs2.close();
                        %>
                    </table>
                </div>

                <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12" >
                    <a  href="register.jsp"><button class="btn btn-success" >Add a new Admin Account</button></a>
                </div>
            </div>
        </div>
    </div>


    <%@include file="footer.jsp" %>