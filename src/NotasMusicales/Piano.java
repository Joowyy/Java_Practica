package NotasMusicales;

import java.util.ArrayList;

public class Piano extends Instrumento{

//	============================= ATRIBUTOS =============================
	private String marcaPiano;
	private String nombrePianista;
	
//	============================= CONSTRUCTORES =============================
	Piano () {
		
	}
	Piano (String marcaPiano, String nombrePianista, ArrayList<String> notasMusicales) {
		super(notasMusicales);
		this.marcaPiano = marcaPiano;
		this.nombrePianista = nombrePianista;
	}
	
//	============================= GETTERS & SETTERS =============================
	public String getMarcaPiano() {
		return marcaPiano;
	} 
	public void setMarcaPiano(String marcaPiano) {
		this.marcaPiano = marcaPiano;
	}

	public String getNombrePianista() {
		return nombrePianista;
	}
	public void setNombrePianista(String nombrePianista) {
		this.nombrePianista = nombrePianista;
	}
	
//	============================= METODOS =============================
	@Override
	public void interpretar() {
		
	}
	
	@Override
	public void mostrarInstrumento() {
		
		System.out.println("\nMarca piano -> " + marcaPiano);
		System.out.println("Nombre pianista -> " + nombrePianista);
		System.out.println("Partituras -> " + notasMusicales + "\n");
		
	}
	
}
