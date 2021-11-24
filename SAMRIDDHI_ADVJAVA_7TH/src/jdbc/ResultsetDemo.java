
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            String sql = "SELECT * FROM info";
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            
            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next())
//            {
//              System.out.print(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3) +"\n");   
//            }
            
            rs.last();
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3));
            
            rs.absolute(4);
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3));
            
            
            //Metadaba
            ResultSetMetaData rmd  = rs.getMetaData();
            System.out.println("Table Name:" + rmd.getTableName(1));
            System.out.println("First Col Name:" + rmd.getColumnName(1));
            con.close();
                        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);  
        }
        catch (SQLException ex) {
            System.out.println(ex);   
        }
      
    } 
    
   
}
