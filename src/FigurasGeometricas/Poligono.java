package FigurasGeometricas;

public abstract class Poligono extends FigurasGeometricas {

//	================ ATRIBUTOS ================
	protected double base;
	protected double altura;
	
	//	================ CONSTRUCTORES ================
	Poligono () {
		
	}
	Poligono (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	Poligono (String nombreFigura, double base, double altura) {
		super(nombreFigura);
		this.base = base;
		this.altura = altura;
	}
	
//	================ GETTERS & SETTERS ================
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
//	================ METODOS ================
	@Override
	public abstract double calcularArea ();
	
}
