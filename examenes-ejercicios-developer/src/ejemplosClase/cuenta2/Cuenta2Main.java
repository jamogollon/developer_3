package ejemplosClase.cuenta2;
/**
 * clase que contiene main normal para comprobación de ejercicio, sin menú.
 * @author Antonio Moreno
 *
 */
public class Cuenta2Main {

	public static void main(String[] args) {
		
		Cuenta2 miCuenta1 = new Cuenta2(1);
		Cuenta2 miCuenta2 = new Cuenta2(2, 200);
		Cuenta2 miCuenta3 = new Cuenta2(3, 300);
		Cuenta2 miCuenta4 = new Cuenta2(4);
		
		System.out.println("El número de cuentas creado es: "+ Cuenta2.getContadorDeCuentas());
		System.out.println("El saldo total de todas las cuentas es: "+ Cuenta2.getSaldoTotal());
		//ingresos
		miCuenta1.ingresar(500);
		miCuenta4.ingresar(800);
		System.out.println("Ahora el saldo total de todas las cuentas es: "+ Cuenta2.getSaldoTotal());

		//retiradas
		miCuenta2.retirar(50);
		miCuenta3.retirar(350);
		System.out.println("Ahora el saldo total de todas las cuentas es: "+ Cuenta2.getSaldoTotal());

		//es moroso
		System.out.println("La cuenta nº "+ miCuenta1.getNcuenta()+" es: "+ miCuenta1.isMoroso()+
				" que sea moroso ya que tiene"
				+ " un saldo de: " + miCuenta1.getSaldo() );
		System.out.println("La cuenta nº "+ miCuenta3.getNcuenta()+" es: "+ miCuenta3.isMoroso()+
				" que sea moroso ya que tiene"
				+ " un saldo de: " + miCuenta3.getSaldo() );

	}

}
