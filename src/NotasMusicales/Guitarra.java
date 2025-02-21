package NotasMusicales;

import java.util.ArrayList;

public class Guitarra extends Instrumento {

//	============================= ATRIBUTOS =============================
	private int cuerdas;
	private boolean guitarraElectrica = false;
	private String nombreGuitarrista;
	
//	============================= CONSTRUCTORES =============================
	Guitarra () {
		
	}
	Guitarra (int cuerdas, boolean guitarraElectrica, String nombreGuitarrista) {
		this.cuerdas = cuerdas;
		this.guitarraElectrica = guitarraElectrica;
		this.nombreGuitarrista = nombreGuitarrista;
	}
	
//	============================= GETTERS & SETTERS =============================
	public int getCuerdas() {
		return cuerdas;
	}
	public void setCuerdas(int cuerdas) {
		this.cuerdas = cuerdas;
	}
	
	public boolean isGuitarraElectrica() {
		return guitarraElectrica;
	}
	public void setGuitarraElectrica(boolean guitarraElectrica) {
		this.guitarraElectrica = guitarraElectrica;
	}
	
	public String getNombreGuitarrista() {
		return nombreGuitarrista;
	}
	public void setNombreGuitarrista(String nombreGuitarrista) {
		this.nombreGuitarrista = nombreGuitarrista;
	}
	
//	============================= METODOS =============================
	
}
