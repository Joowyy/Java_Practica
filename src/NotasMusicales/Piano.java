package NotasMusicales;

import java.util.ArrayList;
import java.util.Scanner;

public class Piano extends Instrumento{

//	============================= ATRIBUTOS =============================
	private String marcaPiano;
	private String nombrePianista;

	//	============================= CONSTRUCTORES =============================
	Piano () {
		
	}
	Piano (String marcaPiano, String nombrePianista, ArrayList<String> notasMusicales) {
		super(notasMusicales);
		this.marcaPiano = marcaPiano;
		this.nombrePianista = nombrePianista;
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

//	============================= METODOS =============================
	@Override
	public void interpretar() {
		Scanner sc = new Scanner (System.in);
		ArrayList<Piano> pianos = GestionPiano.getPianos();
		Boolean partituraEncontrada = false;
		
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
					
					System.out.println("\n 🎶🎵 🎶🎵        🎶🎵 🎶🎵 ");
					
			        Thread.sleep(1000); // Espera 3 segundos
			        
			        System.out.println("   🎶🎵 🎶🎵        🎶🎵 🎶🎵 ");
			        
			        Thread.sleep(1000);
			        
			        System.out.println(" 🎶🎵 🎶🎵        🎶🎵 🎶🎵 ");
			        
			        Thread.sleep(1000);
			        
			        System.out.println("   🎶🎵 🎶🎵        🎶🎵 🎶🎵 \n");
			        
			        partituraEncontrada = true;
			        
			    } catch (InterruptedException e) {
			        
			    	e.printStackTrace();
			    
			    }
					
			}
			
		}
		
		if (partituraEncontrada != true) {
			
			System.out.println("\nNo se ha encontrado a ese autor.\n");
			
		}

	}

	@Override
	public void eliminarPartitura() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Piano> pianos = GestionPiano.getPianos();
		
		for (Piano p1 : pianos) {
			
			p1.mostrarInstrumento();
			
		}
		
		System.out.println("¿Que partitura del piano desea eliminar? Digame el nombre: ");
		String nombrePartUsu = sc.nextLine();
	
		pianos.removeIf(Piano -> Piano.getNombrePianista().equalsIgnoreCase(nombrePartUsu));
		System.out.println("Partitura borrada correctamente.\n");

		for (Piano p2 : pianos) {
			
			if (!p2.getNombrePianista().equalsIgnoreCase(nombrePartUsu)) {
				
				System.out.println("No se ha encontrado a ese autor.");
				
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
