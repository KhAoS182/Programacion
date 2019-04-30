/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.InvalidPathException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Práctica de Streams
 * @author Adrian
 * @version 1.01
 * 
 */
public class P07 {

    static Scanner sc = new Scanner(System.in);
    static String datos[] = {"Año: ", "Director: ", "Duracion: ", "Sinopsis: ", "Reparto: ", "Sesión: "};
    static int ndatos = 0;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     *
     */
    public static void main(String[] args) throws IOException {

	boolean salir = true;
	while (salir) {
	    try {
		switch (menu()) {
		    case 1:
			System.out.println("Indica la ruta del archivo a leer y su salida....");
			cargarficherobtb();

			break;
		    case 2:
			System.out.println("Indica la ruta del archivo a leer y su salida....");
			cargarficherocac();
			break;
		    case 3:
			System.out.println("Indica la ruta del archivo a leer y su salida....");
			cargarficherolal();
			break;
		    case 4:
			leerObjeto(menuobjetos());
			break;
		    case 5:
			salir = true;
			break;
		    default:
			System.out.println("Introduce una opción valida....");
			imprimirlog("No se han introducido datos válidos");
		}
	    } catch (InputMismatchException e) {
		System.out.println("Introduce datos validos. " + "(" + e + ")");
		imprimirlog("No se han introducido datos válidos" + "(" + e + ")");
		sc.nextLine();
	    }
	}

    }

    /**
     *	<b>Menú principal.</b>
     * Imprime el menú principal
     * @return guiri i guiri seras
     *
     */
    public static int menu() {
	System.out.println("--------------------------");
	System.out.println("1) Byte to Byte");
	System.out.println("2) Caracter a caracter");
	System.out.println("3) Línia a línia");
	System.out.println("4) Tratamiento de objetos");
	System.out.println("5) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }

    /**
     * <b>Imprime el menú de objetos.</b>
     * @return Imprime el menu de lectura de objteos, y nos devuelve la opción del usuario, y lo trata en el main.
     */
    public static int menuobjetos() {
	System.out.println("--------------------------");
	System.out.println("1) Lectura línea a línea y escritura con objetos.");
	System.out.println("2) Lectura de objetos y escritura de objetos");
	System.out.println("3) Lectura de objetos y escritura por consola. ");
	System.out.println("4) Lectura por consola y escritura de objetos. (añadirá objetos al final del fichero existente) ");
	System.out.println("5) Volver al menú principal. ");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }
/**
 * 
 * <b>Un pequeño menú.</b>
 * Imprime un menú unicamente visual.
 */
    public static void menuCartelera() {
	System.out.println("----------------------------------------------");
	System.out.println("	     Cartelera cinefbmoll");
	System.out.println("----------------------------------------------");
    }

    /**
     * Este metodo carga un fichero <b>byte a byte</b>.
     * @throws FileNotFoundException <b>Cuando el fichero de entrada no se ha encontrado.</b>
     * @throws InvalidPathException  <b>Sí es una ruta válida.</b>
     * @throws IOException <b>Sí no es ninguna de las anteriores.</b>
     */
    public static void cargarficherobtb() throws FileNotFoundException, InvalidPathException, IOException {

	ndatos = 0;
	String saltolinea = "\n", formatpelicula = "----------", formatpelicula2 = "\n\n----------";
	int i;
	FileInputStream fin = null;
	FileOutputStream fout = null;
	//Primero, asegúrese de que ambos archivos hayan sido especificados.
	//Copiar un Archivo
	try {
	    fin = new FileInputStream(sc.next());
	    fout = new FileOutputStream(sc.next(), true);
	    //Intentar abrir los archivos
	    menuCartelera();
	    fout.write(formatpelicula.getBytes());
	    System.out.print(formatpelicula);
	    do {
		i = fin.read();
		if (i != -1) {
		    char x = (char) i;
		    switch (x) {
			case '#':
			    if (ndatos == 0) {
				System.out.println(formatpelicula);
				fout.write(formatpelicula.getBytes());
			    }
			    System.out.print("\n" + datos[ndatos]);
			    byte[] datosbytes = datos[ndatos].getBytes();
			    fout.write(saltolinea.getBytes());
			    fout.write(datosbytes);
			    ndatos++;
			    break;
			case '{':
			    System.out.print(formatpelicula2);
			    fout.write(formatpelicula.getBytes());
			    ndatos = 0;
			    break;
			default:
			    System.out.print((char) i);
			    fout.write(i);
			    break;
		    }
		}
	    } while (i != -1);
	    System.out.println();
	    imprimirlog("Se ha formateado el texto correctamente con BTB");
	} catch (FileNotFoundException notf) {
	    System.out.println(notf.getMessage());
	    imprimirlog("Error: " + notf);
	    sc.nextLine();
	} catch (InvalidPathException invp) {
	    System.out.println(invp.getMessage());
	    imprimirlog("Error: " + invp);
	} catch (IOException exc) {
	    System.out.println("Error de E/S: " + exc);
	    imprimirlog("Error de E/S: " + exc);
	} catch (Exception e) {//supongo que aqui iria runtime error
	    System.out.println("Error del usuario");
	    imprimirlog("Error: " + e);
	} finally {
	    try {
		if (fin != null) {
		    fin.close();
		}
	    } catch (IOException exc) {
		System.out.println("Error al cerrar el archivo de entrada.");
		imprimirlog("Error:" + exc);
	    }
	    try {
		if (fout != null) {
		    fout.close();
		}
	    } catch (IOException exc) {
		System.out.println("Error al cerrar el archivo de salida.");
		imprimirlog("Error:" + exc);
	    }
	}
    }

    /**
     * Este metodo carga un fichero <b>carácter a carácter</b>.
     * @throws IOException <b>Sí no es ninguna de las anteriores.</b>
     * 
     */
    public static void cargarficherocac() throws IOException {
	ndatos = 0;
	String saltolinia = "\n";
	String formatpelicula = "----------";
	String formatpelicula2 = "\n\n----------";
	// Define el archivo a usar
	File archivoEntrada = new File(sc.next());
	File archivoSalida = new File(sc.next());
	//instanciamos un writer
	FileWriter writer = new FileWriter(archivoSalida);
	// Declara una variable que contendrá el caracter a leer
	try ( // Instancia un FileReader que se encargara de leer del archivo
		FileReader lector = new FileReader(archivoEntrada)) {
	    // Declara una variable que contendrá el caracter a leer
	    int unCaracter;
	    System.out.print("----------");
	    writer.write(formatpelicula);
	    // Lee el archivo e informa
	    while ((unCaracter = lector.read()) != -1) {
		char x = (char) unCaracter;
		if (x == '#') {
		    if (ndatos == 0) {
			System.out.println("----------");
			writer.write(formatpelicula);
		    }
		    System.out.print("\n" + datos[ndatos]);
		    writer.write(saltolinia);
		    writer.write(datos[ndatos]);
		    ndatos++;

		} else if (x == '{') {
		    System.out.print("\n\n----------");
		    writer.write(formatpelicula2);
		    ndatos = 0;
		} else {
		    System.out.print((char) unCaracter);
		    writer.write((char) unCaracter);
		}
	    }
	    // Cierra el archivo
	    lector.close();
	    writer.close();
	    ndatos = 0;
	    System.out.println();
	} catch (IOException e) {
	    System.out.println("Ha ocurrido algun error...");
	}
    }

    /**
     * Este metodo carga un fichero <b>línea a línea</b>.
     * @throws IOException <b>Sí tenemos algún error de input output</b>
     * 
     */
    public static void cargarficherolal() throws IOException {
	ndatos = 0;
	String saltolinia = "\n";
	String formatpelicula = "----------";
	String formatpelicula2 = "\n\n----------";
	// Instancia un objeto File de entrada
	File archivoEntrada = new File(sc.next());
	File archivoSalida = new File(sc.next());
	// Construye un BufferedReader
	BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
	BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));
	// Defino variables
	boolean eof = false;
	String lineaLeida = "";
	String[] broken_text = null;
	// Lee el archivoEntrada de forma eficiente e imprime los datos en pantalla
	while (!eof) {
	    // Lee una linea entera
	    lineaLeida = reader.readLine();//una vez leída la línea la podemos partir con el método split, suele ser muy útil
	    // Imprime la linea en pantalla
	    if (lineaLeida != null) {
		broken_text = lineaLeida.split(" ");
	    } // Si llego al final del archivo, termina la ejecución
	    else {
		eof = true;
	    }
	}
	System.out.print(formatpelicula);
	try {
	    writer.write(formatpelicula);
	    for (int i = 0; i < broken_text.length; i++) {
		for (int j = 0; j < broken_text[i].length(); j++) {
		    // Declara una variable que contendrá el caracter a leer
		    // Lee el archivo e informa
		    char x = broken_text[i].charAt(j);
		    if (x == '#') {
			if (ndatos == 0) {
			    System.out.println("----------");
			    writer.write(formatpelicula);
			}
			System.out.print("\n" + datos[ndatos]);
			writer.write(saltolinia);
			writer.write(datos[ndatos]);
			ndatos++;

		    } else if (x == '{') {
			System.out.print("\n\n----------");
			writer.write(formatpelicula2);
			ndatos = 0;
		    } else {
			if (j == 0 && i != 0) {
			    System.out.print(" " + x);
			    writer.write(" " + x);
			} else {
			    System.out.print(x);
			    writer.write(x);
			}
		    }
		}
	    }
	} catch (Exception e) {

	}

	// Cierra el FileReader
	System.out.println();
	reader.close();
	writer.close();
    }

