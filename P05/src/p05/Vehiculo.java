/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

import java.util.ArrayList;
import java.util.Scanner;
import static p05.P05P2.listaVehiculos;

/**
 *
 * @author Adrian
 */
public abstract class Vehiculo {
    private int id, potencia;
    private String matricula, modelo;
    protected static int ultimo_id = 1;

    public Vehiculo(int id, int potencia, String matricula, String modelo) {
	this.id = id;
	this.potencia = potencia;
	this.matricula = matricula;
	this.modelo = modelo;
    }
    public Vehiculo(Vehiculo v) {
	this.id = v.id;
	this.potencia = v.potencia;
	this.matricula = v.matricula;
	this.modelo = v.modelo;
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
    public void mostrarAtributos(){//utilizar operador this
	System.out.println(" ("+this.id+ ")");
	System.out.println("Matricula :"+ this.matricula );
	System.out.println("Modelo :"+ this.modelo);
	System.out.println("Potencia :"+ this.potencia);
    }
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        this.id = this.ultimo_id++;
        System.out.println("Introduce la matrícula: ");
        this.setMatricula(sc.next());
        System.out.println("Introduce el modelo: ");
        this.setModelo(sc.next());
        System.out.println("Introduce la potencia: ");
        this.setPotencia(sc.nextInt());
    }
    public static void buscarID(ArrayList<Vehiculo> lista){
	Scanner sc = new Scanner(System.in);
    System.out.println("Dime la id del vehiculo");
    int id = sc.nextInt();
    if (id>=0 && id<lista.size()){
	lista.get(id).mostrarAtributos();
    }
    else{
	System.out.println("No existe ningun vehiculo con esa id");
    }
}
}
