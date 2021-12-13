

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is my first jsp page</title>
        <%! 
          int sum(int x, int y)
          {
          return x+y;    
          }
        %>
    </head>
    <body>
        <h1>
            <% 
        for (int idx = 0; idx < 10; idx++) {
        out.println("<br>" + "Tribhuvan University");     
          }
            %>
        </h1>
    <h> sum of two number is : <h> <%= sum(Integer.parseInt(request.getParameter("fn")),Integer.parseInt(request.getParameter("sn"))) %>
    </body>
</html>
