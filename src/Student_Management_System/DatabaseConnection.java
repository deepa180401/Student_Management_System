/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deepa
 */
public class DatabaseConnection {
   final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   final static String DB_URL = "jdbc:mysql://localhost:3306/student";
   final static String DB_USER = "root";
   final static String DB_PASS = " ";
 
   public static Connection connection(){
       try {
           Class.forName(JDBC_DRIVER);
           Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           return con;
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
       
   }
    
}
