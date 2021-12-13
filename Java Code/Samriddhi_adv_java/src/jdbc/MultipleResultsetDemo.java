
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleResultsetDemo{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            Statement stmt = con.createStatement();
            String sql = "SELECT * from info WHERE id<4; SELECT * From info WHERE id>4;";
            boolean result = stmt.execute(sql);
            do
            {
                if(result){
                ResultSet rs = stmt.getResultSet();
                System.out.println("   ");
                while(rs.next())
                {
                System.out.println(rs.getInt("id") + "  "+ rs.getString("name")+ " "+rs.getString("address"));
                }
                rs.close();
                result = stmt.getMoreResults();
                }
            }while(result);
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
