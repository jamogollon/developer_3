package Examenes;
//Dise�a un programa que pida un n�mero y despu�s rellena un array de esa dimensi�n.
//Calcular, la media, cuantos valores son positivos, negativos y mayores que el n�mero 15. 
import java.util.Scanner;

public class ExA30Ejercicio3 {

	public static void main(String[] args) {
		int dimension, suma=0, cpos=0, cneg=0, mayq=0, cont=0;
		float media;
		int[] numeros;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un n�mero:");
		dimension=entrada.nextInt();
		
		numeros=new int[dimension];
		
		for(int i=0; i<dimension;i++) {
			System.out.println("Introduce un n�mero:");
			numeros[i]=entrada.nextInt();
			cont++;
			suma+=numeros[i];
			if(numeros[i]>0) {
				cpos++;
			}
			else {
				cneg++;
			}
			if (numeros[i]>15)mayq++;
		}
		media=suma/cont;
		System.out.println("La suma: "+suma);
		System.out.println("La media: "+media);
		System.out.println("Positivos: "+cpos);
		System.out.println("Negativos: "+cneg);
		System.out.println("Mayores que 15: "+mayq);
		
		entrada.close();
	}

}
