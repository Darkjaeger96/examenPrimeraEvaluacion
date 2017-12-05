package examen;
import java.util.Scanner;
/**
 * 
 * @author Jesús Villar Garcia
 * @version 1.0
 * 
 */

public class Numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int n1 = sc.nextInt();
		System.out.println("Introduce otro numero:");
		int n2 = sc.nextInt();
		sc.close();
		
		if(n1 > 0 && n1 < 1000 && n2 > 0 && n2 < 1000) {
			System.out.println(n1 + " es mayor de 0 y menor de 1000.");
			System.out.println(n2 + " es mayor de 0 y menor de 1000.");
			System.out.println("========================");
		
		}else {
			System.out.println("Fin del programa.");
		}
		mostrarMayor(n1, n2);
		System.out.println("=========================");
		mostrarDiezMultiplosDeTres();
	}
	
	//Primer metodo que muestra el mayor o iguales
	public static int mostrarMayor(int n1, int n2) {
		if(n1 > n2) {
			System.out.println(n1 + " es el mayor.");
		}
		else if(n1 == n2) {
			System.out.println("Son iguales.");
		}else{
			System.out.println(n2 + " es el mayor.");
		}
		return n1;
	}
	
	//segundo metodo que muestra los diez primeros multiplos de 3
	public static int mostrarDiezMultiplosDeTres() {
		for (int i = 1; i <= 10; i++) {
			int resultado = i*30;
			System.out.printf("%d%n", resultado);
		}
		return 0;
	}
}
	


