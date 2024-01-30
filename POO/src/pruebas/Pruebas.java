package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		
			Empleados trabajador1 = new Empleados("Paco");

	        Empleados trabajador2 = new Empleados("Ana");

	        trabajador1.cambioSeccion("RRHH");

	        System.out.println(trabajador1.devuelveDatos());

	        System.out.println(trabajador2.devuelveDatos());

	    }
	}

	class Empleados {

		// El final significa que es algo fijo y constante.
	    private final String nombre;
	    private String seccion;

	    public Empleados(String nom) {

	        nombre = nom;

	        seccion = "Administracion";
	    }

	    public void cambioSeccion(String seccion) {

	        this.seccion = seccion;
	    }
	    

	    public String devuelveDatos() {
	    	
	        return "El nombre es: " + nombre + " y la secion es " + seccion;
	    }
	    
	    /*public void cambiaNombre(String nombre) {
	    	por eso aqui al haber puesto final, nombre da error
	    	this.nombre=nombre;
	    }
	    */
	   

	}