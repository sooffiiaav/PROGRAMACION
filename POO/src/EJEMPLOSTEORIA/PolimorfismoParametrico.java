package EJEMPLOSTEORIA;

public class PolimorfismoParametrico {

		public class Contenedor<T> {
		    private T objeto;

		   
		    public Contenedor(T objeto) {
		        this.objeto = objeto;
		    }

		   
		    public T obtener() {
		        return objeto;
		    }
		}
		public class PolimorfismoParametricoo {
		    public static void main(String[] args) {
		     
		        Contenedor<Integer> contenedorEntero = new Contenedor<>(42);
		        int entero = contenedorEntero.obtener();
		        System.out.println("Contenido del contenedor de enteros: " + entero);

		      
		        Contenedor<String> contenedorCadena = new Contenedor<>("Hola, mundo!");
		        String cadena = contenedorCadena.obtener();
		        System.out.println("Contenido del contenedor de cadenas: " + cadena);

		        
		        Contenedor<Double> contenedorDecimal = new Contenedor<>(3.14);
		        double decimal = contenedorDecimal.obtener();
		        System.out.println("Contenido del contenedor de decimales: " + decimal);
		    }
		}


	}


