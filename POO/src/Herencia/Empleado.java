package Herencia;

public class Empleado extends Persona{

	
	int numero_registro;
	String cargo;
	Double sueldo;
	
	
	public Empleado() {
	
	}
	
	public Empleado(int numero_registro, String cargo, Double sueldo,
			int id, String dni, String nombre, String apellido, 
			String domicilio, String telefono) {
		super(id, dni,nombre, apellido,domicilio,telefono);
		this.numero_registro = numero_registro;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getNumero_registro() {
		return numero_registro;
	}

	public void setNumero_registro(int numero_registro) {
		this.numero_registro = numero_registro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	

	
}
