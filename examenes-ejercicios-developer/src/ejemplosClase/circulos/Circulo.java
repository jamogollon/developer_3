package ejemplosClase.circulos;

public class Circulo {
	private int radio;
	private double longitud;
	private double area;
	private String color;
	
	public Circulo() {
	}
	
	public Circulo(int radio) {
		this.radio=radio;
	}

	/**
	 * @return el radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio el radio a establecer
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * @return el longitud
	 */
	public double getLongitud() {
		if(longitud==0)
			calculaLongitud();
		return longitud;
	}

	/**
	 * @return el area
	 */
	public double getArea() {
		if (area==0)
			calculaArea();
		return area;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	private void calculaLongitud() {
		this.longitud= 2*Math.PI*this.radio;
	}
	private void calculaArea() {
		this.area=Math.PI*Math.pow(radio, 2);
	}
}
