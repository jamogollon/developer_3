package ejemplosClase.cuenta2;
/** 
 * clase main con menú elaborado.
 * crea cuenta aleatoriamente(0-100), comprueba si existe. Guarda las instancias en un array de objetos
 * Comprueba si un número de cuenta ya existe antes de crearlo...
 * @author Antonio Moreno
 */
import java.util.Scanner;

public class Cuenta2Main1 {
	//Atributos de clase
	private static Cuenta2[] miscuentas=new Cuenta2[100];
	//private static int contador;

	public static void main(String[] args) {
		int opcion, ncuenta;
		double importe;
		double saldo;
		boolean seguirIteracion=true; //bandera.
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Elige una opción del menú:");
			System.out.print("1 Crear cuenta \n"+
							 "2 Crear con saldo \n"+
							 "3 Ingresar \n" +
							 "4 Retirar \n" +
							 "5 Moroso? \n" +
							 "6 Listar todas las cuentas \n"+
							 "7 Salir \n");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1://crear
				do {
					//System.out.println("Introduzca número cuenta a crear:");
					//ncuenta = entrada.nextInt();
					ncuenta= (int) (Math.random()*100);//genero el número aleatoriamente
					if (miscuentas[0]!=null && !existeNcuenta(ncuenta)) {//si no es la primera cuenta y no existe ya
						miscuentas[Cuenta2.getContadorDeCuentas()]=new Cuenta2(ncuenta);
						seguirIteracion=false;
					}
					else if(miscuentas[0]==null){//si es la primera cuenta
						miscuentas[0] = new Cuenta2(ncuenta);
						seguirIteracion=false;
					}
					else {
						System.out.println("Esta cuenta ya existe, intentelo otra vez.");
						seguirIteracion=true;
					}
					
				}while(seguirIteracion);
				break;
			case 2://crear con saldo
				do {
					//System.out.println("Introduzca número cuenta a crear:");
					//ncuenta = entrada.nextInt();
					ncuenta= (int) (Math.random()*100);//genero el número aleatoriamente
					if (miscuentas[0]!=null && !existeNcuenta(ncuenta)) {//si no es la primera cuenta y no existe ya
						System.out.println("Con qué saldo deseas abrir la cuenta?");
						importe =entrada.nextDouble();
						miscuentas[Cuenta2.getContadorDeCuentas()]=new Cuenta2(ncuenta,importe);
						seguirIteracion=false;
					}
					else if(miscuentas[0]==null){//si es la primera cuenta
						System.out.println("Con qué saldo deseas abrir la cuenta?");
						importe =entrada.nextDouble();
						miscuentas[0] = new Cuenta2(ncuenta, importe);
						seguirIteracion=false;
					}
					else {
						System.out.println("Esta cuenta ya existe, intentelo otra vez.");
						seguirIteracion=true;
					}
					
				}while(seguirIteracion);
				break;
			case 3://ingresar
				if(miscuentas[0]!=null){//si existe alguna cuenta
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
			case 5://es moroso
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
			case 6://listar todas las cuentas con sus saldos
				System.out.println("El número de cuentas totales creadas hasta ahora, son: "+ Cuenta2.getContadorDeCuentas());
				imprimeNcuentas();
				System.out.println("El saldo total es: "+ Cuenta2.getSaldoTotal());
				System.out.println();
				break;
			case 7:
				System.out.println("Aaaaaaaaaadios");
				break;
			default:
				System.out.println("Debes elegir alguna opción\n");
			}


		}while(opcion!=7);
		entrada.close();
	}
	private static boolean existeNcuenta(int ncuenta) {
		for (int i =0; i< Cuenta2.getContadorDeCuentas(); i++) {
			if (ncuenta == miscuentas[i].getNcuenta())
				return true;
		}
		return false;
	}
	private static void imprimeNcuentas() {
		System.out.println();
		for (int i =0; i< Cuenta2.getContadorDeCuentas(); i++) {
			System.out.println("número cuentas: "+miscuentas[i].getNcuenta()+ ", saldo: "+ miscuentas[i].getSaldo());
		}
		System.out.println();
	}
	private static int dimeIndice(int ncuenta) {

		for (int i =0; i< Cuenta2.getContadorDeCuentas(); i++) {
			if(ncuenta==miscuentas[i].getNcuenta())
				return i;
		}
		return ncuenta;		
	}

}
