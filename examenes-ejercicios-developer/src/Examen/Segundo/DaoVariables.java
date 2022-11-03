package Examen.Segundo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DaoVariables {
	private File fichero;
	
	public DaoVariables(String nomf) {
		this(new File(nomf));
	}
	public DaoVariables(File f) {
		this.fichero=f;
	}
	public void cargarVariables() throws Exception {
		String linea;
		String [] datos;
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setUltimoCodPedido(Integer.parseInt(datos[1].trim()));
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setPvpPollo(Float.parseFloat(datos[1]));
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setPvpCarne(Float.parseFloat(datos[1]));
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setPvpVegetariano(Float.parseFloat(datos[1]));
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setArchivoPedidos(datos[1]);
		linea = br.readLine();
		datos = linea.split("=");
		Variables.setArchivoClientes(datos[1]);

		br.close();
	}
	/**
	 * Guarda archivo texto con todas la variable globales.
	 * @throws Exception
	 */
	public void guardarVariables() throws Exception{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, false));
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("Ultimo Numero Pedidos ="+ Variables.getUltimoCodPedido());
		pw.println("Precio pollo ="+ Variables.getPvpPollo());
		pw.println("Precio carne ="+ Variables.getPvpCarne());
		pw.println("Precio vegetariano ="+ Variables.getPvpVegetariano());
		pw.println("Archivo pedidos ="+ Variables.getArchivoPedidos());
		pw.println("Archivo clientes ="+ Variables.getArchivoClientes());
		
		pw.close();
		
	}
}
