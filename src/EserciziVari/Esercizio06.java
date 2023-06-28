//Esercizio sulla conversione di temperature:
//Scrivi un programma che converta una temperatura da Celsius a Fahrenheit. 
//Chiedi all'utente di inserire una temperatura in gradi Celsius e calcola la corrispondente 
//temperatura in gradi Fahrenheit utilizzando la formula: F = C * 9/5 + 32. Alla fine, 
//stampa la temperatura in gradi Fahrenheit.

package EserciziVari;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire tempertura in gradi Celsius");
		double C = input.nextDouble();
		double F = converti(C);
		System.out.printf("La temperatura di %.2f gradi Celsius equivale a %.2f gradi Fahrenheit", C, F);
		input.close();
	}

	public static double converti(double C) {
		return C * 9 / 5 + 32;
	}

}
