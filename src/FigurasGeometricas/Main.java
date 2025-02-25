package FigurasGeometricas;

public class Main {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo("Circulo de Miguel", 5.7);
		c1.calcularArea();
		
		Rectangulo r1 = new Rectangulo("Rectangulo de Jose", 6.7, 2.4);
		r1.calcularArea();
		
		Triangulo t1 = new Triangulo("Triangulo de Joel", 8.3, 6.2);
		t1.calcularArea();

	}

}
