package ejercicios3;

import java.util.Scanner;

public class Recetita {

	public static void main(String[] args) {

Scanner escaner = new Scanner(System.in);

		System.out.println("Vamos a hacer una receta, podras añadir y eliminar los ingredientes que quieras basándote en los que ya te ofrecemos para hacer pasta a la carbonara.");

		int[] ingredientes = new int[4];

		int valor = 1;

		for (int i = 0; i < 4; i++) {

			
		}

		System.out.println();
		
		
		int exit = 0;

		int ingredienteliminado= 0;

		int[] eliminados = new int[4];

		int ingrediente = 0;
		
		System.out.println("¿ Qué habitacion quiere ?");

		ingrediente = escaner.nextInt();


			boolean verificador = false;

			for (int i = 0; i < ingredienteliminado; i++) {

			if (eliminados[i] == ingrediente) {

			verificador = true;

					break;

				}

			}

			if (verificador) {

				System.out.println("Este ingrediente ya está eliminado.");


			} else {

				eliminados[ingredienteliminado] = ingrediente;

				ingredienteliminado++;

				System.out.println();

				

				int[] ingrediente1 = new int[4];

				int valor1 = 1;

				for (int i = 0; i < 4; i++) {

				

						boolean ocupado = false;

						for (int k = 0; k < ingredienteliminado; k++) {

							if (eliminados[k] == ingredientes[i]) {

								ocupado = true;

								break;

							}

						}

						if (ocupado) {

							System.out.print(ingrediente1[i] + "->Ingrediente Eliminado" + "\t");

						} else {

							System.out.print(ingrediente1[i] + "->Ingrediente añadido" + "\t");

						}

					}

					System.out.println();

				}

				System.out.println();

			}
			
	

		
		
		
		
		
	



	}

}
