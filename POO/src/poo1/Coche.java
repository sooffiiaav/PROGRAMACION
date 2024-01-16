package poo1;

public class Coche {

	// 1.Defino sus características.
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	private String color;
	int peso_total;
	boolean asientos_cuero, climatizador;

	public Coche() {
		ancho = 250;
		largo = 400;
		ruedas = 4;
		motor = 200;
		peso = 1900;
		
		


	}
	
	public String dime_motor() {//GETTER
		//Nada mas crearlo va a dar error porque espera un return del Getter
		
		return "El motor del coche tiene" + motor + "caballos de potencia ";
		
	}
		
		//Puedo utilizar el atributo motor porque estoy en la misma clase, aunq sea privada´

	public void establece_color() { // SETTER

		color = "Rojo";
	}

	public String dime_color() { //GETTER

		return "El color de tu coche es" + color;

	}
}
