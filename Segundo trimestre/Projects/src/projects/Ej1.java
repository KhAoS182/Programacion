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
public class Ej1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;     
        int[] array = new int[5];//En este caso 5
        for (int i=0;i<array.length;i++){
            System.out.println("Escribe el numero:");
            num = reader.nextInt();
            array[i]=num;
        }
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        
        
        
    }
    
}
