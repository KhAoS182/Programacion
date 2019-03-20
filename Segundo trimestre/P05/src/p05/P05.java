/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
public class P05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	//Empleado e1 = new Empleado("pepe", "garcia", "trias", "34fd", 30, 200.0f);//la f te salva la vida crack
	//e1.mostrarAtributos();
	//Comercial c1 = new Comercial();
	Scanner sc = new Scanner(System.in);
	boolean menu = true;
	int opcion=0;
	String templeado;
	while(menu==true){
	   System.out.println("   M	   E	   N	   U	");
	   System.out.println("==================================");
	   System.out.println("1. Opcion 1 - Mostrar Empleados");
           System.out.println("2. Opcion 2 - Dar de alta a un empleado");
           System.out.println("3. Opcion 3 - Lista de peliculas");
           System.out.println("4. Opcion 4 - Buscar peliculas");            
           System.out.println("5. Salir");
	   System.out.println("==================================");  
           System.out.println("Escribe una de las opciones");
	   opcion= sc.nextInt();
	   sc.nextLine();
	    switch (opcion) {
		case 1:	
			for (int i = 0; i < listaEmpleados.size(); i++) {
			    listaEmpleados.get(i).mostrarAtributos();
			}
		    break;
		case 2:
		    System.out.println("Que tipo de empleado quieres añadir?");
		    templeado = sc.nextLine();
		    templeado = templeado.toLowerCase();
		    if(templeado.equals("comercial")){
		     Comercial c1 = new Comercial();
		     c1.pedirAlta();
		     listaEmpleados.add(c1);			
		    }
		    else if(templeado.equals("repartidor")){
			Repartidor r1 = new Repartidor();
			r1.pedirAlta();
			listaEmpleados.add(r1);
		    }
		    else{
			System.out.println("Ha ocurrido algun error.");
		    }
		   /*Comercial c1 = new Comercial();
		    c1.pedirAlta();
		    listaEmpleados.add(c1);*/
		    break;
		    
		case 3:
		    
		    break;
		case 4:
		    
		    break;
		case 5:
		    menu=false;
		    break;
		default:
		    System.out.println("Te has equivocado colega");
		    //throw new AssertionError("error brutal");
		    break;
	    }
	}
	
    }
    
}
