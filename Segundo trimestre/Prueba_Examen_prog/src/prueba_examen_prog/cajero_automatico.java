/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_examen_prog;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class cajero_automatico {
    int id_cajero_ult, id_cajero, total;
    static int[][] billetes;
    ArrayList<targeta> lista_targeta = new ArrayList<>();

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
    public void mostrar_cajero (){
	System.out.println("Cajero: " + this.id_cajero);
        System.out.println("Carga de billetes:");
        for (int i = 0; i < this.billetes.length; i++) {
            System.out.println(this.billetes[i][1] + " billetes de " + this.billetes[i][0] + "€");
        }
        System.out.println("TOTAL: " + this.total);
        System.out.println("=================================");
 
}
}
