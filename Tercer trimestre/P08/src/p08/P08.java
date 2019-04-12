/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian
 */
public class P08 { //connection -statement - executeupdate/query resultset next get

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	boolean salir = false;
	try {
	    while (!salir) {
		switch (menu(obtenerConexion())) {
		    case 1:
			System.out.println("Consulta");
			break;
		    case 2:
			break;
		    case 3:
			break;
		    case 4:
			salir = true;
			break;
		    default:
			throw new AssertionError();
		}
	    }
	} catch (SQLException ex) {
	    Logger.getLogger(P08.class.getName()).log(Level.SEVERE, null, ex);
	    System.out.println("Error en la conexion de la base de datos");
	}
    }

    public static Connection obtenerConexion() throws SQLException { //SET GLOBAL time_zone = '+3:00';
	String url = "jdbc:mysql://localhost:3306/bars";
	return DriverManager.getConnection(url, "prog", "123");

    }

    public static int menu(Connection conexion) {
	System.out.println("--------------------------");
	System.out.println("1) Hacer consulta");
	System.out.println("2) Actualizar una tabla");
	System.out.println("3) Insertar un campo");
	System.out.println("4) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }
}
