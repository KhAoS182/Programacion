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
public abstract class Vehiculo {
    int id, potencia;
    String matricula, modelo;

    public Vehiculo(int id, int potencia, String matricula, String modelo) {
	this.id = id;
	this.potencia = potencia;
	this.matricula = matricula;
	this.modelo = modelo;
    }

    public Vehiculo() {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getPotencia() {
	return potencia;
    }

    public void setPotencia(int potencia) {
	this.potencia = potencia;
    }

    public String getMatricula() {
	return matricula;
    }

    public void setMatricula(String matricula) {
	this.matricula = matricula;
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = modelo;
    }
}
