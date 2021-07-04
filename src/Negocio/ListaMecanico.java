package Negocio;

import java.util.ArrayList;

public class ListaMecanico {
	private ArrayList<Mecanico> mecanicos;

	public ListaMecanico() {
		super();
		this.mecanicos = new ArrayList<Mecanico>();
	}
	
	public void aniadir(Mecanico mecanico) {
		mecanicos.add(mecanico);
	}
	
	public void quitar(Mecanico mecanico) {
		mecanicos.remove(mecanico);
	}
	
	@Override
	public String toString() {
		String salida="";
		for (Mecanico mecanico: mecanicos) {
			salida+=(mecanico.toString()+"\n");
		}
		return salida;
	}
}