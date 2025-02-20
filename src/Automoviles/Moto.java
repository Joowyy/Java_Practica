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
	public boolean pararMoto () {
		
		System.out.println("Has puesto la pata de cabra de tu moto");
		
		return pataCabra = true;
	}
	public boolean encenderMoto () {
		
		System.out.println("Has quitado la pata de cabra de tu moto");
		
		return pataCabra = false;
	}
	
	@Override
	public void mostrarVehiculo () {
		
		System.out.println("\nMatricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Potencia: " + potencia + "cv");
		System.out.println("Arrancado: " + arrancado);
		System.out.println("Pata de cabra: " + pataCabra + "\n");
		
	}
	
}
