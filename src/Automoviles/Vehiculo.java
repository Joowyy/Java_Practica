package Automoviles;

public class Vehiculo {

//	============= ATRIBUTOS =============
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int potencia;
	protected boolean arrancado;
	
//	============= CONSTRUCTORES =============
	Vehiculo () {
		
	}
	Vehiculo (String matricula, String marca, String modelo, int potencia, boolean arrancado) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.arrancado = arrancado;
	}
	
//	============= GETTERS & SETTERS =============
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public boolean isArrancado() {
		return arrancado;
	}
	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}
	
//	============= METODOS =============
//	Setea el boolean a 'true' para arrancarlo
	public boolean arrancarVehiculo () {
		
		System.out.println("El vehiculo esta arrancando.");
		
		return arrancado = true;
	}
	
//	Setea el boolean a 'false' para detenerlo
	public boolean pararVehiculo () {
		
		System.out.println("El vehiculo ha sido detenido.");
		
		return arrancado = false;
	}
	
//	Nos muestra el vehiculo entero
	public void mostrarVehiculo () {
		
		System.out.println("\nMatricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Potencia: " + potencia + "cv");
		System.out.println("Arrancado: " + arrancado + "\n");
		
	}
	
}
