/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04;

import java.util.ArrayList;
import java.util.Scanner;
import static p04.P04.listaPeliculas;
import static p04.P04.listarPeliculas;//hace falta???
import static p04.P04.readString;

/**
 *
 * @author Adrian
 */
public class Pelicula {
    String titulo;
    String director;
    int duracion;
    String genero;
    int año;
    boolean disponibilidad;
    int cantidad_copias;
    int reservas;

    public Pelicula() {
	
    }
    public Pelicula(String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int cantidad_copias, int reservas) {
	
	this.titulo = titulo;
	this.director = director;
	this.duracion = duracion;
	this.genero = genero;
	this.año = año;
	this.disponibilidad = disponibilidad;
	this.cantidad_copias = cantidad_copias;
	this.reservas = reservas;
    }

public Pelicula(Pelicula a) {

	this.titulo = a.titulo;
	this.director = a.director;
	this.duracion = a.duracion;
	this.genero = a.genero;
	this.año = a.año;
	this.disponibilidad = a.disponibilidad;
	this.cantidad_copias = a.cantidad_copias;
	this.reservas = a.reservas;
    }
     public static String capitalize(String s) {
        if (s.length() == 0) return s;       
	s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	return s;
    }
    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = capitalize(titulo);
    }

    public String getDirector() {
	return director;
    }

    public void setDirector(String director) {
	this.director = director;
    }

    public int getDuracion() {
	return duracion;
    }

    public void setDuracion(int duracion) {
	this.duracion = duracion;
    }

    public String getGenero() {
	return genero;
    }

    public void setGenero(String genero) {
	this.genero = genero.toUpperCase();
    }

    public int getAño() {
	return año;
    }

    public void setAño(int año) {
	this.año = año;
    }

    public boolean isDisponibilidad() {
	return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
	this.disponibilidad = disponibilidad;
    }

    public int getCantidad_copias() {
	return cantidad_copias;
    }

    public void setCantidad_copias(int cantidad_copias) {
	    if(this.cantidad_copias>3000){
		System.out.println("Ya no podemos almacenar mas peliculas");
	    }
	    else
		this.cantidad_copias = cantidad_copias;    
    }

    public int getReservas() {
	return reservas;
    }

    public void setReservas(int reservas) {
	if (this.reservas>this.cantidad_copias){
	    System.out.println("Mas reservas que copias? so tryhard bro");
	}
	else
	    this.reservas= reservas;
    }
       /* public void incrementarReservas() {// Creo que complica la cosa
	if (this.reservas>this.cantidad_copias){
	    System.out.println("Mas reservas que copias? so tryhard bro");
	}
	else
	    this.reservas++;
    }*/
     public static void añadirPelicula(ArrayList<Pelicula> pepe) {// para que requiere nombre?
	 
	Scanner sc = new Scanner(System.in);
	Pelicula p1 = new Pelicula();
	System.out.println("Titulo de la pelicula:");
	p1.setTitulo(readString());
	System.out.println("Director:");
	p1.setDirector(readString());
	System.out.println("Duracion:");
	p1.setDuracion(sc.nextInt());
	System.out.println("Genero:");
	p1.setGenero(readString());
	System.out.println("Año:");
	p1.setAño(sc.nextInt());
	p1.setDisponibilidad(true);//digo yo que si ingresas un pelicula es porque si hay esa pelicula no?
	System.out.println("Cantidad de copias(máximo 3000):");
	p1.setCantidad_copias(sc.nextInt());
	System.out.println("Reservas:");
	p1.setReservas(sc.nextInt());
	if (p1.getCantidad_copias()> 3000){
	    System.out.println("No podemos guardar mas de 3000 copias, no hemos podido ingresar la pelicula");
	}
	else
	    pepe.add(p1);
    }
    static public  void reservarPelicula() {
	Scanner sc = new Scanner(System.in);
	int id;
	int reserva  =0;
	listarPeliculas();
	System.out.println("Que pelicula quieres reservas?");
	id = sc.nextInt();
	System.out.println("Numero de reservas: ");
	reserva = sc.nextInt();
	if (listaPeliculas.get(id).disponibilidad == true && listaPeliculas.get(id).cantidad_copias+reserva>listaPeliculas.get(id).reservas){
	    System.out.println("Se ha reservado la pelicula: " + listaPeliculas.get(id).titulo);
	    listaPeliculas.get(id).reservas=+reserva;
	}
	else{
	    System.out.println("No tenemos tantes copias de la pelicula, disculpe las molestias");
	}
	
    }
    public static void buscarPelicula(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Que deseas buscar:");
	System.out.println("1. Titulo");
	System.out.println("2. Director");
	System.out.println("3. Genero");
	System.out.println("4. Duración");
	System.out.println("5. Año");
	int opcion = sc.nextInt();
	switch (opcion) {
	    case 1:
		System.out.println("Introduce titulo");
		String titulo = sc.nextLine();
		titulo = sc.nextLine();
		for (int i = 0; i<listaPeliculas.size();i++)
		{
		    if (listaPeliculas.get(i).titulo.contains(titulo))
		    {
			System.out.println("--------------------------------------");
			System.out.println("Id: "+i);
			System.out.println("Titulo: "+listaPeliculas.get(i).titulo);
			System.out.println("Director: "+listaPeliculas.get(i).director);
			System.out.println("Duración: "+listaPeliculas.get(i).duracion);
			System.out.println("Género: "+listaPeliculas.get(i).genero);
			System.out.println("Año: "+listaPeliculas.get(i).titulo);
			System.out.println("--------------------------------------");
		    }
		}
		break;
	    default:
		throw new AssertionError();
	}
    }

}

