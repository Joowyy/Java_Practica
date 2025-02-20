package Automoviles;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static ArrayList<Moto> motos = new ArrayList<Moto>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Quieres crearun coche o moto nuevo? c/m");
		String respuestaUsuario = sc.nextLine();
		
		if (respuestaUsuario.equals("c")) {
			
		} else if (respuestaUsuario.equals("m")) {
			
		}
		
////		CREAMOS NUESTRO COCHE
//		Coche c = new Coche("4583JGB", "Skoda", "Kamiq", 115, false, 4, 250);
//		
//		System.out.println("==== SKODA ====");
//		c.mostrarVehiculo();
//		c.aparcarCoche();
//		
////		CREAMOS NUESTRA MOTO
//		Moto m = new Moto("9684DLW", "Yamaha", "R6", 150, false, true);
//		
//		System.out.println("\n==== YAMAHA ====");
//		m.mostrarVehiculo();
//		m.encenderMoto();
//		m.pararVehiculo();
		
	}

}
