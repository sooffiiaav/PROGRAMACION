package abstracs;

abstract class Vehiculo {

	abstract class Vehiculoo {
	    public abstract void acelerar();
	    public abstract void frenar();
	}

	class Automovil extends Vehiculo {
	    public void acelerar() {
	        System.out.println("El automóvil está acelerando.");
	    }

	    public void frenar() {
	        System.out.println("El automóvil está frenando.");
	    }
	}

	class Motocicleta extends Vehiculo {
	    public void acelerar() {
	        System.out.println("La motocicleta está acelerando.");
	    }

	    public void frenar() {
	        System.out.println("La motocicleta está frenando.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Automovil auto = new Automovil();
	        Motocicleta moto = new Motocicleta();

	        auto.acelerar();
	        auto.frenar();

	        moto.acelerar();
	        moto.frenar();
	    }
	}


}
