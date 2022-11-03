package Examenes;
// Diseña un programa que pida al usuario los planetas del sistema solar.
//Haz una búsqueda del planeta Marte y dices en qué posición está.
//Enseña por pantalla los planetas, pero en orden inverso a como se han introducido.

import java.util.Scanner;

public class ExB30Ejercicio3 {

	public static void main(String[] args) {
		int pos=0;
		String[] planetas=new String[8];
		Scanner entrada=new Scanner(System.in);
		
		for(int i=0;i<planetas.length;i++) {
			System.out.println("Introduce un planeta:");
			planetas[i]=entrada.nextLine();
			if(planetas[i].equals("Marte")) {
				pos=i;
			}
		}
		for(int i=planetas.length-1;i>=0;i--) {
			System.out.println(planetas[i]);
		}
		System.out.println("Marte está en la posición: "+pos+1);
		entrada.close();
	}

}
