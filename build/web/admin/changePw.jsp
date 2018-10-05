<%@include file="adminHeader.jsp" %>
<html>
    <head>

        <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />
  <link rel="stylesheet" href="assets/style.css"/>
    </head>
    <body>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%
    String cpw = request.getParameter("pw");
    String npw = request.getParameter("npw");
    String Conpw = request.getParameter("Conpw");
    

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
    Statement stmt = con.createStatement();
    String id = session.getAttribute("uid").toString();
    String query = "SELECT * FROM login WHERE id='" + id + "'";
    ResultSet rs = stmt.executeQuery(query);

    if (rs.next()) {
        String pw = rs.getString("password");
        //out.println("<h3>Confirm Your Password</h3>");
        
        if (pw.equals(cpw)) {
            Statement stmt2 = con.createStatement();
            String query2 = "UPDATE login SET password = '" + npw + "' WHERE id='" + id + "'";
            if (npw.equals(Conpw)) {
                stmt2.executeUpdate(query2);
                response.sendRedirect("index.jsp");
            } else {
                        out.println("<div class ='container'>");
                        out.println("<div class ='alert alert-danger'>");
                        out.println("<strong>Wrong Confirmation Password!</strong>");
                        out.println("</div>");
                        out.println("</div>");
            }
        }
        else{
                out.println("<div class ='container'>");
                        out.println("<div class ='alert alert-warning'>");
                        out.println("<strong>Enter Your Correct Password!</strong>");
                        out.println("</div>");
                        out.println("</div>");
        }
    }


%>
</body>
</html>
<%@include file="footer.jsp" %>