<%-- 
    Document   : deactivate
    Created on : Nov 17, 2017, 9:35:39 PM
    Author     : SachithrE
--%>


<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
    Statement stmt = con.createStatement();
    String id=request.getParameter("id");
    String query = "update login set activated ='1' where id='" + id + "'";
    stmt.executeUpdate(query);
    response.sendRedirect("userAccounts.jsp");
%>