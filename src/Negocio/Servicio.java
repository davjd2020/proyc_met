package Negocio;

import java.util.Scanner;

public class Servicio {
	private String tipo;
	private String detalle;
	private double costo;
	
	public Servicio() {
		registrarServicio();
	}
	
	public Servicio(String tipo, String detalle, double costo) {
		this.tipo = tipo;
		this.detalle = detalle;
		this.costo = costo;
	}

	public void registrarServicio() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el tipo del servicio:");
		String aux= sc.nextLine();
		this.tipo= aux;
		System.out.println("Ingrese el detalle del servicio:");
		aux= sc.nextLine();
		this.detalle= aux;
		System.out.println("Ingrese el costo del servicio:");
		aux= sc.nextLine();
		this.costo= Double.parseDouble(aux);
		System.out.println("Registro exitoso.\n");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Servicio [tipo=" + tipo + ", detalle=" + detalle + ", costo=" + costo + "]";
	}
}