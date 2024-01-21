package ejercicios3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarma {

	private int hora_alarma;
	private int hora_actual;
	private boolean hora_activada;

	public Alarma() {

		LocalTime hora_alarma = LocalTime.of(19, 45);
		LocalTime hora_actual = LocalTime.now();
		hora_activada = true;
	}

	public void establece_alarma() {// setter
		LocalTime hora_alarma = LocalTime.of(19,45);

	}

	public void establece_hora() {// setter
		LocalTime hora_actual = LocalTime.now();
	}
	private void estable_decimales(String etiqueta, LocalTime hora) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormateada = hora.format(formato);
	}

	public void establece_activada() {// setter
		hora_activada = true;
	}

public String dime_alarma() {

	if(hora_alarma==hora_actual) {
		System.out.println("Alarma sonando");
	}else {
		System.out.println ("La hora de la alarma y la actual no es la misma");
	}
	return "La hora de la alarma es "+hora_alarma;

}
public String dime_hora() {
	return "La hora actual es "+LocalTime.now();
	
}
public String dime_activada() {
	return hora_activada ? "La alarma esta activada":"La alarma no está activada";
}
}

