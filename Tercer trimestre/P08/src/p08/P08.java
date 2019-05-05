/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author Adrian
 */
public class P08 { //connection -statement - executeupdate/query resultset next get

    static Scanner sc = new Scanner(System.in);
    static String[] mensajes = {"+---------Resultado de la consulta---------+\n","+------------Consulta finalizada-----------+\n"};

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

			consulta(st);
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
	} catch (Exception e) {
	   Logger.getLogger(P08.class.getName()).log(Level.SEVERE, null, e);
	} finally {
	    //obtenerConexion().close(); //No es necesario ??¿¿
	}
    }

    public static Connection obtenerConexion() throws SQLException { //SET GLOBAL time_zone = '+3:00';
	String url = "jdbc:mysql://localhost:3306/prog_bars?useLegacyDatetimeCode=false&serverTimezone=UTC";// Work's for me....
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

    public static void verTablawhere(Statement st) throws SQLException, IOException {
	System.out.println("Que tablas deseas ver:");
	String tabla = sc.nextLine();
	int filas = 0;
	//ResultSet cfilas = st.executeQuery("Select count(*) from " + tabla + "where ? ilike '?'");
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
	System.out.println("Que columna deseas filtrar?");
	String columna = sc.next();
	System.out.println("Qué condición debe cumplir");
	String condicion = sc.next();
	String conwhere = "Select * from " + tabla + " where " + columna + " like '%" + condicion + "%'";
	System.out.println(conwhere);
	cfilas = st.executeQuery("Select count(*) from " + tabla + " where " + columna + " like '%" + condicion + "%'");

	while (cfilas.next()) {
	    filas = cfilas.getInt(1);
	}
	log("Consulta realizada: " + conwhere + ";", 1);
	log(1);
	rs = st.executeQuery(conwhere);
	rsmd = rs.getMetaData();
	columnas = rsmd.getColumnCount();
	String query = "";
	//String query[][] = new String[filas][columnas];
	for (int i = 1; i - 1 < filas && rs.next() == true; i++) {
	    query = "";
	    System.out.print("+");
	    for (int j = 1; j - 1 < columnas; j++) {
		String campo = rs.getString(j);
		if (j > columnas - 1) {
		    System.out.print(campo);
		    //query[i-1][j-1] = campo;
		} else {
		    System.out.print(campo + " | ");
		}
		query = query.concat(campo);
	    }	    
	    System.out.println();
	    log(query, 2);	    
	}
	log(2);
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

    public static int menuConsulta() {
	System.out.println("----------Consulta----------");
	System.out.println("1) Ver todos los campos de una tabla");
	System.out.println("2) Ver el campo de una tabla");
	System.out.println("3) Ver campos con la clausula where");
	System.out.println("4) Ver campo con prepared statement");
	System.out.println("5) Ver clave primaria");
	System.out.println("6) Ver clave primaria prepared statement");
	System.out.println("7) ROLLBACK");
	System.out.println("8) COMMIT");
	System.out.println("9) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }

    public static void consulta(Statement st) throws SQLException, IOException {
	switch (menuConsulta()) {
	    case 1:
		mostrarTablas(st);
		verTabla(st);
		break;
	    case 2:
		mostrarTablas(st);
		verTablawhere(st);
		break;
	    default:
		throw new AssertionError();
	}
    }

    public static void log(String mensaje, int tipo) throws FileNotFoundException, IOException {
	BufferedWriter writer = new BufferedWriter(new FileWriter("log.log", true));
	File log = new File("log.log");
	if (!log.exists()) {
	    log.createNewFile();
	}
	if (tipo == 1) {
	    mensaje = mensaje.concat("\n");
	    writer.write(obtenerFecha() + mensaje);
	    System.out.println("ya ta bro");
	   
	} else if (tipo == 2) {
	    mensaje = "+ " + mensaje + "\n";
	    writer.write(mensaje);
	}
	 writer.close();
    }

    public static void log(int mensaje) throws FileNotFoundException, IOException {
	BufferedWriter writer = new BufferedWriter(new FileWriter("log.log", true));
	if (mensaje == 1) {//por poner algo
	    writer.write(mensajes[0]);
	    
	}
	else if (mensaje == 2){
	    writer.write(mensajes[1]);
	}
	writer.close();
    }

    public static String obtenerFecha() {
	Date mydate = new Date();
	String fecha = new SimpleDateFormat("YYYY/MM/dd").format(mydate);
	String hora = new SimpleDateFormat("HH:mm:ss").format(mydate);
	String fechaCompleta = fecha + " " + hora + " ";
	return fechaCompleta;
    }
}
