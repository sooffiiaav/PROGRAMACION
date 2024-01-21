package ejercicios3;

import java.util.Scanner;

public class Hotel_Habitacion {

	public static void main(String[] args) {
		Scanner escaner =new Scanner(System.in);
		
		System.out.println("¿Que desea hacer, reservar o cancelar?. 1, para cancelar. 2,para reservar");
		

		int respuesta1=escaner.nextInt();
		if (respuesta1 == 2) {
			System.out.println("Ha escogido la opción de reserva. Le mostraré la distribución del hotel");
		
		} else if(respuesta1== 1) {
			System.out.println("Reserva cancelada");
		}
		
		System.out.println();

		int filas = 3;

		int columnas = 10;

		int[][] matriz = new int[filas][columnas];

		int valor = 1;

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				matriz[i][j] = valor;

				valor++;

			}

		}

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print(matriz[i][j] + "->Habitacion Libre" + "\t");
		
			}

			System.out.println();

		}

		System.out.println();
		
		
		int exit = 0;

		int habitacionocupada = 0;

		int[] ocupados = new int[30];

		int habitacion = 0;
		
		System.out.println("¿ Qué habitacion quiere ?");

		habitacion = escaner.nextInt();


			boolean verificador = false;

			for (int i = 0; i < habitacionocupada; i++) {

			if (ocupados[i] == habitacion) {

			verificador = true;

					break;

				}

			}

			if (verificador) {

				System.out.println("Esta habitacion está ocupada. Por favor, elija otra.");


			} else {

				ocupados[habitacionocupada] = habitacion;

				habitacionocupada++;

				System.out.println();

				int filas1 = 3;

				int columnas1 = 10;

				int[][] matriz1 = new int[filas1][columnas1];

				int valor1 = 1;

				for (int i = 0; i < filas1; i++) {

					for (int j = 0; j < columnas1; j++) {

						matriz1[i][j] = valor1;

						valor1++;

					}

				}

				for (int i = 0; i < filas1; i++) {

					for (int j = 0; j < columnas1; j++) {

						boolean ocupado = false;

						for (int k = 0; k < habitacionocupada; k++) {

							if (ocupados[k] == matriz1[i][j]) {

								ocupado = true;

								break;

							}

						}

						if (ocupado) {

							System.out.print(matriz1[i][j] + "->Hbitacion Ocupada" + "\t");

						} else {

							System.out.print(matriz1[i][j] + "->Habitacion Libre" + "\t");

						}

					}

					System.out.println();

				}

				System.out.println();

			}
			System.out.println("Su reserva queda confirmada. Gracias por elegirnos");
	}
}

		
		
		
		
		
	

