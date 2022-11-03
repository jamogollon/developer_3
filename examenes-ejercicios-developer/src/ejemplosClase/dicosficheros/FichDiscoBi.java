package ejemplosClase.dicosficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
/**
 * Esta clase implementa un guardar y un cargar de una colección lista tipo arraylist
 * que guarda objetos Disco utilizando archivos binarios con DataOutputStream y DataInputStream.
 * @author MiPc
 *
 */
public class FichDiscoBi implements Idao<Disco>{
	private File fichero;
	
	public FichDiscoBi(String nomFile) {
		this(new File(nomFile));
	}
	
	public FichDiscoBi(File fil) {
		this.fichero=fil;
	}

	public File getFichero() {
		return fichero;
	}

	@Override
	public void guardar(List<Disco> danis) throws Exception {
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,true));
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		
		for(Disco d: danis) {
			
			dos.writeUTF(d.getCodigo());
			dos.writeUTF(d.getAutor());
			dos.writeUTF(d.getTitulo());
			dos.writeUTF(d.getGenero());
			dos.writeInt(d.getDuracion());
		}
		
		dos.close();
	}

	@Override
	public void cargar(List<Disco> danis) throws Exception {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		DataInputStream dis = new DataInputStream(bis);
		
		
		while(dis.available()!=0) {//el método available devuelve el número byte que quedan hast el final del archivo, cuando devuelva 0 es el final.
			Disco d = new Disco();
			d.setCodigo(dis.readUTF());
			d.setAutor(dis.readUTF());
			d.setTitulo(dis.readUTF());
			d.setGenero(dis.readUTF());
			d.setDuracion(dis.readInt());
			danis.add(d);
		}
		dis.close();
	}
	
	
}
