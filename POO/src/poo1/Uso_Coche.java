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

	}
		
		
}
