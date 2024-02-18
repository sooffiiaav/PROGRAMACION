package abstracs;

public abstract class Animal {
	
	

	abstract class Animales {
	    public abstract void hacerSonido();
	    public abstract void moverse();
	}

	class Perro extends Animal {
	    public void hacerSonido() {
	        System.out.println("El perro ladra.");
	    }

	    public void moverse() {
	        System.out.println("El perro camina o corre.");
	    }
	}

	class Gato extends Animal {
	    public void hacerSonido() {
	        System.out.println("El gato maulla.");
	    }

	    public void moverse() {
	        System.out.println("El gato camina o corre.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Perro perro = new Perros();
	        Gato gato = new Gato();

	        perro.hacerSonido();
	        perro.moverse();

	        gato.hacerSonido();
	        gato.moverse();
	    }
	}


}
