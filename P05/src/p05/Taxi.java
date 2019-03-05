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
    int licencia, num_Taxista_Licencia;
    boolean estado;

    public Taxi() {
    }

    public Taxi(int licencia, int num_Taxista_Licencia, boolean estado, int id, int potencia, String matricula, String modelo) {
	super(id, potencia, matricula, modelo);
	this.licencia = licencia;
	this.num_Taxista_Licencia = num_Taxista_Licencia;
	this.estado = estado;
    }

    public Taxi(int licencia, int num_Taxista_Licencia, boolean estado) {
	this.licencia = licencia;
	this.num_Taxista_Licencia = num_Taxista_Licencia;
	this.estado = estado;
    }

    

    public int getLicencia() {
	return licencia;
    }

    public void setLicencia(int licencia) {
	this.licencia = licencia;
    }

    public int getNum_Taxista_Licencia() {
	return num_Taxista_Licencia;
    }

    public void setNum_Taxista_Licencia(int num_Taxista_Licencia) {
	this.num_Taxista_Licencia = num_Taxista_Licencia;
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }
    @Override
    public void mostrarAtributos(){
	System.out.print ("Taxi ");
	super.mostrarAtributos();
	System.out.println("Numero de taxista :"+ num_Taxista_Licencia);
	System.out.println("Estado: "+ estado);
	
    }
    @Override
    public void pedirAlta(){
	Scanner sc = new Scanner(System.in);
	super.pedirAlta();
	System.out.println("nº de Licencia: ");
	this.setNum_Taxista_Licencia(sc.nextInt());
	System.out.println("Estado: Disponible ");
	this.setEstado(true);
    }
}
