/**
 * Examen de recuperacion mayo 2024
 * 
 * @author Alejandro Eraso Jimenez
 * @date 29/05/2024
 * @version 1.0
 */

package examen;

/**
 * Clase publica Hora
 */

public class Hora {
	/**
	 *  Se le pasa por defecto true
	 */
	public static boolean hora = true;
	
	/**
	 * 
	 * @param segundos Los segundos deben ser mayores iguales a 0
	 * @param minutos Los minutos deben ser mayores iguales a 0
	 * @param horas Las horas deben ser mayores iguales a 0
	 * @return Si se cumplen los requisitos devuelve TRUE
	 */

	public static boolean validarHora(int segundos, int minutos, int horas) {
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				hora = false;
			} else if (minutos > 59) {
				hora = false;
			} else if (segundos > 59) {
				hora = false;
			}
		} else {
			hora = false;
		}
		/**
		 * @return Si se cumple true sino false
		 */
		return hora;
	}
}