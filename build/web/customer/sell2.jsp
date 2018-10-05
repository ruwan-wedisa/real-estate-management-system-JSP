<%-- 
    Document   : sell2
    Created on : Nov 18, 2017, 5:06:05 PM
    Author     : DellWD
--%>
<%@include file="customerHeader.jsp" %>
<%-- 
    Document   : sell2
    Created on : Nov 18, 2017, 5:06:05 PM
    Author     : DellWD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/w3.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class=" w3-card" style="margin-top:40px;margin-left: 25%;margin-right: 25%;">
                <form ENCTYPE="multipart/form-data" ACTION="photoUpload.jsp" METHOD=POST>
                    <table border="0" class="w3-table-all w3-hoverable table-bordered">

                        <tbody>
                            <tr>
                                <td>Add Photos</td>
                                <td>
                                    <INPUT NAME="file" TYPE="file"  id="brows">
                                    <input type="submit" value="Upload photo" name="btn1" class="btn-primary" id="upload" style="float:right">
                                </td> 
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
<%@include file="footer.jsp" %>
