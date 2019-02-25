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
public class cajero_automatico {
    int id_cajero_ult, id_cajero;
    static int[][] billetes;
    String [] targeta = new String [100];

    public cajero_automatico() {
    }

    public cajero_automatico(int id_cajero_ult, int id_cajero) {
	this.id_cajero_ult = id_cajero_ult;
	this.id_cajero = id_cajero;
    }

    public int getId_cajero_ult() {
	return id_cajero_ult;
    }

    public void setId_cajero_ult(int id_cajero_ult) {
	this.id_cajero_ult = id_cajero_ult;
    }

    public int getId_cajero() {
	return id_cajero;
    }

    public void setId_cajero(int id_cajero) {
	this.id_cajero = id_cajero;
    }

    public int[][] getBilletes() {
	return billetes;
    }

    public void setBilletes(int[][] billetes) {
	this.billetes = billetes;
    }

    public String[] getTargeta() {
	return targeta;
    }

    public void setTargeta(String[] targeta) {
	this.targeta = targeta;
    }
    public static void mostrar_cajero (){
	for (int x = 0; x < (billetes.length/2)-1; x++) {
	    for (int y = 0; y < billetes[x].length; y++) {
		System.out.println(billetes[x][y] + " " + billetes[billetes.length-x][y]);
	    }
}
	    
	}
 
}
