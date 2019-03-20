/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian_garcia_trias;

//se que es un caso, pero lo de longitud de aves me ha hecho perder mucho teimpo, asi mismo creo que se ve que una minima idea de como se podia hacer la tengo
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Zoo {

    static ArrayList<Animal> listaAnimales = new ArrayList<>();
    static ArrayList<Animal> listaAnimalesOrdenada = new ArrayList<>();

    public static void main(String[] args) {
	boolean salir = false;
	while (!salir) {
	    switch (menu()) {
		case 1:
		    //Sin metodos
		    break;
		case 2:
		    Ave av1 = new Ave();
		    av1.altaAve();
		    listaAnimales.add(av1);
		    break;
		case 3:
		    //temporal
		    for (int i = 0; i < listaAnimales.size(); i++) {
			System.out.println("Id: " + (i + 1));
			listaAnimales.get(i).mostrarAnimal();
		    }

		    mostrarOrdenado(listaAnimales);
		    break;
		case 4:
		    salir = true;
		    break;

		default:
		    throw new AssertionError();
	    }
	}
    }

    public static int menu() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1. Alta Pez");
	System.out.println("2. Alta Ave");
	System.out.println("3. Mostrar Ordenado");
	System.out.println("4. Salir");
	System.out.println("Escribe una de las opciones");
	return sc.nextInt();

    }

    /*
  public static void altaAve(){
      Scanner sc = new Scanner(System.in);
       System.out.println("Dame los datos del ave que quieres añadir:");
       System.out.println("Nombre: ");
       String nombre = sc.nextLine();
       System.out.println("Peso");
       int peso = sc.nextInt();
       
       
   }
     */
    public static void mostrarOrdenado(Object Animales) {
	Scanner sc = new Scanner(System.in);
	boolean salir = false;
	int opcion = 0;
	while (!salir) {
	    System.out.println("Que deseas ver");
	    System.out.println("1 ) Aves ordenadas");
	    System.out.println("2 ) Peces ordenados ");
	    System.out.println("3 )Salir");
	    opcion = sc.nextInt();
	    switch (opcion) {
		case 1:
		    int oaves = 0;
		    System.out.println("Como deseas ordenar las aves?");
		    System.out.println("1) Longitud de vuelo");
		    System.out.println("2) Numero de alas");
		    oaves = sc.nextInt();
		    if (oaves == 1) {//pruebas cosas sin sentido soy consicente de ello
			int numAve = 0;
			ArrayList<Ave> listaAveTemporal = new ArrayList<>();//no me ha dado tiempo ha utilizarla
			for (int i = 0; i < listaAnimalesOrdenada.size(); i++) {//borramos la lista y la volvemos a crear
			    listaAnimalesOrdenada.clear();

			}
			for (int i = 0; i < listaAnimales.size(); i++) {
			    try {
				int x = 0;
				int y = 0;
				if (listaAnimales.get(i) instanceof Ave) {//como puedo acceder a la longitud de la ave??				   
				    listaAnimales.get(i).ordenarAvesVuelo(x);// ya estabsa en el final del examen pero he consegui obtener longitud de vuelo pero ya no me da tiempo
				    Ave a = (Ave)listaAnimales.get(i);
				    int longitud = a.longitud_vuelo;
				    if (i + 1 < listaAnimales.size()) {
					listaAnimales.get(i + 1).ordenarAvesVuelo(y);
				    }
				    if (y > x) {

					listaAnimalesOrdenada.add(listaAnimales.get(i));
				    } else {
					listaAnimalesOrdenada.add(listaAnimales.get(i + 1));//se que no funciona como toca pero es por el tiempo que he tardado en obtener logitud de vuelo, pero seria buscar el algoritmo y ya
				    }
				}//creo que se ordena pero alreves xd

			    } catch (Exception e) {

			    }
			}
			for (int i = 0; i < listaAnimales.size(); i++) {
			    listaAnimales.get(i).mostrarAnimal();

			}
		    } else if (oaves == 2) {//pruebas 
			int numAve = 0;
			ArrayList<Animal> listaAveTemporal = new ArrayList<>();
			for (int i = 0; i < listaAveTemporal.size(); i++) {//borramos la lista y la volvemos a crear
			    listaAveTemporal.clear();

			}
			for (int i = 0; i < listaAnimales.size(); i++) {
			    try {
				int x = 0;
				int y = 0;
				if (listaAnimales.get(i) instanceof Ave) {//como puedo acceder a la longitud de la ave??				   
				    listaAnimales.get(i).ordenarAvesAlas(x);// ya estabsa en el final del examen pero he consegui obtener longitud de vuelo pero ya no me da tiempo
				    if (i + 1 < listaAnimales.size()) {
					listaAnimales.get(i + 1).ordenarAvesAlas(y);
				    }
				    if (y > x) {

					listaAveTemporal.add(listaAnimales.get(i));
				    } else {
					listaAveTemporal.add(listaAnimales.get(i + 1));//se que no funciona como toca pero es por el tiempo que he tardado en obtener logitud de vuelo, pero seria buscar el algoritmo y ya
				    }
				}//creo que se ordena pero alreves xd

			    } catch (Exception e) {

			    }
			}
			for (int i = 0; i < listaAveTemporal.size(); i++) {
			    listaAveTemporal.get(i).mostrarAnimal();

			}
		    }

		    break;
		case 2:
		    break;
		case 3:
		    salir = true;
		    break;
		default:
		    System.out.println("Nope");
	    }
	}
    }

}
