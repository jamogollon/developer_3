package Examen.Segundo;

import java.util.List;

/**
 * Interfaz gen�rico del patr�n DAO.
 * Seguir este patr�n permite desligar la l�gica de aplicaci�n de la de datos.
 * 
 * La implementaci�n de estos m�todos as� como la forma en que se instanciar�
 * el objeto depender� de cada caso y fuente de datos.
 * 
 * @author MiPc
 * @param <T> Tipo de objeto a almacenar en la fuente de datos.
 */
public interface Idao<T> {

	/**
	 * A�ade una nueva instancia a la fuente de datos. 
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


