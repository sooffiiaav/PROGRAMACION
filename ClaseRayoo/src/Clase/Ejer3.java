package Clase;

public class Ejer3 {

	public static void main(String[] args) {
		
	int a1=10,a2=10;
	String s1="Hola", s2="Hola";
	
		Persona p1=new Persona("ana",22);
		Persona p2=new Persona("ana",22);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		if(p1.equals(p2)) {
			
			System.out.println("Somos iguales");
		}else {
			System.out.println("Somos distintos");
		}

	}

}
