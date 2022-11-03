package Examenes;
//Diseña un programa que muestre todos los números del 120 al 325 que son pares, 
//la suma de estos, y la media.
public class ExA30Ejercicio1 {

	public static void main(String[] args) {
		int suma=0, cont=0;
		for(int i=120; i<=325;i++) {
			if(i%2==0) {
				System.out.println("Números pares:"+i);
				suma +=i;
				cont++;
			}
		}
		System.out.println("La suma de todos es:"+suma);
		System.out.println("La media de todos es:"+suma/cont);
	}

}
