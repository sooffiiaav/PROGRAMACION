package gettersetters;

public class Automovil {
	private String marca;
	private String modelo;
	
public void establece_marca() { //setter
		
		marca="Mercedes";
	}

	
public String dime_marca() { //getter
		
		return "Mi coche es un" +marca;
		
}	


	
}

