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
	
	public boolean dimeClimatizador() {// SETTER
		if (climatizador == true) {
			return "Tienes climatizador";
		} else {
			return "No tienes climatizador";
		}

	}

	public void configurarClimatizador(boolean climatizador) {// GETTER
		this.climatizador = climatizador;
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	public String dime_peso_coche() {
		int pesoCarroceria=500;
		peso_total = peso_plataforma + pesoCarroceria;
		
		if(asientos_cuero==true) {
			peso_total = peso_total + 50;
		}
		if(climatizador ==true) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total;
	}

	public int precio_coche() {
		
		int precio_final = 10000;
		
		if(asientos_cuero == true) {
			precio_final += 2000;
		}
		if(climatizador == true) {
			
		}  precio_final +=1500;
		
		return precio_final;
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
