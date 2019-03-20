/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_examen_prog;

/**
 *
 * @author Adrian
 */
public abstract class targeta {
    private String NIF, nombre, apellido;
    int PIN;

    public targeta() {
    }

    public targeta(String NIF, String nombre, String apellido, int PIN) {
	this.NIF = NIF;
	this.nombre = nombre;
	this.apellido = apellido;
	this.PIN = PIN;
    }
     public targeta(targeta t) {
	this.NIF = t.NIF;
	this.nombre = t.nombre;
	this.apellido = t.apellido;
	this.PIN = t.PIN;
    }

    public String getNIF() {
	return NIF;
    }

    public void setNIF(String NIF) {
	this.NIF = NIF;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public int getPIN() {
	return PIN;
    }

    public void setPIN(int PIN) {
	this.PIN = PIN;
    }
    protected void mostrarTargeta(){
	System.out.println("Nombre: " + this.nombre + " " + this.apellido);
	System.out.println("NIF: " + this.NIF);
    }
    abstract int getSaldoTotal();//hay que probarlo
    abstract void setSaldoTotal(int importe);
}
