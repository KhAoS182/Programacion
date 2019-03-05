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
public class targeta_credit extends targeta {
    int saldo, credito;

    public targeta_credit() {
    }

    public targeta_credit(String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
    }

    public targeta_credit(int saldo_disponible, int credito_disponible) {
	this.saldo = saldo_disponible;
	this.credito = credito_disponible;
    }

    public targeta_credit(int saldo_disponible, int credito_disponible, String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
	this.saldo = saldo_disponible;
	this.credito = credito_disponible;
    }

    public int getSaldo() {
	return saldo;
    }

    public void setSaldo(int saldo) {
	this.saldo = saldo;
    }

    public int getCredito() {
	return credito;
    }

    public void setCredito(int credito) {
	this.credito = credito;
    }
    @Override
    protected void mostrarTargeta(){
	super.mostrarTargeta();
	System.out.println("Targeta de credito:");
	System.out.println("Saldo: " + this.saldo);
	System.out.println("Credito: " + this.credito);
	System.out.println();
    }
    @Override
    public int getSaldoTotal() {
        return this.getSaldo() + this.getCredito();
    }

    @Override
    public void setSaldoTotal(int importe) {
        if (this.getCredito() - importe >= 0) {
            this.setCredito(this.getCredito()-importe);
        } else {
            importe -= this.getCredito();
            this.setCredito(0);
            this.setSaldo(this.getSaldo()-importe);
        }
    }
}
