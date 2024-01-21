package poo1;

public class Coche {

	// 1.Defino sus características.
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

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

	
	public String dime_color() { //GETTER

		return "El color de tu coche es" + color;

	}
	
	public void establece_color(String color_coche) {
		
		color= color_coche;
		//ESTABLECEMOS LA IGUALDAD ENTRE EL COLOR DE LOS ATRIBUTOS Y EL DEL SETTER
	}
	
	public String dime_datos_generales() {
		return "La plataforma del coche tiene" + ruedas + " ruedas " + ", Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de " + peso + " kg ";
	}

	public void configura_asientos(String asientos_cuero) {//setter
		if (asientos_cuero == "si") {
			this.asientos_cuero = true;

		} else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if(asientos_cuero) {
			
		return "El coche tiene asientos de cuero";
	}else {
		return "Tus asientos son de pena";
	}
}
}
