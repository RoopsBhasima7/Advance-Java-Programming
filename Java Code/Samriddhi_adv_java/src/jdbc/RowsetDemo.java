
package jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public class RowsetDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        RowSetFactory rowsetfactory = RowSetProvider.newFactory();
        JdbcRowSet rowset = rowsetfactory.createJdbcRowSet();
        rowset.setUrl("jdbc:mysql://localhost/mydb");
        rowset.setPassword("");
        rowset.setUsername("root");
        rowset.setCommand("SELECT * from info");
        rowset.execute();
        rowset.last();
        System.out.println(rowset.getInt("id"));
        System.out.println(rowset.getString("name"));
        System.out.println(rowset.getString("address"));       
    }
    
}
