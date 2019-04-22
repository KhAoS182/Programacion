/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.sql.*;
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
	    Statement st = obtenerConexion().createStatement();// ejemplo de autocloseable?
	    st.executeQuery("START transaction");// por ahora
	    while (!salir) {
		switch (menu()) {
		    case 1:
			//st.executeUpdate("INSERT INTO bar VALUES ('polla', 'pito')");
			consulta();
			break;
		    case 2:
			break;
		    case 3:
			break;
		    case 4:
			mostrarTablas(st);
			verTabla(st);
			break;
		    case 5:
			st.executeQuery("ROLLBACK");
			break;
		    case 6:
			st.executeQuery("COMMIT");
			break;
		    case 7:
			salir = true;
			break;
		    default:
			throw new AssertionError();
		}
	    }
	} catch (SQLException ex) {
	    Logger.getLogger(P08.class.getName()).log(Level.SEVERE, null, ex);
	    System.out.println("Error en la conexion de la base de datos");
	} finally {
		//obtenerConexion().close(); //No es necesario ??¿¿
	}
    }

    public static Connection obtenerConexion() throws SQLException { //SET GLOBAL time_zone = '+3:00';
	String url = "jdbc:mysql://localhost:3306/prog_bars?useLegacyDatetimeCode=false";// Work's for me....
	return DriverManager.getConnection(url, "prog", "123");

    }

    public static int menu() {
	System.out.println("--------------------------");
	System.out.println("1) Hacer consulta");
	System.out.println("2) Actualizar una tabla");
	System.out.println("3) Insertar un campo");
	System.out.println("4) Ver una tabla");
	System.out.println("5) ROLLBACK");
	System.out.println("6) COMMIT");
	System.out.println("7) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }

    public static void verTabla(Statement st) throws SQLException {
	System.out.println("Que tablas deseas ver:");
	String tabla = sc.nextLine();
	int filas = 0;
	ResultSet cfilas = st.executeQuery("Select count(*) from " + tabla);
	while (cfilas.next()) {
	    filas = cfilas.getInt(1);
	}
	ResultSet rs = st.executeQuery("Select * From " + tabla);
	ResultSetMetaData rsmd = rs.getMetaData();
	int columnas = rsmd.getColumnCount();
	for (int i = 1; i - 1 < filas && rs.next() == true; i++) {
	    System.out.print("+");
	    for (int j = 1; j - 1 < columnas; j++) {
		String campo = rs.getString(j);
		if (j > columnas - 1) {		    
		    System.out.print(campo);
		} else {
		    System.out.print(campo + " | ");
		}
	    }
	    System.out.println();
	}
	//rs.close(); no es necesario ??¿¿
    }

    private static void mostrarTablas(Statement st) throws SQLException {
	int tamaño = 12;//pendiente
	ResultSet rs = st.executeQuery("show tables");
	//ResultSetMetaData rsmd = rs.getMetaData();
	System.out.println("+---Bars---+");
	while (rs.next()) {
	    System.out.println("|" + rs.getString(1)); //ojo el rs.next() avanza de 1 en ya que se lo hemos puesto.

	}
	System.out.println("+----------+");
    }
    public static void consulta(){
	
    }
}
public class writter extends Scanner{
    
}
