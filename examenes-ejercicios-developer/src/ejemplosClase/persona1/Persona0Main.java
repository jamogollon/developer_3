package ejemplosClase.persona1;
/**
 * 

Crea un objeto para cada caso.

Un mayor de edad.
Un menor de edad.
Uno con sobrepeso.
Uno con menos peso.
 */
public class Persona0Main {
	
	public static void main(String[] args) {

		Persona0 persona1=new Persona0("Manuel","Lara","Gonzalez");
		persona1.setEdad(25);
		
		Persona0 persona2=new Persona0("José","Tomas","Santana", Persona0.GENERO_MASCULINO);
		persona2.setEdad(15);
		
		Persona0 persona3=new Persona0("María","Ruis","Millan", Persona0.GENERO_FEMENINO);
		persona3.setPeso(120);
		persona3.setEdad(25);
		persona3.setAltura(1.80);
		
		Persona0 persona4=new Persona0("José","Romero","Garcia", Persona0.GENERO_DESCONOCIDO);
		persona4.setEdad(40);
		persona4.setPeso(45);
		persona4.setAltura(1.80);

		System.out.println(persona1.toString());
		System.out.println("Esta persona es "+ persona1.isMayorDeEdad() + " que es mayor de edad");
		System.out.println(persona2.toString());
		System.out.println("Esta persona es "+ persona2.isMayorDeEdad() + " que es mayor de edad");
		System.out.println(persona3.toString());
		System.out.println("Esta persona tiene de ICM: " + persona3.calcularIMC() + "y por lo tanto es: "+
		persona3.isSobrepeso()+ " que tenga sobrepeso");
		System.out.println(persona4.toString());
		System.out.println("Esta persona tiene de ICM: " + persona4.calcularIMC() + "y por lo tanto es: "+
		persona4.isSobrepeso()+ " que tenga sobrepeso");


	}
}
