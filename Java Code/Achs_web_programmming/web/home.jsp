

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>first jsp demo</title>
        <%-- declaration tag --%>
        <%!
            
         int marks = 85;
         int sum(int x , int y)
         {
           return x+y;  
         }

         %>
        
    </head>
    <body>
        <h1>Hello World!</h1>
       
        <%-- Scriptlet tag --%>
        <%
           int x= 10;
           int y=20;
           int result =x+y;
           out.print("<h1>" + result + "</h1>");
        %>
     
        <h1> Sum of two number : <%= sum(4,9)%></h1> <% out.println(marks);%>
        
        <%
            for (int idx = 0; idx < 10; idx++) {
                    out.println("Tribhuvan University");
                    out.print("<br>");
                    
                }
        %>
        
    </body>
</html>
