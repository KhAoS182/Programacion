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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        int[] array = new int[10];//En este caso 10
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escribe el numero:");
            num = reader.nextInt();
            array[i] = num;
        }
        System.out.println("Lista ordenada:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + "-");
            System.out.print(array[array.length - i - 1] + "-");

        }

    }
    
}
