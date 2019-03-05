/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_examen_prog;

/**
 *
 * @author Adrian
 */
public class targeta_debito extends targeta{
    int saldo;

    public targeta_debito() {
    }

    public targeta_debito(String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
    }

    public targeta_debito(int saldo_disponible) {
	this.saldo = saldo_disponible;
    }

    public targeta_debito(int saldo_disponible, String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
	this.saldo = saldo_disponible;
    }

    public int getSaldo() {
	return saldo;
    }

    public void setSaldo(int saldo) {
	this.saldo = saldo;
    }
        @Override
    public void mostrarTargeta() {
        super.mostrarTargeta();
        System.out.println("Tarjeta de Débito:");
        System.out.println("Saldo: " + this.saldo);
        System.out.println("=================================");
    }

    @Override
    int getSaldoTotal() {
        return this.getSaldo();
    }

    @Override
    public void setSaldoTotal(int importe) {
        this.setSaldo(this.getSaldo()-importe);
    }
}
