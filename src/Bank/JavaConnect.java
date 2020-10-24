/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bank;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachin Prajapati
 */

public class JavaConnect {
    Connection conn=null;
    
    public static Connection ConnectDb(){
        try {
          Class.forName("com.mysql.jdbc.Driver");
           java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
           //JOptionPane.showMessageDialog(null, "Connected");
           return (Connection) conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
