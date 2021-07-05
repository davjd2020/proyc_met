package Negocio;

import java.util.Scanner;

public class GestorFactura {
	
	private Factura factura;
	
	
	public void realizarFactura(FichaTecnica fichaT) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el metodo de pago (1)Efectivo, (2)Tarjeta Crédito (Se recomienda ingresar Efectivo):");
		String metodoPago = sc.nextLine();
		this.factura = new Factura(metodoPago, fichaT );
		
		System.out.println(this.factura.toString());
	}
	
	public void reembolsarFactura() {
		
	}
	
	public void imprimirFactura() {
		
	}
	
	public void modificarFactura() {
		
	}
	
	public void devolverFactura() {
		
	}
}