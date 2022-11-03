package Examen.Segundo;

import java.util.List;

/**
 * Interfaz genérico del patrón DAO.
 * Seguir este patrón permite desligar la lógica de aplicación de la de datos.
 * 
 * La implementación de estos métodos así como la forma en que se instanciará
 * el objeto dependerá de cada caso y fuente de datos.
 * 
 * @author MiPc
 * @param <T> Tipo de objeto a almacenar en la fuente de datos.
 */
public interface Idao<T> {

	/**
	 * Añade una nueva instancia a la fuente de datos. 
	 * 
	 * @param objeto El objeto que se quiere almacenar.
	 * @throws java.lang.Exception
	 */
	public void guardar(List<T> objeto) throws Exception;    

	/**
	 * Obtiene todos los objetos que hay almacenados en la fuente de datos.
	 * 
	 * @return Lista de objetos almacenados en el disco.
	 * @throws java.lang.Exception
	 */
	public List<T> cargar() throws Exception;

	/**
	 * Actualiza el objeto pasado como argumento. 
	 * 
	 * @param objeto Instancia que se quiere actualizar.
	 * @throws java.lang.Exception
	 * @throws IllegalStateException si el objeto no existe en el fichero.
	 */
	public void agnadir(T objeto) throws Exception;
}


