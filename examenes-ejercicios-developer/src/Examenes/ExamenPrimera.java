package Examenes;
/**
 * Examen 1� Evaluaci�n, Dam1 20/11/2020
1-	(2) Dise�a un programa que imprima en consola el siguiente men�:
ELIGE UNA OPCI�N Y PRESIONA LA LETRA CORRESPONDIENTE:
A 	Crear una matriz.
B	C�lculos con matriz.
C	Ordena la matriz.
D	Busca n�mero acabado.
E	Ordenar array de strings 
S	Salir.
2-	(1.25) La opci�n A del men�, debe llamar a un m�todo que devuelva una matriz bidimensional y recibe dos par�metros (fila y columna) que los proporciona el usuario. Debe rellenar la matriz con n�meros aleatorios excepto la diagonal principal que ser�n ceros. Despu�s imprimir por pantalla.
3-	 (1.25) La opci�n B del men�, debe llamar a un m�todo que no devuelve nada y que se le pasa como par�metro la matriz.  Debe calcular e imprimir por consola, el m�ximo, m�nimo y media de los elementos de la matriz.
4-	(2) La opci�n C del men�, debe llamar a un m�todo que devuelve una matriz ordenada por el m�todo de intercambio, y que recibe como par�metro la matriz desordenada. Despu�s se imprime por pantalla.
5-	(1.5) La opci�n D del men�, debe ejecutar un m�todo que se le pasa la matriz y un n�mero entero �n� a introducir por el usuario y no devuelve nada. Debe buscar los elementos de la matriz que acaban en este n�mero �n� e imprimir por pantalla la matriz, pero donde hay un n�mero de con estas condiciones aparecer� una �X�. Ejemplo si n=2, busca todos los n�meros dentro de la matriz acabados en 2 (2, 12, 22, 32, 42, �) y en su lugar imprime una �X�. 
6-	 (2) La opci�n F del men�, debe ejecutar un m�todo que no devuelve nada y no tiene par�metros. Utiliza el array de strings definido como variable de clase (es decir tiene visi�n en toda la clase), siguiente:
Meses={�enero�, �febrero�, �marzo�, �abril�, �mayo�, �junio�, �julio�, �agosto�, �septiembre�, �octubre�, �noviembre�, �diciembre�}
Debe imprimirse por consola, este mismo array pero ordenado por el m�todo burbuja, los meses seg�n el n�mero de letras que contienen. Es decir, primero el m�s corto y el �ltimo el m�s largo.
7-	La opci�n S finaliza el programa. Es decir, si no se pulsa S, el programa sigue funcionando, luego se puede volver a ejecutar cualquier opci�n del men� una y otra vez.

(es evidente que, si no se ejecuta la opci�n A en primer lugar, no ser� posible las dem�s a excepci�n de la F y S, tener esto en cuenta.)
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
						System.out.println("Debe generarse la matriz antes con la opci�n de men� A");
					break;
				case 'C':
					if(banderaCasoA) {
						miMatriz=ordenarMatriz(miMatriz);
						imprimeMatriz(miMatriz);
					}
					else
						System.out.println("Debe generarse la matriz antes con la opci�n de men� A");
					break;
				case 'D':
					if(banderaCasoA) {
						System.out.println("Introduce un n�mero: ");
						n=entrada.nextInt();
						buscaNumero(miMatriz, n);
					}
					else
						System.out.println("Debe generarse la matriz antes con la opci�n de men� A");					
					break;
				case 'E':
					ordenaMeses();
					break;
				case 'S':
					break;
				default:System.out.println("Debe elegir una opci�n del men�");
			}
		}while(opcion!='S');
		entrada.close();

	}
	/**
	 * m�todo que imprime el men� principal, se llama cada vez que se ejecuta alguna opci�n.
	 */
	public static void imprimeMenu() {
		System.out.println();
		System.out.println("ELIGE UNA OPCI�N Y PRESIONA LA LETRA CORRESPONDIENTE");
		System.out.println("A - Crea una matriz. ");
		System.out.println("B - C�lculos con matriz. ");
		System.out.println("C - Ordena matriz. ");
		System.out.println("D - Busca n�mero acabado. ");
		System.out.println("E - Ordena array de string. ");
		System.out.println("S - Salir. ");
		System.out.println();
	}
	/**
	 * m�todo que recibe la dimensi�n(filas y columnas) y crea una matriz aleatoria a excepci�n de la diagonal
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
	 * m�todo que recibe la matriz como par�metros y la imprime formateada por pantalla
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
	 * m�todo que realiza los calculos de maximo, m�nimo y media de la matriz.
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
		System.out.println("El m�ximo es: "+ max);
		System.out.println("El m�nimo es: "+ min);
		System.out.printf("La media es: %.2f", suma/cont);
		System.out.println();

	}
	/**
	 * m�todo que recibe una matriz desordenada y la ordena utilizando
	 * el m�todo de intercambio
	 * @param laMatriz
	 * @return la matriz ordenada
	 */
	public static int[][] ordenarMatriz(int[][]laMatriz){
		int aux,k=0;
		int[] cuadMatriz= new int[laMatriz.length*laMatriz[0].length];
		
		//paso el array bidimensional a uno con una dimensi�n
		for(int i=0; i<laMatriz.length; i++) {
			for(int j=0; j<laMatriz[0].length; j++) {
				cuadMatriz[k]=laMatriz[i][j];
				k++;
			}
		}
		//aplico m�todo del intercambio al array de una dimensi�n para ordenarlo
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
		System.out.println("N�meros acabados es:" +n);
	}
	/**
	 * m�todo que ordena un array de string por el largo de las cadenas.
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
