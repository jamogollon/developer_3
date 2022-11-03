package ejemplosClase.cuenta2;


public class Cuenta2 {
	//Atributos de clase
	private static Contador contador=new Contador();
	private static double saldoTotal=0;
	
	//Atributos de objeto
	private int nCuenta;
	private double saldo;
	
	//Constructores
	public Cuenta2(int ncuenta) {
		this.nCuenta=ncuenta;
		this.saldo=0;
		Cuenta2.contador.incrementa();

	}
	public Cuenta2(int ncuenta, double saldo) {
		this.nCuenta=ncuenta;
		this.saldo=saldo;
		Cuenta2.contador.incrementa();
		Cuenta2.saldoTotal=Cuenta2.saldoTotal+saldo;

	}
	//getters y setters
	
	public static int getContadorDeCuentas() {
		return Cuenta2.contador.getCont();
		
	}
	
	public static double getSaldoTotal() {
		return Cuenta2.saldoTotal;
	}

	public int getNcuenta() {
		return nCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	//metodos
	public double ingresar(double importe) {
		saldo= saldo+importe;
		Cuenta2.saldoTotal=Cuenta2.saldoTotal+importe;
		return saldo;
	}
	
	public double retirar(double importe) {
		saldo=saldo-importe;
		Cuenta2.saldoTotal=Cuenta2.saldoTotal-importe;
		return saldo;
	}
	
	public boolean isMoroso() {
		if (saldo<0) {
			return true;
		}
		return false;
	}
}
