package Examen;
/**
 * Clase Empleados de producción que hereda de Asalariado
 * @author Antonio Moreno
 *
 */
public class EmpleadoProduccion extends Asalariado{
	private String turno;
	
	/**
	 * Constructor que pide el ejercicio, debería tener alguna sobrecarga más
	 * @param nombre
	 * @param nif
	 * @param salarioBase
	 * @param turno
	 */
	public EmpleadoProduccion(String nombre, String nif, double salarioBase, 
			String turno) {
		super(nombre, nif, salarioBase);
		this.turno=turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	/**
	 * Método que debe implementar obligatoriamente heredado.
	 */
	@Override
	public double calculaNomina() {
		return this.getSalarioBase()*1.15;
	}

	@Override
	public String toString() {
		return "EmpleadoProduccion [ Nombre=" + getNombre() + 
				", Nif=" + getNif() + ", SalarioBase="
				+ getSalarioBase() + " turno=" + turno +
				", nómina="	+ calculaNomina() + " ]";
	}

}
