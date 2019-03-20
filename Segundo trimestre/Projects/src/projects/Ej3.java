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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        System.out.println(total/cantidad);
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
        System.out.println(total/cantidad);
        System.out.println("Hay " + cero +" ceros");
        
    }
    
}
