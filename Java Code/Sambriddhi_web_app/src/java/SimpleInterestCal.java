

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleInterestCal extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int p = Integer.parseInt(req.getParameter("p"));
        int t = Integer.parseInt(req.getParameter("t"));
        int r = Integer.parseInt(req.getParameter("r"));
        double si = (double)(p*t*r)/100;
        //out.println("<html>");
        //out.println("<title>" + "Interest Calculted" + "/title>");
        out.println("<h1>" + "simple interest : " +"</h1>"+ si);
        //out.println("</html>");
        
        
        //cookies
        
        Cookie pc = new Cookie("P",req.getParameter("p"));
        Cookie rc = new Cookie("Rate",req.getParameter("r"));
        
        res.addCookie(pc);
        res.addCookie(rc);
        
        
        
        
    }
    
}
