package Examenes;
/**
 * Examen 1ª Evaluación, Dam1 20/11/2020
1-	(2) Diseña un programa que imprima en consola el siguiente menú:
ELIGE UNA OPCIÓN Y PRESIONA LA LETRA CORRESPONDIENTE:
A 	Crear una matriz.
B	Cálculos con matriz.
C	Ordena la matriz.
D	Busca número acabado.
E	Ordenar array de strings 
S	Salir.
2-	(1.25) La opción A del menú, debe llamar a un método que devuelva una matriz bidimensional y recibe dos parámetros (fila y columna) que los proporciona el usuario. Debe rellenar la matriz con números aleatorios excepto la diagonal principal que serán ceros. Después imprimir por pantalla.
3-	 (1.25) La opción B del menú, debe llamar a un método que no devuelve nada y que se le pasa como parámetro la matriz.  Debe calcular e imprimir por consola, el máximo, mínimo y media de los elementos de la matriz.
4-	(2) La opción C del menú, debe llamar a un método que devuelve una matriz ordenada por el método de intercambio, y que recibe como parámetro la matriz desordenada. Después se imprime por pantalla.
5-	(1.5) La opción D del menú, debe ejecutar un método que se le pasa la matriz y un número entero “n” a introducir por el usuario y no devuelve nada. Debe buscar los elementos de la matriz que acaban en este número “n” e imprimir por pantalla la matriz, pero donde hay un número de con estas condiciones aparecerá una “X”. Ejemplo si n=2, busca todos los números dentro de la matriz acabados en 2 (2, 12, 22, 32, 42, …) y en su lugar imprime una “X”. 
6-	 (2) La opción F del menú, debe ejecutar un método que no devuelve nada y no tiene parámetros. Utiliza el array de strings definido como variable de clase (es decir tiene visión en toda la clase), siguiente:
Meses={“enero”, ”febrero”, ”marzo”, ”abril”, ”mayo”, ”junio”, ”julio”, ”agosto”, ”septiembre”, “octubre”, “noviembre”, “diciembre”}
Debe imprimirse por consola, este mismo array pero ordenado por el método burbuja, los meses según el número de letras que contienen. Es decir, primero el más corto y el último el más largo.
7-	La opción S finaliza el programa. Es decir, si no se pulsa S, el programa sigue funcionando, luego se puede volver a ejecutar cualquier opción del menú una y otra vez.

(es evidente que, si no se ejecuta la opción A en primer lugar, no será posible las demás a excepción de la F y S, tener esto en cuenta.)
 */
import java.util.Scanner;

