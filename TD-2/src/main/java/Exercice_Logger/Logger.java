package Exercice_Logger;

public abstract class Logger {
	private static boolean enabled;
	
	public static void log(Object o,String s) {
		enabled = true;
		System.out.println(o.getClass().toString()+" /"+s);
	}
	/* Questions
	 *  1. getClass renvoie l'environement de la class
	 * 
	 * 
	 * */
	
	
	
}
