package NotasMusicales;

import java.util.ArrayList;
import java.util.Scanner;

public class Piano extends Instrumento{

//	============================= ATRIBUTOS =============================
	private String marcaPiano;
	private String nombrePianista;
	//private ArrayList<String> partituraPianista;

	//	============================= CONSTRUCTORES =============================
	Piano () {
		
	}
	Piano (String marcaPiano, String nombrePianista, ArrayList<String> notasMusicales) {
		super(notasMusicales);
		this.marcaPiano = marcaPiano;
		this.nombrePianista = nombrePianista;
//		this.partituraPianista = partituraPianista;
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
	
//	public ArrayList<String> getPartituraPianista() {
//		return partituraPianista;
//	}
//	public void setPartituraPianista(ArrayList<String> partituraPianista) {
//		this.partituraPianista = partituraPianista;
//	}

//	============================= METODOS =============================
	@Override
	public void interpretar() {
		Scanner sc = new Scanner (System.in);
		ArrayList<Piano> pianos = GestionPiano.getPianos();
		
		System.out.println("Aqui tienes todas las partituras guardadas de piano");
		
//		Mostramos los pianos
		for (Piano p1 : pianos) {
				
			System.out.println("\n=== PIANO ===");
			p1.mostrarInstrumento();
				
		}
			
		System.out.println("Introduzca el nombre del pianista que desea tocar");
		String partituraUsuario = sc.nextLine();
			
		for (Piano p2 : pianos) {
			
			if (partituraUsuario.equalsIgnoreCase(p2.getNombrePianista())) {
					
				System.out.println("\n🎶🎵 Tocando partitura... 🎵🎶\n🎶🎵 Espere 3 segundos... 🎵🎶\n");
				
				try {
					
			        Thread.sleep(3000); // Espera 3 segundos
			        
			    } catch (InterruptedException e) {
			        
			    	e.printStackTrace();
			    
			    }
					
			} else {
					
				System.out.println("No se encontrado ninguna partitura con el nombre especificado");
					
			}
				
		}

	}

	@Override
	public void mostrarInstrumento() {
		
		System.out.println("\nMarca piano -> " + marcaPiano);
		System.out.println("Nombre pianista -> " + nombrePianista);
		System.out.println("Partituras -> " + notasMusicales + "\n");
		
	}
	
}
