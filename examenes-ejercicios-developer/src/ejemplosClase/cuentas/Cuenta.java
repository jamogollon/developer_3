package ejemplosClase.cuentas;

public class Cuenta {
	private int nCuenta;
	private double saldo;
	
	
	public Cuenta(int ncuenta) {
		this.nCuenta=ncuenta;
		this.saldo=0;
	}
	public Cuenta(int ncuenta, double saldo) {
		this.nCuenta=ncuenta;
		this.saldo=saldo;
	}
	
	public int getNcuenta() {
		return nCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double ingresar(double importe) {
		saldo= saldo+importe;
		return saldo;
	}
	
	public double retirar(double importe) {
		saldo=saldo-importe;
		return saldo;
	}
	
	public boolean isMoroso() {
		if (saldo<0) {
			return true;
		}
		return false;
	}
}
