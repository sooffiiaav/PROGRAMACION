package ejercicios3;

public class Habitacion {
	
	private int numeroHabitacion;
	private String tipo;
	private boolean ocupada;
	
	public Habitacion() {
		
		numeroHabitacion=12;
		tipo="simple,doble,suite";
		ocupada=true;
	
	}
	
	public void establece_numero(String numeroHabitacion) {
		numeroHabitacion=numeroHabitacion;
	}
	public void establece_tipo() {
		tipo="suite";
	}
	public void establece_ocupada() {
		ocupada=false;
	}
	public String dime_numero() {
		return "El numero de habitacion es " +numeroHabitacion;
	}
	public String dime_tipo() {
		int tipo=3;
		switch(tipo) {
		case 1:
			System.out.println("Habitacion simple");
			break;
		case 2:
			System.out.println("Habitacion doble");
			break;
		case 3:
			System.out.println("Habitacion suite");
			break;
		}
		return "El tipo de habitacion es suite " ;
	}
	public String dime_ocupada() {
		return ocupada ? "La habitacion 12 está ocupada" : "La habitacion 12 no está ocupada";
	}
}


