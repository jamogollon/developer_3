package Examen.Segundo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class MainKeback {
	private static File ruta=new File("F:\\Google Drive(amorenoa28@educarex.es)\\Educarex"
			+ "\\Castelar20-21\\Prog1\\Eclipse-WorkSpace\\SegundaEvaluacion"
			+ "\\segundaevaluacion\\ficheros");

	private List<Clientes> listClientes;
	private List <Pedidos> listPedidos;
	private DaoClientes daoClientes= null;
	private DaoPedidos daoPedidos= null;
	private DaoVariables daoVariables=null;
	Scanner sc = new Scanner(System.in);
	
	public MainKeback() {
		listClientes = new ArrayList<Clientes>();
		listPedidos = new ArrayList<Pedidos>();
		
		
	}
	public static void main(String[] args) {
		MainKeback mk = new MainKeback();
		mk.Iniciar();
		
	}

	private void Iniciar() {
		
		try {
			daoVariables = new DaoVariables(ruta + "//" + "Variables.ini");
			daoVariables.cargarVariables();
			File f = new File(ruta + "//"+ Variables.getArchivoClientes());
			
			daoClientes = new DaoClientes(f);
			
			if (f.exists()) {//si no se ha creado el fichero y evitar un error esto es lo mejor.
				listClientes= daoClientes.cargar();
			}
			daoPedidos = new DaoPedidos(ruta + "//"+ Variables.getArchivoPedidos());
			logicaMenu();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	private void logicaMenu() {
		boolean salir=true;
		int opcion = 0;
		do {
			ShowViewMenu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1://añade cliente
				addCliente();
				break;
			case 2://lista clientes
				System.out.println(listClientes);
				break;
			case 3://borra cliente
				borraCliente();
				break;
			case 4://nuevo pedido
				nuevoPedido();
				break;
			case 5://lista pedidos
				System.out.println(listPedidos);
				break;
			case 6://Facturación dia
				System.out.println("Número de pedidos totales: "+
			 Pedidos.numPedidos);
				System.out.println("Total facturado: "+
			 Pedidos.facturacionDia);
				break;
			case 7://Salir
				//guardar todo
				try {
					daoVariables.guardarVariables();
					daoClientes.guardar(listClientes);
					daoPedidos.guardar(listPedidos);
					salir=false;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
					
			}
			
		}while(salir);
	}
	private void ShowViewMenu() {
		
		System.out.println("1. Introduce un cliente");
		System.out.println("2. Lista clientes");
		System.out.println("3. Borra cliente");
		System.out.println("4. Nuevo pedido");
		System.out.println("5. Lista pedidos");
		System.out.println("6. Datos facturación");
		System.out.println("7. Salir");
		System.out.print("Selecciona una opción:");
	}
	private void addCliente() {
		
		sc.nextLine();
		System.out.println("Introduce código:");
		int codigo= sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre:");
		String nombre= sc.nextLine();
		System.out.println("Dirección:");
		String direccion= sc.nextLine();
		System.out.println("Fecha de nacimiento dd/mm/aaaa:");
		Date fecha_n;
		Calendar calendario= Calendar.getInstance();
		boolean sigue=false;
		do {
			try {
				String str_fecha= sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				fecha_n = sdf.parse(str_fecha);
				//colocamos la fecha en nuestro objeto Calendar
				calendario.setTime(fecha_n);
			} catch (ParseException e) {
				System.out.println("Introduzca la fecha en el formato quele indica: dd/mm/aaa \n"+ e.getMessage());
				sigue=true;
			}
		}while(sigue);

		System.out.println("Teléfono:");
		String tlf= sc.next();
		
		Clientes c = new Clientes(codigo,nombre,direccion);
		c.setFecha_nacimiento(calendario);
		c.setTelefono(tlf);
		
		listClientes.add(c);
		try {
			daoClientes.agnadir(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	private void borraCliente() {
		boolean s=true;
		
		System.out.println("Introduce código del cliente:");
		int codigo= sc.nextInt();
		
		Iterator<Clientes> i = listClientes.iterator();
		while(i.hasNext()) {
			if(i.next().getCodigo()==codigo) {
				i.remove();
				s=false;
			}
		}
		if(s) {
			System.out.println("No se ha encontrado este código");
		}
	}
	private void nuevoPedido() {
		Clientes c= null;
		boolean sigue=true;
		do {
			System.out.println("Introduce código cliente:");
			int codigo= sc.nextInt();
			c =buscaCliente(codigo);
			if(c==null) {
				System.out.println("Este código de cliente no es válido, introduce otro:");
				
			}
			else {
				sigue=false;
			}
		}while(sigue);
		System.out.println("Tipo pedido (POLLO, CARNE, VEGETARIANO):");
		//String str = sc.next();
		Productos tipo= Productos.valueOf(sc.next());
		System.out.println("Cantidad:");
		int cantidad= sc.nextInt();

		Pedidos p = new Pedidos(c,tipo,cantidad);
		//p.calculaPvp(cantidad);

		listPedidos.add(p);
		try {
			daoPedidos.agnadir(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private Clientes buscaCliente(int codigo) {
		
		for(Clientes c: listClientes) {
			if (c.getCodigo()== codigo) {
				return c;
			}
		}
		return null;
		
	}
}









