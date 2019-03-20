/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Autobus extends Vehiculo {
    private int plazas;
    private int  paradas;//se supone?

    public Autobus() {
    }

    public Autobus(int plazas, int paradas, int potencia, String matricula, String modelo) {
	super(potencia, matricula, modelo);
	this.plazas = plazas;
	this.paradas = paradas;
    }

    public Autobus(int plazas, int paradas) {
	this.plazas = plazas;
	this.paradas = paradas;
    }

   

    public int getPlazas() {
	return plazas;
    }

    public void setPlazas(int plazas) {
	this.plazas = plazas;
    }

    public int getParadas() {
	return paradas;
    }

    public void setParadas(int paradas) {
	while(paradas<3 || paradas>20){
	    if(paradas<3)
	    System.out.println("Lo sentimos, los autobuses deben tener un mínimo de 3 paradas.");
	    else
		System.out.println("Los autobuses no pueden tener mas de 20 paradas.");
	    paradas = sc.nextInt();
	}
	this.paradas = paradas;
    }
    @Override
    public void mostrarAtributos(){
	System.out.print ("-----Autobus----");
	super.mostrarAtributos();
	System.out.println("Plazas: "+ plazas);
	System.out.println("Paradas: "+ paradas);
	System.out.println();
    }
    @Override
    public void pedirAlta(){
	Scanner sc = new Scanner(System.in);
	super.pedirAlta();
	System.out.println("nº de plazas: ");
	this.setPlazas(sc.nextInt());
	System.out.println("nº de paradas: ");
	this.setParadas(sc.nextInt());
    }
}
