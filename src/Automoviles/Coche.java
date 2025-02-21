package Automoviles;

import java.util.ArrayList;

public class Coche extends Vehiculo {
	
//	============= ATRIBUTOS =============
	private ArrayList<Vehiculo> coches = new ArrayList<Vehiculo>();
	private int numPuertas;
	private int velocidadMax;
	
//	============= CONSTRUCTORES =============
	Coche () {
		
	}
	Coche (String matricula, String marca, String modelo, int potencia, boolean arrancado, int numPuertas, int velocidadMax) {
		super(matricula, marca, modelo, potencia, arrancado);
		this.numPuertas = numPuertas;
		this.velocidadMax = velocidadMax;
	}
	
//	============= GETTERS & SETTERS =============
	public ArrayList<Vehiculo> getCoches() {
		return coches;
	}
	public void setCoches(ArrayList<Vehiculo> coches) {
		this.coches = coches;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

//	============= METODOS =============
//	Imprime mensaje de depuracion y llama a un metodo padre
	@Override
	public void mostrarVehiculo () {
		
		System.out.println("\nMatricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Potencia: " + potencia + "cv");
		System.out.println("Arrancado: " + arrancado);
		System.out.println("Numero de puertas: " + numPuertas);
		System.out.println("Velocidad máxima: " + velocidadMax + "\n");
		
	}
	
	@Override
	public boolean arrancar() {
		
		System.out.println("El coche está arrancando\n");
		
		return this.arrancado = true;
	}
	
	@Override
	public boolean parar() {
		
		System.out.println("El coche acaba de aparcar");
		System.out.println("Poniendo freno de mano...\n");
		
		return this.arrancado = false;
	}
	
}
