/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03;
import java.util.Scanner;
/**

* 
 *
 * @author Adrian
 */
public class P03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int opcion = 0;
	Cuenta c1 = new Cuenta("Adrian", "ES2000", 1.5, 5000);
	Cuenta c2 = new Cuenta("Jorjito", "ES2111", 0.5, 1000);
	while (opcion != 4) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("==========================");
	    System.out.println("=     M   E   N   Ú      =");
	    System.out.println("==========================");
	    System.out.println("1) Ingreso");
	    System.out.println("2) Reintegro");
	    System.out.println("3) Transferencia");
	    System.out.println("4) Salir");
	    System.out.print("¿Qué ejercicio quieres ver? ");
	    opcion = sc.nextInt();
	    sc.nextLine();
	    switch(opcion){
		case 1:
		    String seleccion="";
		    System.out.print("¿Que cantidad desea ingresar? ");
		    double importe = sc.nextDouble();	    
		    System.out.println("Desde que cuenta quieres ingresarlo?");		    
		    sc.nextLine();
		    seleccion = sc.nextLine();
		    if (seleccion.equals("c1") || seleccion.equals("cuenta1") || seleccion.equals("Adrian") || seleccion.equals("adrian")){
			c2.ingreso(c1, importe);
		    }
		    else if(seleccion.equals("c2") || seleccion.equals("cuenta2") || seleccion.equals("Jorjito") || seleccion.equals("jorjito")){
			c1.ingreso(c2, importe);
		    }
		    else{
			System.out.print("Cuenta no valida. operación cancelada. ");
		    }
		    break;
		case 2:
		    System.out.print("¿Qué cantidad desea retirar? ");
		    double sacar = sc.nextDouble();		    
		    c1.reintegro(c1, sacar);
		    break;
		case 3:
		    System.out.print("¿Qué cantidad desea transferir? ");
		    double cantidad = sc.nextDouble();
		    c1.realizarTranferencia(c1, c2, cantidad);
		    break;
		case 4:
		    break;
		default:
		    System.out.println("La opción que has introducido no "
			+ "es válida");
		    break;
	    }
	    System.out.println(c1.getSaldo()+ " Andres");//para saber que contiene cada uno
	    System.out.println(c2.getSaldo()+ " Carlos");
	}
    }
}
     
    
