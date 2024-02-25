package Sobrecarga;

import javax.swing.JOptionPane;

public class Figura {

	public static void main(String[] args) {
		
		Rectangulo figura1 = new Rectangulo(12, 23);
		Rectangulo figura2 = new Rectangulo(1.5, 0.2);

		JOptionPane.showMessageDialog(null, "\naltura: " + figura1.getAltura() + "\nancho: " + figura1.getAncho());
		JOptionPane.showMessageDialog(null, "\naltura: " + figura2.getAltura() + "\nancho: " + figura2.getAncho());
	}
	}
	
	public class Rectangulo {
		
	private double ancho;
	private double altura;


	public Rectangulo(double ancho, double altura) {
		 this.ancho=ancho;
		 this.altura=altura;
		 
	}

	public Rectangulo(double ancho, int altura) {
		 this.ancho=ancho;
		 this.altura=altura;
		 
		 
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	}

	
