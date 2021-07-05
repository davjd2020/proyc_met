package Negocio;

import java.util.Scanner;

public class Vehiculo {
	private String tipo;
	private String modelo;
	private String marca;
	private String matricula;
	private Propietario propietario;

	public Vehiculo(Propietario propietario) {
		registrarVehiculo(propietario);
	}
	
	public void registrarVehiculo(Propietario propietario) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el tipo del vehículo:");
		String aux= sc.nextLine();
		this.tipo= aux;
		System.out.println("Ingrese el modelo del vehículo:");
		aux= sc.nextLine();
		this.modelo= aux;
		System.out.println("Ingrese la marca del vehículo:");
		aux= sc.nextLine();
		this.marca= aux;
		System.out.println("Ingrese la matrícula del vehículo:");
		aux= sc.nextLine();
		this.matricula= aux;
		this.propietario= propietario;
		System.out.println("Registro exitoso.\n");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", modelo=" + modelo + ", matricula=" + matricula + ", propietario="
				+ propietario + "]";
	}
}