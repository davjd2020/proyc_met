package Negocio;

import java.util.ArrayList;

public class ListaVehiculo {
	private ArrayList<Vehiculo> vehiculos;

	public ListaVehiculo() {
		super();
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void aniadir(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public void quitar(Vehiculo vehiculo) {
		vehiculos.remove(vehiculo);
	}
	
	@Override
	public String toString() {
		String salida="";
		for (Vehiculo vehiculo : vehiculos) {
			salida+=(vehiculo.toString()+"\n");
		}
		return salida;
	}
}