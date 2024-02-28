package Clase;

import java.util.ArrayList;

import Clase.Persona;

public class Ejer4 {

	public static void main(String[] args) {
		
		ArrayList<Persona> lista=new ArrayList<Persona>();
		
		Persona p1=new Persona("maria",50);
		lista.add(new Persona("ana", 20));
		lista.add(p1);
		lista.add(new Persona("ines", 33));
		lista.add(new Persona("andres", 33));
		
		lista.remove(new Persona("maria",50));
		
		for(Persona p: lista) {
			System.out.println(p);
		}

	}

}
