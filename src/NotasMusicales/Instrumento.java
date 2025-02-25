package NotasMusicales;

import java.util.ArrayList;

public abstract class Instrumento {

//	============================= ATRIBUTOS =============================
	protected ArrayList<String> notasMusicales = new ArrayList<String>();
	
//	============================= CONSTRUCTORES =============================
	Instrumento () {
		
	}
	Instrumento (ArrayList<String> notasMusicales) {
		this.notasMusicales = notasMusicales;
	}
	
//	============================= GETTERS & SETTERS =============================
	public ArrayList<String> getNotasMusicales() {
		return notasMusicales;
	}

	public void setNotasMusicales(ArrayList<String> notasMusicales) {
		this.notasMusicales = notasMusicales;
	}
	
//	============================= METODOS =============================
	public void agregarNota(String nota) {
		
		notasMusicales.add(nota);
		
	}
	
	public void mostrarNotas() {
		
		System.out.println("Partituras guardadas -> " + notasMusicales + "\n");
		
	}
	
//	Creamos el metodo abstracto interpretar para las demas clases
	public abstract void interpretar();
	
//	Creamos el metodo abstracto mostrarInstrumento para las clases
	public abstract void mostrarInstrumento();
	
	public abstract void eliminarPartitura();
	
}