public class ExamenPrimera {
	//variable de clase, array de strings. Es visible desde toda la clase.
	static String[] meses = {"enero","febrero","marzo","abril","mayo",
			"junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	
	public static void main(String[] args) {
		boolean banderaCasoA=false;
		char opcion;
		int n;
		int[][] miMatriz = null;
		int fila, columna;
		Scanner entrada= new Scanner(System.in);
		
		do {
			imprimeMenu();
			opcion=entrada.next().toUpperCase().charAt(0);
			switch(opcion){
				case 'A':
					banderaCasoA=true;
					System.out.println("Introduce fila:");
					fila=entrada.nextInt();
					System.out.println("Introduce columna:");
					columna=entrada.nextInt();
					miMatriz=new int[fila][columna];
					miMatriz=creaMatriz(fila, columna);
					imprimeMatriz(miMatriz);
					break;
				case 'B':
					if(banderaCasoA)
						calculosMatriz(miMatriz);
					else
						System.out.println("Debe generarse la matriz antes con la opción de menú A");
					break;
				case 'C':
					if(banderaCasoA) {
						miMatriz=ordenarMatriz(miMatriz);
						imprimeMatriz(miMatriz);
					}
					else
						System.out.println("Debe generarse la matriz antes con la opción de menú A");
					break;
				case 'D':
					if(banderaCasoA) {
						System.out.println("Introduce un número: ");
						n=entrada.nextInt();
						buscaNumero(miMatriz, n);
					}
					else
						System.out.println("Debe generarse la matriz antes con la opción de menú A");					
					break;
				case 'E':
					ordenaMeses();
					break;
				case 'S':
					break;
				default:System.out.println("Debe elegir una opción del menú");
			}
		}while(opcion!='S');
		entrada.close();

	}
	/**
	 * método que imprime el menú principal, se llama cada vez que se ejecuta alguna opción.
	 */
	public static void imprimeMenu() {
		System.out.println();
		System.out.println("ELIGE UNA OPCIÓN Y PRESIONA LA LETRA CORRESPONDIENTE");
		System.out.println("A - Crea una matriz. ");
		System.out.println("B - Cálculos con matriz. ");
		System.out.println("C - Ordena matriz. ");
		System.out.println("D - Busca número acabado. ");
		System.out.println("E - Ordena array de string. ");
		System.out.println("S - Salir. ");
		System.out.println();
	}
	/**
	 * método que recibe la dimensión(filas y columnas) y crea una matriz aleatoria a excepción de la diagonal
	 * principal con ceros.
	 * @param fila
	 * @param columna
	 * @return la matriz creada
	 */
	public static int[][]creaMatriz(int fila, int columna){
		int[][] laMatriz= new int[fila][columna];

		for (int i =0; i<fila; i++) {
			for(int j=0; j<columna; j++) {
				if (i!=j)
					laMatriz[i][j]=(int)(100*Math.random());
				else
					laMatriz[i][j]=0;
			}
		}
		return laMatriz;
	}
	/**
	 * método que recibe la matriz como parámetros y la imprime formateada por pantalla
	 * @param laMatriz
	 */
	public static void imprimeMatriz(int[][]laMatriz) {
		
		for(int i=0; i < laMatriz.length; i++) {
			for (int j=0; j < laMatriz[0].length; j++) {
				System.out.printf("%2d ",laMatriz[i][j]);
			}
			System.out.println();
		}
	}
	/**
	 * método que realiza los calculos de maximo, mínimo y media de la matriz.
	 * No devuelve nada, lo imprime en pantalla.
	 * @param laMatriz
	 */
	public static void calculosMatriz(int[][]laMatriz) {
		int max=0, min=0, cont=0;
		float suma=0;
		for(int i=0; i < laMatriz.length; i++) {
			for (int j=0; j < laMatriz[0].length; j++) {
				if(laMatriz[i][j]>max)
					max=laMatriz[i][j];
				if(laMatriz[i][j]<min)
					min=laMatriz[i][j];
				suma +=laMatriz[i][j];
				cont++;
				
			}
		
		}
		System.out.println("El máximo es: "+ max);
		System.out.println("El mínimo es: "+ min);
		System.out.printf("La media es: %.2f", suma/cont);
		System.out.println();

	}
	/**
	 * método que recibe una matriz desordenada y la ordena utilizando
	 * el método de intercambio
	 * @param laMatriz
	 * @return la matriz ordenada
	 */
	public static int[][] ordenarMatriz(int[][]laMatriz){
		int aux,k=0;
		int[] cuadMatriz= new int[laMatriz.length*laMatriz[0].length];
		
		//paso el array bidimensional a uno con una dimensión
		for(int i=0; i<laMatriz.length; i++) {
			for(int j=0; j<laMatriz[0].length; j++) {
				cuadMatriz[k]=laMatriz[i][j];
				k++;
			}
		}
		//aplico método del intercambio al array de una dimensión para ordenarlo
		for(int i=0; i<cuadMatriz.length-1;i++) {
			for(int j=i+1; j<cuadMatriz.length; j++) {
				if (cuadMatriz[i]>cuadMatriz[j]) {
					aux=cuadMatriz[i];
					cuadMatriz[i]=cuadMatriz[j];
					cuadMatriz[j]=aux;
				}
			}
		}
		//recompongo la matriz bidimensional con los datos de la matriz monodimensional
		k=0;
		for(int i=0; i<laMatriz.length; i++) {
			for(int j=0; j<laMatriz[0].length; j++) {
				laMatriz[i][j]=cuadMatriz[k];
				k++;
			}
		}
		return laMatriz;
	}
	/**
	 * busca los elementos que acaban en n y los sustituye por X a la hora de imprimir
	 * @param laMatriz
	 * @param n
	 */
	public static void buscaNumero(int[][]laMatriz, int n) {
		
		for(int i=0; i<laMatriz.length; i++) {
			for(int j=0; j<laMatriz[0].length; j++) {
				if((laMatriz[i][j] % 10)==n)
					System.out.printf(" X ");
				else
					System.out.printf("%2d ",laMatriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("Números acabados es:" +n);
	}
	/**
	 * método que ordena un array de string por el largo de las cadenas.
	 */
	public static void ordenaMeses() {
		int aux;
		String aux1;
		int[] letraMeses=new int[meses.length];
		
		for (int i=0; i< meses.length; i++) {
			letraMeses[i]=meses[i].length();
		}
		for(int i=0; i<letraMeses.length-1;i++) {
			for(int j=i+1; j<letraMeses.length; j++) {
				if (letraMeses[i]>letraMeses[j]) {
					aux=letraMeses[i];
					aux1=meses[i];
					letraMeses[i]=letraMeses[j];
					meses[i]=meses[j];
					letraMeses[j]=aux;
					meses[j]=aux1;
				}
			}
		}
		//salida por pantalla
		for(int i=0; i<letraMeses.length;i++) {
			System.out.print(meses[i]+", ");
		}
		System.out.println();
		
	}
}
