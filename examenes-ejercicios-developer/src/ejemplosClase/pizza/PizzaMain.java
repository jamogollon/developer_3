package ejemplosClase.pizza;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		//Definición variables
		int opcion;
		Scanner entrada=new Scanner(System.in);
		//Definición de array de objetos de tipo Pizza de 15 dimensión.
		Pizza[] mispizzas= new Pizza[15];
		int contador=0, pservir;
		String tamano, tipo;
		
		//iteración
		do {
			//impresión menú
			System.out.println("Menú");
			System.out.println(" 1 Pedir \n");
			System.out.println(" 2 Servir \n");
			System.out.println(" 3 Salir \n");
			opcion=entrada.nextInt();
			switch(opcion){
				case 1://pedir
						System.out.println();
						System.out.println("Tamaño?");
						tamano=entrada.next();
						System.out.println();
						System.out.println("Tipo;");
						tipo = entrada.next();
						//Se instancia un nuevo objeto tipo Pizza y se guarda en el array de objetos tipo Pizza,
						//en la posición que indica contador.
						mispizzas[contador]=new Pizza(tamano, tipo);
						contador++;
					break;
				case 2://servir
					System.out.println("Cual sirve?");
					pservir=entrada.nextInt();
					//El objeto que está en la posición pservir del array llama (invoca) el método servir().
					mispizzas[pservir].servir();
					break;
				case 3://salir
					//Utilización de los getter de atributos de clase, al ser métodos también 
					System.out.println("Totales en pedido:"+ Pizza.getnPedidos());
					System.out.println("Totales servidas:"+ Pizza.getnServidos());					
					break;
				default: System.out.println("Selecciona una opción válida");
			}
		}while(opcion!=3);
		entrada.close();

	}

}
