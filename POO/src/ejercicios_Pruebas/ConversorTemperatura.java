package ejercicios_Pruebas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		
		String grados_Celsius=JOptionPane.showInputDialog("Dime un grado en Celsius y lo pasaré a Fahrenheit");
		double gradosCelsius=Double.parseDouble(grados_Celsius);
		
		CoversorTemperatura Fahrenheit = new CoversorTemperatura();
		
		double grados_Fahrenheit= Fahrenheit.Convertir(gradosCelsius);
		
		JOptionPane.showMessageDialog(null, grados_Celsius+ " grados Celsius son "+grados_Fahrenheit+ " grados Fahrenheit");
	}
}
class CoversorTemperatura{
	
	private final double constante1 =1.8;
	private final int constante2=32;


	public double Convertir(double grados_Celsius) {
		
		return (grados_Celsius * constante1)+ constante2;
	}
	
	

	}

