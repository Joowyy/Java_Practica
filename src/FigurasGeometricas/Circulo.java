package FigurasGeometricas;

public class Circulo extends FigurasGeometricas {

//	================ ATRIBUTOS ================
	private double radio;
	
//	================ CONSTRUCTORES ================
	Circulo () {
		
	}
	Circulo (double radio) {
		this.radio = radio;
	}
	Circulo (String nombreFigura, double radio) {
		super(nombreFigura);
		this.radio = radio;
	}
	
//	================ GETTERS & SETTERS ================
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
//	================ METODOS ================
	@Override
	public double calcularArea () {
		
		
		return 7.8;
	}
	
}
