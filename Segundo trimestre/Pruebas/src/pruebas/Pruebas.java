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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int [] prueba = new int[5];
	pene(prueba);
	System.out.println(prueba[0]);
    }
    static void pene(int[] p1){
	p1 [0] = 3;
    }
}
