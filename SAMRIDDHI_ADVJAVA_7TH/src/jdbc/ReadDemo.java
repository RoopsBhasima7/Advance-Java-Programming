
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ReadDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            String sql = "select * from info";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                System.out.print(rs.getInt(1) + "\t"); 
                System.out.print(rs.getString(2) + "\t");   
                System.out.println(rs.getString(3));   
            }
            
            con.close();
           //JOptionPane.showMessageDialog(null, "Data saved successfully !!");
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);  
        }
        catch (SQLException ex) {
            System.out.println(ex);   
        }
      
    }
}
