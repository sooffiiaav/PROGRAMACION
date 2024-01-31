package statics;

public class ConversionUnidades {
	
	public static double kmmi;
	public static double CF;
	public static double mikm;
	public static double FC;
	
	public static double kmmi (double km) {
	 
		return km/1.60;
	}
	
	public static double mikm (double millas) {
		
		return millas*0.62;
	}
	
	public static double CF (double Celsius, double Fahrenheit) {
		
		return (Fahrenheit-32)* 5/9;
	}
	
	public static double FC (double Celsius, double Fahrenheit) {
		
		return (Celsius*9/5)+32;
	}

	public static void main(String[] args) {
		
		double km=200;
		double millas=40;
		double Celsius=7.8;
		double Fahrenheit= 120;
		
		System.out.println(+km+ " km son " +ConversionUnidades.kmmi+ " millas");
		System.out.println(+millas+ " millas son "+ConversionUnidades.mikm+ " km");
		System.out.println(+Celsius+ " Celsisus son "+ConversionUnidades.CF+ " Fahrenheit");
		System.out.println(+Fahrenheit+ " Fahrenheit son " +ConversionUnidades.FC+ " Celsius");
	
	}

}
