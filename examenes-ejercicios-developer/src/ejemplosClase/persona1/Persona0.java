package ejemplosClase.persona1;
/**
 * Constantes:

int GENERO_DESCONOCIDO = 0

int GENERO_MASCULINO = 1

int GENERO_FEMENINO = 2

Atributos:

nombre (String): nombre.
apellido1 (String): primer apellido.
apellido2 (String): segundo apellido.
edad(int): edad
genero(int): género.
peso(double): peso de la persona.
altura (double): altura de la persona.
Constructores:
Tendrá un constructor que recibirá nombre y apellidos.
Tendrá un constructor que recibirá nombre, apellidos y genero.
Los atributos a los que no se le asigne un valor se asignarán a 0.
Getters/Setters:
Habrá métodos para obtener el nombre, apellidos y género.
Habrá métodos para obtener y asignar el resto de atributos.
Métodos:
calcularIMC(): calcula el indice de masa corporal como peso/(altura*altura) y lo retorna. El método será privado.
isMayorDeEdad(): Retorna true si la persona tiene más de 18 años.
isSobrepeso(): retorna true si el indice de masa corporal de esta persona está por encima de 20.

 * @author MiPc
 *
 */
public class Persona0 {
	//COSTANTES
	static final int GENERO_DESCONOCIDO=0;
	static final int GENERO_MASCULINO=1;
	static final int GENERO_FEMENINO=2;
	//ATRIBUTOS
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private int edad;
	private int genero;
	private double peso;
	private double altura;
	
	//CONSTRUCTORES
	public Persona0(String nombre, String apellido1, String apellido2) {
		this.nombre= nombre;
		this.primerApellido=apellido1;
		this.segundoApellido=apellido2;
		this.genero=0;
		this.edad=0;
		this.peso=0;
		this.altura=0;
	}
	public Persona0(String nombre, String apellido1, String apellido2, int genero) {
		this.nombre= nombre;
		this.primerApellido=apellido1;
		this.segundoApellido=apellido2;
		this.genero=genero;
		this.edad=0;
		this.peso=0;
		this.altura=0;
	}
	
	//Getters/Setters
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso el peso a establecer
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return el altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura el altura a establecer
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return el primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @return el segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @return el genero
	 */
	public int getGenero() {
		return genero;
	}
	
	//MÉTODOS
	public double calcularIMC() {
		return peso/(altura*altura);
	}
	
	public boolean isMayorDeEdad() {
		if(edad>=18)
			return true;
		return false;
	}
	
	public boolean isSobrepeso() {
		if(calcularIMC()>20)
			return true;
		return false;
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
	
}
