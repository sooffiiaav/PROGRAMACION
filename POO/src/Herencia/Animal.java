package Herencia;

public class Animal {
	
	String sonido;
	
	public Animal() {
		
	}

	public Animal(String sonido){
		this.sonido=sonido;
		
		
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		
		if(sonido=="si") {
			System.out.println("Este animal hace un sonido");
		}else {
			System.out.println("Este animal no hace un sonido");
		}
	}


}
