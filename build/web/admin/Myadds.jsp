
<%@include file="adminHeader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assets/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="assets/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="assets/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="assets/w3.css">
    </head>
<body>
<div>   
<!-- banner -->

<!-- banner -->
        <div class="container-fluid" style="margin-left: 25%; margin-right: 25%">  

            <a href="MyAccount.jsp" class="btn btn-success ">Update Account</a>
            <br>
            <a href="Myadds.jsp" class="btn btn-success">Manage My Adds</a>
        </div>

<div class="container col-lg-9 " >

    <div class="properties-listing spacer">

        <!--<div class="row">-->

            <div class="col-lg-12 col-sm-12">
                <div class="sortby clearfix">




                    <!-- Page Content 
                    <div style="margin-left:25%">
            
                        <div class="w3-container w3-teal">
                            <h1>My Addvertisements</h1>
                        </div> 
                    -->
                    <%!
                        String imgUrl = "";
                        String price = "";
                        String tel = "";
                        String town = "";
                        int id;


                    %>

                    <%
                        String g = session.getAttribute("userName").toString();
                        //out.println(g);
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("select * from ads WHERE username='" + g + "'");

                        //int i = 0;

                        while (rs.next()) {

                            tel = rs.getString("tel");
                            town = rs.getString("town");
                            price = rs.getString("price");
                            imgUrl = rs.getString("imgName");
                                    id = Integer.parseInt(rs.getString("id")); %>

                    <div class="col-lg-4 col-sm-6" style="width:25% ; float:left;">
                        <div class="properties">
                            <div class="image-holder"><img src="images/New folder/<%out.println(imgUrl);%>" class="img-responsive" alt="properties">

                            </div>
                            <h4><%out.println(town);%></h4>
                            <p class="price">Price: Rs.<%out.println(price);%></p>
                            <p class="price">Tel: <%out.println(tel);%></p>
                            <a class="btn btn-primary" href="property-detail.jsp?id=<%out.println(id);%>" >View Details</a>


                        </div>
                    </div>



                    <% }
                    %>





                </div>

            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>



