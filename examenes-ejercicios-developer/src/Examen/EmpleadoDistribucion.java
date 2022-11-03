package Examen;
/**
 * Clase Empleados de distribución que hereda de Asalariado e implemente
 * la interface Idieta
 * @author Antonio Moreno
 *
 */
public class EmpleadoDistribucion extends Asalariado implements Idieta {
	private int kmRecorridos;

	/**
	 * Constructor que pide el ejercicios, alguna sobrecarga seria de agradecer
	 * @param nombre
	 * @param nif
	 * @param salarioBase
	 */
	public EmpleadoDistribucion(String nombre, String nif, double salarioBase) {
		super(nombre, nif, salarioBase);

	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	/**
	 * Método que debe implementar obligatoriamente proveniente
	 * de la interface Idieta
	 */
	@Override
	public double calculoDietaKm() {
		return this.kmRecorridos*EmpleadoDistribucion.precioKm;
	}
	/**
	 * Método que debe implementar obligatoriamente heredada
	 *  de la clase Asalariado
	 */
	@Override
	public double calculaNomina() {
		return this.getSalarioBase()*1.10+ calculoDietaKm();

	}
	@Override
	public String toString() {
		return "EmpleadoDistribucion [ Nombre=" + getNombre() + ", Nif=" + getNif() + 
				", SalarioBase=" + getSalarioBase() + " kilometros recorridos=" + kmRecorridos +
				", nómina="	+ calculaNomina() + " ]";
	}
}
