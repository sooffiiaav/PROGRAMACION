package ejercicios_Pruebas;

import javax.swing.JOptionPane;

public class AñoBisiesto {

	public static void main(String[] args) {
		
		int año=Integer.parseInt(JOptionPane.showInputDialog("Dime un año y te diré si es bisiesto o no"));
		
		AñoBisiesto bisiesto = new AñoBisiesto();
		
		bisiesto.ComprobarBisiesto(año);
	
		JOptionPane.showInputDialog("El año indicado "+bisiesto.DimeMensaje());
		
		

	}


	private String mensaje;
	private final int excepcion4 = 4;
	private final int excepcion100 = 100;
	private final int excepcion400 = 400;

	public void ComprobarBisiesto(int año) {

		String mensaje;
		   if (año % excepcion4 == 0 && (año % excepcion100 != 0 || año % excepcion400 == 0)) {
	            mensaje = "Es bisiesto";
	        } else {
	            mensaje = "No es bisiesto";
	        }
	    }

	public String DimeMensaje() {
		return mensaje;
	}

}