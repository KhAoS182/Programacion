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
public class Taxi extends Vehiculo {
    static Scanner sc = new Scanner(System.in);
    private int licencia, nTaxistas;
    private boolean estado;
    private static int ult_licencia=1000;

    public Taxi() {
    }

    public Taxi(int nTaxistas,boolean estado,int potencia, String matricula, String modelo) {
	super(potencia, matricula, modelo);
	this.licencia = ult_licencia++;
	this.estado = estado;
	this.nTaxistas = nTaxistas;
    }

    public Taxi(boolean estado, int nTaxistas) {
	this.licencia = ult_licencia++;
	this.estado = estado;
	this.nTaxistas = nTaxistas;
    }

    public Taxi(Taxi t){
	super(t);
	this.licencia = t.ult_licencia++;
	this.estado = t.estado;
	this.nTaxistas = t.nTaxistas;
    }

    public int getLicencia() {
	return licencia;
    }

    public void setLicencia() {
	this.licencia = ult_licencia++;
    }

    public int getnTaxistas() {
	return nTaxistas;
    }

    public void setnTaxistas(int nTaxistas) {
	this.nTaxistas = nTaxistas;
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }
    @Override
    public void mostrarAtributos(){
	System.out.print ("------Taxi-----");
	super.mostrarAtributos();
	System.out.println("Numero de taxista: "+ this.nTaxistas);
	System.out.println("Estado: "+ (this.estado ? "Disponible" : "Ocupado"));
	System.out.println("Número de licéncia: " + this.licencia);
	System.out.println();
    }
    @Override
    public void pedirAlta(){
	super.pedirAlta();
	this.setLicencia();//Licencia automatica..
	System.out.println("Nª de taxista: ");//? que se pide exactamente???
	this.setnTaxistas(sc.nextInt());
	System.out.println("Estado: Disponible ");
	this.setEstado(true);
    }
}
