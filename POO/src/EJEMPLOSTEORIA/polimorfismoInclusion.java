package EJEMPLOSTEORIA;

public class polimorfismoInclusion {

	public static void main(String[] args) {
		
		Animal miPerro = new Perro();
		miPerro.SonidoGenerico(); 

        Animal miGato = new Gato();
        miGato.SonidoGenerico(); 
    }
}
class Animal {
    public void SonidoGenerico() {
        System.out.println("Sonido de un animal");
    }
}


class Perro extends Animal {
  
    public void SonidoPerro() {
        System.out.println("Guau guau");
    }
}


class Gato extends Animal {
   
    public void SonidoGato() {
        System.out.println("Miau miau");
    }
}
	