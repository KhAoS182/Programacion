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

    public void setHoras_trabajadas(int horas_trabajadas) {
	this.horas_trabajadas = horas_trabajadas;
    }

    public String getZona() {
	return zona;
    }

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
	System.out.println("Apellido: ");
	apellido1 = sc.nextLine();
	System.out.println("Segundo Apellido: ");
	apellido2 = sc.nextLine();
	System.out.println("NIF: ");
	nif = sc.nextLine();
	System.out.println("Edad: ");
	edad = sc.nextInt();
	sc.next();
	System.out.println("Salario: ");
	salario = sc.nextInt();
	sc.next();
	System.out.println("Salario: ");
	zona = sc.nextLine();
	sc.next();
	horas_trabajadas = 0;
	
	
	
    }
}
