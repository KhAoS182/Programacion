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
    int id, potencia;
    String matricula, modelo;
    protected static int ultimo_id = 1;

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
    public void mostrarAtributos(){
	System.out.println(id);
	System.out.println("Matricula :"+ matricula );
	System.out.println("Modelo :"+ modelo);
	System.out.println("Potencia :"+ potencia);
    }
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        this.id = ultimo_id++;
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
