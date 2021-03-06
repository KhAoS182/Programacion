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
public abstract class Empleado {
    private String nombre, apellido1, apellido2, nif;
    private int edad;
    private float salario;//f
    
    /*public abstract int getVentas_realizadas();
    public abstract void setVentas_realizadas(int i);
    public abstract float getComision();
    public abstract void setComision(float f);
    public abstract void setHoras_trabajadas(int i);
    public abstract int getHoras_trabajadas(int i);
    public abstract String getZona();
    public abstract void setZona(String z);*/
    
    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.nif = nif;
	this.edad = edad;
	this.salario = salario;
    }
    public Empleado(Empleado a) {
	this.nombre = a.nombre;
	this.apellido1 = a.apellido1;
	this.apellido2 = a.apellido2;
	this.nif = a.nif;
	this.edad = a.edad;
	this.salario = a.salario;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = capitalize(nombre);
    }

    public String getApellido1() {
	return apellido1;
    }

    public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
    }

    public String getApellido2() {
	return apellido2;
    }

    public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
    }

    public String getNif() {
	return nif;
    }

    public void setNif(String nif) {
	this.nif = nif.toUpperCase();
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public float getSalario() {
	return salario;
    }

    public void setSalario(float salario) {
	this.salario = salario;
    }
    public void mostrarAtributos(){//faltan getters
	System.out.println("Nombre: " +nombre+" " + apellido1+ " " + apellido2 +"\nNIF: "+ nif+ "\nEdad: " + edad+ "\nSalario: " + salario);
    }
    public void pedirAlta(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Nombre: ");
	setNombre(sc.nextLine());
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
    }
    public String capitalize(String s) {
        if (s.length() == 0) return s;       
	s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	return s;
    }
}
