package ejemplosClase.cuenta2;

public class Contador {
	private int cont;
	
	public Contador() {
		this.cont=0;
	}
	
	public Contador(int cont) {
		if(cont<0)
			this.cont=0;
		else
			this.cont=cont;
	}
	
	/**
	 * @return el cont
	 */
	public int getCont() {
		return cont;
	}

	public void incrementa() {

			cont++;
	}
	
	public void decrementa() {
		if(this.cont<0)
			cont=0;
		else
			cont--;		
	}
	
	public String toString() {
		return "El valor del contador actual es: "+ this.cont;
	}
}
