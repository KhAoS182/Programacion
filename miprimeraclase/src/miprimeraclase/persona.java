/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraclase;

/**
 *
 * @author Adrian
 */
public class persona {
    //Varibles son privadas por defecto
    String nombre;
    String apelido;
    int edad;
    String nif;

    public persona(String nombre, String apelido, int edad, String nif) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.edad = edad;
        this.nif = nif;
    }
    
}
