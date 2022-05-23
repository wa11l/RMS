/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms_walaa;
//class used to make connection with database in XAMPP
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RMS_Connection {
/*
    This method will make the connction to rms_walaa
    *@param no parameter
    *@return object of type connection
    */
    public static Connection connectToRMS()
    {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/rms_walaa";
        Connection mycon=DriverManager.getConnection(url,"root","");
        
        return mycon;
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Error in connectToRMS");
    return null;
    }
    }

    PreparedStatement PreparedStatement(String sql) {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
