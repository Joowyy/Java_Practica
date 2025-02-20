package Automoviles;

import java.util.ArrayList;

public class Moto extends Vehiculo {

//	============= ATRIBUTOS =============
	private ArrayList<Moto> motos = new ArrayList<Moto>();
	private boolean pataCabra;
	
//	============= CONSTRUCTORES =============
	Moto () {
		
	}
	Moto (String matricula, String marca, String modelo, int potencia, boolean arrancado, boolean pataCabra) {
		super(matricula, marca, modelo, potencia, arrancado);
		this.pataCabra = pataCabra;
	}
	
//	============= GETTERS & SETTERS =============
	public ArrayList<Moto> getMotos() {
		return motos;
	}
	public void setMotos(ArrayList<Moto> motos) {
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
	
}
