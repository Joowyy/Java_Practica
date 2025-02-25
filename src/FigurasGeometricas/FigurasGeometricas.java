package FigurasGeometricas;

public abstract class FigurasGeometricas {

//	================ ATRIBUTOS ================
	protected String nombreFigura;
	
//	================ CONSTRUCTORES ================
	FigurasGeometricas () {
		
	}
	FigurasGeometricas (String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

//	================ GETTERS & SETTERS ================
	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	
//	================ METODOS ================
	public abstract double calcularArea();
}
