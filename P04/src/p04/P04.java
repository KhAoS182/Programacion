/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class P04 {
    static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    
    public static String readString()//obligatio para leer strings ya que el nextInt no lee el intro y aveces da errores.
    {
	Scanner sc = new Scanner(System.in);
	return sc.nextLine();
    }
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	boolean menu = true;
	int opcion=0;
	while(menu==true){
	   System.out.println("   M	   E	   N	   U	");
	   System.out.println("==================================");
	   System.out.println("1. Opcion 1 - Añadir pelicula");
           System.out.println("2. Opcion 2 - Reservar pelicula");
           System.out.println("3. Opcion 3 - Lista de peliculas");
           System.out.println("4. Opcion 4 - Buscar peliculas");            
           System.out.println("5. Salir");
	   System.out.println("==================================");  
           System.out.println("Escribe una de las opciones");
	   opcion= sc.nextInt();
	    switch (opcion) {
		case 1:	
		    Pelicula.añadirPelicula(listaPeliculas);
		    break;
		case 2:
		    Pelicula.reservarPelicula();
		    break;
		case 3:
		    listarPeliculas();
		    break;
		case 4:
		    
		    break;
		case 5:
		    menu=false;
		    break;
		default:
		    System.out.println("Te has equivocado colega");
		    //throw new AssertionError("error brutal");
		    break;
	    }
	}
	
    }
    public static void listarPeliculas() {//Deberia estar en pelicula.java? qisas
	for (int i = 0; i < listaPeliculas.size(); i++) {
	    System.out.println("");
	    System.out.println("ID: " + (i));//La id comienza por 0?
	    System.out.println("Título: " + listaPeliculas.get(i).titulo);
	    System.out.println("Director: " + listaPeliculas.get(i).director);
	    System.out.println("Duración: " + listaPeliculas.get(i).duracion);
	    System.out.println("Género: " + listaPeliculas.get(i).genero);
	    System.out.println("Año: " + listaPeliculas.get(i).año);
	    System.out.println("Disponibilidad: " + (listaPeliculas.get(i).disponibilidad ? "Disponible" : "No disponible"));
	    System.out.println("Cantidad de copias: " + listaPeliculas.get(i).cantidad_copias);
	    System.out.println("Reservas: " + listaPeliculas.get(i).reservas);
	    System.out.println("----------------------------------");
	}
    }
}
