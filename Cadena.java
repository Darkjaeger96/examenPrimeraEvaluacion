package examen;
/**
 * 
 * @author Jesús Villar García
 * @version 1.0
 *
 */

public class Cadena {

	public static void main(String[] args) {
		String cadena = "HolaMundo";
		cadena = cadena.toUpperCase(); //convierte a mayuscula
		System.out.println(cadena);
		cadena = cadena.toLowerCase(); //convierte a minuscula
		System.out.println(cadena);
		System.out.println("Logitud de " + cadena + " : " + cadena.length()); //devuelve la longitud de la cadena
		
		char comp1 = cadena.charAt(0); //Primera letra
		char comp2 = cadena.charAt(cadena.length()-1); //Ultima letra
		System.out.println(comp1); 
		System.out.println(comp2);
		
		//Comprueba si empieza por vocal o consonante
		if(comp1 == 'a' || comp1 == 'e' || comp1 == 'i' || comp1 == 'o' || comp1 == 'u') {
			System.out.println("Empieza por vocal");
		}else {
			System.out.println("Empieza en consonante");
		}
		
			
	}
}
