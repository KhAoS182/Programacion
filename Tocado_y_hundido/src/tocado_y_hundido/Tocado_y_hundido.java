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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {	
	System.out.println("----------Hundir la flota----------");
	inicializarJuego();
	/*
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
		    
		    break;
		case 2:
		    
		    break;
		case 3:
		    
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
*/
    }
    static void inicializarJuego(){
	Scanner sc = new Scanner(System.in);
	String jugador1 , jugador2;
	System.out.println("¿Que tamaño quieres que tenga el tablero?");
	int ttablero= sc.nextInt();
	while (ttablero<5){
	    System.out.println("Tiene que ser mayor de 5, introduce un numero "
		    + "igual o mayor");
	    sc.nextLine();
	    ttablero= sc.nextInt();
	    System.out.println("");    
	}
	int x = ttablero, y= ttablero;
	String[][] tablero = new String[x][y];
	for (int i = 0; i < tablero.length; i++) {
	    for (int j = 0; j < tablero.length; j++) {
		tablero[i][j]="0 ";
		
	    }
	    
	}
	dibujarTablero(tablero);
	int tbarcos = ttablero-1;
	int cbarcos = ttablero-2;
	while (cbarcos >0){
	boolean espaciot = true;
	sc.nextLine();
	System.out.println("Donde quieres poner el barco, H o V");
	String opcion = sc.nextLine();
	if (opcion.equals("h")|| opcion.equals("H")){
	    System.out.println("Donde quieres colocar el barco " + cbarcos + " " + tbarcos); //temporal
	    int posicion = sc.nextInt();
	    System.out.println("En que posicion vertical quieres ponerlo?");
	    int posicionv = sc.nextInt();	    
	    if (posicion<tablero.length){
	    for (int i = 0; i < tbarcos && espaciot==true; i++) {
	try{
	    if (tablero[posicion-1][i+(posicionv-1)].equals("X ")){
		    System.out.println("Posicion invalida!");
		    espaciot=false;
		}
	    }
	catch(Exception e){//Por ahora.
	    System.out.println("algo ha salido mal");
	}
	    }
	    for (int i = 0; i < tbarcos && espaciot==true; i++) {
		    tablero[posicion-1][i+(posicionv-1)]="X ";
		}
	    }	    
	}else if(opcion.equals("v")|| opcion.equals("V")){
	    System.out.println("Donde quieres colocar el barco" + cbarcos + tbarcos);
	    int posicion = sc.nextInt();
	    System.out.println("En que posicion horizontal quieres ponerlo?");
	    int posicionh = sc.nextInt();
	    if (posicion<tablero.length){
	    for (int i = 0; i < tbarcos && espaciot == true; i++) {
		if (tablero[i+(posicionh-1)][posicion-1].equals("X ")){
		System.out.println("Psocion invalida!");
		espaciot = false;
		}	
	    }
	    for (int i = 0; i < tbarcos && espaciot == true; i++) {
		    tablero[i+(posicionh-1)][posicion-1]="X ";
	    	 
	    }
	}
	else{
	    System.out.println("Va a ser que nope crack");
	}
	if (espaciot==true){
	    tbarcos--;
	    cbarcos--;
	    }
	}
	dibujarTablero(tablero);
	
	}
	/*while(cbarcos!=0){
	System.out.println("Introduce un barco, Posicion horizontal (tamaño:"
		+ tbarcos);
	int opcionh = sc.nextInt();
	System.out.println("Introduce un barco, Posicion vertical (tamaño:"
		+ tbarcos);
	int opcionv = sc.nextInt();
	for (int i = tbarcos;i<1;i--)
	    tablero[opcionh][opcionv-i] = 1;
	}
	cbarcos--;
	dibujarTablero(tablero);*/
    }
	
   
    static void ponerBarcos(int barcos){
    
}
    static void jugarFlota(){
	
    }
    
    static void dibujarTablero(String[][] tablero){//se que no deberia poner ñ
	System.out.println();
	System.out.print("  ");
	for (int i = 0; i < tablero.length; i++) {
	    System.out.print(i+1);
	}
	System.out.print(" V\n");
	for (int i = 0; i < tablero.length; i++) {
	    System.out.print(""+(i+1)+" ");
	    for (int j = 0; j < tablero[i].length; j++) {
		System.out.print(tablero[i][j]);
	    }
	    System.out.println("");	
    }
	System.out.println("H\n");
    }
}

