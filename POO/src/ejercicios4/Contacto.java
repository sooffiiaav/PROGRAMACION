package ejercicios4;

public class Contacto {
	
	private String nombreContacto;
	private int numeroTelefono;
	private String emailContacto;
	
public Contacto(String nombre,int numero,String email) {
	this.nombreContacto=nombre;
	this.numeroTelefono=numero;
	this.emailContacto=email;
}

public String getNombreContacto() {
	return nombreContacto;
}

public void setNombreContacto(String nombreContacto) {
	this.nombreContacto = nombreContacto;
}

public int getNumeroTelefono() {
	return numeroTelefono;
}

public void setNumeroTelefono(int numeroTelefono) {
	this.numeroTelefono = numeroTelefono;
}

public String getEmailContacto() {
	return emailContacto;
}

public void setEmailContacto(String emailContacto) {
	this.emailContacto = emailContacto;
}
public String Contacto() {
	String menu = "Nombre del contacto: " + this.nombreContacto;
	menu += "\n---------------------------------------\n";
	menu += "\n Numero del contacto: " + this.numeroTelefono;
	menu += "\n---------------------------------------\n";
	menu += "\n Email del contacto: " + this.emailContacto + "\n";
	menu += "\n---------------------------------------\n";
	return menu;
}

}
