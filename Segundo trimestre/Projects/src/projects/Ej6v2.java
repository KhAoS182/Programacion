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
public class Ej6v2 {
    String hola = "xd";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista1 = new int[12];
        int[] lista2 = new int[12];
        int[] lista3 = new int[24];
        int j=0;
        int x=0;
        int z=0;
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
            System.out.print(lista1[i]);
            
        }
        System.out.println("Escribe 10 numeros en la Segunda lista:");
        for (int i = 0; i < lista2.length; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            num = reader.nextInt();
            lista2[i] = num;
        }
        for (int i = 0; i < lista2.length; i++) {
            System.out.print(lista2[i]);
            
        }
        System.out.println("");

        for (int i=0;i<lista1.length/3;i++){
            for (j=0;j<3;j++){
                lista3[x] = lista1[j+z];
                x++;
            }
            for (j=0;j<3;j++){
                lista3[x] = lista2[j+z];
                x++;
            }
            z=z+3;      
        }
        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i]+" ");
            
        }

    }
}
