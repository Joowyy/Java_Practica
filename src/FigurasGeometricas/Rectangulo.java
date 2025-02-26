package FigurasGeometricas;

import java.text.DecimalFormat;

public class Rectangulo extends Poligono {

	//	================ CONSTRUCTORES ================
	Rectangulo () {
		
	}
	Rectangulo (String nombreFigura, double base, double altura) {
		super(nombreFigura, base, altura);
	}
	
//	================ METODOS ================
	@Override
	public double calcularArea () {

		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("____________________________________________\n");
		
        System.out.println("**********");
        System.out.println("*        *\t   > Formula <");
        System.out.println("*        *\t A = b(ase) * a(ltura)");
        System.out.println("**********");
		
		System.out.println("\nLa formula del triangulo es -> [ A = b(ase) * a(ltura) ]");
		double area = base * altura;
		System.out.println("El area del triangulo es -> " + df.format(area) + "\n");
		System.out.println("____________________________________________\n\n");
		
		return area;
	}
	
}
