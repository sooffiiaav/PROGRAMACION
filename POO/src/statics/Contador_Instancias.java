package statics;

public class Contador_Instancias {
	
	private static int contador;
	
	
	public Contador_Instancias() {
		contador++;
	}
	
	public static int dime_Instancias() {
		return contador;
	}
	
	public static void main(String[] args) {
		
		System.out.println("El numero es instancias es:" +Contador_Instancias.dime_Instancias());
		
		
	}

}
