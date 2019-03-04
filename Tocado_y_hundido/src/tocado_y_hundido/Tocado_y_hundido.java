/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocado_y_hundido;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Tocado_y_hundido {

    static String[][] tablero_jugador1;
    static String[][] tablero_jugador2;
    static String[][] tablero_contrincante1;
    static String[][] tablero_contrincante2;
    static int[] posiciones_barcosj1;
    static int[] posiciones_barcosj2;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int jugador = 0;
	System.out.println("----------Hundir la flota----------");
	inicializarJuego(jugador);
	jugador++;
	inicializarJuego(jugador);

    }

    static void inicializarJuego(int jugador) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Que tamaño quieres que tenga el tablero?");
	int ttablero = sc.nextInt();
	while (ttablero < 5) {
	    System.out.println("Tiene que ser mayor de 5, introduce un numero "
		    + "igual o mayor");
	    sc.nextLine();
	    ttablero = sc.nextInt();
	    System.out.println("");
	}
	int[] posicionbarcos = new int[(ttablero - 2) * 5];//guardar las posiciones de los barcos 0 numero de barco,1 tamaño barco, 2 posicion v,3 posicion h , vidas
	int nbarco = 0;
	int x = ttablero, y = ttablero;
	String[][] tablero = new String[x][y];
	String[][] tablero_contrincante = new String[x][y];
	for (int i = 0; i < tablero.length; i++) {
	    for (int j = 0; j < tablero.length; j++) {
		tablero[i][j] = "  ";
		tablero_contrincante[i][j] = "  ";

	    }

	}
	dibujarTablero(tablero);
	int tbarcos = ttablero - 1;
	int cbarcos = ttablero - 2;
	while (cbarcos > 0) {
	    sc.nextLine();
	    boolean espaciot = true;
	    try {
		System.out.println("Como quieres poner el barco, H o V");
		String opcion = sc.nextLine();
		if (opcion.equals("h") || opcion.equals("H")) {
		    System.out.println("Donde quieres colocar el barco?" + "Barcos por poner: " + cbarcos + " Tamaño del barco actual: " + tbarcos); //temporal
		    int posicion = sc.nextInt();
		    System.out.println("En que posicion vertical quieres ponerlo?");
		    int posicionv = sc.nextInt();

		    if (posicion <= tablero.length && posicionv <= tablero.length) {

			for (int i = 0; i < tbarcos && espaciot == true; i++) {
			    if (tablero[posicion - 1][i + (posicionv - 1)].equals("# ")) {
				System.out.println("Posicion invalida!");
				espaciot = false;//se encarga de verificar que no 'pisa' ningun barco
			    }
			}

			for (int i = 0; i < tbarcos && espaciot == true; i++) {
			    tablero[posicion - 1][i + (posicionv - 1)] = "# ";
			}
			agregarBarco(espaciot, tbarcos, posicionbarcos, nbarco, posicionv, posicion);
		    } else {
			espaciot = false;
		    }
		} else if (opcion.equals("v") || opcion.equals("V")) {
		    System.out.println("Como quieres colocar el barco? Barcos por poner: " + cbarcos + " Tamaño del barco actual: " + tbarcos);
		    int posicion = sc.nextInt();
		    System.out.println("En que posicion horizontal quieres ponerlo?");
		    int posicionh = sc.nextInt();
		    if (posicion <= tablero.length && posicionh <= tablero.length) {
			for (int i = 0; i < tbarcos && espaciot == true; i++) {
			    if (tablero[i + (posicionh - 1)][posicion - 1].equals("# ")) {
				System.out.println("Posicion invalida!");
				espaciot = false;
			    }
			}

			for (int i = 0; i < tbarcos && espaciot == true; i++) {
			    tablero[i + (posicionh - 1)][posicion - 1] = "# ";
			}
			agregarBarco(espaciot, tbarcos, posicionbarcos, nbarco, posicion, posicionh);//lo guardamos en una array
		    } else {
			espaciot = false;
		    }
		} else {
		    System.out.println("Algo que tenga sentido ty.");
		    espaciot = false;
		}
		if (espaciot == true) {
		    tbarcos--;
		    cbarcos--;
		}
		dibujarTablero(tablero);
	    } catch (Exception e) {
		System.out.println("Algo que no debería ha pasado");
	    }

	}
	if (jugador <= 0) {
	    tablero_jugador1 = tablero;
	    posiciones_barcosj1 = posicionbarcos;
	    tablero_contrincante1 = tablero_contrincante;
	} else {
	    tablero_jugador2 = tablero;
	    posiciones_barcosj2 = posicionbarcos;
	    tablero_contrincante2 = tablero_contrincante;
	    System.out.println("Tablero jugador 1");
	    dibujarTablero(tablero_jugador1);
	    System.out.println("Tablero jugador 2");
	    dibujarTablero(tablero_jugador2);
	    jugarFlota(ttablero - 2);

	}
    }

    static void mostrarMenu(int jugador, boolean barcosj1, boolean barcosj2) {
	verificarganador(barcosj1, barcosj2);
	System.out.println("\nJugador:" + jugador);
	System.out.println("----------Hundir la flota----------\n"
		+ "1) Mostrar el tablero del contrincante\n"
		+ "2) Mostrar mi tablero\n"
		+ "3) Disparar cañones\n"
		+ "4) Pasar turno");

    }

    static void jugarFlota(int cantidad_barcos) {
	boolean barcosj1 = true, barcosj2 = true;
	int jugador = 1;
	while (barcosj1 == true && barcosj2 == true) {
	    boolean menu = true;
	    while (menu == true && barcosj1 == true && barcosj2 == true) {
		mostrarMenu(jugador, barcosj1, barcosj2);
		int opcion = sc.nextInt();
		switch (opcion) {
		    case 1:
			if (jugador == 1) {
			    dibujarTablero(tablero_contrincante2);
			} else {
			    dibujarTablero(tablero_contrincante1);
			}
			break;
		    case 2:
			if (jugador == 1) {
			    dibujarTablero(tablero_jugador1);
			} else {
			    dibujarTablero(tablero_jugador2);
			}
			break;
		    case 3:
			if (jugador == 1) {
			    introducirTirada(tablero_jugador2, tablero_contrincante2, tablero_jugador2);
			    
			} else {
			    introducirTirada(tablero_jugador1, tablero_contrincante1, tablero_jugador1);
			    
			}
			menu = false;
			break;
		    case 4:
			menu = false;//???
			break;
		    default:
			System.out.println("Vuelve a intentarlo.");
		}

	    }
	    jugador = 1 - (jugador - 1) + 1;
	}
	if (barcosj1 == false) {
	    System.out.println("Ha ganado el jugador 2!");
	} else {
	    System.out.println("Ha ganado el jugador 1!");
	}
    }

    static void dibujarTablero(String[][] tablero) {//se que no deberia poner ñ
	System.out.println();
	System.out.print("  ");
	String espacios;
	if (tablero.length > 10) {
	    espacios = "  ";
	} else {
	    espacios = " ";
	}
	for (int i = 0; i < tablero.length; i++) {
	    System.out.print(i + 1 + espacios);
	}
	System.out.print(" V\n");
	for (int i = 0; i < tablero.length; i++) {
	    System.out.print("" + (i + 1) + espacios);
	    for (int j = 0; j < tablero[i].length; j++) {
		System.out.print(tablero[i][j]);
	    }
	    System.out.println("");
	}
	System.out.println("H\n");
    }

    static void agregarBarco(boolean barco_disponible, int tamaño_barco, int[] posiciones_barcos, int numero_barco, int posicion_vertical, int posicion_horizontal) {
	if (barco_disponible == true) {//sin uso todavia, en su momento pense que era necesario
	    posiciones_barcos[numero_barco] = numero_barco + 1;
	    posiciones_barcos[numero_barco + 1] = tamaño_barco;
	    posiciones_barcos[numero_barco + 2] = posicion_vertical;//creo que esta al reves 
	    posiciones_barcos[numero_barco + 3] = posicion_horizontal;
	    posiciones_barcos[numero_barco + 4] = tamaño_barco;//vidas
	    numero_barco += 5;
	}
    }

    static void introducirTirada(String[][] tablero_jugador, String[][] tablero_contricante, String[][] tablero_j2) {
	System.out.println("\nIntroduce posiciones h y v");
	int x = sc.nextInt();
	int y = sc.nextInt();
	if (y <= tablero_jugador.length && x <= tablero_jugador.length) {
	    if (tablero_jugador[x - 1][y - 1].contentEquals("# ")) {

		System.out.println("tocado!");
		tablero_contricante[x - 1][y - 1] = ("X ");
		tablero_j2[x - 1][y - 1] = ("X ");
		tablero_jugador2 = tablero_j2;
	    } else {
		tablero_contricante[x - 1][y - 1] = ("0 ");
		tablero_j2[x - 1][y - 1] = ("0 ");
		tablero_jugador2 = tablero_j2;

		System.out.println("No hemos tocado ningun barco!");
	    }
	}
    }

    static void verificarganador(boolean barcosj1, boolean barcosj2) {
	int casillasbarcosj1 = 0, casillasbarcosj2 = 0;
	for (int i = 0; i < tablero_jugador1.length; i++) {
	    for (int j = 0; j < tablero_jugador1[i].length; j++) {
		if (tablero_jugador1[i][j].equals("# ")) {
		    casillasbarcosj1++;
		}
	    }

	}
	if (casillasbarcosj1 == 0) {
	    barcosj1 = false;
	}
	for (int i = 0; i < tablero_jugador2.length; i++) {
	    for (int j = 0; j < tablero_jugador2[i].length; j++) {
		if (tablero_jugador2[i][j].equals("# ")) {
		    casillasbarcosj2++;
		}
	    }

	}
	if (casillasbarcosj2 == 0) {
	    barcosj2 = false;
	}
    }
}
