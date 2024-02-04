package ejercicios4;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Usar_Empleado {

	public static void main(String[] args) {
		
		Empleado []empleados= new Empleado[5];
		
		for(int i=0; i<5; i++) {
			
			String nombre= JOptionPane.showInputDialog("Introduce el nombre del empleado:");
			double horas_hechas= Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));
			double tarifa=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa que tenga: "));
			
			empleados[i]=new Empleado(nombre,horas_hechas,tarifa) ;
				
			
			}
		StringBuilder salario=new 
		
		for(int i=0; i<5; i++) {
			
		System.out.println(JOptionPane.showInputDialog("El salario es: "+salario));
			
		}
		
			
			
		}

	}


