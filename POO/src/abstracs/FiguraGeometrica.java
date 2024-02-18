package abstracs;

abstract class FiguraGeometrica {
	
	public abstract double calcularArea();
	}

	class Rectangulo extends FiguraGeometrica {
	    private double base;
	    private double altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    public double calcularArea() {
	        return base * altura;
	    }
	}

	class Circulo extends FiguraGeometrica {
	    private double radio;

	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    public double calcularArea() {
	        return Math.PI * Math.pow(radio, 2);
	    }
	
	
	public static void main(String[] args) {
		
	       Rectangulo rectangulo = new Rectangulo(5, 10);
	        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

	        Circulo circulo = new Circulo(3);
	        System.out.println("Área del círculo: " + circulo.calcularArea());
	    }
	

	}


