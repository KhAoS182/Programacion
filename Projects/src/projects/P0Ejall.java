/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.util.Scanner;
import java.io.Console;
/**
 *
 * @author Adrian
 */
public class P0Ejall {
    
    public static void Ej1(){
        
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
        System.out.println("");
    }
    public static void Ej2(){
        Scanner reader = new Scanner(System.in);
        int num;     
        int[] array = new int[5];//En este caso 5
        for (int i=0;i<array.length;i++){
            System.out.println("Escribe el numero:");
            num = reader.nextInt();
            array[i]=num;
        }
        for (int i=1; i<array.length+1;i++){
            System.out.print(array[array.length-i] + "-");
        }
        System.out.println("");
    }
    public static void Ej3(){
        Scanner reader = new Scanner(System.in);
        int num =0, cero = 0;
        int[] negativos = new int[5];
        int[] positivos = new int[5];
        float total = 0;
        int[] array = new int[5];//En este caso 5
         for (int i=0;i<array.length;i++){
            System.out.println("Escribe el numero:");
            num = reader.nextInt();
            array[i]=num;
            total = total + num;
            if (num>0){
                positivos[i] = num;
            }
            else if(num==0){
                cero = cero+ 1;
            }
            else{
                negativos[i] = num;
            }
        }
        System.out.println("Los positivos son:");
        total =0;
        int cantidad=0;
        for (int i =0; i<positivos.length;i++){          
            if (positivos[i]==0){
                
            }
            else{
                System.out.println(positivos[i]);
                total = total + positivos[i];
                cantidad= cantidad +1;
            }
            
        }
        System.out.println("La media es:"+total/cantidad);
        System.out.println("Los negativos son:");
        total =0;
        cantidad = 0;
        for (int i =0; i<negativos.length;i++){        
           if (negativos[i]==0){
                
            }
            else{
                System.out.println(negativos[i]);
                total = total + negativos[i];
                cantidad= cantidad +1;
            }
        }
        System.out.println("La media es:"+total/cantidad);
        System.out.println("Hay " + cero +" ceros");
        System.out.println("");
        
    }
    public static void Ej4() {

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
    public static void Ej5() {

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
        }
        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i] + "-");

        }
        System.out.println("");
    }
    public static void Ej6(){
        
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
        System.out.println("");
    }
    /** Nothing
     * 
     * 
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
                    + "1) Ejercicio 1:  Leer 5 números y mostrarlos en el mismo orden introducido.\n"
                    + "2) Ejercicio 2:  Leer 5 números y mostrarlos en orden inverso al introducido.\n"
                    + "3) Leer 5 números por teclado y a continuación realizar la media de los números.\n"
                    + "4) Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.\n"
                    + "5) Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.\n"
                    + "6) Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc\n"
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
