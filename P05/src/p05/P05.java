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
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	ArrayList<Comercial> listaComerciales = new ArrayList<>();
	ArrayList<Repartidor> listaRepartidores = new ArrayList<>();
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
	   System.out.println("1. Opcion 1 - Mostrar Empleado");
           System.out.println("2. Opcion 2 - Dar de alta a un empleado");
           System.out.println("3. Opcion 3 - Lista de peliculas");
           System.out.println("4. Opcion 4 - Buscar peliculas");            
           System.out.println("5. Salir");
	   System.out.println("==================================");  
           System.out.println("Escribe una de las opciones");
	   opcion= sc.nextInt();
	    switch (opcion) {
		case 1:	
		    System.out.println("Que tipo de empleado quieres ver?");
		    templeado = sc.nextLine();
		    templeado = templeado.toLowerCase();
		    if(templeado.equals("comercial")){
			for (int i = 0; i < listaComerciales.size(); i++) {
			    System.out.println("Nombre: "+listaComerciales.get(i).nombre+" " + listaEmpleados.get(i).apellido1 +" "+ listaEmpleados.get(i).apellido2);
			    System.out.println("Edad: " + listaComerciales.get(i).edad);
			    System.out.println("Salario: " + listaComerciales.get(i).salario);
			    System.out.println("Salario: " + listaComerciales.get(i).ventas_realizadas);
			    System.out.println("Salario: " + listaComerciales.get(i).comision);
			}
		    }
		    else if(templeado.equals("repartidor")){
			for (int i = 0; i < listaRepartidores.size(); i++) {
			    System.out.println("Nombre: "+listaEmpleados.get(i).nombre+" " + listaEmpleados.get(i).apellido1 +" "+ listaEmpleados.get(i).apellido2);
			    System.out.println("Edad: " + listaEmpleados.get(i).edad);
			    System.out.println("Salario: " + listaEmpleados.get(i).salario);
			    System.out.println("Salario: " + listaEmpleados<Comercial>.);
			}
		    }
		    break;
		case 2:
		    System.out.println("Que tipo de empleado quieres añadir?");
		    templeado = sc.nextLine();
		    templeado = templeado.toLowerCase();
		    if(templeado.equals("comercial")){
			Empleado e1 = new Empleado();
			
		    }
		    else if(templeado.equals("repartidor")){
			Repartidor r1 = new Repartidor();
		    }
		    else{
			System.out.println("Ha ocurrido algun error.");
		    }
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
