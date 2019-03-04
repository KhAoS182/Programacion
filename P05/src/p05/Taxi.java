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
public class Taxi extends Vehiculo {
    int Licencia, num_Taxista_Licencia;
    boolean estado;

    public Taxi(int id, int potencia, String matricula, String modelo) {
	super(id, potencia, matricula, modelo);
    }

    public Taxi() {
    }

    public int getLicencia() {
	return Licencia;
    }

    public void setLicencia(int Licencia) {
	this.Licencia = Licencia;
    }

    public int getNum_Taxista_Licencia() {
	return num_Taxista_Licencia;
    }

    public void setNum_Taxista_Licencia(int num_Taxista_Licencia) {
	this.num_Taxista_Licencia = num_Taxista_Licencia;
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }
    public void mostrarVehiculo(){
	System.out.println("Autobús " + id);
	System.out.println("Plazas :"+ matricula );
	System.out.println("Plazas :"+ modelo);
	System.out.println("Plazas :"+ potencia);
	System.out.println("Plazas :"+ Licencia);
	System.out.println("Paradas :"+ num_Taxista_Licencia);
	
    }
}
