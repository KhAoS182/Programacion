/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03;

/**
 *
 * @author Adrian
 */
public class Cuenta {
    private String cliente;
    private String numcuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
    }
    
    public Cuenta(String cliente, String numcuenta, double interes, double saldo) {
	this.cliente = cliente;
	this.numcuenta = numcuenta;
	this.interes = interes;
	this.saldo = saldo;
    }
    
     public Cuenta(Cuenta cuenta) {
	this.cliente = cuenta.cliente;
	this.numcuenta = cuenta.numcuenta;
	this.interes = cuenta.interes;
	this.saldo = cuenta.saldo;
    }

    public String getCliente() {
	return cliente;
    }

    public void setCliente(String cliente) {
	this.cliente = cliente;
    }

    public String getNumcuenta() {
	return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
	this.numcuenta = numcuenta;
    }

    public double getInteres() {
	return interes;
    }

    public void setInteres(double interes) {
	this.interes = interes;
    }

    public double getSaldo() {
	return saldo;
    }

    public void setSaldo(double saldo) {
	this.saldo = saldo;
    }
     //METODOS
    public void imprimir() {
        System.out.print(getCliente()+", ");
        System.out.print(getNumcuenta()+", ");
        System.out.print(getInteres()+", ");
        System.out.print(getSaldo());
    }
    
    public boolean ingreso(Cuenta c1, double ingresar) {
        if(ingresar > 0){
            c1.setSaldo(c1.getSaldo()+ingresar);
            System.out.println("Ingreso realizado con éxito.");
        } else {
            System.out.println("No se dispone de la cantidad indicada.");
        }
        return ingresar > 0;
    }
    
    public boolean reintegro(Cuenta c1, double sacar) {
	boolean comprobar = false;
        if (sacar > 0 && sacar <= getSaldo()){
            setSaldo(c1.getSaldo()-sacar);
            System.out.println("Reintegro realizado con éxito.");
        } else {
            System.out.println("No se dispone de la cantidad indicada.");
        }
        return comprobar;
    }
    
    public void realizarTranferencia(Cuenta c1, Cuenta c2,
        double cantidad) {
        System.out.println("Antes de la transferencia tenías "
                    +c1.getSaldo());
        if(cantidad < c1.getSaldo() && cantidad > 0){
            c1.setSaldo(c1.getSaldo()-cantidad);
            c2.setSaldo(c2.getSaldo()+cantidad);
            System.out.println("Transferencia realizada con éxito.");
            System.out.println("Tu saldo ahora es: "+c1.getSaldo());
        } else {
            System.out.println("No se dispone de la cantidad indicada.");
        }
    }
}
