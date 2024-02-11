package EjerciciosHerencia;

public class Perro extends Animal {
	
	String emitirSonido;
	
	public Perro() {
		
	}
	public Perro(String sonido, String emitirSonido) {
		super(sonido);
		this.emitirSonido=emitirSonido;
		
	}
	public String getEmitirSonido() {
		return emitirSonido;
	}
	public void setEmitirSonido(String emitirSonido) {
		this.emitirSonido = emitirSonido;
	}

}
