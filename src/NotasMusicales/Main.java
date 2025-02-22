package NotasMusicales;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Instrumento> notasMusicales = new ArrayList<Instrumento>();
	
	public static void main(String[] args) {

		ArrayList<String> notasUsuario = new ArrayList<String>();
		Scanner sc = new Scanner (System.in);
		char respuestaUsuario;
		
//		Solicitamos que quiere hacer el usuario
		do {
			
			System.out.println("¿Quieres agregar una partitura o tocar una partitura?\n1. Agregar partitura\n2. Tocar partitura\n3. Salir");
			
			switch (respuestaUsuario = sc.nextLine().charAt(0)) {
			case '1':
				
				System.out.println("\nVamos a agregar una nueva nota!");
				agregarPartitura(notasUsuario);
				break;
			
			case '2':
				
				//tocarPartitura();
				break;
				
			case '3':
				
				System.out.println("Saliendo... Hasta luego!");
				break;
				
			default:
				
				System.out.println("Carácter introducido inválido.");
				
			}
			
		} while (respuestaUsuario != '3');
		
	}
	
	public static ArrayList<Instrumento> agregarPartitura(ArrayList<String> notasUsuario) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿De que instrumento quieres añadir la partitura? -> \n1. Piano\n2. Guitarra");
		System.out.println("Según la elección, tendrás que poner distintos datos de cada instrumento");
		char instrumentoUsuario = sc.nextLine().charAt(0);
		
//		Segun el instrumento hace una cosa u otra
		if (instrumentoUsuario == '1') {
			
			System.out.println("¿Cual será la marca del piano que usas?");
			String marcaPianoUsu = sc.nextLine();
			System.out.println("¿Y como se llamará el gran pianista?");
			String nombrePianistaUsu = sc.nextLine();
			
			System.out.println("Adelante! Grabaremos una partitura con el piano\nCuando acabes de agregarla introduce la tecla 'x'");
			
			while (true) { // Bucle infinito hasta que se ingrese "salir"
				
	            String nota = sc.nextLine();
	            
	            if (nota.equalsIgnoreCase("x")) {
	            	
	                break; // Salimos del bucle cuando el usuario escriba "salir"
	                
	            }
	            
//	            Agregamos la nota en un ArrayList de notas
	            notasUsuario.add(nota); // Agregamos la nota a la lista
	            
	        }
			
//			Creamos el objeto agregando un ArrayList en el constructor de Piano
			Piano p = new Piano(marcaPianoUsu, nombrePianistaUsu, notasUsuario);
			notasMusicales.add(p);
			
//			Mostramos la partitura junto los datos del Pianista
			p.mostrarInstrumento();
			
		} else if (instrumentoUsuario == '2') {
			
			//do {
				
				//notasUsuario = sc.nextLine();
				
			//} while (notasUsuario[].equalsIgnoreCase("x"));
			
		} else {
			
			System.out.println("Has introducido un número inválido.");
			
		}
		
		
		return notasMusicales;
	}

	public static void tocarPartitura () {
		
		
		
	}
	
}
