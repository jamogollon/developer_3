package Examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * Clase principal main de ejecuci�n y men�
 */
public class ExamenMain {
	
	Scanner sc = new Scanner(System.in);
	List<Asalariado> listaEmpleados = new ArrayList<Asalariado>();
	int opcion;
	
	public ExamenMain() {
		
	}
	/**
	 * Construcci�n de main para evitar usar m�todos y atributos est�ticos continuamente
	 * @param args
	 */
	public static void main(String[] args) {
		ExamenMain main = new ExamenMain();
		main.ejecutarMenu();

	}

	private void ejecutarMenu() {
		boolean sigue=true;

		do {
			showMenu();
			opcion = sc.nextInt();
			switch(opcion){
				case 1:
					altaEmpleado(1);
					break;
				case 2:
					altaEmpleado(2);
					break;
				case 3:
					/*otra opci�n es: System.out.println(listaEmpleados)
					 * ya que los objetos tienen implementado m�todos toString().
					 * Pero el listado es todo en una l�nea.
					 */
					listar();
					break;
				case 4:
					borraUno();
					break;
				case 5:
					listaEmpleados.clear();
					break;
				case 6:
					sigue=false;
					break;
				default:
					System.out.println("Debes elegir una opci�n v�lida.");
			}
		}while(sigue);
		
	}
	
	private void showMenu() {
		System.out.println("------------MENU----------");
		System.out.println("1- Alta empleado de producci�n");
		System.out.println("2- Alta empleado de distribuci�n");
		System.out.println("3- Listar");
		System.out.println("4- Borrar un empleado");
		System.out.println("5- Borrar todo");
		System.out.println("6- Salir");
		System.out.println("Elige una opci�n");
	}
	
	private void altaEmpleado(int tipoEmpleado) {
		String nombre;
		String nif;
		double salarioBase;
		String turno;
		int kmRecorridos;
		
		System.out.println("---ALTAD DE EMPLEADO---");
		sc.nextLine();//para limpiar buffer de entrada
		System.out.println("Introduce nombre de empleado:");
		nombre = sc.nextLine();
		System.out.println("Introduce nif del empleado:");
		nif = sc.nextLine();
		System.out.println("Introduce salario base:");
		salarioBase = sc.nextDouble();

		if (tipoEmpleado==1) {//Empleado de producci�n
			sc.nextLine();//para limpiar buffer de entrada
			System.out.println("Introduce el turno:");
			turno = sc.nextLine();
			listaEmpleados.add(new EmpleadoProduccion(nombre, nif, salarioBase, turno));
		}
		else {//Empleado de distribuci�n
			System.out.println("Introduce los kil�metros recorridos:");
			kmRecorridos = sc.nextInt();
			EmpleadoDistribucion empdist = new EmpleadoDistribucion(nombre, nif, salarioBase);
			empdist.setKmRecorridos(kmRecorridos);
			listaEmpleados.add(empdist);
		}
		System.out.println("OK");
	}
	private void listar() {
		if (!(listaEmpleados.isEmpty())) {
			for(Asalariado a: listaEmpleados) {
				System.out.println(a.toString());
			}
		}
		else {
			System.out.println("La lista est� vacia");
		}
	}
	private void borraUno() {
		String nif;
		boolean b=false;
		sc.nextLine();//para limpiar buffer de entrada
		System.out.println("Introduce nombre el nif del empleado a borrar:");		
		nif = sc.nextLine();
		Iterator<Asalariado> i = listaEmpleados.iterator();
		while(i.hasNext()) {
			if (i.next().getNif().equals(nif)) {
				i.remove();
				b=true;
				break;
			}				
		}
		if (!b)
			System.out.println("Este nif no se corresponde con ninguno de la lista.");
		else
			System.out.println("Empleado borrado.");
	}
	
}
