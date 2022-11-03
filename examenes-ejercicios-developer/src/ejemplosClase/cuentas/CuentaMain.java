package ejemplosClase.cuentas;
/**Solución permitiendo abrir una sola cuenta.
*/
import java.util.Scanner;

public class CuentaMain {

	public static void main(String[] args) {
		int opcion;
		double importe;
		double saldo;
		boolean hayCuenta=false;//bandera para saber si se ha creado la cuenta.
		Scanner entrada = new Scanner(System.in);
		Cuenta micuenta = null;

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
					if(!hayCuenta) {
						micuenta = new Cuenta(357);
						hayCuenta=true;
					}
					else {
						System.out.println("Elige otra opción que ya se ha creado la cuenta");
					}
					break;
				case 2://crear con saldo
					if(!hayCuenta) {
						System.out.println("Con qué saldos deseas abrir la cuenta?");
						importe =entrada.nextDouble();
						micuenta = new Cuenta(485, importe);
					}
					else {
						System.out.println("Elige otra opción que ya se ha creado la cuenta\n");
					}

					break;
				case 3://ingresar
					if(hayCuenta) {
						System.out.println("Importe a ingresar");
						importe = entrada.nextDouble();
						saldo=micuenta.ingresar(importe);
						System.out.println("Operación realizada, su saldo actual es: \n"+saldo);
					}
					else {
						System.out.println("Elige la opción crear cuenta antes de nada\n");
					}
						
					break;
				case 4:
					if(hayCuenta) {
						importe = entrada.nextDouble();
						saldo=micuenta.retirar(importe);
						System.out.println("Operación realizada, su saldo actual es: \n"+saldo);
					}
					else {
						System.out.println("Elige la opción crear cuenta antes de nada\n");
					}					System.out.println("Importe a retirar");
					break;
				case 5:
					if (micuenta.isMoroso()) {
						System.out.println("Está en números rojos, su saldo es:\n"+ micuenta.getSaldo());
					}
					else {
						System.out.println("NO está en números rojos, su saldo es:\n"+ micuenta.getSaldo());

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

}
