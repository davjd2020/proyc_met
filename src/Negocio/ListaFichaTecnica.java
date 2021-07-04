package Negocio;

import java.util.ArrayList;

public class ListaFichaTecnica {
	private ArrayList<FichaTecnica> fichasTecnicas;

	public ListaFichaTecnica(){
		super();
		this.fichasTecnicas= new ArrayList<FichaTecnica>();
	}
	
	public void aniadir(FichaTecnica ficha) {
		fichasTecnicas.add(ficha);
	}
	
	public void quitar(FichaTecnica ficha) {
		fichasTecnicas.remove(ficha);
	}
	
	@Override
	public String toString() {
		String salida="";
		for (FichaTecnica ficha : fichasTecnicas) {
			salida+=(ficha.toString()+"\n");
		}
		return salida;
	}
}