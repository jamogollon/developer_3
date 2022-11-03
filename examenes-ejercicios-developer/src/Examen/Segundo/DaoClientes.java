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

public class DaoClientes implements Idao<Clientes> {
	private File fichero;
	
	public DaoClientes(String nomf) {
		this(new File(nomf));
	}
	public DaoClientes(File f) {
		this.fichero=f;
	}
	@Override
	public void guardar(List<Clientes> objeto) throws Exception {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,false));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		for(Clientes c: objeto) {
			oos.writeObject(c);
		}
		oos.close();
		
	}
	@Override
	public List<Clientes> cargar() throws Exception {
		List<Clientes> lista = new ArrayList<>();
		Clientes c= null;

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		
		while(true) {
			try {
				c=(Clientes)ois.readObject();
				lista.add(c);
			} catch (EOFException e) {//Esta excepción se lanza cuando se llega al final del archivo
				break;
			} 
			
		}
		ois.close();
		return lista;


	}
	@Override
	public void agnadir(Clientes objeto) throws Exception {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fichero,true));
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(objeto);

		oos.close();
		
	}

		

}
