package clases;

/**
 * En esta clase calcularemos la superficie y el volumen de una esfera y la
 * mostraremos al usuario
 * 
 * @author Raul Romera
 */

public class Esfera {

	/**
	 * Valor del radio de la esfera
	 */
	double radio = 1.0;

	public Esfera() {
		super();
	}

	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Esta funcion calcula la superficie de la esfera, se crea una varaible para
	 * guardar el resultado y se calcula la formula de la superficie utilizando la
	 * funcion MATH y el radio
	 * 
	 * @return La multiplicacion de cuatro por Pi, por el radio al cuadrado
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Esta función calcula el volumen de la esfera, se crea una variable para
	 * guardar el resultado y se calcula la formula de esta misma utilizando la
	 * funcion MATH y el radio
	 * 
	 * @return La multiplicacion de 4 por PI entre tres, por el radio al cubo
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
