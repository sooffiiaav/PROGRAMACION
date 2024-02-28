package Interfaces;

public class Futbolista extends SeleccionFutbol{
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
 
	public int getDorsal() {
		return dorsal;
	}
 
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
 
	public String getDemarcacion() {
		return demarcacion;
	}
 
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
 
	@Override
	public String toString() {
		
		StringBuffer cadena= new StringBuffer ("F dorsal=" + dorsal+"\n");
		cadena.append("demarcacion=" + demarcacion+"\n");
		cadena.append(" "+ super.toString());
		return cadena.toString();
	}
 
	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Futbolista).");
 
	}
 
	@Override
	public void viajar() {
		System.out.println("Viajar (Futbolista).");
 
	}
 
	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Futbolista).");
 
	}
 
	@Override
	public void jugarPartido() {
		System.out.println("Asistir al partido (Futbolista).");
 
	}
	
	
 
}
