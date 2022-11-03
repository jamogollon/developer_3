package Examenes;
//Diseña un programa que muestre todos los números del 546 al 389 de 3 en 3.
//Calcula la suma y la media.

public class ExB30Ejercicio1 {

	public static void main(String[] args) {
		int suma=0,cont=0;
		float media;
		
		for(int i=546;i>=389;i=i-3) {
			System.out.println(i);
			suma+=i;
			cont++;
		}
		System.out.println("La sumas es: "+suma);
		media=suma/cont;
		System.out.println("La media es: "+media);

	}

}
