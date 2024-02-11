package Herencia;

public class SuperVehiculo {
	
	String marca;
	String modelo;
	int año;
	
	public SuperVehiculo() {
		
	}
	
	public SuperVehiculo(String marca, String modelo, int año ) {
		
		this.año=año;
		this.marca=marca;
		this.modelo=modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	

}
