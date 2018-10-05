<%@include file="customerHeader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Account/Update Account</title>

        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assets/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="assets/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="assets/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="assets/w3.css">

    </head>
    <body>
        <%!
            String un = "";
        %>

        <%
            String un = session.getAttribute("userName").toString();
        %>


        <div class="container-fluid" style="margin-left: 25%; margin-right: 25%">  

            <a href="MyAccount.jsp" class="btn btn-success ">Update Account</a>
            <br>
            <a href="Myadds.jsp" class="btn btn-success">Manage My Adds</a>
        </div>
        <br>
        <!-- Page Content -->
        <div style="margin-left:15% ; margin-right: 15%">

            <div class="w3-container w3-teal">

                <h1>Update Account</h1>
            </div>



            <div class="w3-container">

                <table class="table">
                    <br>


                    <div class="container"><b>Change Password</b></div>

            </div> 


            <div class="container">







                <!--<div class="container"><b>Change Password</b></div>-->
                <br>
                <form name="form2" action="changePw.jsp" method="POST">

                    <table border="0" class="w3-table-all w3-hoverable table-bordered">

                        <tbody>
                            <tr>
                                <td>Currunt Password</td>
                                <td><input class="form-control" type ="password" name="pw" rows="4" cols="28" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="8-16"-
                                           data-validation-error-msg="Your Password must be between 8-16 Characters"/></td>
                            </tr>

                            <tr>
                                <td>New Password</td>
                                <td><input class="form-control" type ="password" name="npw" rows="4" cols="28" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="8-16".
                                           data-validation-error-msg="Your New Password must be between 8-16 Characters"/></td>
                            </tr>
                            <tr>
                                <td>Confirm Password</td>
                                <td><input class="form-control" type ="password" name="Conpw" rows="4" cols="28" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="8-16"
                                           data-validation-error-msg="Your New Password must be between 8-16 Characters"/></td>
                            </tr>


                            <tr>
                                <td></td>
                                <td><input type="submit" class="w3-btn w3-block w3-teal " value="Change Password" name="btn1" /></td>
                            </tr>

                        </tbody>


                    </table>
                </form>
                <br>
                <div class="container"><b>Change Details</b></div>
                <br>
                <form name="form1" action="changeDetails.jsp" method="POST">

                    <table border="0" class="w3-table-all w3-hoverable table-bordered">

                        <tbody>
                            <tr>
                                <td>User Name</td>
                                <td><input class="form-control" value="<%out.println(un);%>" name="un" rows="4" cols="28" disabled/></td>
                            </tr>

                            <tr>
                                <td>Name</td>
                                <td><input class="form-control" name="name" rows="4" cols="28" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="max30"
                                           data-validation-error-msg="Maximum length of characters is 30"           
                                           /></td>
                            </tr>

                            <tr>
                                <td>Address</td>
                                <td><input class="form-control" name="address" rows="4" cols="28" 
                                           data-validation="length alphanumeric" 
                                           data-validation-length="max50"
                                           data-validation-error-msg="Maximum length of characters for Address is 50"
                                           /></td>
                            </tr>

                            <tr>
                                <td>Telephone</td>
                                <td><input class="form-control" name="telNo" rows="4" cols="28"
                                           data-validation="length" data-validation-length="9-10" 
                                           data-validation-error-msg="Telephone Number has to be an Number(9-10 numbers)"
                                           /></td>
                            </tr>

                            <tr>
                                <td></td>
                                <td><input type="submit" class="w3-btn w3-block w3-teal " value="Update Details" name="btn1" /></td>
                            </tr>

                        </tbody>


                    </table>
                </form>


            </div>
        </div>



        <br>
        <br>
    </body>
</html>
<script src="assets/jquery.form-validator.min.js"></script>
<script>
    $.validate({
        lang: 'en'
    });
</script>

<%@include file="footer.jsp" %>