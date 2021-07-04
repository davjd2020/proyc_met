package Negocio;

import java.util.ArrayList;

public class ListaPropietario {
	private ArrayList<Propietario> propietarios;

	public ListaPropietario(){
		super();
		this.propietarios = new ArrayList<Propietario>();
	}
	
	public void aniadir(Propietario propietario) {
		propietarios.add(propietario);
	}
	
	public void quitar(Propietario propietario) {
		propietarios.remove(propietario);
	}
	
	@Override
	public String toString() {
		String salida="";
		for (Propietario propietario: propietarios) {
			salida+=(propietario.toString()+"\n");
		}
		return salida;
	}
}