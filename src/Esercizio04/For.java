package Esercizio04;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();

		stampaRovescia(numero);

		input.close();
	}

	public static void stampaRovescia(int numero) {
		System.out.printf("Il conto alla rovescia di %d è:\n", numero);
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}
}

