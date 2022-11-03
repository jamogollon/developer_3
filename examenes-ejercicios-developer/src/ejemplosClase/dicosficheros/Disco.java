package ejemplosClase.dicosficheros;

import java.io.Serializable;

/**
 * Definición de la clase Disco
 * 
 * @author Mipc
 */
public class Disco implements Serializable {
	/*Implementamos la interface Serializable, para poder utilizar ObjectInputStream y ObjectOutputStream, para poder
	 * guardar y leer este objeto de ficheros.
	 */
	private static final long serialVersionUID = 1L;/*variable obligatoria si utilizas Serialización
	previene que se pueda cargar un objeto Disco desde fichero con otra versión distinta de la clase Disco*/
	private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duración total en minutos

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	 public String toString() {
		 String cadena = this.codigo+":"+
	 this.autor+ ":"+
	 this.titulo+ ":"+
	 this.genero+ ":"+
	 this.duracion;
//		    String cadena = "\n------------------------------------------";
//		        cadena += "\nCódigo: " + this.codigo;  
//		        cadena += "\nAutor: " + this.autor;    
//		        cadena += "\nTítulo: " + this.titulo;
//		        cadena += "\nGénero: " + this.genero;
//		        cadena += "\nDuración: " + this.duracion;
//		        cadena += "\n------------------------------------------";

		    return cadena;
		  }
}

