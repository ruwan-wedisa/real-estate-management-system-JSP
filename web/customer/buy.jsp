<%@include file="customerHeader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!-- banner -->
<div class="inside-banner">
    <div class="container"> 
        <span class="pull-right"><a href="index.jsp">Home</a> / Buy, Sale & Rent</span>
        <h2>Buy,Don't wait to Buy..! Just Buy and wait..</h2>
    </div>
</div>
<!-- banner -->


<div class="container">
    <div class="properties-listing spacer">

        <div class="row">

            <div class="col-lg-12 col-sm-12">
                <div class="sortby clearfix">
                    <%!
                        String town = "";
                        String imgurl = "";
                        String price = "";
                        int id;

                    %>        
                    <%
                        try {
                            String un = session.getAttribute("userName").toString();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                            Statement stmt = con.createStatement();
                            String query = "SELECT * FROM ads";
                            ResultSet rs = stmt.executeQuery(query);

                            while (rs.next()) {

                                imgurl = rs.getString("imgName");
                                town = rs.getString("town");
                                price = rs.getString("price");
                                id = Integer.parseInt(rs.getString("id"));

                    %>


                    <!-- properties -->
                    <div class="col-lg-4 col-sm-6">
                        <div class="properties">
                            <div class="image-holder"><img src="../admin/images/New folder/<%out.println(imgurl);%>" class="img-responsive" alt="properties">

                            </div>
                            <h4><%out.println(town);%></h4>
                            <p class="price">><%out.println(town);%></p>
                            <a class="btn btn-primary" href="../admin/property-detail.jsp?id=<%out.println(id);%>" >View Details</a>


                        </div>
                    </div>

                    <%

                            }

                        } catch (Exception e) {
                            out.println("<p> ERROR: " + e.getMessage() + "</p>");
                        }
                    %>


                </div>

            </div>
        </div>
    </div>
</div>

<%@include file="footer.jsp" %>