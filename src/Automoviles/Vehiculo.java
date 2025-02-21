package Automoviles;

public abstract class Vehiculo {

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
//	Hacemos un metodo abstracto, este está vacio
//	Pero le decimos que estará en otras clases.
	public abstract boolean arrancar ();
	
//	Hacemos un metodo abstracto, este está vacio
//	Pero le decimos que estará en otras clases.
	public abstract boolean parar ();
	
//	Hacemos un metodo abstracto, este está vacio
//	Pero le decimos que estará en otras clases.
	public abstract void mostrarVehiculo ();
	
}
