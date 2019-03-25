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
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class P07 {

    static Scanner sc = new Scanner(System.in);
    static String datos[] = {"Año: ", "Director: ", "Duracion: ", "Sinopsis: ", "Reparto: ", "Sesión: "};
    static int ndatos = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
	System.out.println("¿Como quieres leer el fichero?");
	boolean salir = true;
	while (salir) {
	    switch (menu()) {
		case 1:
		    cargarficherobtb(sc.next(), sc.next());

		    break;
		case 2:
		    cargarficherocac();
		    break;
		case 3:
		    cargarficherolal();
		    break;
		case 4:
		    salir = false;
		    break;
		default:
		    System.out.println("Introduce una opción valida....");
	    }
	}
    }

    public static int menu() {
	System.out.println("--------------------------");
	System.out.println("1) Byte to Byte");
	System.out.println("2) Caracter a caracter");
	System.out.println("3) Línia a línia");
	System.out.println("4) Salir");
	System.out.println("--------------------------");
	int x = sc.nextInt();
	System.out.println("Indica la ruta del archivo a leer y su salida....");
	sc.nextLine();// :)
	return x;
    }

    public static void menuCartelera() {
	System.out.println("----------------------------------------------");
	System.out.println("	     Cartelera cinefbmoll");
	System.out.println("----------------------------------------------");
    }

    public static void cargarficherobtb(String rutain, String rutaout) throws FileNotFoundException {
	ndatos = 0;
	String saltolinia = "\n";
	String formatpelicula = "----------";
	String formatpelicula2 = "\n\n----------";
	byte[] saltolineabytes = saltolinia.getBytes(StandardCharsets.UTF_8);// Lo pasamos a bytes
	byte[] formatpeliculabytes = formatpelicula.getBytes(StandardCharsets.UTF_8);
	byte[] formatpeliculabytes2 = formatpelicula2.getBytes(StandardCharsets.UTF_8);
	int i;
	FileInputStream fin = new FileInputStream(rutain);
	FileOutputStream fout = new FileOutputStream(rutaout, true);
	//Primero, asegúrese de que ambos archivos hayan sido especificados.
	//Copiar un Archivo
	try {
	    //Intentar abrir los archivos
	    menuCartelera();
	    fout.write(formatpeliculabytes);
	    System.out.print(formatpelicula);
	    do {
		i = fin.read();
		if (i != -1) {
		    char x = (char) i;
		    if (x == '#') {
			if (ndatos == 0) {
			    System.out.println(formatpelicula);
			    fout.write(formatpeliculabytes);
			}
			System.out.print("\n" + datos[ndatos]);
			byte[] datosbytes = datos[ndatos].getBytes();
			fout.write(saltolineabytes);
			fout.write(datosbytes);
			ndatos++;

		    } else if (x == '{') {
			System.out.print(formatpelicula2);
			fout.write(formatpeliculabytes2);
			ndatos = 0;
		    } else {
			System.out.print((char) i);

			fout.write(i);
		    }
		}
	    } while (i != -1);
	    System.out.println();
	} catch (IOException exc) {
	    System.out.println("Error de E/S: " + exc);
	} finally {
	    try {
		if (fin != null) {
		    fin.close();
		}
	    } catch (IOException exc) {
		System.out.println("Error al cerrar el archivo de entrada.");
	    }
	    try {
		if (fout != null) {
		    fout.close();
		}
	    } catch (IOException exc) {
		System.out.println("Error al cerrar el archivo de salida.");
	    }
	}
    }

    public static void cargarficherocac() throws IOException {
	ndatos = 0;
	String saltolinia = "\n";
	String formatpelicula = "----------";
	String formatpelicula2 = "\n\n----------";
	// Define el archivo a usar
	File archivoEntrada = new File(sc.next()); File archivoSalida = new File(sc.next());	
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
	    try{
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
			    if (j == 0 && i!=0 ) {
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
    }
	
