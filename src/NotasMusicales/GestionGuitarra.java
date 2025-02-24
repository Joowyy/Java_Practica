package NotasMusicales;

import java.util.ArrayList;

public class GestionGuitarra {
	
	private static ArrayList<Guitarra> guitarras = new ArrayList<Guitarra>();

	public static ArrayList<Guitarra> getGuitarras() {
		return guitarras;
	}

	public static void setGuitarras(ArrayList<Guitarra> guitarras) {
		GestionGuitarra.guitarras = guitarras;
	}

}
