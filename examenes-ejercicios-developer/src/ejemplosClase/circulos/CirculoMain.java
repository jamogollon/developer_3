package ejemplosClase.circulos;

public class CirculoMain {

	public static void main(String[] args) {
		double longitud;
		double area;
		int radio;
		
		Circulo miCirculo=new Circulo(5);
		
		longitud=miCirculo.getLongitud();
		area=miCirculo.getArea();
		miCirculo.setColor("Rojo");
		System.out.println("el circulo de radio: "+ miCirculo.getRadio()+
				"Tiene de longitud: "+ longitud + " de área: "+ area +
				" y  de color: "+ miCirculo.getColor());
		
		
		Circulo miCirculo1=new Circulo(7);
		
		longitud=miCirculo1.getLongitud();
		area=miCirculo1.getArea();
		miCirculo1.setColor("Azul");		
		System.out.println("el circulo de radio: "+ miCirculo1.getRadio()+
				"Tiene de longitud: "+ longitud + " y de área: "+ area+
				" y  de color: "+ miCirculo.getColor());
		
		
		Circulo miCirculo2=new Circulo();
		
		miCirculo2.setRadio(8);
		longitud=miCirculo2.getLongitud();
		area=miCirculo2.getArea();
		miCirculo2.setColor("Verde");		
		System.out.println("el circulo de radio: "+ miCirculo.getRadio()+
				"Tiene de longitud: "+ longitud + " y de área: "+ area+
				" y  de color: "+ miCirculo.getColor());

	}

}
