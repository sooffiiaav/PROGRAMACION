package Ejercicio1;
import Clase.Utiles;

public class Ej1 {

	
	
	public static void main(String[] args) {
		
		Utiles ul= new Utiles();
		
		System.out.println(ul.redondear(145.678,2));
		System.out.println(ul.redondear(145.457878,4));
		System.out.println(ul.truncar(145.672,2));
		System.out.println(ul.truncar(145.636564, 4));

	}

}
