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
public class Comercial extends Empleado {
    int ventas_realizadas;
    float comision;

    public Comercial(Empleado a) {
	super(a);
    }

    public Comercial() {
    }

    public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
	super(nombre, apellido1, apellido2, nif, edad, salario);
    }

    public Comercial(int ventas_realizadas, float comision) {
	this.ventas_realizadas = ventas_realizadas;
	this.comision = comision;
    }
 
    public Comercial(Comercial a) {
	this.ventas_realizadas = a.ventas_realizadas;
	this.comision = a.comision;
    }

    @Override
    public int getVentas_realizadas() {
	return ventas_realizadas;
    }
    
    @Override
    public void setVentas_realizadas(int ventas_realizadas) {
	this.ventas_realizadas = ventas_realizadas;
    }

    @Override
    public float getComision() {
	return comision;
    }

    @Override
    public void setComision(float comision) {
	this.comision = comision;
    }
    @Override
    public void mostrarAtributos (){
	System.out.println("Nombre: " +nombre+" " + apellido1+ " " + apellido2 +"\nNIF: "+ nif+ "\nEdad: " + edad+ "\nSalario: " + salario + "\nVentas realizadas: " + ventas_realizadas + "\n Comision: "+ comision);
    }
    @Override
    public void pedirAlta(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Nombre: ");
	nombre = sc.nextLine();
	System.out.print("Apellido: ");
	apellido1 = sc.nextLine();
	System.out.print("Segundo Apellido: ");
	apellido2 = sc.nextLine();
	System.out.print("NIF: ");
	nif = sc.nextLine();
	System.out.print("Edad: ");
	edad = sc.nextInt();
	sc.nextLine();
	System.out.print("Salario: ");
	salario = sc.nextInt();
	sc.nextLine();
	System.out.print("Comision: ");
	comision = sc.nextFloat();
	sc.nextLine();
	ventas_realizadas = 0;
	
	
    }

    @Override
    public void setHoras_trabajadas(int i) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHoras_trabajadas(int i) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getZona() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setZona(String z) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
