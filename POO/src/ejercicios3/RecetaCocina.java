package ejercicios3;

public class RecetaCocina {
	
	private String plato;
	private String ingredientes;
	private int pasos;
	private String tipo_pasos;
	
	public RecetaCocina() {
		
		plato="Pasta carbonara";
		ingredientes="pasta,nata,bacon,cebolla";
		pasos=6;
		tipo_pasos="Cocer pasta en una olla, cortar ingredientes, freir ingredientes, echar la nata con los ingredientes,mezclar pasta con la salsa hecha.";
		
	}
	
	public void establece_plato () {
		
		plato="Pasta carbonara";
	}
	public void establece_ingredientes() {
		
		ingredientes="pasta,nata,bacon,cebolla";
	}
	
	public void establece_pasos() {
		
		pasos=6;
	}
	
	public void establece_tipo_pasos() {
		tipo_pasos="Cocer pasta en una olla, cortar ingredientes, freir ingredientes, echar la nata con los ingredientes,mezclar pasta con la salsa hecha.";
	}
	public String dime_plato(){
		
		return "El plato que vamos a cocinar hoy es "+plato;
	}
	
	public String dime_ingredientes() {
		
		return "Los ingredientes que vamos a usar son: " +ingredientes;
	}
	public String dime_pasos() {
		return "El numero de pasos que vamos a seguir son: "+pasos;
	}
	public String dime_tipo_pasos() {
		return "Los pasos son los siguientes: "+tipo_pasos;
	}
}
