package statics;

public class LLamadasMétodo {
	
	private static int contador;
	
	public static void contador() {
		
		contador++;
	}
	
	public static int getContador() {
		
		return contador;
	}

	public static void main(String[] args) {
		
		contador=2;
		
		System.out.println("Se ha llamado al metodo especifico "+contador);

	}

}
