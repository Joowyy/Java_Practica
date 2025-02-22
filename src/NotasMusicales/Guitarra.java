package NotasMusicales;

public class Guitarra extends Instrumento {

//	============================= ATRIBUTOS =============================
	private int cuerdas;
	private boolean guitarraElectrica = false;
	private String nombreGuitarrista;
	private String notasMusicalesGuitarra;

	//	============================= CONSTRUCTORES =============================
	Guitarra () {
		
	}
	Guitarra (String notasMusicalesGuitarra) {
		this.notasMusicalesGuitarra = notasMusicalesGuitarra;
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
	
	public String getNotasMusicalesGuitarra() {
		return notasMusicalesGuitarra;
	}
	public void setNotasMusicalesGuitarra(String notasMusicalesGuitarra) {
		this.notasMusicalesGuitarra = notasMusicalesGuitarra;
	}
	
//	============================= METODOS =============================
	@Override
	public void interpretar() {
		
	}
	
	@Override
	public void mostrarInstrumento() {
		
	}
	
}
