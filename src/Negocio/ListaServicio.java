package Negocio;

import java.util.ArrayList;

public class ListaServicio {
	private ArrayList<Servicio> servicios;

	public ListaServicio() {
		this.servicios = new ArrayList<Servicio>();
	}
	
	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	public void aniadir(Servicio servicio) {
		servicios.add(servicio);
	}
	
	public void quitar(Servicio servicio) {
		servicios.remove(servicio);
	}
	
	public double valoresServicios() {
		double subT=0.0;
		for (Servicio servicio : servicios) {
			subT += servicio.getCosto();
		}
		return subT;
	}

	@Override
	public String toString() {
		String salida="";
		int cont=0;
		for (Servicio servicio : servicios) {
			cont++;
			salida+=(cont+": "+servicio.toString()+"\n");
		}
		return salida;
	}
}