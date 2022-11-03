package Examen;
/**
 * Clase Empleados de producci�n que hereda de Asalariado
 * @author Antonio Moreno
 *
 */
public class EmpleadoProduccion extends Asalariado{
	private String turno;
	
	/**
	 * Constructor que pide el ejercicio, deber�a tener alguna sobrecarga m�s
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
	 * M�todo que debe implementar obligatoriamente heredado.
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
				", n�mina="	+ calculaNomina() + " ]";
	}

}
