<%-- 
    Document   : cvupload
    Created on : Nov 15, 2017, 11:05:07 PM
    Author     : KAUSHIKA VIRAJ
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.DataInputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sent</title>
        <link href="assets/bootstrap.min.css" rel="stylesheet">
        <link href="include/w3.css" rel="stylesheet">
        <!--<link rel="stylesheet" href="include/font-awesome-4.7.0/css/font-awesome.min.css">-->
    </head>

   <body>
         <div class="container">
            <div class=" w3-card" style="margin-top:40px">
                 <div class="row w3-margin"><button class="w3-button w3-light-grey" onClick= "window.location.href = 'sell.jsp';">Back</button></div>
         <h1 class="w3-padding"><i class="fa fa-user-plus"></i>Successfully Saved your Data!</h1>
         <table align="center" cellpadding="5" cellspacing="5" border="1">

<%! String file_name;%>
<% 
      String saveFile = "";
      String contentType = request.getContentType();
      if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
            DataInputStream in = new DataInputStream(request.getInputStream());
            int formDataLength = request.getContentLength();
            byte dataBytes[] = new byte[formDataLength];
            int byteRead = 0;
            int totalBytesRead = 0;
            while (totalBytesRead < formDataLength) {
                  byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                  totalBytesRead += byteRead;
            }
            String file = new String(dataBytes);
            saveFile = file.substring(file.indexOf("filename=\"") + 10);
            saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
            int lastIndex = contentType.lastIndexOf("=");
            String boundary = contentType.substring(lastIndex + 1, contentType.length());
            int pos;
            pos = file.indexOf("filename=\"");
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            int boundaryLocation = file.indexOf(boundary, pos) - 4;
            int startPos = ((file.substring(0, pos)).getBytes()).length;
            int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
            file_name=saveFile;
            saveFile = "C:/Users/DellWD/Desktop/RAD/WebApplication1/web/admin/images/New folder/" + saveFile;
            File ff = new File(saveFile);
            FileOutputStream fileOut = new FileOutputStream(ff);
            fileOut.write(dataBytes, startPos, (endPos - startPos));
            fileOut.flush();
            fileOut.close();
%>

<%
                  //out.println(saveFile);
                  }
            %>
            <%try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root", "");
                Statement stmt = con.createStatement();
                String un = session.getAttribute("userName").toString();
                ResultSet rs = stmt.executeQuery("select max(id) from ads");
                rs.next();
                String lastid = rs.getString("max(id)");
                String query ="UPDATE ads SET imgName='"+file_name+"' WHERE id='"+lastid+"'";
                int a = stmt.executeUpdate(query);
                if(a>0){
                    
                    response.sendRedirect("index.jsp");
                }
                else{
                    out.println("<p>Failed!</p>");
                }
                
                //ResultSet rs = stmt.executeQuery("select max(id) from applicants");
                //rs.next();
                /*String lastid = rs.getString("max(id)");
                String query = "UPDATE applicants SET CV = '"+file_name+"'  WHERE  id='"+lastid+"'";
                int a = stmt.executeUpdate(query);

                if(a > 0){
               
                        //out.println("<p>Successfully Saved your Data!</p>");
                        //out.println("<p>If you are selected for the interview, we will inform you via email.\nBe alert with your emails.\n\nThank you.</p>");
               out.println("<div class='alert alert-success alert-dismissable col-md-8 offset-2 w3-margin-top'>"
                                + "<a href='JobBank/index.jsp' class='close' data-dismiss='alert' aria-label='close'>"
                                + "&times;</a><strong>Success!</strong> <p>If you are selected for the interview, we will inform you via email.\nBe alert with your emails.\n\nThank you.</p></div>");

        
                */
                
                
            } catch (Exception e) {
                out.println("<p> ERROR: " + e.getMessage() + "</p>");
                out.println("<div class='alert alert-danger alert-dismissable col-md-8 offset-2 w3-margin-top'>"
                            + "<a href='#' class='close' data-dismiss='alert' aria-label='close'>"
                            + "&times;</a><strong>Error</strong> '" + e.getMessage() + "'</div>");
        


}%>

             
            
    
       
   
         </table>
    
</div>

        </div>
</body>
</html>