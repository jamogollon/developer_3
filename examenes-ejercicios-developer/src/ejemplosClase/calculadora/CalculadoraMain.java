package ejemplosClase.calculadora;

import java.util.Scanner;

public class CalculadoraMain {
	
	public static void main(String[] args) {
		char opcion;
		int n;
		Scanner entrada= new Scanner(System.in);
		//Crear objeto, instancia		
		Calculadora miCalculadora= new Calculadora();//constructor vacio.

		do {
			//Menú
			System.out.println("Menú: elige opción");
			System.out.print("+ sumar\n");
			System.out.print("- restar\n");
			System.out.print("* multiplicar\n");
			System.out.print("/ dividir\n");
			System.out.print("f factorial\n");
			System.out.print("c CE:inicializa a cero\n");
			System.out.print("s SALIR\n");
			opcion=entrada.next().toLowerCase().charAt(0);
			switch(opcion) {
			case'+':
				System.out.println("Introduce número a sumar:");
				n= entrada.nextInt();
				 miCalculadora.sumar(n);
				break;
			case'-':
				System.out.println("Introduce número a restar:");
				n= entrada.nextInt();
				 miCalculadora.restar(n);
				break;
			case'*':
				System.out.println("Introduce número a multiplicar:");
				n= entrada.nextInt();
				 miCalculadora.multiplicar(n);
				break;
			case'/':
				System.out.println("Introduce número a dividir:");
				n= entrada.nextInt();
				 miCalculadora.dividir(n);
				break;
			case'f':
				//System.out.println("Introduce número a sumar:");
				//n= entrada.nextInt();
				 miCalculadora.fatorial();
				break;
			case'c':
				miCalculadora.inicializar();
				break;
			case's':
				System.out.println("Aaaaaadios");
				break;
			default:System.out.println("Elige una opción.");

			}
			System.out.println("El resultador es:" + miCalculadora.getResultado());

		}while(opcion!='s');
		
		entrada.close();
	}

}
