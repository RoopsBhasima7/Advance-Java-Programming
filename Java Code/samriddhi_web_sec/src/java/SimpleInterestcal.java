
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleInterestcal extends HttpServlet
{
   @Override
   public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
   {
      
       res.setContentType("text/html");
       PrintWriter pw = res.getWriter();
       
       int p = Integer.parseInt(req.getParameter("p"));
       int t = Integer.parseInt(req.getParameter("t"));
       int r = Integer.parseInt(req.getParameter("r"));
       
      double si = (double)(p*t*r)/100;
      pw.println("<h1>" + "Simple Interest :" + "</h1>" + si);
      pw.close();
}
}

