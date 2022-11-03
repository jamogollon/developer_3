package ejemplosClase.pizza;

public class Pizza {
	//Atributos de clase
	private static int nPedidos;
	private static int nServidos;
	//Atributos de objeto
	private String tamano;
	private String tipo;
	private String estado;
	//Constructor
	public Pizza(String tamano, String tipo) {
		this.tamano=tamano;
		this.tipo=tipo;
		Pizza.nPedidos++;
		this.estado="pedida";
	}
	//getters y setters
	/**
	 * método de clase que devuelve el número de pedidos
	 * no es necesario instanciar un objeto de la clase para acceder a este método
	 * @return el nPedidos
	 */
	public static int getnPedidos() {
		return Pizza.nPedidos;
	}

	/**
	 * método de clase que devuelve el número de pedidos servidos
	 * no es necesario instanciar un objeto de la clase para acceder a este método
	 * @return el nServidos
	 */
	public static int getnServidos() {
		return Pizza.nServidos;
	}

	/**
	 * @return el tamano
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * @return el tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return el estado
	 */
	public String getEstado() {
		return estado;
	}
	//Métodos operacionales
	public void servir() {
		
		if(!this.estado.equals("Servido")) {
			this.estado="Servido";
			Pizza.nServidos++;//a los atributos estaticos o de clase se accede así.
			Pizza.nPedidos--;//o también como "nServidos". Pero nunca con "this"
		
		}
		else {
			System.out.println("Esta pizza ya se ha servido.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
