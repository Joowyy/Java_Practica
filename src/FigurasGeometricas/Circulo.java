package FigurasGeometricas;

import java.text.DecimalFormat;

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

		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("____________________________________________\n");
		
        System.out.println("   ***   ");
        System.out.println(" *     * \t   > Formula <");
        System.out.println("*       *\t A = PI * r(adio) ");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
		
		double area = Math.PI * radio;
		System.out.println("El area del circulo es -> " + df.format(area));
		System.out.println("____________________________________________\n\n");
		
		return area;
	}
	
}
