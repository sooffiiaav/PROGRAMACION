package Clase;

import java.util.Objects;

public class Persona {
		
	/*	@Override
	public int hashCode() {
		return Objects.hash(Edad, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Edad == other.Edad && Objects.equals(Nombre, other.Nombre);
	}
*/
		private String Nombre;
		private int Edad;
		
	public Persona(String nombre, int edad) {
		super();
		Nombre=nombre;
		Edad=edad;
		

		
	}
	

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}

	}


