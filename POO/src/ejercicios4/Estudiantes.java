package ejercicios4;

public class Estudiantes {

	private String nombre;
	private int edad;
	private int grado;
	
public Estudiantes() {
	
	nombre="Sofia";
	edad=18;
	grado=2;
}

public void establece_nombre(String nombreEstudiante) {
	
	nombre=nombreEstudiante;
}

public String dime_nombre() {
	
	return "El nombre del estudiante es "+nombre;
	
}

public void establece_edad(int edadEstudiante) {
	
	edad=edadEstudiante;
}

public String dime_edad() {
	
	return "La edad del estudiante es "+edad;
	
}

public void establece_grado(int gradoEstudiante) {
	
	grado=gradoEstudiante;
}

public String dime_grado() {
	
	return "El grado del alumnx es "+grado;
}

}
