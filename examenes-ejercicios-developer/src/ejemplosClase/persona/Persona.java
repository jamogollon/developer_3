package ejemplosClase.persona;

public class Persona {

	private String dni;
	private String nombre;
	private String direccion;
	private String nss;
	private float sueldo;
	/**
	 * @param dni
	 * @param nombre
	 * @param direccion
	 * @param nss
	 * @param sueldo
	 */
	public Persona(String dni, String nombre, String direccion, String nss, float sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.nss = nss;
		this.sueldo = sueldo;
	}
	/**
	 * @param dni
	 */
	public Persona(String dni) {
		this.dni = dni;
	}
	public Persona() {
		
	}
	/**
	 * 
	 * @return el dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el nss
	 */
	public String getNss() {
		return nss;
	}
	/**
	 * @param nss el nss a establecer
	 */
	public void setNss(String nss) {
		this.nss = nss;
	}
	/**
	 * @return el sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo el sueldo a establecer
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String getAll() {
	
		return nombre + ", "+ dni + ", "+ 
		direccion + ", "+ nss + ", "+ sueldo;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", nss=" + nss + ", sueldo="
				+ sueldo + "]";
	}
	
	
}
