/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class DeleteDemo {
  public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE from info where id = 35");
            con.close();
                        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);  
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }   
}
