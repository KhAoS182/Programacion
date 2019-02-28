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
public class Repartidor extends Empleado {
    int horas_trabajadas;
    String zona;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, float salario) {
	super(nombre, apellido1, apellido2, nif, edad, salario);
    }

    public Repartidor(int horas_trabajadas, String zona) {
	this.horas_trabajadas = horas_trabajadas;
	this.zona = zona;
    }
    public Repartidor(Repartidor a) {
	this.horas_trabajadas = a.horas_trabajadas;
	this.zona = a.zona;
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
    public void mostrarAtributos (){
	System.out.println(nombre + apellido1+ apellido2 + nif + edad + salario+
		horas_trabajadas+ zona);
    }
}
