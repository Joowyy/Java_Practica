package NotasMusicales;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Guitarra> guitarras = GestionGuitarra.getGuitarras();
	static ArrayList<Piano> pianos = GestionPiano.getPianos();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		char respuestaUsuario;
		
//		Solicitamos que quiere hacer el usuario
		do {
			
			System.out.println("¿Quieres agregar una partitura o tocar una partitura?\n1. Agregar partitura\n2. Tocar partitura\n3. Salir");
			
			switch (respuestaUsuario = sc.nextLine().charAt(0)) {
			case '1':
				
				System.out.println("\nVamos a agregar una nueva nota!");
				agregarPartitura();
				break;
			
			case '2':
				
				System.out.println("\nVayamos a tocar una partitura!!");
				tocarPartitura();
				break;
				
			case '3':
				
				System.out.println("Saliendo... Hasta luego!");
				break;
				
			default:
				
				System.out.println("Carácter introducido inválido.");
				
			}
			
		} while (respuestaUsuario != '3');
		
	}
	
	public static ArrayList<String> agregarPartitura() {
		Scanner sc = new Scanner (System.in);
		boolean partituraTerminada = false;
		
		System.out.println("¿De que instrumento quieres añadir la partitura? -> \n1. Piano\n2. Guitarra");
		System.out.println("Según la elección, tendrás que poner distintos datos de cada instrumento");
		char instrumentoUsuario = sc.nextLine().charAt(0);
		
		ArrayList<String> notasMusicales = new ArrayList<String>();
		
//		Segun el instrumento hace una cosa u otra
		if (instrumentoUsuario == '1') {
			
			System.out.println("¿Cual será la marca del piano que usas?");
			String marcaPianoUsu = sc.nextLine();
			System.out.println("¿Y como se llamará el gran pianista?");
			String nombrePianistaUsu = sc.nextLine();
			
			System.out.println("Adelante! Grabaremos una partitura con el piano\nCuando acabes de agregarla introduce la tecla 'x'");
			
			while (partituraTerminada != true) { // Bucle infinito hasta que se ingrese "salir"
				
	            String nota = sc.nextLine();
	            
	            if (nota.equalsIgnoreCase("x")) {
	            	
	            	partituraTerminada = true;
	                break; // Salimos del bucle cuando el usuario escriba "salir"
	                
	            }
	            
//	            Agregamos la nota en un ArrayList de notas
	            notasMusicales.add(nota); // Agregamos la nota a la lista
	            
	        }
			
//			Creamos el objeto agregando un ArrayList en el constructor de Piano
			Piano p = new Piano(marcaPianoUsu, nombrePianistaUsu, notasMusicales);
			pianos.add(p);
			
//			Mostramos la partitura junto los datos del Pianista
			p.mostrarInstrumento();
			
		} else if (instrumentoUsuario == '2') {
			
			System.out.println("¿Tocará una guitarra eléctrica o no? false / true");
			boolean guitarraElecOno = sc.nextBoolean();
			System.out.println("¿Cuantas cuerdas tendrá tu guitarra?");
			int cuerdasGuitarraUsu = sc.nextInt();
			sc.nextLine();
			System.out.println("¿Y como se llamará el guitarrista jefe?");
			String nombreGuitarristaUsu = sc.nextLine();
			
			System.out.println("Adelante! Grabaremos una partitura con el piano\nCuando acabes de agregarla introduce la tecla 'x'");
			
			while (partituraTerminada != true) { // Bucle infinito hasta que se ingrese "salir"
				
	            String nota = sc.nextLine();
	            
	            if (nota.equalsIgnoreCase("x")) {
	            	
	            	partituraTerminada = true;
	                break; // Salimos del bucle cuando el usuario escriba "salir"
	                
	            }
	            
//	            Agregamos la nota en un ArrayList de notas
	            notasMusicales.add(nota); // Agregamos la nota a la lista
	            
	        }
			
//			Creamos el objeto agregando un ArrayList en el constructor de Piano
			Guitarra g = new Guitarra(cuerdasGuitarraUsu, guitarraElecOno, nombreGuitarristaUsu, notasMusicales);
			guitarras.add(g);
			
//			Mostramos la partitura junto los datos del Pianista
			g.mostrarInstrumento();
			
		} else {
			
			System.out.println("Has introducido un número inválido.");
			
		}
		
		return notasMusicales;
	}

	public static void tocarPartitura () {
		Scanner sc = new Scanner (System.in);
		Piano pAux = new Piano ();
		Guitarra gAux = new Guitarra();
		
		System.out.println("Aqui tienes todas las partituras guardadas");
		System.out.println("¿Desea tocar el piano o la guitarra?\n1. Piano\n2. Guitarra");
		char respuestaUsuario = sc.nextLine().charAt(0);
		
		if (respuestaUsuario == '1') {
			
			pAux.interpretar();
			
		} else if (respuestaUsuario == '2') {
			
			gAux.interpretar();
			
		}
		
	}
	
}
