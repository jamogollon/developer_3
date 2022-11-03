package ejemplosClase.dicosficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
/**
 * Esta clase implementa un guardar y un cargar de una colección lista tipo arraylist
 * que guarda objetos Disco utilizando archivos de caracteres.
 * @author MiPc
 *
 */
public class FichDisco implements Idao<Disco>{
	private File fichero;
	
	/*----CONSTRUCTORES------*/

	public FichDisco(String nomFile) {
		this(new File(nomFile));
	}
	
	public FichDisco(File fil) {
		this.fichero=fil;
	}

	
	/*------Getter-----*/
	
	public File getFichero() {
		return fichero;
	}
	
	/*-----MÉTODOS----*/

	@Override
	public void guardar(List<Disco> dani) throws Exception {
		
		BufferedWriter bfw = new BufferedWriter(new FileWriter(fichero, true));
		
		for(Disco d: dani) {
			bfw.write(d.toString());
//			bfw.write(d.getCodigo()+":");
//			bfw.write(d.getAutor()+":");
//			bfw.write(d.getTitulo()+":");
//			bfw.write(d.getGenero()+":");
//			bfw.write(d.getDuracion());
			bfw.newLine();
		}
		bfw.close();
	}

	@Override
	public void cargar(List<Disco> dani) throws Exception {
		String linea;
		
		
		BufferedReader bfr = new BufferedReader(new FileReader(fichero));
		
		linea= bfr.readLine();
		while(linea !=null) {
			int i=0;
			String[] datos = linea.split(":");
			Disco d = new Disco();
			d.setCodigo(datos[i++]);
			d.setAutor(datos[i++]);
			d.setTitulo(datos[i++]);
			d.setGenero(datos[i++]);
			d.setDuracion(Integer.parseInt(datos[i]));
			
			dani.add(d);
			linea=bfr.readLine();
		}
		bfr.close();
	}
}














