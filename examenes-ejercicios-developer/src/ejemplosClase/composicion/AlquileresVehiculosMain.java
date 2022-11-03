package ejemplosClase.composicion;

public class AlquileresVehiculosMain {

	public static void main(String[] args) {

		
		Vehiculo vehiculo1 = new Vehiculo("1234LDS", "MERCEDES", "CLS", "NEGRO", 50); 
		
		Cliente cliente1 = new Cliente("123456789L","JOSE ANTONIO", "MOGOLLON");
		
		VehiculoAlquilado alquilerVehiculo = new VehiculoAlquilado(cliente1, vehiculo1, 7,12,2020,10);
		
		System.out.println(alquilerVehiculo.getCliente().getNif());
		
		System.out.println(alquilerVehiculo.getVehiculo().getMatricula());
	}

}
