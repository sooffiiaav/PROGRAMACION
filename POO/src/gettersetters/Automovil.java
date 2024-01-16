package gettersetters;

public class Automovil {
	private String marca;
	private String modelo;
	
public void establece_marca() {
		
		marca="Mercedes";
	}

	
public String dime_marca() {
		
		return "Mi coche es un" +marca;
		
}	


	
}

