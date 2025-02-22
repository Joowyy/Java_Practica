package NotasMusicales;

import java.util.ArrayList;

public abstract class Instrumento {

//	============================= ATRIBUTOS =============================
	private ArrayList<Instrumento> notasMusicales = new ArrayList<Instrumento>();
	
//	============================= CONSTRUCTORES =============================
	Instrumento () {
		
	}
	Instrumento (ArrayList<Instrumento> notasMusicales) {
		this.notasMusicales = notasMusicales;
	}
	
//	============================= GETTERS & SETTERS =============================
	public ArrayList<Instrumento> getNotasMusicales() {
		return notasMusicales;
	}

	public void setNotasMusicales(ArrayList<Instrumento> notasMusicales) {
		this.notasMusicales = notasMusicales;
	}
	
//	============================= METODOS =============================
//	Creamos el metodo abstracto interpretar para las demas clases
	public abstract void interpretar();
	
//	Creamos el metodo abstracto mostrarInstrumento para las clases
	public abstract void mostrarInstrumento();
	
}
