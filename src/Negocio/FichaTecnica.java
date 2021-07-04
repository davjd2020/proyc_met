package Negocio;

public class FichaTecnica {
	private static int numFicha=0;
	private Vehiculo vehiculo;
	private ListaServicio servicios;
	private Mecanico mecanico;
	
	public FichaTecnica(Vehiculo vehiculo, Mecanico mecanico) {
		this.numFicha++;
		this.vehiculo = vehiculo;
		this.servicios = new ListaServicio();
		this.mecanico = mecanico;
	}
	
	public int getNumFicha() {
		return numFicha;
	}
	public void setNumFicha(int numFicha) {
		this.numFicha = numFicha;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public ListaServicio getServicios() {
		return servicios;
	}
	public void setServicios(ListaServicio servicios) {
		this.servicios = servicios;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public void registrarServicioRealizado(Servicio servicio) {
		this.servicios.aniadir(servicio);
		System.out.println("Servicio Registrado Exitosamente.");
	}
	
	@Override
	public String toString() {
		return "FichaTecnica [numFicha=" + numFicha + ", vehiculo=" + vehiculo + ", servicios=" + servicios.toString()
				+ ", mecanico=" + mecanico + "]";
	}
}