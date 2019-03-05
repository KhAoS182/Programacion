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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
	//para pruebas
	listaVehiculos.add(new Taxi(22, 32, true,0,120,"434233","nissan"));
	listaVehiculos.add(new VTC(22, 32, "Palma",1,120,"434233","nissan"));
	listaVehiculos.add(new Autobus(50,25,2,120,"434233","nissan"));
 
	menu(listaVehiculos);
	
    }
   static void menu(ArrayList<Vehiculo> lista){
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
}

