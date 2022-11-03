package ejemplosClase.dicosficheros;

import java.util.List;

public interface Idao<T>{
	
	    /** Guarda una lista de objetos en la fuente de datos asociada */
	   void  guardar(List< T > objetos)  throws  Exception;
	    /** Carga la lista de objetos desde la fuente de datos asociada */
	   void  cargar(List< T > objetos)  throws Exception;
	

}
