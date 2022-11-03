package ejemplosClase.composicion;

public class VehiculoAlquilado {
	private Cliente cliente;
	private Vehiculo vehiculo;
	private int diaAlquiler;
	private int mesAlquiler;
	private int anoAlquiler;
	private int totalDiasAlquiler;
	/**
	 * @param cliente
	 * @param vehiculo
	 * @param diaAlquiler
	 * @param mesAlquiler
	 * @param anoAlquiler
	 * @param totalDiasAlquiler
	 */
	public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int anoAlquiler,
			int totalDiasAlquiler) {
		super();
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.diaAlquiler = diaAlquiler;
		this.mesAlquiler = mesAlquiler;
		this.anoAlquiler = anoAlquiler;
		this.totalDiasAlquiler = totalDiasAlquiler;
	}
	/**
	 * @return el cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @return el vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @return el diaAlquiler
	 */
	public int getDiaAlquiler() {
		return diaAlquiler;
	}
	/**
	 * @param diaAlquiler el diaAlquiler a establecer
	 */
	public void setDiaAlquiler(int diaAlquiler) {
		this.diaAlquiler = diaAlquiler;
	}
	/**
	 * @return el mesAlquiler
	 */
	public int getMesAlquiler() {
		return mesAlquiler;
	}
	/**
	 * @param mesAlquiler el mesAlquiler a establecer
	 */
	public void setMesAlquiler(int mesAlquiler) {
		this.mesAlquiler = mesAlquiler;
	}
	/**
	 * @return el anoAlquiler
	 */
	public int getAnoAlquiler() {
		return anoAlquiler;
	}
	/**
	 * @param anoAlquiler el anoAlquiler a establecer
	 */
	public void setAnoAlquiler(int anoAlquiler) {
		this.anoAlquiler = anoAlquiler;
	}
	/**
	 * @return el totalDiasAlquiler
	 */
	public int getTotalDiasAlquiler() {
		return totalDiasAlquiler;
	}
	/**
	 * @param totalDiasAlquiler el totalDiasAlquiler a establecer
	 */
	public void setTotalDiasAlquiler(int totalDiasAlquiler) {
		this.totalDiasAlquiler = totalDiasAlquiler;
	}
	
	
}
