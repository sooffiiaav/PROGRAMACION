package Main;

import Interfaces.Futbolista;

public class Inicio {

	public static void main(String[] args) {
		
		Futbolista Jude=new Futbolista(1, "Jude","Belligham",40,4,"medio");
		Futbolista Jochi=new Futbolista(1, "Jochi","Sanchez",40,4,"medio");
		Futbolista Camila=new Futbolista(1, "Camila","Andreina",40,4,"medio");
		Futbolista Juan=new Futbolista(1, "Juan","Di Bene",40,4,"medio");
		
		Jude.concentrarse();
		Jude.entrenar();
		Jude.jugarPartido();
		Jude.viajar();
	}

}
