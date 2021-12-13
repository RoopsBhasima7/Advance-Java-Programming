

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


public class Signup extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        String name = req.getParameter("fn");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        Member member = new Member(name,address,phone);
        MemberDAO obj = new MemberDAO();
               int status = obj.insert(member);
               if(status==1)
               res.getWriter().print("Data saved successful");
               
               //JOptionPane.showMessageDialog(null, "Data do not saved successful");
        
    }

    
}
