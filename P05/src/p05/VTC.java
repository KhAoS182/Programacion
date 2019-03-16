/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class VTC extends Vehiculo{
    private int maximo_horas_trabajadas;
    private int radiokm;
    private String ciudad;

    public VTC() {
    }

    public VTC(int maximo_horas_trabajadas, int radiokm, String ciudad, int potencia, String matricula, String modelo) {
	super(potencia, matricula, modelo);
	this.maximo_horas_trabajadas = maximo_horas_trabajadas;
	this.radiokm = radiokm;
	this.ciudad = ciudad;
    }

    public VTC(int maximo_horas_trabajadas, int radiokm, String ciudad) {
	this.maximo_horas_trabajadas = maximo_horas_trabajadas;
	this.radiokm = radiokm;
	this.ciudad = ciudad;
    }



    public int getMaximo_horas_trabajadas() {
	return maximo_horas_trabajadas;
    }

    public void setMaximo_horas_trabajadas(int maximo_horas_trabajadas) {
	while(maximo_horas_trabajadas>24 || maximo_horas_trabajadas<0){
	    System.out.println("Debe tener un mínimo de 0 y un maximo de 24");
	    maximo_horas_trabajadas = sc.nextInt();
	}
	this.maximo_horas_trabajadas = maximo_horas_trabajadas;
    }

    public int getRadiokm() {
	return radiokm;
    }

    public void setRadiokm(int radiokm) {
	while(radiokm>50 || radiokm<0){
	    System.out.println("El radio mínimo es de 0, y el máximo es de 50");
	    radiokm = sc.nextInt();
	}
	this.radiokm = radiokm;
    }

    public String getCiudad() {
	return ciudad;
    }

    public void setCiudad(String ciudad) {
	this.ciudad = capitalize(ciudad);
    }
    @Override
     public void mostrarAtributos(){
	System.out.print ("-------VTC------");
	super.mostrarAtributos();
	System.out.println("Máximo de horas trabajadas: "+ maximo_horas_trabajadas);
	System.out.println("Radio de km :"+ radiokm);
	System.out.println("Ciudad: "+ ciudad);
	System.out.println();
	
    }
    @Override
        public void pedirAlta(){
	Scanner sc = new Scanner(System.in);
	super.pedirAlta();
	System.out.println("Ciudad: ");
	this.setCiudad(sc.nextLine());
	System.out.println("Introduce numº de horas: ");
	this.setMaximo_horas_trabajadas(sc.nextInt());
	System.out.println("Introduce radio de acción (km)");
	this.setRadiokm(sc.nextInt());
    }
}
