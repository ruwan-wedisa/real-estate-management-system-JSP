<%@include file="customerHeader.jsp" %>
<%-- 
    Document   : Message
    Created on : Nov 14, 2017, 7:36:49 PM
    Author     : Ishanga
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Customer page</title>
        <link rel="stylesheet" href="assets/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="assets/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="assets/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="assets/w3.css">

    </head>
    <body>
        <div class="container">
            <div class=" w3-card" style="margin-top:40px">

                <div class="row w3-margin-left">
                    <h1 class="w3-padding"><i class="fa fa-handshake-o"></i>Enter Your Message Here</h1>
                </div><hr>
                <form name="form1" action="contact.jsp" method="POST">

                    <table border="0" class="w3-table-all w3-hoverable table-bordered">

                        <tbody>


                            <tr>
                                <td>Full Name</td>
                                <td><input class="form-control" type="text" name="fullname" value="" size="30" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="max30"
                                           data-validation-error-msg="Maximum length of characters is 30"
                                           /></td>
                            </tr>
                            <tr>
                                <td>Telephone No</td>
                                <td><input class="form-control" type="text" name="telephone" value="" size="30" 
                                           data-validation="length" data-validation-length="9-10" 
                                           data-validation-error-msg="Telephone Number has to be an Number(9-10 numbers)"
                                           />
                                </td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><input class="form-control" type="text" name="email" value="" size="30" data-validation="email"/></td>
                            </tr>

                            <tr>
                                <td>Address</td>
                                <td><textarea class="form-control" type="text" name="address" value="" rows="3" cols="28"
                                              data-validation="length alphanumeric" 
                                              data-validation-length="max50"
                                              data-validation-error-msg="Maximum length of characters for Address is 50"              
                                              /></textarea></td>
                            </tr>

                            <tr>
                                <td>Message</td>
                                <td><textarea class="form-control" name="message" rows="4" cols="28" 
                                              data-validation="length alphanumeric" 
                                              data-validation-length="max255"
                                              data-validation-error-msg="Maximum length of characters for Message is 255"/></textarea></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" class="w3-btn w3-blue " value="Send" name="btn1" /></td>
                            </tr>

                        </tbody>
                    </table>
                </form>
            </div>

            <%
                String fullname = request.getParameter("fullname");
                if (fullname != null) {
                    String telephone = request.getParameter("telephone");
                    String email = request.getParameter("email");
                    String address = request.getParameter("address");
                    String message = request.getParameter("message");

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                        Statement stmt = con.createStatement();
                        String query = "INSERT INTO message(fullname,telephone,email,address,message)VALUES('" + fullname + "','" + telephone + "','" + email + "','" + address + "','" + message + "')";
                        int a = stmt.executeUpdate(query);

                        if (a > 0) {%>
            <h2 class="w3-padding"><% out.println("Your Message was Successfully Sent !!!");%></h2>
            <% }
            } catch (Exception e) {%>
            <h2 class="w3-padding"><% out.println("<p>Error: Try Again..." + e.getMessage() + "</p>"); %></h2>
            <%   }
                }

            %>
        </div>
    </body>
</html>

<script src="assets/jquery.form-validator.min.js"></script>
<script>
    $.validate({
        lang: 'en'
    });
</script>
<%@include file="footer.jsp" %>