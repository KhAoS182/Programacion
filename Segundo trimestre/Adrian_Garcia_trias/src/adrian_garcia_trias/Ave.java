/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian_garcia_trias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Ave extends Animal {

    int aves;
    int alas;
    protected int longitud_vuelo;

    public Ave() {
    }

    public Ave(int animales, int peso, String nombre) {
	super(animales, peso, nombre);
    }

    public Ave(int aves, int alas, int longitud_vuelo) {
	this.aves = aves;
	this.alas = alas;
	this.longitud_vuelo = longitud_vuelo;
    }
    public Ave(Ave av) {//av porque ya tenemos un constractor copia con a, quizas puede dar a algunas dudas confusiones
	this.aves = av.aves;
	this.alas = av.alas;
	this.longitud_vuelo = av.longitud_vuelo;
    }

    public int getAves() {
	return aves;
    }

    public void setAves(int aves) {
	this.aves = aves;
    }

    public int getAlas() {
	return alas;
    }

    public void setAlas(int alas) {
	this.alas = alas;
    }

    public int getLongitud_vuelo() {
	return longitud_vuelo;
    }

    public void setLongitud_vuelo(int longitud_vuelo) {
	this.longitud_vuelo = longitud_vuelo;
    }
    @Override
    public void mostrarAnimal(){
	System.out.println("-------Ave------");
	super.mostrarAnimal();
	System.out.println("Alas: " + this.alas);
	System.out.println("Longitud de vuelo: " + this.longitud_vuelo);
    }
    public void altaAve(){
	super.altaAnimal();
	Scanner sc = new Scanner(System.in);
	System.out.println("Longitud de vuelo: ");
	this.setLongitud_vuelo(sc.nextInt());
	System.out.println("Numero de alas: ");
	this.setAlas(sc.nextInt());
	

    }
    public int ordenarAvesAlas(int x){
       System.out.println(""+ this.longitud_vuelo);
       x = this.longitud_vuelo;
       return x;
    }
    public int ordenarAltura(int x){
       System.out.println(""+ this.alas);
       x = this.longitud_vuelo;
       return x;
    }
    @Override
    void mostrarContador() {
	
    }
    public int   dameLongitud (){
	int x = 0;
	x = this.longitud_vuelo;
	return x;
	
    }

    @Override
    public int ordenarAvesVuelo() {
	int x = this.longitud_vuelo;
	return x;
    }
}
