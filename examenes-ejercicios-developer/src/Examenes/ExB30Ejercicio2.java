package Examenes;
//Escribe un programa que pide el peso de personas, hay que calcular cuántos 
//hay entre 65 y 75 kilos, cuantos por debajo de 65 y cuantos, por encima de 75, 
//la media y cuantas personas hay. El programa deja de pedir el peso cuando se 
//introduzca el valor 0.

import java.util.Scanner;

public class ExB30Ejercicio2 {

	public static void main(String[] args) {
		int peso, contm=0, conte=0, contM=0, suma=0;
		float media;
		Scanner entrada= new Scanner(System.in);
		
		do {
			System.out.println("Introduce un peso: ");
			peso=entrada.nextInt();
			if(peso<65) {
				contm++;
			}else if(peso>=65 && peso<=75) {
				conte++;
			}else {
				contM++;
			}
			suma+=peso;
		}while(peso!=0);
		media=suma/(contm+conte+contM);
		System.out.println("Personas con peso menor de 65: "+contm);
		System.out.println("Personas con peso entre 65 y 75: "+conte);
		System.out.println("Personas con peso mayor de 75: "+contM);
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+media);
		
		entrada.close();
	}

}
