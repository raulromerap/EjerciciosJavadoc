package clases;

/**
 * Esta clase hace operaciones con los numeros del usuario, suma, resta,
 * multiplicación, división, mayor y menor
 */

public class Operaciones {

	/**
	 * Primer numero del usuario
	 */
	double num1;

	/**
	 * Segundo numero del usuario
	 */
	double num2;

	public Operaciones() {

	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Esta funcion devuelve la suma de los dos nummeros del usuario
	 * 
	 * @return La suma del primer numero y del segundo
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Esta funcion devuelve la resta de los dos numeros del usuario
	 * 
	 * @return La resta del primer numero y del segundo
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Esta funcion delvuelve la multiplicacion de los numeros del usuario
	 * 
	 * @return La multiplicacion del primer numero y segundo
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Esta funcion delvuelve la division de los numeros del usuario en el caso de
	 * que el segundo numero no sea cero
	 * 
	 * @return La division del primer numero con el segundo(si este no es cero)
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Esta funcion devuelve el numero que es más grande de los dos numeros del
	 * usuario
	 * 
	 * @return En caso de que el primer numero sea mayor, el primer numero, en caso
	 *         de que no se cumpla la condicion, el segundo numero
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Esta funcion devuelve el numero que es más pequeño de los dos numeros del
	 * usuario
	 * 
	 * @return En caso de que el primer numero sea menor, el primer numero, en caso
	 *         de que no se cumpla la condicion, el segundo numero
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
