package examen;

public class Hora {
	public static boolean hora = true;

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
		return hora;
	}
}