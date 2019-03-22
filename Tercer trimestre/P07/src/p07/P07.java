/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
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
    public static void main(String[] args) {
	cargarfichero();
    }

    public static void menuCartelera() {
	System.out.println("----------------------------------------------");
	System.out.println("	     Cartelera cinefbmoll");
	System.out.println("----------------------------------------------");
    }
    public static void cargarfichero(){
	int i;
	boolean peli = true;
	FileInputStream fin;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	/*if (args.length != 1) {
	    System.out.println("Uso: MostrarArchivo.");
	}*/
	try {
	    //Abrir el archivo
	    System.out.println("Donde esta el archivo....."); // .\.\ejemplo.txt funciona & .\ejemplo.txt funciona & ejemplo.txt tambien??? pum cervell
	    String ruta = sc.nextLine();
	    fin = new FileInputStream(ruta);
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
}
