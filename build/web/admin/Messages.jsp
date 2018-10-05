<%@include file="adminHeader.jsp" %>
<%-- 
    Document   : Admin
    Created on : Nov 16, 2017, 2:30:05 PM
    Author     : Ishanga
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin page</title>
        <link rel="stylesheet" href="assets/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="assets/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="assets/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="assets/w3.css">

    </head>
    <body>
        <%
            String driverName = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/realestate";
            String dbName = "rad";
            String userId = "root";
            String password = "";

            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        %>
        <div class="container">
            <div class="w3-card-2" style="margin-top:35px">
                <h2 class="w3-padding" align="center"><font><strong><i class="fa fa-send">Messages from Customers</i></strong></font></h2>
                <table class="w3-table-all " align="center" cellpadding="5" cellspacing="5" border="1">
                    <tr>

                    </tr>
                    <tr class="w3-light-blue">
                        <td><b>Full Name</b></td>
                        <td><b>Telephone No</b></td>
                        <td><b>Email</b></td>
                        <td><b>Address</b></td>
                        <td><b>Message</b></td>
                    </tr>
                    <%
                        try {
                            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                            statement = connection.createStatement();
                            String query = "SELECT * FROM message";

                            resultSet = statement.executeQuery(query);
                            while (resultSet.next()) {
                    %>
                    <tr >

                        <td><%=resultSet.getString("fullname")%></td>
                        <td><%=resultSet.getString("telephone")%></td>
                        <td><%=resultSet.getString("email")%></td>
                        <td><%=resultSet.getString("address")%></td>
                        <td><%=resultSet.getString("message")%></td>

                    </tr>

                    <%
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </table>
            </div>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>