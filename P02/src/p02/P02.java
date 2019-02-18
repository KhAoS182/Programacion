/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class P02 {
    public static void Ej1() {
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++) 
	    for(int j = 0; j < array[i].length; j++) 
                array[i][j] = i + j;
            
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) 
                System.out.print(array[i][j] + " ");          
	    System.out.println();
        }
    }
    public static void Ej2(){
	/*int[] dimension = new int[2]; //manera cutre.
	int[][] array = new int[4][4];
	for (int i = 0; i < array.length; i++) {
	    dimension[0] = i;
	    for (int j = 0; j < array[i].length; j++) {
		dimension[1] = j;		
	    }	    
	}
	if (dimension[0]==dimension[1]){
	    System.out.println("Yes!");
	}
	else{
	    System.out.println("Nope!");
	}
	*/
	int[][] array = new int[5][4]; //better
	if(array.length==array[0].length){
	    System.out.println("Yesi!");
	}
	else{
	    System.out.println("Nopi!");
	}
    }
    public static void Ej3(){
	/*int[][] array = new int[3][3]; Depen de lo que demanis bro
	int[][] array1 = new int[3][3];
	
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		array[i][j]=i+j;
		
	    }	    
	}
	for (int i = 0; i < array1.length; i++) {
	    for (int j = 0; j < array1[i].length; j++) {
		array1[i][j]=i+j;
    }
	}
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		System.out.print(array[i][j] + array1[i][j]);
		
	    }
	    System.out.println();
	}*/
	//si suponemos que las arrays las 2 tendran la msima dimension...
	int[][] array = new int[3][3];
	int[][] array1 = new int[3][3];
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		array[i][j]=i+j;
		array1[i][j]=i+j;
		System.out.print(array[i][j] + array1[i][j]);		
	    }
	    System.out.println();	    
	}	
    }
    public static void Ej4() {
	int[][] array = new int[7][7];
	int diago = array.length -1;//Las arrays cuentan la posición cero por eso le aplicaremos -1.
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array.length; j++) {
		if (j==diago){
		    array[i][j] = 1;
		}
		System.out.print(array[i][j] + " ");		
	    }
	    diago--;
	    System.out.println();
	}
    }
    public static void Ej5() {
	int[][] array = new int[8][6];//No se si te referias a que la llamasemos marco...
	for (int i = 0; i < array.length; i++) {
	    array[i][0] =1;
	    for (int j = 0; j < array[i].length; j++) {
		if(i==0 || i==array[i].length+1 || j== array[i].length-1){
		    array[i][j]=1;		    
		}		
		System.out.print(array[i][j] + " ");		
	    }
	    System.out.println();        
	}
    }
    public static void Ej6() {
	Scanner reader = new Scanner(System.in);
	int x=0;
	int y=0;	
	System.out.println("Dime que altura tendra tu  marco:");
	x= reader.nextInt();
	System.out.println("Dime que longitud tendra tu  marco:");
	y= reader.nextInt();
	int[][] array = new int[x][y];
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		if(j==0 || j== array[i].length-1 || i==array.length-1 || i==0){		    
		}	
		else{
		    array[i][j]=1;
		}
		System.out.print(array[i][j] + " ");		
	    }
	    System.out.println();        
	}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir=false;
        Scanner reader = new Scanner(System.in);
        int menu = 0;
        String continuar = "";
        while (salir == false) {
            System.out.println(
                    "======================\n"
                    + " M     E     N     U\n"
                    + "1) Ejercicio 1:  Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido. \n"
                    + "2) Ejercicio 2: Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se obtiene la misma tabla al cambiar filas por columnas. \n"
                    + "3) Leer 5 Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma. \n"
                    + "4) Leer  Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.\n"
                    + "5) Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz \n"
                    + "6) Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado. Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz.\n"
                    + "7) Salir.\n");
            menu = reader.nextInt();
            switch (menu) {
                case 1:
                    Ej1();
                   continuar = reader.next();
                    break;
                case 2:
                    Ej2();
                    continuar = reader.next();
                    break;
                case 3:
                    Ej3();
                    continuar = reader.next();
                    break;
                case 4:
                    Ej4();
                    continuar = reader.next();
                    break;
                case 5:
                    Ej5();
                    continuar = reader.next();
                    break;
                case 6:
                    Ej6();
                    continuar = reader.next();
                    break;
                case 7:
                    salir = true;
                    break;
            }

        }
    }
    
}

