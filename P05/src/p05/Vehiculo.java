/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public abstract class Vehiculo {
    Scanner sc = new Scanner(System.in);
    private int id, potencia;
    private String matricula, modelo;
    protected static int ultimo_id = 0; //lo utilizaremos para el autoincrement 

    public Vehiculo(int potencia, String matricula, String modelo) {
	this.id = ultimo_id++;
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
	while (potencia<0){
	    System.out.println("Debes introducir un numero mayor que 0");
	    potencia = sc.nextInt();
	}
	this.potencia = potencia;
    }

    public String getMatricula() {
	return matricula;
    }

    public void setMatricula(String matricula) {
	this.matricula = matricula.toUpperCase();
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = capitalize(modelo);
    }
    public void mostrarAtributos(){//utilizar operador this
	System.out.println(" ("+this.id+ ")");
	System.out.println("Matricula: "+ this.matricula );
	System.out.println("Modelo: "+ this.modelo);
	System.out.println("Potencia: "+ this.potencia);
    }
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        this.id = ultimo_id++;//auto increment id
        System.out.println("Introduce la matrícula: ");
        this.setMatricula(sc.nextLine());
        System.out.println("Introduce el modelo: ");
        this.setModelo(sc.nextLine());
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
    public static String capitalize(String s) {
        if (s.length() == 0) return s;       
	s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	return s;
    }
}
