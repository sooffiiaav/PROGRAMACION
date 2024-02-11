package EjerciciosHerencia;

public class Automovil extends SuperVehiculo {
	
	String tipoDeCombustible;

	public Automovil() {
		
	}

	public Automovil(String tipoDeCombustible,String marca, String modelo, int año) {
		super(marca, modelo, año);
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}

	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	
	
	

}
