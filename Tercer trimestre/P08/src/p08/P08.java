/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
	    Statement st = obtenerConexion().createStatement();
	    st.executeQuery("START transaction");// por ahora
	    while (!salir) {
		switch (menu()) {
		    case 1:
			st.executeUpdate("INSERT INTO bar VALUES ('polla', 'pito')");
			break;
		    case 2:
			break;
		    case 3:
			break;
		    case 4:
			System.out.println("Que tabla deseas ver:");
			mostrarTablas(st);
			verTabla(st);
			/*while (rs.next()) {
			String name = rs.getString(1);// Columna
			String address = rs.getString(2);
			     System.out.print(name + " "+ address+ "\n");
			     
			 }
			 */
			break;
		    case 5:
			salir = true;
			st.executeQuery("ROLLBACK");
			break;
		    case 6:
			st.executeQuery("COMMIT");
			break;
		    default:
			throw new AssertionError();
		}
	    }
	    st.close();
	} catch (SQLException ex) {
	    Logger.getLogger(P08.class.getName()).log(Level.SEVERE, null, ex);
	    System.out.println("Error en la conexion de la base de datos");
	}
    }

    public static Connection obtenerConexion() throws SQLException { //SET GLOBAL time_zone = '+3:00';
	String url = "jdbc:mysql://localhost:3306/bars";
	return DriverManager.getConnection(url, "prog", "123");

    }

    public static int menu() {
	System.out.println("--------------------------");
	System.out.println("1) Hacer consulta");
	System.out.println("2) Actualizar una tabla");
	System.out.println("3) Insertar un campo");
	System.out.println("4) Ver una tabla");
	System.out.println("5) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }

    public static void verTabla(Statement st) throws SQLException {
	System.out.println("Que tablas deseas ver");
	String tabla = sc.nextLine();
	int filas = 0;
	ResultSet cfilas = st.executeQuery("Select count(*) from " + tabla);
	while (cfilas.next()) {
	    filas = cfilas.getInt(1);
	}
	ResultSet rs = st.executeQuery("Select * From " + tabla);
	ResultSetMetaData rsmd = rs.getMetaData();
	int columnas = rsmd.getColumnCount();
	for (int i = 1; i < filas && rs.next() == true; i++) {
	    for (int j = 1; j < columnas; j++) {
		String campo = rs.getString(j);
		System.out.print(campo + " ");
	    }
	    System.out.println();
	}
    }

    private static void mostrarTablas(Statement st) throws SQLException {
	ResultSet rs = st.executeQuery("show tables");
	//ResultSetMetaData rsmd = rs.getMetaData();
	while (rs.next()){
	    System.out.println(rs.getString(1)); //ojo el rs.next() avanza de 1 en ya que se lo hemos puesto.
	    
	}
    }
}
