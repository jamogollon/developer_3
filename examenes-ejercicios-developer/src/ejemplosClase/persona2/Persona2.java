package ejemplosClase.persona2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Requisitos:

Cada persona tendrá una propiedad con un código único dentro del programa. Este código se le asignará automáticamente cuando se cree un objeto de tipo persona.
PENDIENTE
Para representar el género, utilizaremos el tipo enumerado Genero con los valores DESCONOCIDO, MASCULINO y FEMENINO.
Constructures:

Constructor privado sin parámetros.


Propiedades:

FechaNacimiento.
Propiedades de solo lectura:
Código único de persona: Se ha generado al crear el objeto de forma automática.
Edad: Quitaremos esta propiedad de momento y pondremos un comentario de tipo TODO. Esta propiedad a partir de ahora se calculará a partir de la fecha de nacimiento pero estará pendiente de implementar.

Métodos:
Los siguientes métodos requieren la fecha de nacimiento asignada, que no consideramos obligatoria, y puede haber errores si una fecha no está correctamente formateada.
Pondremos un comentario de tipo TODO para marcar que queda tarea por hacer para después.

getEdadEnFecha(int): obtiene la edad de la persona en una fecha que se pasa en formato AAAAMMDD.
getEdadEnFecha(int dia, int mes, int año): Pasado día, mes y año, calcula la edad de la persona en ese momento.
getPrimerCumpleañosEnAñoBisiesto(): Retorna el primer año bisiesto en que la persona ha cumplido años.
hacerCopiaPersona(): Retorna una nueva instancia de persona con todos los atributos iguales.

AQUI INCLUYO LOS EJERCICIOS DE PersonaII y PersonaIII CON DOS CLASES DISTINTAS PARA CALCULAR FECHAS.

 * @author Antonio Moreno
 *
 */
public class Persona2 {
	//private int codigo;TODO
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	//private int edad;
	private LocalDate fechNac;//con la clase Time
	private Calendar fechaNacimiento;//con la clase Calendar
	private Genero genero;/*tipo enum*/
	private double peso;
	private double altura;
	
	
	/************************************************************************************************
	*CONSTRUCTORES
	*************************************************************************************************/
	public Persona2(String nombre, String apellido1, String apellido2) {
		this.nombre= nombre;
		this.primerApellido=apellido1;
		this.segundoApellido=apellido2;
		this.peso=0;
		this.altura=0;
	}
	public Persona2(String nombre, String apellido1, String apellido2, Genero gen) {
		this.nombre= nombre;
		this.primerApellido=apellido1;
		this.segundoApellido=apellido2;
		this.genero=gen;
		this.peso=0;
		this.altura=0;
	}
	/**
	*Constructor de copia= copia los atributos del objeto parametro en el nuevo objeto que se crear.
	*/
	public Persona2(Persona2 nomObjeto) {
		this.nombre= nomObjeto.nombre;
		this.primerApellido=nomObjeto.primerApellido;
		this.segundoApellido=nomObjeto.segundoApellido;
		this.genero=nomObjeto.genero;
		this.fechNac= nomObjeto.fechNac;
		this.fechaNacimiento=nomObjeto.fechaNacimiento;
		this.peso=nomObjeto.peso;
		this.altura=nomObjeto.altura;		
	}
	
