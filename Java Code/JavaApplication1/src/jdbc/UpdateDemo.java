
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            
            PreparedStatement stmt = con.prepareStatement("UPDATE info SET id = ? WHERE name = ?");
            
            stmt.setInt(1, 8);
            stmt.setString(2, "Ram");
            
            stmt.executeUpdate();
            con.close();
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
            
}
