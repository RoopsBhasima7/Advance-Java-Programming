
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            String sql = "INSERT INTO info VALUES(5,'gita' ,'Pokhara')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(null, "Data saved successfully !!");
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);  
        }
        catch (SQLException ex) {
            System.out.println(ex);   
        }
      
    }
}
