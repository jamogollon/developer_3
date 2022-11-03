package Examenes;
//Diseña un programa para adivinar un nombre de persona que anteriormente
//hemos guardado, para lo cual solo tenemos 3 intentos. Debe emitir avisos.
import java.util.Scanner;

public class ExA30Ejercicio2 {

	public static void main(String[] args) {
		//boolean acierto=true;
		int intento=0;
		String nombre="antonio", inNombre;
		Scanner entrada=new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce un nombre:");
			inNombre=entrada.nextLine();
			if(nombre.equals(inNombre)) {
				//acierto=false;
				System.out.println("Has acertado");
				break;
			}
			if(++intento >2) {
				System.out.println("Has agotado tus 3 intentos");
				//acierto=false;
				break;
			}
			System.out.println("Llevas "+ intento+" intentos");
			
		}while(true);
		entrada.close();
	}

}
