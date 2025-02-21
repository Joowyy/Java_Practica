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
	//public abstract void interpretar();
	
}