	/**********************************************************************************************************
	*GETTERS/SETTERS
	**********************************************************************************************************/
	/**
	 * @param establecer fecha nacimiento.Utilizando la clase Time
	 */
	public void setFechNac(int dia, int mes, int ano) {
		this.fechNac = LocalDate.of(ano,mes,dia);
	}
	/**
	 * @param establecer fecha nacimiento.Utilizando la clase Calendar
	 */
	public void setFechaNacimiento(int dia, int mes, int ano) {
		this.fechaNacimiento.set(ano, mes, dia);
	}
	/**
	 * 
	 * @param gen
	 */
	public void setGenero(Genero gen) {
		this.genero=gen;
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
	public Genero getGenero() {
		return genero;
	}
	
	/************************************************************************************************
	*MÉTODOS
	*************************************************************************************************/
	public double calcularIMC() {
		return peso/(altura*altura);
	}
	public boolean isMayorDeEdad() {
		if(this.getEdad()>=18)
			return true;
		return false;
	}
	public boolean isSobrepeso() {
		if(calcularIMC()>20)
			return true;
		return false;
	}
	/**
	 * 
	 * @param nomObjeto
	 * @return un nueva instancia de Persona2 copiada del objeto que se pasa por parámetro.
	 */
	public Persona2 hacerCopiaPersona(Persona2 nomObjeto) {
		Persona2 newObjeto = new Persona2(nomObjeto);
		return this;
	}
	/*--------------------------------------
	//Con clase Time
	 ****************************************/
	/**
	 * @return el edad
	 * Calculo de edad utilizando la clase Time.
	 */
	public int getEdadT() {
		LocalDate hoy = LocalDate.now();
		Period edad= Period.between(fechNac, hoy);
		return edad.getYears();
	}
	/**
	 * Con clase Time
	 * @param fechaNacimiento, entero formateado AAAAMMDD
	 * @return edad actual
	 * Calcula y devuelve la edad en años (entero) utilizando la clase Calendar
	 */
	public int getEdadEnFechaT(int fechaNacimiento) {
		
		int ano = fechaNacimiento / 10000;//parte entera despues de correr la coma tanto lugares como ceros hay
		int mes = (fechaNacimiento % 10000) / 100;//
		int dia = fechaNacimiento % 100;
		
		LocalDate hoy = LocalDate.now();
		this.fechNac = LocalDate.of(ano, mes, dia);
		Period edad= Period.between(fechNac, hoy);
		
		return edad.getYears();

	}
	/**
	 * Con clase Time
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return edad actual
	 * Calcula y devuelve la edad en años (entero) utilizando la clase Time
	 */
	public int getEdadEnFechaT(int dia, int mes, int ano) {
		
		LocalDate hoy = LocalDate.now();
		this.fechNac = LocalDate.of(ano, mes, dia);
		Period edad= Period.between(fechNac, hoy);
		
		return edad.getYears();

	}
	/**
	 * Con clase Time
	 * @return año
	 * Método que retorna el primer cumpleaños en año bisiesto.
	 * el método "isLeapYear()" devuelve true o false si el año es bisiesto.
	 */
	public int getPrimerCumpleanosEnAnoBisiestoT() {
		LocalDate fechTemp;
		LocalDate fechaActual = LocalDate.now();
		int bisiesto = 0;
		for (int i= this.getEdadT();i<=0; i--) {
			fechTemp=this.fechNac.plusYears(-i);//le resta a la fecha la edad i
			if(fechTemp.isLeapYear()) {//comprueba si es bisiesto
				bisiesto = i;
				break;
			}
			else
				bisiesto = 0;
		}
		return bisiesto;
	}
	/**
	 * @return el edad
	 * Calculo de edad utilizando la clase Calendar.
	 */
	
	/*--------------------------------------
	//Con clase Calendar
	 ****************************************/
	public int getEdad() {
		Calendar fech_hoy = Calendar.getInstance();
		
		int difAno = fech_hoy.get(Calendar.YEAR) - this.fechaNacimiento.get(Calendar.YEAR);
		int difMes = fech_hoy.get(Calendar.MONTH) - this.fechaNacimiento.get(Calendar.MONTH);
		int difDia = fech_hoy.get(Calendar.DATE) - this.fechaNacimiento.get(Calendar.DATE);

		if ((difMes < 0)||(difMes ==0 && difDia < 0)) {//si no los ha cumplido aún dentro de este año.
			difAno--;
		}

		return difAno;

	}
	/**
	 * Con clase calendar
	 * @param fechaNacimiento, entero formateado AAAAMMDD
	 * @return edad actual
	 * Calcula y devuelve la edad en años (entero) utilizando la clase Calendar
	 */
	public int getEdadEnFecha(int fechaNacimiento) {
		
		int ano = fechaNacimiento / 10000;//parte entera despues de correr la coma tanto lugares como ceros hay
		int mes = (fechaNacimiento % 10000) / 100;//
		int dia = fechaNacimiento % 100;
		
		this.fechaNacimiento.set(ano, mes, dia);
		Calendar fechaActual = Calendar.getInstance();//fecha actual

		int difAno = fechaActual.get(Calendar.YEAR) - ano;
		int difMes = fechaActual.get(Calendar.MONTH) - mes;
		int difDia = fechaActual.get(Calendar.DATE) - dia;

		if ((difMes < 0)||(difMes ==0 && difDia < 0)) {//si no los ha cumplido aún dentro de este año.
			difAno--;
		}

		return difAno;
	}
	/**
	 * Con clase calendar
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return edad
	 * Obtiene la edad a partir de los parametros
	 */
	public int getEdadEnFecha(int dia, int mes, int ano) {
		Calendar fechaActual = Calendar.getInstance();
		
		this.fechaNacimiento.set(ano, mes, dia);
		int difAno = fechaActual.get(Calendar.YEAR) - ano;
		int difMes = fechaActual.get(Calendar.MONTH) - mes;
		int difDia = fechaActual.get(Calendar.DATE) - dia;

		if ((difMes < 0) || (difMes == 0 && difDia < 0)) {
			difAno--;
		}

		return difAno;
	}
	/**
	 * Con clase Calendar
	 * @return entero año
	 * Método que retorna el primer cumpleaños en año bisiesto.
	 * La clase GegorianCalendar que hereda de Calendar, posee el método "isLeapYear(int año)"
	 * que devuelve true o false si el año es bisiesto.
	 */
	/**
	 * 
	 * @return
	 */
	public int getPrimerCumpleanosEnAnoBisiesto() {
		
		GregorianCalendar fechaActual = new GregorianCalendar();
		int bisiesto = 0;
		for (int i = fechaNacimiento.get(Calendar.YEAR); i <= fechaActual.get(Calendar.YEAR); i++) {
			if(((GregorianCalendar) fechaNacimiento).isLeapYear(i)) {
				bisiesto = i;
				break;
			}
			else
				bisiesto = 0;
		}
		return bisiesto;
	}
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", edad=" + this.getEdad() + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
}
