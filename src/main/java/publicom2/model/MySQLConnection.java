/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicom2.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author l.blee
 */
public class MySQLConnection {
    
    private static final String url = "jdbc:mysql://172.28.36.9/publicom2";
    private static final String user = "clientlourdPublicom";
    private static final String pass = "clientlourd";
    
    private static Connection con = null;
    
    public static Connection getConnexion(){
        
        if(con == null){
            try {
               // Class.forName("com.mysql.cj.jbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
            } catch (Exception ex){
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
    
}
