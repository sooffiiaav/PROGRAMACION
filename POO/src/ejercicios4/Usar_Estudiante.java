package ejercicios4;

public class Usar_Estudiante {

	public static void main(String[] args) {
		
		Estudiantes alumno = new Estudiantes();
		
		alumno.establece_nombre(JOption.showDialog("Introduce el nombre"));
		System.out.println(alumno.dime_nombre());
		alumno.establece_edad(JOption.showDialog("Introduce la edad"));
		System.out.println(alumno.dime_edad());
		alumno.establece_grado(JOption.showDialog("Introduce el grado"));
		System.out.println(alumno.dime_grado());
	}

}
