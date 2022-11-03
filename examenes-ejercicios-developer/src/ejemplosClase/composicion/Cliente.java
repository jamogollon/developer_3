package ejemplosClase.composicion;

public class Cliente {
	private String nif;
	private String nombre;
	private String apellido;
	/**
	 * @param nif
	 * @param nombre
	 * @param apellido
	 */
	public Cliente(String nif, String nombre, String apellido) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/**
	 * @return el nif
	 */
	public String getNif() {
		return nif;
	}
	/**
	 * @param nif el nif a establecer
	 */
	public void setNif(String nif) {
		this.nif = nif;
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
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
