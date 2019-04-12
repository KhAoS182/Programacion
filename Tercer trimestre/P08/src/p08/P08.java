/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian
 */
public class P08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
	obtenerConexion();
    }

    public static Connection obtenerConexion() throws SQLException { //SET GLOBAL time_zone = '+3:00';

	    String url = "jdbc:mysql://localhost:3306/bars";	    
	    return DriverManager.getConnection(url, "prog", "123");

    }
}
