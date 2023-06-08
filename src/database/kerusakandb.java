/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ZULFA
 */
public class kerusakandb {
       public static Connection  configDB(){
        try{
            String url = "jdbc:mysql://localhost:3306/kerusakandb";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           Connection cn = DriverManager.getConnection(url,user,pass);
              return cn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
