package ejemplosClase.cuentas;
/**Solución que permite abrir mas cuentas, utilizando un array para guardar los objetos cuentas.
 * El array es limitado, en este caso he puesto una dimensión de 10 => luego te permite habrir hasta 10 cuentas.
 * Para no tener este problema seria mas recomendable utilizar un array autodimensionable tipo ArrayList.
 * Ahora para realizar un movimiento hay que preguntar en que cuenta.
*/
import java.util.Scanner;

public class CuentaMain2 {
	static Cuenta[] miscuentas=new Cuenta[10];
	static int contador=0;

	public static void main(String[] args) {
		int opcion, ncuenta;
		double importe;
		double saldo;
		//boolean haycuenta; //bandera para saber si existen cuentas.
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Elige una opción del menú:");
			System.out.println("1 Crear cuenta \n"+
					"2 Crear con saldo \n"+
					"3 Ingresar \n" +
					"4 Retirar \n" +
					"5 Moroso? \n" +
					"6 Salir");
			opcion=entrada.nextInt();
			switch(opcion) {
				case 1://crear
					do {
						System.out.println("Introduzca número cuenta a crear:");
						ncuenta = entrada.nextInt();
						if (!existeNcuenta(ncuenta)) {
							miscuentas[contador] = new Cuenta(ncuenta);
							contador++;
							break;
						}
						System.out.println("Esta cuenta ya existe, intentelo otra vez.");
					}while(true);
					break;
				case 2://crear con saldo
					do {
						System.out.println("Introduzca número cuenta a crear:");
						ncuenta = entrada.nextInt();
						if(!existeNcuenta(ncuenta)) {
							System.out.println("Con qué saldos deseas abrir la cuenta?");
							importe =entrada.nextDouble();
							miscuentas[contador] = new Cuenta(ncuenta, importe);
							contador++;
							break;
						}
						System.out.println("Esta cuenta ya existe, intentelo otra vez.");
					}while(true);
					break;
				case 3://ingresar
					if(miscuentas[0]!=null){
						do {
							imprimeNcuentas();
							System.out.println("Elige nº cuenta:");
							ncuenta=entrada.nextInt();
							if (existeNcuenta(ncuenta)) {
								System.out.println("Importe a ingresar");
								importe = entrada.nextDouble();
								int indice=dimeIndice(ncuenta);
								saldo=miscuentas[indice].ingresar(importe);
								System.out.println("Operación realizada, su saldo actual"
										+ " en la cuenta" + ncuenta +"  es: \n"+saldo);
								break;
							}
							else {
								System.out.println("Elige bien la cuenta, esa no existe");
							}
						}while(true);
					}
					else {
						System.out.println("Aún no hay creada ninguna cuenta:");
					}
					break;
				case 4://retirar
					if(miscuentas[0]!=null) {
						do {
							imprimeNcuentas();
							System.out.println("Elige nº cuenta:");
							ncuenta=entrada.nextInt();
							if (existeNcuenta(ncuenta)) {
								System.out.println("Importe a retirar");
								importe = entrada.nextDouble();
								int indice=dimeIndice(ncuenta);
								saldo=miscuentas[indice].retirar(importe);
								System.out.println("Operación realizada, su saldo actual es: \n"+saldo);
								break;
							}
							else {
								System.out.println("Elige bien la cuenta, esa no existe");
							}
						}while(true);
					}
					else {
							System.out.println("Elige la opción crear cuenta antes de nada\n");
					}					
					break;
				case 5:
					if(miscuentas[0]!=null) {//existen cuentas
						do {
							imprimeNcuentas();
							System.out.println("Elige nº cuenta:");
							ncuenta=entrada.nextInt();
							if (existeNcuenta(ncuenta)) {
								int indice=dimeIndice(ncuenta);
								if (miscuentas[indice].isMoroso()) {
									System.out.println("Está en números rojos, su saldo es:\n"+ miscuentas[indice].getSaldo());
								}
								else {
									System.out.println("NO está en números rojos, su saldo es:\n"+ miscuentas[indice].getSaldo());
								}
								break;
							}
						}while(true);
					}
					else {
						System.out.println("Elige la opción crear cuenta antes de nada\n");
					}					
					break;
				case 6:
					System.out.println("Aaaaaaaaaadios");
					break;
				default:
					System.out.println("Debes elegir alguna opción\n");
			}
			

	}while(opcion!=6);
		entrada.close();
	}
	private static boolean existeNcuenta(int ncuenta) {
		for (int i =0; i< contador; i++) {
			if (ncuenta == miscuentas[i].getNcuenta())
				return true;
		}
		return false;
	}
	private static void imprimeNcuentas() {
		System.out.println();
		for (int i =0; i< contador; i++) {
			System.out.println("número cuentas: "+miscuentas[i].getNcuenta()+ ", saldo: "+ miscuentas[i].getSaldo());
		}
		System.out.println();
	}
	private static int dimeIndice(int ncuenta) {
		
		for (int i =0; i< contador; i++) {
			if(ncuenta==miscuentas[i].getNcuenta())
				return i;
		}
		return ncuenta;		
	}
}
