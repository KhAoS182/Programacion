/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_examen_prog;

/**
 *
 * @author Adrian
 */
public class Prueba_Examen_prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[][] carga_billetes = {{500, 10}, {200, 0}, {100, 0}, {50, 27},
        {20, 0}, {10, 18}, {5, 25}};
	cajero_automatico micajero = new cajero_automatico();
	micajero.setBilletes(carga_billetes);
	
    }
    
}
