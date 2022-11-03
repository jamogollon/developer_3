package ejemplosClase.contador;

public class ContadorMain {

	public static void main(String[] args) {

		Contador miContador= new Contador();
		
		miContador.incrementa();
		System.out.println(miContador.toString());
		miContador.decrementa();
		System.out.println(miContador.toString());
		
		Contador miContador1= new Contador(50);
		
		miContador1.incrementa();
		System.out.println(miContador1.toString());
		miContador1.decrementa();
		System.out.println(miContador1.toString());
		
		
	}

}
