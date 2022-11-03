package ejemplosClase.persona;

public class PersonaMain {

	public static void main(String[] args) {

		float sueldo=2000;
		String nss="06/123456789A";
		String direccion="San Antoniom 3";
		String nombre= "Manuel";
		String dni="123456789J";
		
		Persona persona1=new Persona(dni, nombre, direccion, nss, sueldo);
		
		System.out.println(persona1.toString());
		System.out.println();
		persona1.setSueldo(7000);
		
		System.out.println(persona1.getSueldo());
		
		persona1.setNombre("Jose");
		System.out.println();
		System.out.println(persona1.getAll());
		
	}

}
