package clases;

import java.util.Random;

/**
 * Esta clase sirve genera numeros aleatorios a gusto del usuario
 * 
 * @author Raul Romera
 */

public class Aleatorios {

	/**
	 * En esta funcion estática se recoge el numero de numeros aleatorios que quiere
	 * el usuario imprimir, se crea una variable para los numeros aleatorios, se
	 * guardan en la variable los numeros aleatorios para luego imprimirlos y el
	 * bucle termnina cuando la variable "i" llega al numero introducido por el
	 * usuario
	 * 
	 * @param cantidad La cantidad de numeros que el usuario quiera generar
	 */

	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * En esta funcio estática se recoge el numero de numeros aleatorios que quiere
	 * el usuario imprimir y el numero con el que quiere que se calcule el MCM, se
	 * crea una variable para los numeros aleatorios, se guardan en la variable los
	 * numeros que son MCM de los dos para luego imprimirlos y el bucle termnina
	 * cuando la variable "i" llega al numero introducido por el usuario
	 * 
	 * @param cantidad La cantidad de numeros que el usuario quiera generar
	 * @param max El numero que multiplicará a los numeros aleatorios
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * En esta funcio estática se recoge el numero de numeros aleatorios que quiere
	 * el usuario imprimir, el numero limite menor y el numero limite mayor, se crea
	 * una variable para los numeros aleatorios, se crea tambien la clase "Random"
	 * para generar los numeros aleatorios con limites, se guardan en la variable
	 * los numeros aleatorios de entre los límites para luego imprimirlos y el bucle
	 * termnina cuando la variable "i" llega al numero introducido por el usuario
	 * 
	 * @param cantidad La cantidad de numeros que el usuario quiera generar
	 * @param minimo El límite menor del intervalo
	 * @param maximo El límite mayor del intervalo
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
