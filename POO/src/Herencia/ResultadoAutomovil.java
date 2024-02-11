package Herencia;

import javax.swing.JOptionPane;

public class ResultadoAutomovil {

	public static void main(String[] args) {
		
		
		String marca = JOptionPane.showInputDialog("Ingrese la marca del coche");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del coche");
		int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de salida del coche"));
		String tipoDeCombustible = JOptionPane.showInputDialog("Ingrese el tipo de combustible");
		
		Automovil coche = new Automovil(marca, modelo, tipoDeCombustible, año);
			
			String mensaje=( "RESUMEN DEL COCHE:\n"+
							"\n La marca de tu coche es:" +coche.getMarca()+
										"\n El modelo del coche es:" +coche.getModelo()+
										"\n El tipo de combustible: "+coche.getTipoDeCombustible()+
										"\n El año de salida:" +coche.getAño()
										);
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		

	}


