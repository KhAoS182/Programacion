/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Ej5 {
    /*
     public static void Ejercicio5() {
        System.out.println("EJERCICIO 5");
        int tab1[] = new int[5];
        int tab2[] = new int[5];
        int tab3[] = new int[10];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tab1.length; i++) {
            System.out.print("Introduce un número (tabla 1): ");
            tab1[i]=leer.nextInt();            
        }
        
        for (int i = 0; i < tab2.length; i++) {
            System.out.print("Introduce un número (tabla 2): ");
            tab2[i]=leer.nextInt();            
        }
        
        int j=0;
        for (int i = 0; i < tab1.length; i++){
            tab3[j]=tab1[i];
            j++;
            tab3[j]=tab2[i];
            j++;
        }
        
        for (int i = 0; i < tab3.length; i++){
            System.out.println(tab3[i]);
        }
    }
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int[] lista3 = new int[20];
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int[] lista4 = new int[10];
        System.out.println("Escribe 10 numeros en la primera lista:");
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            num = reader.nextInt();
            lista1[i] = num;
        }
        for (int i = 0; i < lista1.length; i++) {
            System.out.print(lista1[i] + "-");

        }
        System.out.println("Escribe 10 numeros en la Segunda lista:");
        for (int i = 0; i < lista2.length; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            num = reader.nextInt();
            lista2[i] = num;
        }
        for (int i = 0; i < lista3.length - 1; i++) {
            if (i % 2 == 0 || i == 0) {
                lista3[i] = lista1[i / 2];
            } else {
                lista3[i] = lista2[i / 2];
            }
            /*  for (int i = 0; i < tab1.length; i++) {
                tab3[j] = tab1[i];
                j++;
                tab3[j] = tab2[i];
                j++;
        }*/
        }
        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i] + "-");

        }
        
    }
    
}
