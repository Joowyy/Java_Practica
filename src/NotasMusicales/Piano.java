package NotasMusicales;

import java.util.ArrayList;

public class Piano extends Instrumento{

//	============================= ATRIBUTOS =============================
	private ArrayList<String> notasMusicalesPiano = new ArrayList<String>();
	private String marcaPiano;
	private String nombrePianista;
	
//	============================= CONSTRUCTORES =============================
	Piano () {
		
	}
	Piano (String marcaPiano, String nombrePianista, ArrayList<String> notasMusicalesPiano) {
		this.marcaPiano = marcaPiano;
		this.nombrePianista = nombrePianista;
		this.notasMusicalesPiano = notasMusicalesPiano;
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

	public ArrayList<String> getNotasMusicalesPiano() {
		return notasMusicalesPiano;
	}
	public void setNotasMusicalesPiano(ArrayList<String> notasMusicalesPiano) {
		this.notasMusicalesPiano = notasMusicalesPiano;
	}
	
//	============================= METODOS =============================
	@Override
	public void interpretar() {
		
	}
	
	@Override
	public void mostrarInstrumento() {
		
		System.out.println("\nMarca piano -> " + marcaPiano);
		System.out.println("Nombre pianista -> " + nombrePianista);
		System.out.println("Notas musicales -> " + notasMusicalesPiano + "\n");
		
	}
	
}
