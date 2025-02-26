package FigurasGeometricas;

import java.text.DecimalFormat;

public class Triangulo extends Poligono {

	//	================ CONSTRUCTORES ================
	Triangulo () {
		
	}
	Triangulo (String nombreFigura, double base, double altura) {
		super(nombreFigura, base, altura);
	}
	
//	================ METODOS ================
	@Override
	public double calcularArea () {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("____________________________________________\n");
		
        System.out.println("    *    ");
        System.out.println("   ***   \t   > Formula <");
        System.out.println("  *****  \t A = (b(ase) * a(ltura)) / 2");
        System.out.println(" ******* ");
        System.out.println("*********");

		double area = (base * altura) / 2;
		System.out.println("El area del triangulo es -> " + df.format(area));
		System.out.println("____________________________________________\n\n");
		
		return area;
	}
	
}
