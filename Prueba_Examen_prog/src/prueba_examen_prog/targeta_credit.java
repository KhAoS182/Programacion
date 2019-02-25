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
    int saldo_disponible, credito_disponible;

    public targeta_credit() {
    }

    public targeta_credit(int saldo, int credito) {
	this.saldo_disponible = saldo;
	this.credito_disponible = credito;
    }

    public int getSaldo_disponible() {
	return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
	this.saldo_disponible = saldo_disponible;
    }

    public int getCredito_disponible() {
	return credito_disponible;
    }

    public void setCredito_disponible(int credito_disponible) {
	this.credito_disponible = credito_disponible;
    }
    
}
