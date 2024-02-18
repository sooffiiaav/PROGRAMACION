package abstracs;

public abstract class Empleado {

	abstract class Empleados {
	    public abstract double calcularSalario();
	}

	class EmpleadoTiempoCompleto extends Empleado {
	    private double salarioMensual;

	    public EmpleadoTiempoCompleto(double salarioMensual) {
	        this.salarioMensual = salarioMensual;
	    }

	    public double calcularSalario() {
	        return salarioMensual;
	    }
	}

	class EmpleadoTiempoParcial extends Empleado {
	    private int horasTrabajadas;
	    private double salarioPorHora;

	    public EmpleadoTiempoParcial(int horasTrabajadas, double salarioPorHora) {
	        this.horasTrabajadas = horasTrabajadas;
	        this.salarioPorHora = salarioPorHora;
	    }

	    public double calcularSalario() {
	        return horasTrabajadas * salarioPorHora;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto(3000);
	        System.out.println("Salario a tiempo completo: $" + empleadoTiempoCompleto.calcularSalario());

	        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial(20, 15);
	        System.out.println("Salario a tiempo parcial: $" + empleadoTiempoParcial.calcularSalario());
	    }
	}

}
