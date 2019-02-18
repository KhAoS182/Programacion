package projects;
import java.io.Console;
import java.util.Scanner;
import javafx.beans.binding.Bindings;
import java.util.Random;

/**
 *
 * @author Adrian
 */
public class Tocat_i_hundit {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int tablero = 0, barcos, tamañobarco, coordenadax, coordenaday;
        //int[] array = new int[tablero];
        int posicion = 0;
        boolean partida = true;
        System.out.print("Indrotuce tamaño del tablero: ");
        tablero = reader.nextInt();
        while (tablero<5){
            System.out.println("El tamaño minimo es de 5, introduce un numero "
                    + "mayor al 5");
            tablero = reader.nextInt();
        }
        int[] atablero = new int[tablero*tablero];
        for (int i =0; i < tablero*tablero; i++){
            atablero[i] = i;
        }
        while (partida == true) {
            for (int i = 0; i < tablero; ++i) {//pintar lineas
                for (int e = 0; e < tablero; ++e) {//pintar el tablero
                    System.out.print("X");
                    
                }
                System.out.println();

            }
            System.out.println();
            //tablero con array
            for (int i=0;i<tablero*tablero; ++i){
                if (i%tablero==0 && i!=0){
                    System.out.println();
                }
                System.out.print("X");
                
            }
            System.out.print(atablero);
            System.out.println();
            
            for (int i=0;i<tablero*tablero; ++i){
                if (i%tablero==0 && i!=0){
                   posicion++;
                   System.out.println();
                }
                System.out.print(posicion);
                System.out.print(i);
                
                }
            partida = false;
        }
    }
    
    
            
}


