package poo5;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		//Vamos a trabajar en un unico fichero
		/*Correcion:
		 * Empleado[]misEmpleados = new Empleado [3];
		 * misEmpleado[0]
		 * 	("Jorge", 19500, 2000, 12, 30);
		 * 
		 */
		Empleado nuevo = new Empleado (JOptionPane.showInputDialog("Ingrese el nombre"));
		Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo diario"));
		Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de alta"));
		Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de alta"));
		Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de alta"));
		
	}

	class Empleado{
		/* Al crear un único fichero, unicamente una de las clases tiene que ser publica.
		 * Haz la prueba y crea otra clase:
		 * public class prueba(){}Te salen warnings.
		 * 3. Vamos a crear un cosntructor y a pasarle parámetros.
		 * Antes no lo hacíamos, pero se puede. 
		 */
		private String nombre;
		private double sueldo;
		private Date alta_contrato;	
		
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(agno, mes -1, dia);
		//Ponemos mes -1 porque es el mes 0.
		
		alta_contrato=calendario.getTime();
	}
		
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public double dameSueldo() {
		
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		
		return alta_contrato;
	}
	
	public void estableceNombre() {
		this.estableceNombre();
	}
	public void estableceSueldo() {
		this.estableceSueldo();
	}
	public void estableceFecha() {
		this.estableceFecha();
	}
	
	public void subeSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	}
	
	}


