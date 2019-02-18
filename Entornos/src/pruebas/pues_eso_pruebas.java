/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Adrian
 */
public class pues_eso_pruebas {
    public static void main(String[] args) {
	int  a= 60;
	int b = 0;
	for (int i=1;i<a;i++){ // al ser hasta i<num no tenemos en cuenta el propio num
	    if(i%2 == 0){ // si i divide a num
	    b++;
	    System.out.println(i);
	    }
    }
    } 
}
