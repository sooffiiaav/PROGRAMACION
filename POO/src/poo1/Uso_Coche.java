package poo1;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Audi= new Coche();
		System.out.println(Audi.dime_motor());
		
		Coche Mercedes=new Coche();
		Mercedes.establece_color("Rojo");
		System.out.println(Mercedes.dime_color());
		Mercedes.configura_asientos("si");
		System.out.println(Mercedes.dime_asientos());
		
		Mercedes.establece_color(JOptionPane.showInputDialog("Introduce el color"));
		
		System.out.println(Mercedes.dime_color());
		Mercedes.configura_asientos(JOptionPane.showInputDialog("Tienes asientos de cuero"));
		System.out.println(Mercedes.dime_asientos());
		
		Mercedes.configurarClimatizador(JOptionPane.showInputDialog("¿Tienes climatizador o eres un motochorro"));
		System.out.println(Mercedes.dimeClimatizador());
		System.out.println(Mercedes.dime_peso_coche());
		System.out.println("El precio final del coche es "+Mercedes.precio_coche());
	}
		
		
}
