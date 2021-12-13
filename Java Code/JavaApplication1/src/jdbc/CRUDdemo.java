
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUDdemo {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO info VALUES(35, 'ram','Kathmandu')");
            con.close();
                        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);  
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
}
