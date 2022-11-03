package ejemplosClase.persona2;

public class MainPersona2 {

	public static void main(String[] args) {
		Persona2 mipersona = new Persona2("ANTONIO","MORENO","ALONSO");
		mipersona.setFechaNacimiento(1, 5, 1989);
		mipersona.setFechNac(25, 6, 2000);
		Persona2 mipersona1= new Persona2(mipersona);
		//Persona2 mipersona2= mipersona.hacerCopiaPersona(mipersona);
	}
	
	
}
