/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class P07 {

    static Scanner sc = new Scanner(System.in);
    static String datos[] = {"Año: ", "Director: ", "Duracion: ", "Sinopsis: ", "Reparto:", "Sesión: "};
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
		    cargarficherobtb();
		    salir = false;
		    break;
		case 2:
		    cargarficherocac();
		    break;
		case 3:
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
	System.out.println("--------------------------");
	int x = sc.nextInt();
	sc.nextLine();// :)
	return x;
    }

    public static void menuCartelera() {
	System.out.println("----------------------------------------------");
	System.out.println("	     Cartelera cinefbmoll");
	System.out.println("----------------------------------------------");
    }

    public static void cargarficherobtb() {
	int i;
	FileInputStream fin;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	/*if (args.length != 1) {
	    System.out.println("Uso: MostrarArchivo.");
	}*/
	try {
	    //Abrir el archivo
	    System.out.println("Indica la ruta del archivo....."); // .\.\ejemplo.txt funciona & .\ejemplo.txt funciona & ejemplo.txt tambien??? pum cervell
	    fin = new FileInputStream(sc.nextLine());
	    // fin = new FileInputStream("C:\\Users\\Adrian\\Desktop\\Fp\\Grado Superior\\Programación\\Programacion Git-hub\\Tercer trimestre\\P07\\ejemplo.txt");
	} catch (FileNotFoundException exc) {
	    System.out.println("Archivo no encontrado");
	    return;
	}
	menuCartelera();
	try {
	    //Leer bytes hasta que se encuentre el EOF
	    //EOF es un concepto para determinar el final de un archivo
	    System.out.print("----------");
	    do {//byte a byte (caracter a caracter)
		i = fin.read();
		char x = (char) i;
		if (i != -1) {
		    if (x == '#') {
			if (ndatos == 0) {
			    System.out.println("----------");

			}
			System.out.print("\n" + datos[ndatos]);
			ndatos++;

		    } else if (x == '{') {
			System.out.print("\n\n----------");
			ndatos = 0;
		    } else {
			System.out.print((char) i);
		    }
		}
	    } while (i != -1); //Cuando i es igual a -1, se ha alcanzado el final del archivo
	} catch (IOException exc) {
	    System.out.println("Error al leer el archivo");
	}
	try {
	    fin.close();
	    
//Cerrar el archivo
	} catch (IOException exc) {
	    System.out.println("Error cerrando el archivo.");
	}
    }

    public static void cargarficherocac() throws IOException {
	// Define el archivo a usar
	System.out.println("Introduce la ruta del archivo....");
	File archivoEntrada = new File(sc.nextLine());
	// Declara una variable que contendrá el caracter a leer
	try ( // Instancia un FileReader que se encargara de leer del archivo
		FileReader lector = new FileReader(archivoEntrada)) {
	    // Declara una variable que contendrá el caracter a leer
	    int unCaracter;
	    System.out.print("----------");
	    // Lee el archivo e informa
	    while ((unCaracter = lector.read()) != -1) {
		char x = (char) unCaracter;
		if (x == '#') {
			if (ndatos == 0) {
			    System.out.println("----------");

			}
			System.out.print("\n" + datos[ndatos]);
			ndatos++;

		    } else if (x == '{') {
			System.out.print("\n\n----------");
			ndatos = 0;
		    }
		    else{
		System.out.print((char) unCaracter);
		    }
	    }
	    // Cierra el archivo
	    lector.close();
	    System.out.println();
	}
	catch(IOException e){
	    System.out.println("Ha ocurrido algun error...");  
    }
}
}
