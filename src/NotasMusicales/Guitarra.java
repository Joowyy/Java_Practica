package NotasMusicales;

import java.util.ArrayList;
import java.util.Scanner;

public class Guitarra extends Instrumento {

//	============================= ATRIBUTOS =============================
	private int cuerdas;
	private boolean guitarraElectrica;
	private String nombreGuitarrista;

	//	============================= CONSTRUCTORES =============================
	Guitarra () {
		
	}
	Guitarra (int cuerdas, boolean guitarraElectrica, String nombreGuitarrista, ArrayList<String> notasMusicales) {
		super(notasMusicales);
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

//	============================= METODOS =============================
	@Override
	public void interpretar() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Guitarra> guitarras = GestionGuitarra.getGuitarras();
		
		System.out.println("Aqui tienes todas las partituras a tocar");
		
		for (Guitarra g1 : guitarras) {
			
			g1.mostrarInstrumento();
			
		}
		
		System.out.println("Dime el nombre del guitarrista para tocar -> ");
		String nombreGuitarristaUsu = sc.nextLine();
		
		for (Guitarra g2 : guitarras) {
			
			if (g2.getNombreGuitarrista().equalsIgnoreCase(nombreGuitarristaUsu)) {
				
				try {
					
					System.out.println("Tocando partitura con la guitarra...\nEspere...\n");
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			} else {
				
				System.out.println("No se ha encontrado ningun guitarrista por ese nombre");
				
			}
			
		}
		
	}
	
	@Override
	public void mostrarInstrumento() {
		
		System.out.println("\nNombre guitarrista -> " + nombreGuitarrista);
		System.out.println("Guitarra electrica -> " + guitarraElectrica);
		System.out.println("Numero de cuerdas -> " + cuerdas);
		mostrarNotas();
		
	}
	
}
