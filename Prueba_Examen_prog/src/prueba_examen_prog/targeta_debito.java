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
    int saldo_disponible;

    public targeta_debito() {
    }

    public targeta_debito(String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
    }

    public targeta_debito(int saldo_disponible) {
	this.saldo_disponible = saldo_disponible;
    }

    public targeta_debito(int saldo_disponible, String NIF, String nombre, String apellido, int PIN) {
	super(NIF, nombre, apellido, PIN);
	this.saldo_disponible = saldo_disponible;
    }

    public int getSaldo_disponible() {
	return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
	this.saldo_disponible = saldo_disponible;
    }
}
