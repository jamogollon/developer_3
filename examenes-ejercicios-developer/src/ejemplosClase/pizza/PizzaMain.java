package ejemplosClase.pizza;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		//Definici�n variables
		int opcion;
		Scanner entrada=new Scanner(System.in);
		//Definici�n de array de objetos de tipo Pizza de 15 dimensi�n.
		Pizza[] mispizzas= new Pizza[15];
		int contador=0, pservir;
		String tamano, tipo;
		
		//iteraci�n
		do {
			//impresi�n men�
			System.out.println("Men�");
			System.out.println(" 1 Pedir \n");
			System.out.println(" 2 Servir \n");
			System.out.println(" 3 Salir \n");
			opcion=entrada.nextInt();
			switch(opcion){
				case 1://pedir
						System.out.println();
						System.out.println("Tama�o?");
						tamano=entrada.next();
						System.out.println();
						System.out.println("Tipo;");
						tipo = entrada.next();
						//Se instancia un nuevo objeto tipo Pizza y se guarda en el array de objetos tipo Pizza,
						//en la posici�n que indica contador.
						mispizzas[contador]=new Pizza(tamano, tipo);
						contador++;
					break;
				case 2://servir
					System.out.println("Cual sirve?");
					pservir=entrada.nextInt();
					//El objeto que est� en la posici�n pservir del array llama (invoca) el m�todo servir().
					mispizzas[pservir].servir();
					break;
				case 3://salir
					//Utilizaci�n de los getter de atributos de clase, al ser m�todos tambi�n 
					System.out.println("Totales en pedido:"+ Pizza.getnPedidos());
					System.out.println("Totales servidas:"+ Pizza.getnServidos());					
					break;
				default: System.out.println("Selecciona una opci�n v�lida");
			}
		}while(opcion!=3);
		entrada.close();

	}

}
