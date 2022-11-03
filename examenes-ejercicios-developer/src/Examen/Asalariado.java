package Examen;
/**
 * Clase abstracta Asalariado
 * @author Antonio Moreno
 *
 */
public abstract class Asalariado {
	private String nombre;
	private String nif;
	private double salarioBase;
	
	/**
	 * Constructor que pide el ejercicio, se deberian tener alguno más.
	 * @param nombre
	 * @param nif
	 * @param salarioBase
	 */
	public Asalariado(String nombre, String nif, double salarioBase) {

		this.nombre = nombre;
		this.nif = nif;
		this.salarioBase = salarioBase;
	}
	/*******Getters y Setters*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	/**
	 * Método abstracto para implementar en las clases que hereden 
	 */
	public abstract double calculaNomina();
	
}
