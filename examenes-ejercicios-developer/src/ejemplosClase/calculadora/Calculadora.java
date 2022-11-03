package ejemplosClase.calculadora;

public class Calculadora {
	//atributos
	private int resultado;
	
	//contructores
	public Calculadora() {
		this.resultado=0;
	}
	public Calculadora(int valorInicial) {
		this.resultado=valorInicial;
	}
	
	//getters y setters
	public int getResultado() {
		return resultado;
	}
	
	//métodos
	public void sumar(int n) {
		this.resultado = this.resultado+n;
	}
	public void restar(int n) {
		this.resultado=this.resultado-n;
	}
	public void multiplicar(int n) {
		this.resultado= this.resultado * n;
	}
	public void dividir(int n) {
		if(n!=0)
			this.resultado=this.resultado/n;
	}
	public void fatorial() {
		int fact=resultado;
		for(int i=resultado-1; i>0;i--) {
			fact= fact*i;
		}
		this.resultado=fact;
	}
	public void inicializar() {
		this.resultado=0;
	}
	
	
}
