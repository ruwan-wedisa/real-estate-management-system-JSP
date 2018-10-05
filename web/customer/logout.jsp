<%-- 
    Document   : logout
    Created on : Nov 3, 2017, 8:17:41 PM
    Author     : Subhash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
    response.sendRedirect("../index.jsp");
%>
