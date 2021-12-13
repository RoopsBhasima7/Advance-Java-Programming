

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                String x = request.getParameter("fn").trim();
                int xx = Integer.parseInt(x);
                String y = request.getParameter("sn").trim();
                int yy = Integer.parseInt(y);
                int result =xx+yy;
                out.println("<h1>" + "sum = " + result + "</h1>");
                
            %>
        </h1>
    </body>
</html>
