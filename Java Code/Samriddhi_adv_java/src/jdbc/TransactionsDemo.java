
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionsDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            String sql1 = "update info set id =100 where id=1";
            String sql2 = "update info set id =500 where id=5";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            con.commit();
            ResultSet rs = stmt.executeQuery("SELECT * FROM info");
              
                System.out.println(" After Transaction Complete");
                while(rs.next())
                {
                System.out.println(rs.getInt("id") + "  "+ rs.getString("name")+ " "+rs.getString("address"));
                }
            rs.close();
            stmt.close();
            con.close();
       
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }
