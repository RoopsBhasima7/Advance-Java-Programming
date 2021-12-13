
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

class NewServlet extends GenericServlet
{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
       
        String str = sr.getParameter("fn");
        PrintWriter pw = sr1.getWriter();
        sr1.setContentType("text/html");
        pw.println("<h1>  " + str +  "</h1>");
        pw.close();
    }
    
}