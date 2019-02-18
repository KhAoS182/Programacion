package Ex4;

import java.util.Scanner;

public class Ex4 {
   
 static void mostrar(int a,int b){
 int mayor = 0, menor;
 // desconocemos el orden en el que vienen a y b.
 // Lo que haremos es poner los valores correctos en mayor, menor.
 if(a>b){ // a es el mayor. Se podría utilizar la función maximo()implementada anteriormente.
 mayor=a;
 menor=b;
 }
 else{ // en este caso b será el mayor mayor=b;
 menor=a;
 mayor=b;
 }
 for (int i=menor;i<mayor+1;i++)// si tenemos que incluir el minimo quitaremos el +1 y agregaremos +1 al mayor
 System.out.print(i+" ");
 System.out.println();
 }
 public static void main(String[] args) { 
 int a,b;
 System.out.print("Introduzca primer numero: ");
 Scanner Entrada = new Scanner(System.in);
 a=Entrada.nextInt();
 System.out.print("Introduzca segundo numero: ");
 b=Entrada.nextInt();
 mostrar(a,b);
 }
}