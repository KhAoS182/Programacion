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


/**
 *
 * @author Adrian
 */
public class P07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int i;
	boolean peli = true;
	FileInputStream fin;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	if (args.length != 1) {
	    System.out.println("Uso: MostrarArchivo.");
	}
	System.out.println("----------------------------------------------");
	System.out.println("	     Cartelera cinefbmoll");
	System.out.println("----------------------------------------------");
	try {
	//Abrir el archivo
	    fin = new FileInputStream("C:\\Users\\Adrian\\Desktop\\Fp\\Grado Superior\\Programación\\Programacion Git-hub\\Tercer trimestre\\P07\\ejemplo.txt");
	} catch (FileNotFoundException exc) {
	    System.out.println("Archivo no encontrado");
	    return;
	}
	try {
	    //Leer bytes hasta que se encuentre el EOF
	    //EOF es un concepto para determinar el final de un archivo
	    do {
		int j=0;
		i = fin.read();
		char x = (char) i;
		if (i != -1) {
		    if (x == '#'){
			System.out.println();
			
			
		    }
		    else if (x == '{'){
			System.out.print("\n----------");
		    }
		    else
		    System.out.print((char) i);

		    
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


