
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    int telNo = Integer.parseInt(request.getParameter("telNo"));
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
    Statement stmt = con.createStatement();
    String id = session.getAttribute("uid").toString();
    String query = "UPDATE admin SET adminName = '"+name+"', address = '"+address+"', telNo = '"+telNo+"'  WHERE id='" + id + "'";
    stmt.executeUpdate(query);
    response.sendRedirect("index.jsp");
%>
