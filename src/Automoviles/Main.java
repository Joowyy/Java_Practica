package Automoviles;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Vehiculo> coches = new ArrayList<Vehiculo>();
	static ArrayList<Vehiculo> motos = new ArrayList<Vehiculo>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		char respuestaUsuario;
		
		do {
		
			System.out.println("¿Quieres crear un coche o moto nuevo?");
			switch(respuestaUsuario= sc.nextLine().charAt(0)) {
			
			case '1':
				
				System.out.println("\nVamos a crear nuestro coche!\n");
				crearCoche();
				break;
			
			case '2':
				
				System.out.println("\nCreemos nuestra nueva moto!\n");
				crearMoto();
				break;
				
			case '3':
				
				mostrarVehiculos();
				break;
				
			case '4':
				
				System.out.println("Saliendo del programa... Hasta luego!");
				break;
			
			}

		} while (respuestaUsuario != '4');
		
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
	
	public static Coche crearCoche () {
		Scanner sc = new Scanner (System.in);
		
//		Solicitamos datos
		System.out.println("Cual es la matricula del coche -> ");
		String matriculaCoche = sc.nextLine();
		System.out.println("Cual es la marca del coche -> ");
		String marcaCoche = sc.nextLine();
		System.out.println("Cual es la modelo del coche -> ");
		String modeloCoche = sc.nextLine();
		System.out.println("Cual es la potencia del coche -> ");
		int potenciaCoche = sc.nextInt();
		System.out.println("Cuantas puertas tiene el coche -> ");
		int numPuertasCoche = sc.nextInt();
		System.out.println("Cual es la velocidad máxima del coche -> ");
		int velocidadMaxima = sc.nextInt();
		
		Coche c = new Coche(matriculaCoche, marcaCoche, modeloCoche, potenciaCoche, false, numPuertasCoche, velocidadMaxima);
		coches.add(c);
		
//		Mostramos el coche despues de crearlo
		c.mostrarVehiculo();
		
		return c;
	}
	
	public static Moto crearMoto () {
		Scanner sc = new Scanner (System.in);
		
//		Solicitamos datos
		System.out.println("Cual es la matricula de la moto -> ");
		String matriculaMoto = sc.nextLine();
		System.out.println("Cual es la marca de la moto -> ");
		String marcaMoto = sc.nextLine();
		System.out.println("Cual es la modelo de la moto -> ");
		String modeloMoto = sc.nextLine();
		System.out.println("Cual es la potencia de la moto -> ");
		int potenciaMoto = sc.nextInt();
		System.out.println("Tiene la pata de cabra puesta? false/true -> ");
		boolean pataCabraMoto = sc.nextBoolean();
		
		Moto m = new Moto(matriculaMoto, marcaMoto, modeloMoto, potenciaMoto, false, pataCabraMoto);
		motos.add(m);
		
//		Mostramos la moto despues de crearla
		m.mostrarVehiculo();
		
		return m;
	}
	
	public static void mostrarVehiculos() {
		
	}

}
