package Automoviles;

import java.util.ArrayList;

public class Moto extends Vehiculo {

//	============= ATRIBUTOS =============
	private ArrayList<Vehiculo> motos = new ArrayList<Vehiculo>();
	private boolean pataCabra;
	
//	============= CONSTRUCTORES =============
	Moto () {
		
	}
	Moto (String matricula, String marca, String modelo, int potencia, boolean arrancado, boolean pataCabra) {
		super(matricula, marca, modelo, potencia, arrancado);
		this.pataCabra = pataCabra;
	}
	
//	============= GETTERS & SETTERS =============
	public ArrayList<Vehiculo> getMotos() {
		return motos;
	}
	public void setMotos(ArrayList<Vehiculo> motos) {
		this.motos = motos;
	}
	
	public boolean isPataCabra() {
		return pataCabra;
	}
	public void setPataCabra(boolean pataCabra) {
		this.pataCabra = pataCabra;
	}
	
//	============= METODOS =============
	@Override
	public void mostrarVehiculo () {
		
		System.out.println("\nMatricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Potencia: " + potencia + "cv");
		System.out.println("Arrancado: " + arrancado);
		System.out.println("Pata de cabra: " + pataCabra + "\n");
		
	}
	
	@Override
	public boolean arrancar() {
		
		System.out.println("La moto está arrancando");
		System.out.println("Quitando pata de cabra...");
		pataCabra = false;
		
		return this.arrancado = true;
	}
	
	@Override
	public boolean parar() {
		
		System.out.println("La moto acaba de aparcar");
		System.out.println("Poniendo pata de cabra...");
		pataCabra = true;
		
		return this.arrancado = false;
	}
	
}
