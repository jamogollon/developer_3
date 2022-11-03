package ejemplosClase.contador;

public class Contador {
	private int cont;
	
	public Contador() {
		this.cont=0;
	}
	
	public Contador(int cont) {
		if(cont<0)
			this.cont=0;
		else if(cont>100)
			this.cont=100;
		else
			this.cont=cont;
	}
	
	public int getCont() {
		return cont;
	}
	
	public void incrementa() {
		if(this.cont>=100)
			this.cont=100;
		else
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
