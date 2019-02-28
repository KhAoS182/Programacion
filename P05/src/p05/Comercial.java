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
public class Comercial extends Empleado {
    int ventas_realizadas;
    float comision;

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

    public int getVentas_realizadas() {
	return ventas_realizadas;
    }

    public void setVentas_realizadas(int ventas_realizadas) {
	this.ventas_realizadas = ventas_realizadas;
    }

    public float getComision() {
	return comision;
    }

    public void setComision(float comision) {
	this.comision = comision;
    }
    @Override
    public void mostrarAtributos (){
	System.out.println(nombre + apellido1+ apellido2 + nif + edad + salario +
		ventas_realizadas + comision);
    }
}
