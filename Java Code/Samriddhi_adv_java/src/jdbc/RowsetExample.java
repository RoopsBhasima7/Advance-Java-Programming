

package jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowsetExample {
    public static void main(String[] args) {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        RowSetFactory   rsf =  RowSetProvider.newFactory();
        JdbcRowSet rowset = rsf.createJdbcRowSet();
        rowset.setUrl("jdbc:mysql://localhost/mydb");
        rowset.setPassword("");
        rowset.setUsername("root");
        rowset.setCommand("SELECT * FROM info");
        rowset.execute();
        rowset.last();     
        System.out.println(rowset.getInt("id") + "  "+ rowset.getString("name")+ " "+rowset.getString("address"));
        rowset.first();     
        System.out.println(rowset.getInt("id") + "  "+ rowset.getString("name")+ " "+rowset.getString("address"));
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);                  
        }
    }
}
