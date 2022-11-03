package Examen.Segundo;

import java.io.Serializable;

public class Pedidos implements Serializable{
	//ATRIBUTOS DE CLASE
	public static int numPedidos;//no puede repetirse. Por ejemplo autoincremental, contador.
	public static float facturacionDia;
	//ATRIBUTOS DE OBJETO
	private int codPedido;
	private Clientes cliente;
	private Productos tipo;
	private int cantidad;
	private float pvp;
	
	public Pedidos(Clientes cliente, Productos tipo, int cantidad) {
		numPedidos++;
		Variables.incrementaCodPedidos();//incrementa le pedido
		this.codPedido= Variables.getUltimoCodPedido();
		this.cliente = cliente;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.calculaPvp();
		facturacionDia+=this.pvp;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Productos getTipo() {
		return tipo;
	}

	public void setTipo(Productos tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPvp() {
		return pvp;
	}

	public void calculaPvp() {
		switch(this.tipo) {
		case CARNE:
			this.pvp= this.cantidad * Variables.getPvpCarne();
			break;
		case POLLO:
			this.pvp= this.cantidad * Variables.getPvpPollo();
			break;
		case VEGETARIANO:
			this.pvp= this.cantidad * Variables.getPvpVegetariano();
		}
	}

	public static int getNumPedidos() {
		return numPedidos;
	}

	public static float getFacturacionDia() {
		return facturacionDia;
	}

	public int getCodPedido() {
		return codPedido;
	}

	@Override
	public String toString() {
		return "Pedidos [codPedido=" + codPedido + ", cliente=" + cliente + ", tipo=" + tipo + ", cantidad=" + cantidad
				+ ", pvp=" + pvp + "]";
	}
	

	
	
	
	
	
}
