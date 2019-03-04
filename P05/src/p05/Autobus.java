/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

/**
 *
 * @author Adrian
 */
public class Autobus extends Vehiculo {
    int plazas;
    int [] paradas;//se supone?

    public Autobus(int id, int potencia, String matricula, String modelo) {
	super(id, potencia, matricula, modelo);
    }

    public Autobus() {
    }

    public Autobus(int plazas, int[] paradas) {
	this.plazas = plazas;
	this.paradas = paradas;
    }

    public int getPlazas() {
	return plazas;
    }

    public void setPlazas(int plazas) {
	this.plazas = plazas;
    }

    public int[] getParadas() {
	return paradas;
    }

    public void setParadas(int[] paradas) {
	this.paradas = paradas;
    }
    public void mostrarVehiculo(){
	System.out.println("Autobús " + id);
	System.out.println("Plazas :"+ matricula );
	System.out.println("Plazas :"+ modelo);
	System.out.println("Plazas :"+ potencia);
	System.out.println("Plazas :"+ plazas);
	System.out.println("Paradas :"+ paradas);
    }
}
