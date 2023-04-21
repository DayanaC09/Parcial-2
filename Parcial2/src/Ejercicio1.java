import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase: ");
		String frase = scanner.nextLine();
		
		char[] caracteres = new char [frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
		}
		
		System.out.println("Los elementos del array son: ");
		for (char caracter : caracteres) {
			System.out.println(caracter);
		}
	}

}


