package Examen.Segundo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoPedidos implements Idao<Pedidos>{
	private File fichero;
	
	public DaoPedidos(String nomf) {
		this(new File(nomf));
	}
	public DaoPedidos(File f) {
		this.fichero=f;
	}
	@Override
	public void guardar(List<Pedidos> objeto) throws Exception {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,false));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		for(Pedidos p: objeto) {
			oos.writeObject(p);
		}
		oos.close();
		
	}
	@Override
	public List<Pedidos> cargar() throws Exception {
		List<Pedidos> lista = new ArrayList<>();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		ObjectInputStream ois = new ObjectInputStream(bis);
		while(true) {
			try {
				lista.add((Pedidos)ois.readObject());
			} catch (EOFException e) {//si llega al final del archivo salta esta excepción
				break;
			} 
		}
		ois.close();
		return lista;
	}
	@Override
	public void agnadir(Pedidos objeto) throws Exception {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,true));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(objeto);

		oos.close();
		
	}

}
