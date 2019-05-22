/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author viniciusbeletella
 */
public class DBConnection {
    
    private String url = "jdbc:postgresql://localhost/dbatm";
    private String user = "postgres";
    private String password = "root";
    
   public Connection connection(){
       
       Connection conn = null;
       
       try{
           conn = DriverManager.getConnection(url, user, password);
           System.out.println("Connected to Database");
       } catch (SQLException e){
               e.printStackTrace();
    }
       return conn;
   }
    
}

