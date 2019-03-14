/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class P05P2 {

    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	//para pruebas
	listaVehiculos.add(new Taxi(22, 32, true, 0, 120, "434233", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 1, 120, "434233", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 2, 120, "434233", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 3, 120, "434233", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 4, 120, "434233", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 5, 120, "434233", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 6, 120, "434233", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 7, 120, "434233", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 8, 120, "434233", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 9, 120, "434233", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 10, 120, "434233", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 11, 120, "434233", "nissan"));

	menu(listaVehiculos);

    }

    static void menu(ArrayList<Vehiculo> lista) {
	Scanner sc = new Scanner(System.in);
	boolean salir = false;
	while (salir == false) {
	    System.out.println("══════════════════════");
	    System.out.println("║              MENÚ               ║");
	    System.out.println("══════════════════════");
	    System.out.println("║1) Alta taxis                    ║");
	    System.out.println("║2) Alta VTC                      ║");
	    System.out.println("║3) Alta Autobuses                ║");
	    System.out.println("║4) Buscar vehículo por id        ║");
	    System.out.println("║5) Buscar vehículo por matrícula ║");
	    System.out.println("║6) Buscar primer taxi libre      ║");
	    System.out.println("║7) Buscar taxi concreto por id   ║");
	    System.out.println("║8) Mostrar todos los vehículos   ║");
	    System.out.println("║9) Salir                         ║");
	    System.out.println("══════════════════════");
	    int opcion = sc.nextInt();
	    sc.nextLine();
	    switch (opcion) {
		case 1:
		    Taxi t1 = new Taxi();
		    t1.pedirAlta();
		    lista.add(t1);
		    break;
		case 2:
		    VTC v1 = new VTC();
		    v1.pedirAlta();
		    lista.add(v1);
		    break;
		case 3:
		    Autobus a1 = new Autobus();
		    a1.pedirAlta();
		    lista.add(a1);

		    break;
		case 4:
		    switch (buscarId()) {
			case 1:
			    buscarIdTaxi();
			    break;
			case 2:
			    buscarIdAutobus();
			    break;
			case 3:
			    buscarIdVTC();
			    break;
			case 4:
			    break;
			default:
			    System.out.println("Introduce una opción valida!");;
		    }
		    break;
		case 5:

		    break;
		case 6:

		    break;
		case 7:

		    break;
		case 8:
		    for (int i = 0; i < lista.size(); i++) {
			lista.get(i).mostrarAtributos();
		    }
		    break;
		case 9:
		    salir = true;
		    break;
		default:
		    System.out.println("La opción introducida no es válida.");
		    break;
	    }
	}
    }

    private static int buscarId() {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Que Vehiculo deseas buscar?");
	System.out.println("1) Taxi");
	System.out.println("2) Autobús");
	System.out.println("3) VTC");
	System.out.println("4) Salir.");
	return sc.nextInt();
    }
    private static void buscarIdVehiculo(){//La idea es sacar una array con cada tipo de vehiculo para cada metodo de buscar id.
	
    }
    private static void buscarIdTaxi() {//Nos dice las id's de taxis. Podriamos utilizar una lista de taxis quizas.
	Scanner sc = new Scanner(System.in);
	int taxis = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Taxi) {
		taxis++;
	    }
	}
	int[] taxiIds = new int[taxis];
	int j =0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Taxi) {
		taxiIds[j]= i;
			j++;
	    }
	    
	}
	boolean idvalida = false, salir = false;
	while(idvalida == false && salir==false){
	System.out.print("Dime la id del taxi ('s') para salir");
	System.out.print(" (");
	for (int i = 0; i < taxiIds.length; i++) {
	    if(i+1<taxiIds.length)
	    System.out.print(taxiIds[i]+",");
	    else
	    System.out.print(taxiIds[i]+")");
	}
	System.out.println();
	int taxi = 0;
	String opcion = "z";
	try{
	taxi = sc.nextInt();
	}
	catch (Exception e){
	  opcion =sc.next().toLowerCase();
	  if(opcion.equals("s"))
	      break;
	  idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	}
	for (int i = 0; i < taxiIds.length && idvalida==false; i++) {
	    if(taxiIds[i] == taxi){
		listaVehiculos.get(taxi).mostrarAtributos();
		idvalida = true;
	    }
	}
	if(idvalida==false){
	    System.out.println("No hay ningun taxi con esa id! Introduce una id válida");
	}
	    System.out.println("Deseas salir?");
	    if(opcion.equals("s"))
		salir = true;
	    else
		idvalida = false;
	    }	    
    }
   private static void buscarIdAutobus(){
	Scanner sc = new Scanner(System.in);
	int autobuses = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Autobus) {
		autobuses++;
	    }
	}
	int[] autobusesIds = new int[autobuses];
	int j =0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Autobus) {
		autobusesIds[j]= i;
			j++;
	    }
	    
	}
	boolean idvalida = false, salir = false;
	while(idvalida == false && salir==false){
	System.out.print("Dime la id del taxi ('s') para salir");
	System.out.print(" (");
	for (int i = 0; i < autobusesIds.length; i++) {
	    if(i+1<autobusesIds.length)
	    System.out.print(autobusesIds[i]+",");
	    else
	    System.out.print(autobusesIds[i]+")");
	}
	System.out.println();
	int taxi = 0;
	String opcion = "z";
	try{
	taxi = sc.nextInt();
	}
	catch (Exception e){
	  opcion =sc.next().toLowerCase();
	  if(opcion.equals("s"))
	      break;
	  idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	}
	for (int i = 0; i < autobusesIds.length && idvalida==false; i++) {
	    if(autobusesIds[i] == taxi){
		listaVehiculos.get(taxi).mostrarAtributos();
		idvalida = true;
	    }
	}
	if(idvalida==false){
	    System.out.println("No hay ningun taxi con esa id! Introduce una id válida");
	}
	    System.out.println("Deseas salir?");
	    if(opcion.equals("s"))
		salir = true;
	    else
		idvalida = false;
	    }
    }
   private static void buscarIdVTC(){
       Scanner sc = new Scanner(System.in);
	int VTCs = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof VTC) {
		VTCs++;
	    }
	}
	int[] VTCsIds = new int[VTCs];
	int j =0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof VTC) {
		VTCsIds[j]= i;
			j++;
	    }
	    
	}
	boolean idvalida = false, salir = false;
	while(idvalida == false && salir==false){
	System.out.print("Dime la id del taxi ('s') para salir");
	System.out.print(" (");
	for (int i = 0; i < VTCsIds.length; i++) {
	    if(i+1<VTCsIds.length)
	    System.out.print(VTCsIds[i]+",");
	    else
	    System.out.print(VTCsIds[i]+")");
	}
	System.out.println();
	int taxi = 0;
	String opcion = "z";
	try{
	taxi = sc.nextInt();
	}
	catch (Exception e){
	  opcion =sc.next().toLowerCase();
	  if(opcion.equals("s"))
	      break;
	  idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	}
	for (int i = 0; i < VTCsIds.length && idvalida==false; i++) {
	    if(VTCsIds[i] == taxi){
		listaVehiculos.get(taxi).mostrarAtributos();
		idvalida = true;
	    }
	}
	if(idvalida==false){
	    System.out.println("No hay ningun taxi con esa id! Introduce una id válida");
	}
	    System.out.println("Deseas salir?");
	    if(opcion.equals("s"))
		salir = true;
	    else
		idvalida = false;
	    }
    }
}
