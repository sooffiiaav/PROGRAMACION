package statics;

public class Calculadora {
	
	public static double suma;
	public static double resta;
	public static double multiplicacion;
	public static double division;
	
	public static double suma(double num1, double num2) {
		
		return num1 + num2;	
	}
	
	public static double resta( double num1, double num2) {
		
		return num1 - num2;
	}
	
	public static double multiplicacion (double num1, double num2) {
		
		return num1 * num2;
	}
	
	public static double division (double num1, double num2) {
		
		return num1/num2;
	}

	public static void main(String[] args) {
		
		double num1=20;
		double num2=2;
		
		System.out.println("El resultado de la suma es: "+Calculadora.suma);
		System.out.println("El resultado de la resta es: "+Calculadora.resta);
		System.out.println("El resultado de la multiplicacion es: "+Calculadora.multiplicacion);
		System.out.println("El resultado de la division es: "+Calculadora.division);
	}

}
