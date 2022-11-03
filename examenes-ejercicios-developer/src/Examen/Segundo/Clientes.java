package Examen.Segundo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Clientes implements Serializable {
	private int codigo;
	private String nombre;
	private String direccion;
	private LocalDate fechNac;//con la clase Time
	private Calendar fecha_nacimiento;
	private String telefono;
	 
	public Clientes(int codigo, String nombre, String direccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public void setFecha_nacimiento(int dia, int mes, int ano) {
		
		this.fecha_nacimiento.set(ano, mes, dia); 
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCodigo() {
		return codigo;
	}
	
	/*------METODOS------*/
	
	public int getEdad() {
		Calendar fech_hoy = Calendar.getInstance();
		
		int difAno = fech_hoy.get(Calendar.YEAR) - this.fecha_nacimiento.get(Calendar.YEAR);
		int difMes = fech_hoy.get(Calendar.MONTH) - this.fecha_nacimiento.get(Calendar.MONTH);
		int difDia = fech_hoy.get(Calendar.DATE) - this.fecha_nacimiento.get(Calendar.DATE);

		if ((difMes < 0)||(difMes ==0 && difDia < 0)) {//si no los ha cumplido aún dentro de este año.
			difAno--;
		}

		return difAno;
		
		
	}
	/**
	 * @return el edad
	 * Calculo de edad utilizando la clase Time.
	 */
	public int getEdadT() {
		LocalDate hoy = LocalDate.now();
		Period edad= Period.between(fechNac, hoy);
		return edad.getYears();
	}

	@Override
	public String toString() {
		return "Clientes [codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", edad="
				+ getEdad() + ", telefono=" + telefono + "]";
	}
	
	
}
