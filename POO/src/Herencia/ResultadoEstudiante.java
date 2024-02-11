package Herencia;

import javax.swing.JOptionPane;

public class ResultadoEstudiante {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		String carrera = JOptionPane.showInputDialog("Introduce el nombre de la carrera que realiza");

		Estudiante estudiante = new Estudiante(nombre, edad, carrera);

		String mensaje = ("RESUMEN:\n" + "\n NOMBRE:" + estudiante.getNombre()) + "\n EDAD: " + estudiante.getEdad()
				+ "\n CARRERA: " + estudiante.getCarrera();

		JOptionPane.showMessageDialog(null, mensaje);
	}

}

