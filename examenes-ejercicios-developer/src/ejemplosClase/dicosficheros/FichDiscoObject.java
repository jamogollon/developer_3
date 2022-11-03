package ejemplosClase.dicosficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 *  Esta clase implementa un guardar y un cargar de una colección lista tipo arraylist
 * que guarda objetos Disco utilizando archivos binarios con ObjectOutputStream y ObjectInputStream.
 * @author MiPc
 *
 */
public class FichDiscoObject implements Idao<Disco>{
	
	private File fichero;	
	
	public FichDiscoObject(String nomFile) {
		this(new File(nomFile));
	}
	
	public FichDiscoObject(File fil) {
		this.fichero=fil;
	}

	public File getFichero() {
		return fichero;
	}

	@Override
	public void guardar(List<Disco> danis) throws Exception {
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero, false));
		
		ObjectOutputStream ous = new ObjectOutputStream(bos);
		
		for(Disco d: danis) {
			ous.writeObject(d);
		}
		
		ous.close();
	}

	@Override
	public void cargar(List<Disco> danis) throws Exception {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object aux = ois.readObject();
		//while(ois.available()!=0) {
		while(aux!=null) {
			Disco d = new Disco();
			//d=(Disco)ois.readObject();
			d = (Disco)aux;
			danis.add(d);
			aux = ois.readObject();
		}
		
		ois.close();
	}
	
	
	

}
