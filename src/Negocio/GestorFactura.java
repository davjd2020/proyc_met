package Negocio;

import java.util.Scanner;

public class GestorFactura {
	
	private Factura factura;
	
	
	public String realizarFactura(FichaTecnica fichaT, String metodoPago) {
		this.factura = new Factura(metodoPago, fichaT );
		return this.factura.toString();
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