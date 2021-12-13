


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MemberDAO {
    String url = "jdbc:mysql://localhost:8088/mydb";
    String driver = "com.mysql.jdbc.Driver";
   public void loadclass()
   {
        try {  
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
   }
   public Connection connection()
   {
     Connection con = null;
        try {
            con = DriverManager.getConnection(url,"root","");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     return con;
   }
   
   public int insert(Member m)
   {
       loadclass();
       Connection con  = connection();
       String sql = "INSERT INTO info1 VALUES(?,?,?)";
        try {
            PreparedStatement smtm = con.prepareStatement(sql);
            smtm.setString(1, m.getName());
            smtm.setString(2, m.getAddress());
            smtm.setString(3, m.getPhone());
            smtm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
     
       return 1;
   }
    
}
