/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocado_y_hundido;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Tocado_y_hundido_optimizado {

    static String[][] tablero_jugador1, tablero_jugador2;
    static String[][] tablero_contrincante1, tablero_contrincante2;
    static ArrayList<barcos> posicionesbarcosj1 = new ArrayList<>();
    static ArrayList<barcos> posicionesbarcosj2 = new ArrayList<>();
    static boolean jugador1 = true, jugador2 = true;
    static Scanner sc = new Scanner(System.in);
    static int jugador = 0;
    
    public static void main(String[] args) {
	System.out.println("----------Hundir la flota----------");
	inicializarJuego();

    }

    static void inicializarJuego() {
	System.out.println("¿Que tamaño quieres que tenga el tablero?");
	int ttablero = sc.nextInt();
	while (ttablero < 5) {
	    System.out.println("Tiene que ser mayor de 5, introduce un numero "
		    + "igual o mayor");
	    sc.nextLine();
	    ttablero = sc.nextInt();
	    System.out.println("");
	}
	while (jugador < 2) {
	    jugador++;
	    String[][] tablero = new String[ttablero][ttablero];
	    String[][] tablero_contrincante = new String[ttablero][ttablero];
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
			System.out.println("Donde quieres colocar el barco? Posicion H, V");
			System.out.println("Barcos por poner : " + cbarcos + " Tamaño del barco actual:  " + tbarcos);
			int posicionh = sc.nextInt();
			int posicionv = sc.nextInt();
			if (posicionh <= tablero.length && posicionv <= tablero.length) {
			    for (int i = 0; i < tbarcos && espaciot == true; i++) {
				if (tablero[posicionh - 1][i + (posicionv - 1)].equals("# ")) {
				    System.out.println("Posicion invalida!");
				    espaciot = false;//se encarga de verificar que no 'pisa' ningun barco
				}
			    }
			    for (int i = 0; i < tbarcos && espaciot == true; i++) {
				tablero[posicionh - 1][i + (posicionv - 1)] = "# ";
			    }
			    agregarBarco("h", posicionh, posicionv, tbarcos, cbarcos);
			} else {
			    espaciot = false;
			}
		    } else if (opcion.equals("v") || opcion.equals("V")) {
			System.out.println("Donde quieres colocar el barco? Posicion H, V");
			System.out.println("Barcos por poner : " + cbarcos + " Tamaño del barco actual:  " + tbarcos);
			int posicionh = sc.nextInt();
			int posicionv = sc.nextInt();
			if (posicionv <= tablero.length && posicionh <= tablero.length) {
			    for (int i = 0; i < tbarcos && espaciot == true; i++) {
				if (tablero[i + (posicionh - 1)][posicionv - 1].equals("# ")) {
				    System.out.println("Posicion invalida!");
				    espaciot = false;
				}
			    }
			    for (int i = 0; i < tbarcos && espaciot == true; i++) {
				tablero[i + (posicionh - 1)][posicionv - 1] = "# ";
			    }
			    agregarBarco("v", posicionh, posicionv, tbarcos, cbarcos);//lo guardamos en una array de barcos
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
		    System.out.println("Esta fuera del tablero!");
		}
	    }
	    if (jugador <= 1) {
		tablero_jugador1 = tablero;
		tablero_contrincante1 = tablero_contrincante;
		System.out.println("-------Jugador 2-------");
	    } else {
		tablero_jugador2 = tablero;
		tablero_contrincante2 = tablero_contrincante;
		jugarFlota(ttablero - 2);
	    }
	}
    }

    static void mostrarMenu(int jugador) {
	if (jugador1 != false && jugador2 != false) {
	    System.out.println("\nJugador:" + jugador);
	    System.out.println("----------Hundir la flota----------\n"
		    + "1) Mostrar el tablero del contrincante\n"
		    + "2) Mostrar mi tablero\n"
		    + "3) Disparar cañones\n"
		    + "4) Pasar turno");
	}
    }

    static void jugarFlota(int cantidad_barcos) {
	int jugador = 1;
	while (jugador1 == true && jugador2 == true) {
	    boolean menu = true;
	    while (menu == true && jugador1 == true && jugador2 == true) {
		try {
		    cls();// no funciona dont know why
		} catch (IOException ex) {
		}
		mostrarMenu(jugador);
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
			    introducirTirada(tablero_jugador2, tablero_contrincante2, tablero_jugador2, posicionesbarcosj2);

			} else {
			    introducirTirada(tablero_jugador1, tablero_contrincante1, tablero_jugador1, posicionesbarcosj1);

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
	if (jugador1 == false) {
	    System.out.println("Ha ganado el jugador 2!");
	} else if (jugador2 == false) {
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

    static void agregarBarco(String posicion_barco, int posicion_horizontal, int posicion_vertical, int tamaño, int num_barco) {
	//num_barco[barcos-num_barco]
	if (jugador == 1) {
	    barcos b1 = new barcos();
	    b1.posicion = posicion_barco;
	    b1.posicion_horizontal = posicion_horizontal;
	    b1.posicion_vertical = posicion_vertical;
	    b1.tamaño = tamaño;
	    posicionesbarcosj1.add(b1);

	} else {
	    barcos b1 = new barcos();
	    b1.posicion = posicion_barco;
	    b1.posicion_horizontal = posicion_horizontal;
	    b1.posicion_vertical = posicion_vertical;
	    b1.tamaño = tamaño;
	    posicionesbarcosj2.add(b1);
	}
    }

    static void introducirTirada(String[][] tablero_jugador, String[][] tablero_contricante, String[][] tablero_j2, ArrayList<barcos> barcos_jugador/*posiccion 4*/) {
	System.out.println("\nIntroduce posiciones h y v");
	int x = sc.nextInt();
	int y = sc.nextInt();
	if (y <= tablero_jugador.length && x <= tablero_jugador.length) {
	    if (tablero_jugador[x - 1][y - 1].contentEquals("# ")) {
		tablero_contricante[x - 1][y - 1] = ("X ");
		tablero_j2[x - 1][y - 1] = ("X ");
		System.out.print("Tocado ");
		boolean tocado = false;
		boolean hundido = false;
		int vida_barco = 0;
		for (int i = 0; i < barcos_jugador.size() && tocado == false && barcos_jugador.get(i).hundido == false; i++) {
		    if (barcos_jugador.get(i).hundido == false && barcos_jugador.get(i).posicion.equals("h")) {
			for (int j = 0; j < barcos_jugador.get(i).tamaño; j++) {
			    if (tablero_jugador[barcos_jugador.get(i).posicion_horizontal - 1][(barcos_jugador.get(i).posicion_vertical + j) - 1].contentEquals("X ")) {
				vida_barco++;
			    }
			    if (vida_barco == barcos_jugador.get(i).tamaño) {
				tocado = true;
				barcos_jugador.get(i).hundido = true;
				hundido = true;
			    }
			}
			if (hundido == true) {
			    System.out.println("y hundido!");
			}
		    } else if (barcos_jugador.get(i).hundido == false && barcos_jugador.get(i).posicion.equals("v")) {
			for (int j = 0; j < barcos_jugador.get(i).tamaño; j++) {
			    if (tablero_jugador[(barcos_jugador.get(i).posicion_horizontal + j) - 1][barcos_jugador.get(i).posicion_vertical - 1].contentEquals("X ")) {
				vida_barco++;
			    }
			    if (vida_barco == barcos_jugador.get(i).tamaño) {
				tocado = true;
				barcos_jugador.get(i).hundido = true;
				hundido = true;
			    }
			}
			if (hundido == true) {
			    System.out.println("y hundido");
			}
		    }
		    System.out.println("!");
		}
	    } else {
		tablero_contricante[x - 1][y - 1] = ("0 ");
		tablero_j2[x - 1][y - 1] = ("0 ");

		System.out.println("No hemos tocado ningun barco!");
	    }
	}
	verificarganador();
    }

    static void verificarganador() {//Pendiente de utilizar la array de barcos para verificar que se ha acabado la partida
	int casillasbarcosj1 = 0, casillasbarcosj2 = 0;
	for (int i = 0; i < tablero_jugador1.length && casillasbarcosj1 == 0; i++) {
	    for (int j = 0; j < tablero_jugador1[i].length && casillasbarcosj1 == 0; j++) {
		if (tablero_jugador1[i][j].equals("# ")) {
		    casillasbarcosj1++;
		}
	    }
	}
	if (casillasbarcosj1 == 0) {
	    jugador1 = false;
	}
	for (int i = 0; i < tablero_jugador2.length && casillasbarcosj2 == 0; i++) {
	    for (int j = 0; j < tablero_jugador2[i].length && casillasbarcosj2 == 0; j++) {
		if (tablero_jugador2[i][j].equals("# ")) {
		    casillasbarcosj2++;
		}
	    }
	}
	if (casillasbarcosj2 == 0) {
	    jugador2 = false;
	}
    }
    
    static void cls() throws IOException {//no funciona
	String os = System.getProperty("os.name");

	if (os.contains("Windows")) {
	    Runtime.getRuntime().exec("cls");
	} else {
	    Runtime.getRuntime().exec("clear");
	}
    }
    
    static class barcos {
	public String posicion;
	public int posicion_horizontal;
	public int posicion_vertical;
	public int tamaño;
	public boolean hundido = false;
    }
}
