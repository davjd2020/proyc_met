package Negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		//Datos quemados
		Scanner sc= new Scanner(System.in);
		ListaVehiculo vehiculos= new ListaVehiculo();
		ListaServicio servicios= new ListaServicio();
		ListaFichaTecnica fichasTecnicas= new ListaFichaTecnica();
		servicios.aniadir(new Servicio("Cambio de Aceite Regular", "Aceite SW-40", 30.00));
		servicios.aniadir(new Servicio("Cambio de Aceite Premium", "Aceite SW-50", 40.00));
		servicios.aniadir(new Servicio("Cambio de Aceite Ultra Premium", "Aceite SW-60", 55.70));
		
		//Prueba Primer Caso de Uso
		Propietario propietario1= new Propietario("Christian", "1721795811", "0984149550", "Conocoto");
		Mecanico mecanico= new Mecanico("José", "1232321289", "0984568790", "Mitado del Mundo");
		Vehiculo vehiculo= new Vehiculo(propietario1);
		System.out.println("\nPrueba de Registro de un Vehículo.");
		System.out.println(vehiculos.toString());
		vehiculos.aniadir(vehiculo);
		
		//Prueba Segundo Caso de Uso
		System.out.println(vehiculos.toString());
		System.out.println("\nPrueba de Registro de un Servicio.");
		System.out.println(servicios.toString());
		Servicio servicio= new Servicio();
		servicios.aniadir(servicio);
		System.out.println(servicios.toString());
		
		//Prueba Tercer Caso de Uso
		System.out.println("\nPrueba de Añadir un Servicio Realizado.");
		FichaTecnica fichaTecnica= new FichaTecnica(vehiculo, mecanico);
		int menu=0;
		System.out.println(servicios.toString());
		System.out.println("Ingrese el servicio que desea agregar: ");
		menu= sc.nextInt();
		fichaTecnica.registrarServicioRealizado(servicios.getServicios().get(menu-1));
		System.out.println(fichaTecnica.toString());
		fichasTecnicas.aniadir(fichaTecnica);
		System.out.println(fichasTecnicas.toString());
		
		//Prueba Cuarto Caso de Uso
		System.out.println("Nueva unión");
		//ultima modificacion
	}
}