

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleInterestcal extends HttpServlet {
@Override
public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
{
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();
    
    int p = Integer.parseInt(req.getParameter("p"));
    int r = Integer.parseInt(req.getParameter("r"));
    int t = Integer.parseInt(req.getParameter("t"));
    
    double si = (double)(p*t*r)/100;
    
    pw.println("<h1>"+ "Simple interest : " + "</h1>" + si);
    
    //cookies
    
    Cookie pc = new Cookie("principle" ,req.getParameter("p"));
    Cookie tc = new Cookie("Time" ,req.getParameter("t"));
    res.addCookie(tc);
    res.addCookie(pc);
   
    
    pw.close();
    
    
    
    
    
}
}