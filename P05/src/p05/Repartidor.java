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
public class Repartidor extends Empleado {
    int horas_trabajadas;
    String zona;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
	super(nombre, apellido1, apellido2, nif, edad, salario);
    }

    public Repartidor(Empleado a) {
	super(a);
    }

    public Repartidor(int horas_trabajadas, String zona) {
	this.horas_trabajadas = horas_trabajadas;
	this.zona = zona;
    }

    public int getHoras_trabajadas() {
	return horas_trabajadas;
    }

    @Override
    public void setHoras_trabajadas(int horas_trabajadas) {
	this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public String getZona() {
	return zona;
    }
    @Override
    public void setZona(String zona) {
	this.zona = zona;
    }
    @Override
    public void mostrarAtributos (){
	System.out.println("Nombre: " +nombre+" " + apellido1+ " " + apellido2 +"\nNIF: "+ nif+ "\nEdad: " + edad+ "\nSalario: " + salario + "\nHoras realizadas: " + horas_trabajadas + "\nZona: "+ zona);
    }
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
	System.out.print("Zona: ");
	zona = sc.nextLine();
	horas_trabajadas = 0;
	
	
	
    }

    @Override
    public int getVentas_realizadas() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVentas_realizadas(int i) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getComision() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setComision(float f) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHoras_trabajadas(int i) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
