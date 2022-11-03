package Examen.Segundo;

import java.io.File;

/**
 * En esta clase todo sus atributos son estáticos, se trata de variables globales del programa
 * Puesto que se encuentra en un fichero texto de configuración(lo puede leer todos el mundo),
 * no seria necesaria la encapsulación. Pero lo hemos dejado de todas formas.
 * @author MiPc
 *
 */
public class Variables {
	public final static String ArchivoVariables = "config.ini";
	public final static File ruta=new File("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex"
			+ "\\Castelar20-21\\Prog1\\Eclipse-WorkSpace\\SegundaEvaluacion"
			+ "\\segundaevaluacion\\ficheros");

	private static int UltimoCodPedido;
	private static float PvpPollo;
	private static float PvpCarne;
	private static float PvpVegetariano;
	private static String ArchivoPedidos;
	private static String ArchivoClientes;
	private static String ArchivoDatosFacturacion;
	
	public Variables() {
		
	}


	public static int getUltimoCodPedido() {
		return UltimoCodPedido;
	}

	public static void setUltimoCodPedido(int valor) {
		UltimoCodPedido=valor;
	}

	public static float getPvpPollo() {
		return PvpPollo;
	}

	public static void setPvpPollo(float pvpPollo) {
		PvpPollo = pvpPollo;
	}

	public static float getPvpCarne() {
		return PvpCarne;
	}

	public static void setPvpCarne(float pvpCarne) {
		PvpCarne = pvpCarne;
	}

	public static float getPvpVegetariano() {
		return PvpVegetariano;
	}

	public static void setPvpVegetariano(float pvpVegetariano) {
		PvpVegetariano = pvpVegetariano;
	}

	public static void setUltimoNumPedido(int ultimoNumPedido) {
		UltimoCodPedido = ultimoNumPedido;
	}

	public static String getArchivoPedidos() {
		return ArchivoPedidos;
	}

	public static void setArchivoPedidos(String archivoPedidos) {
		ArchivoPedidos = archivoPedidos;
	}

	public static String getArchivoClientes() {
		return ArchivoClientes;
	}

	public static void setArchivoClientes(String archivoClientes) {
		ArchivoClientes = archivoClientes;
	}

	public static String getArchivoDatosFacturacion() {
		return ArchivoDatosFacturacion;
	}

	public static void setArchivoDatosFacturacion(String archivoDatosFacturacion) {
		ArchivoDatosFacturacion = archivoDatosFacturacion;
	}
	
	public static void incrementaCodPedidos() {
		UltimoCodPedido++;
	}
	
}