    /**
     * Se encarga de imprimir en el log.
     * @param error <b>En caso de obtener un error en alguno de los metodos anteriores, le pasaremos un texto con ese
     * texto para que este metodo se encarga de escribirlo en un log.</b>
     * @throws IOException
     */
    public static void imprimirlog(String error) throws IOException {//se llama error porque puede
	BufferedReader readerlog = new BufferedReader(new FileReader("log.log"));//decoración? jejs
	BufferedWriter writerlog = new BufferedWriter(new FileWriter("log.log", true));
	writerlog.write(obtenerFecha() + " " + error + "\n");
	writerlog.close();
	readerlog.close();
    }

    /**
     * <b>Obtiene la fecha actual.</b>
     * @return Devuelve la fecha actual.
     */
    public static String obtenerFecha() {
	Date mydate = new Date();
	String fecha = new SimpleDateFormat("YYYY/MM/dd").format(mydate);
	String hora = new SimpleDateFormat("HH:mm:ss").format(mydate);
	String fechaCompleta = fecha + " " + hora;
	return fechaCompleta;
    }

    /**
     * Lee objetos y los trata
     * @param opcion Obtenemos la opción del usuario.
     */
    public static void leerObjeto(int opcion) {
	System.out.println("Indica la ruta del archivo a leer y su salida....");
	File archivoEntrada = new File(sc.next());
	File archivoSalida = new File(sc.next());

    }
}

class excepcionprueba extends IOException {

}
