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
    int plazas;
    int  paradas;//se supone?

    public Autobus() {
    }

    public Autobus(int plazas, int paradas, int id, int potencia, String matricula, String modelo) {
	super(id, potencia, matricula, modelo);
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
	this.paradas = paradas;
    }
    @Override
    public void mostrarAtributos(){
	System.out.print ("Autobus ");
	super.mostrarAtributos();
	System.out.println("Plazas :"+ plazas);
	System.out.println("Paradas : "+ paradas);
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
