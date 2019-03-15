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
	listaVehiculos.add(new Taxi(22, 32, true, 0, 120, "4342533z", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 1, 120, "43233l", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 2, 120, "434239p", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 3, 120, "41233ñ", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 4, 120, "33j", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 5, 120, "233k", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 6, 120, "43433i", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 7, 120, "493h", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 8, 120, "43903a", "nissan"));
	listaVehiculos.add(new Taxi(22, 32, true, 9, 120, "408633c", "nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma", 10, 120, "67443d", "nissan"));
	listaVehiculos.add(new Autobus(50, 25, 11, 120, "4356f", "nissan"));

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
		    switch (buscar()) {
			case 1:
			    buscarIdTaxi();
			    break;
			case 2:
			    buscarIdAutobus();
			    break;
			case 3:
			    buscarIdVTC();
			    break;
			case 4://salir
			    break;
			default:
			    System.out.println("Introduce una opción valida!");

		    }
		    break;
		case 5:
		    switch (buscar()) {
			case 1:
			    buscarMatriculaTaxi();
			    break;
			case 2:
			    buscarMatriculaAutobus();
			    break;
			case 3:
			    buscarMatriculaVTC();
			    break;
			case 4:
			    break;
			default:
			    System.out.println("Introduce una opción valida!");
		    }
		    break;
		case 6:
		    BuscarTaxiLibre();
		    break;
		case 7:
		    establecerDisponibilidadTaxi();
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

    private static int buscar() {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Que Vehiculo deseas buscar?");
	System.out.println("1) Taxi");
	System.out.println("2) Autobús");
	System.out.println("3) VTC");
	System.out.println("4) Salir.");
	return sc.nextInt();
    }

    private static int[] buscarIdVehiculo(String vehiculo) {//La idea es sacar una array con cada tipo de vehiculo para cada metodo de buscar id.
	int vehiculos = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i).getClass().getName().contains(vehiculo)) {
		vehiculos++;
	    }
	}
	int[] vehiculosIds = new int[vehiculos];
	int j = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i).getClass().getName().contains(vehiculo)) {
		vehiculosIds[j] = i;
		j++;
	    }
	}
	return vehiculosIds;
    }

    private static void buscarIdTaxi() {//Nos dice las id's de taxis. Podriamos utilizar una lista de taxis quizas.
	Scanner sc = new Scanner(System.in);
	int[] taxiIds = buscarIdVehiculo("Taxi");

	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del taxi ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < taxiIds.length; i++) {
		if (i + 1 < taxiIds.length) {
		    System.out.print(taxiIds[i] + ",");
		} else {
		    System.out.print(taxiIds[i] + ")");
		}
	    }
	    System.out.println();
	    int taxi = 0;
	    String opcion = "z";
	    try {
		taxi = sc.nextInt();
	    } catch (Exception e) {
		opcion = sc.next().toLowerCase();
		if (opcion.equals("s")) {
		    break;
		}
		idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	    }
	    for (int i = 0; i < taxiIds.length && idvalida == false; i++) {
		if (taxiIds[i] == taxi) {
		    listaVehiculos.get(taxi).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun taxi con esa id! Introduce una id válida");
	    }
	    System.out.println("Deseas salir?");
	    if (opcion.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void buscarIdAutobus() {
	Scanner sc = new Scanner(System.in);
	int[] autobusesIds = buscarIdVehiculo("Autobus");
	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del autobús ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < autobusesIds.length; i++) {
		if (i + 1 < autobusesIds.length) {
		    System.out.print(autobusesIds[i] + ",");
		} else {
		    System.out.print(autobusesIds[i] + ")");
		}
	    }
	    System.out.println();
	    int autobus = 0;
	    String opcion = "z";
	    try {
		autobus = sc.nextInt();
	    } catch (Exception e) {
		opcion = sc.next().toLowerCase();
		if (opcion.equals("s")) {
		    break;
		}
		idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	    }
	    for (int i = 0; i < autobusesIds.length && idvalida == false; i++) {
		if (autobusesIds[i] == autobus) {
		    listaVehiculos.get(autobus).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun Autobus con esa id! Introduce una id válida");
	    }
	    System.out.println("Deseas salir?");
	    if (opcion.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void buscarIdVTC() {
	Scanner sc = new Scanner(System.in);
	int[] VTCsIds = buscarIdVehiculo("VTC");
	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del VTC ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < VTCsIds.length; i++) {
		if (i + 1 < VTCsIds.length) {
		    System.out.print(VTCsIds[i] + ",");
		} else {
		    System.out.print(VTCsIds[i] + ")");
		}
	    }
	    System.out.println();
	    int VTC = 0;
	    String opcion = "z";
	    try {
		VTC = sc.nextInt();
	    } catch (Exception e) {
		opcion = sc.next().toLowerCase();
		if (opcion.equals("s")) {
		    break;
		}
		idvalida = true;//solo imprimira taxi o error en la id en ingresar una id.
	    }
	    for (int i = 0; i < VTCsIds.length && idvalida == false; i++) {
		if (VTCsIds[i] == VTC) {
		    listaVehiculos.get(VTC).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun VTC con esa id! Introduce una id válida");
	    }
	    System.out.println("Deseas salir?");
	    if (opcion.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void buscarMatriculaTaxi() {
	Scanner sc = new Scanner(System.in);
	int taxis = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Taxi) {
		taxis++;
	    }
	}
	String[] taxiMatriculas = new String[taxis];
	int j = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Taxi) {
		taxiMatriculas[j] = listaVehiculos.get(i).getMatricula();
		j++;
	    }

	}
	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del taxi ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < taxiMatriculas.length; i++) {
		if (i + 1 < taxiMatriculas.length) {
		    System.out.print(taxiMatriculas[i] + ",");
		} else {
		    System.out.print(taxiMatriculas[i] + ")");
		}
	    }
	    System.out.println();
	    String taxi = sc.nextLine();
	    if (taxi.equals("s")) {
		break;
	    }
	    for (int i = 0; i < taxiMatriculas.length && idvalida == false; i++) {
		if (taxiMatriculas[i].equals(taxi)) {
		    listaVehiculos.get(i).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun taxi con esa id! Introduce una id válida (s) para salir.");
	    }
	    if (taxi.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void buscarMatriculaAutobus() {
	Scanner sc = new Scanner(System.in);
	int Autobuses = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Autobus) {
		Autobuses++;
	    }
	}
	String[] AutobusMatriculas = new String[Autobuses];
	int j = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Autobus) {
		AutobusMatriculas[j] = listaVehiculos.get(i).getMatricula();
		j++;
	    }

	}
	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del Autobus ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < AutobusMatriculas.length; i++) {
		if (i + 1 < AutobusMatriculas.length) {
		    System.out.print(AutobusMatriculas[i] + ",");
		} else {
		    System.out.print(AutobusMatriculas[i] + ")");
		}
	    }
	    System.out.println();
	    String Autobus = sc.nextLine();
	    if (Autobus.equals("s")) {
		break;
	    }
	    for (int i = 0; i < AutobusMatriculas.length && idvalida == false; i++) {
		if (AutobusMatriculas[i].equals(Autobus)) {
		    listaVehiculos.get(i).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun taxi con esa id! Introduce una id válida (s) para salir.");
	    }
	    if (Autobus.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void buscarMatriculaVTC() {
	Scanner sc = new Scanner(System.in);
	int VTCs = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof VTC) {
		VTCs++;
	    }
	}
	String[] VTCMatriculas = new String[VTCs];
	int j = 0;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof VTC) {
		VTCMatriculas[j] = listaVehiculos.get(i).getMatricula();
		j++;
	    }
	}
	boolean idvalida = false, salir = false;
	while (idvalida == false && salir == false) {
	    System.out.print("Dime la id del Autobus ('s') para salir");
	    System.out.print(" (");
	    for (int i = 0; i < VTCMatriculas.length; i++) {
		if (i + 1 < VTCMatriculas.length) {
		    System.out.print(VTCMatriculas[i] + ",");
		} else {
		    System.out.print(VTCMatriculas[i] + ")");
		}
	    }
	    System.out.println();
	    String VTC = sc.nextLine();
	    if (VTC.equals("s")) {
		break;
	    }
	    for (int i = 0; i < VTCMatriculas.length && idvalida == false; i++) {
		if (VTCMatriculas[i].equals(VTC)) {
		    listaVehiculos.get(i).mostrarAtributos();
		    idvalida = true;
		}
	    }
	    if (idvalida == false) {
		System.out.println("No hay ningun taxi con esa id! Introduce una id válida (s) para salir.");
	    }
	    if (VTC.equals("s")) {
		salir = true;
	    } else {
		idvalida = false;
	    }
	}
    }

    private static void BuscarTaxiLibre() {
	boolean disponibilidad = false;
	for (int i = 0; i < listaVehiculos.size(); i++) {
	    if (listaVehiculos.get(i) instanceof Taxi) {
		Taxi t1 = (Taxi) listaVehiculos.get(i);
		if (t1.isEstado() == true) {
		    t1.setEstado(false);
		    System.out.println("Se ha reservado un taxi" + "(" + i + ")");
		    disponibilidad = true;
		    break;
		}
	    }
	}
	if (!disponibilidad) {
	    System.out.println("No hemos encontrado ningun taxi!");
	}
    }

    private static void establecerDisponibilidadTaxi() {
	Scanner sc = new Scanner(System.in);
	int [] TaxiIds = buscarIdVehiculo("Taxi");
	int[] TaxisIdsOcupados = new int[TaxiIds.length];
	int tDisponibles = 0;
	for (int i = 0; i < TaxiIds.length; i++) {
	    Taxi t1 = (Taxi)listaVehiculos.get(TaxiIds[i]);
	    if(!t1.isEstado()){
		TaxisIdsOcupados[tDisponibles] =TaxiIds[i];
		tDisponibles++;
	    }
	    
	}
	System.out.print("Que taxi esta disponible? (");
	for (int i = 0; i < TaxisIdsOcupados.length; i++) {
	    if(i+1 <TaxisIdsOcupados.length){
		System.out.print(TaxisIdsOcupados[i]+",");
	    }
	    else{
		System.out.println(TaxisIdsOcupados[i]+")");
	    }    
	}
	int taxiid = sc.nextInt();
	for (int i = 0; i < TaxisIdsOcupados.length; i++) {
	    if(taxiid==TaxisIdsOcupados[i]){
		Taxi t1 = (Taxi)listaVehiculos.get(taxiid);
		t1.setEstado(true);
		System.out.println("El taxi(" + taxiid + ")Esta disponible");
		break;
	    }
	    
	}
    }
}
