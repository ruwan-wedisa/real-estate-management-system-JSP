
<%@include file="adminHeader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!-- banner -->
<div class="inside-banner">
    <div class="container"> 
        <span class="pull-right"><a href="#">Home</a> / Buy</span>
        <h2>Buy</h2>
    </div>
</div>
<!-- banner -->
<%!
    String town = "";
    String header = "";
    String price = "";
    String imgurl = "";
    String desc="";
    int tel ;
    String name="";

%> 

<%
    try {
        String id = request.getParameter("id");
        int x = Integer.parseInt(id);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM ads WHERE id='"+x+"'";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            header = rs.getString("heading");
            town = rs.getString("town");
            price = rs.getString("price");
            imgurl = rs.getString("imgName");
            desc = rs.getString("description");
            tel = Integer.parseInt(rs.getString("tel"));
            name =rs.getString("name");
        }
            
%>

<div class="container">
    <div class="properties-listing spacer">

        <div class="row">
            <div class="col-lg-3 col-sm-4 hidden-xs">

                <div class="advertisement">
                    <h4>Advertisements</h4>
                    <img src="images/advertisements.jpg" class="img-responsive" alt="advertisement">

                </div>

            </div>

            <div class="col-lg-9 col-sm-8 ">

                <h2><%out.println(header);%></h2>
                <div class="row">
                    <div class="col-lg-8">
                        <div class="property-images">
                            <!-- Slider Starts -->
                            <div class="image-holder"><img src="images/New folder/<%out.println(imgurl);%>" class="img-responsive" alt="properties">

                            </div>
                            <!-- #Slider Ends -->

                        </div>




                        <div class="spacer"><h4><span class="glyphicon glyphicon-th-list"></span> Properties Detail</h4>
                            <p><%out.println(desc);%></p>
                            
                        </div>

                    </div>
                    <div class="col-lg-4">
                        <div class="col-lg-12  col-sm-6">
                            <div class="property-info">
                                <p class="price">Rs. <%out.println(price);%>.00</p>
                                <p class="area"><span class="glyphicon glyphicon-map-marker"></span> <%out.println(town);%></p>

                                <div class="profile">
                                    <span class="glyphicon glyphicon-user"></span> Customer Details
                                    <p><%out.println(name);%><br><%out.println(tel);%></p>
                                </div>
                            </div>



                        </div>
                    </div>
                </div>
                <%
                        

                    } catch (Exception e) {
                        out.println("<p> ERROR: " + e.getMessage() + "</p>");
                    }
                %>
            </div>
        </div>
    </div>
</div>

<%@include file="footer.jsp" %>