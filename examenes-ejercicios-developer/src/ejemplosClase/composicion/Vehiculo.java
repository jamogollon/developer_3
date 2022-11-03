package ejemplosClase.composicion;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa;
	private boolean disponible;
	/**
	 * 
	 */
	public Vehiculo() {

	}
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param tarifa
	 */
	public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = tarifa;
	}
	/**
	 * @return el matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula el matricula a establecer
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return el color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color el color a establecer
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return el tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa el tarifa a establecer
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	/**
	 * @return el disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}
	/**
	 * @param disponible el disponible a establecer
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
