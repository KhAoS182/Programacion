/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian_garcia_trias;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public abstract class Animal {
    private int peso;//mis dudas de si utilizo una variable int como id para contador
    private String nombre;
    private int id = 0;

    public Animal() {
    }

    public Animal(int id, int peso, String nombre) {
	this.id = id++;
	this.peso = peso;
	this.nombre = nombre;
    }

   
     public Animal(Animal a) {
	this.id = a.id;
	this.peso = a.peso;
	this.nombre = a.nombre;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id++;
    }

    public int getPeso() {
	return peso;
    }

    public void setPeso(int peso) {
	Scanner sc = new Scanner(System.in);
	this.peso = peso;//porque es necesario esto, sino el bucle me salta si o si?
	while(this.peso<=0){
	    System.out.println("Introduce un peso valido: ");
	    this.peso = sc.nextInt();
	}
	this.peso = peso;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    public void mostrarAnimal(){
	System.out.println("Id: " + this.id);
	System.out.println("Nombre: "+ this.nombre);
	System.out.println("Peso: "+ this.peso);
    }
    public void altaAnimal(){
	Scanner sc = new Scanner(System.in);
	//aqui deberia ir la id incremetal pero no se como hacerla
	
	System.out.println("Nombre: ");
	this.setNombre(sc.nextLine());
	System.out.println("Peso: ");
	this.setPeso(sc.nextInt());// se que todos deberian pasar los los setters, no he tenido tiempo de cambiarlos
    }
    public int ordenarAvesVuelo(int x){
       return x;
    }
    public int ordenarAvesAlas(int x){
       return x;
    }
    abstract void mostrarContador();
    public abstract int  ordenarAvesVuelo();
}
