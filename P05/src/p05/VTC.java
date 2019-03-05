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
public class VTC extends Vehiculo{
    int maximo_horas_trabajadas;
    int radiokm;
    String ciudad;

    public VTC() {
    }

    public VTC(int maximo_horas_trabajadas, int radiokm, String ciudad, int id, int potencia, String matricula, String modelo) {
	super(id, potencia, matricula, modelo);
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
	this.maximo_horas_trabajadas = maximo_horas_trabajadas;
    }

    public int getRadiokm() {
	return radiokm;
    }

    public void setRadiokm(int radiokm) {
	this.radiokm = radiokm;
    }

    public String getCiudad() {
	return ciudad;
    }

    public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
    }
    @Override
     public void mostrarAtributos(){
	 System.out.print("VTC ");
	super.mostrarAtributos();
	System.out.println("Máximo de horas trabajadas :"+ maximo_horas_trabajadas);
	System.out.println("Radio de km :"+ radiokm);
	System.out.println("Ciudad: "+ ciudad);
	
    }
}
