package Esercizio02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();
		input.close();

		stampa(numero);
	}

	public static void stampa(int numero) {
		switch (numero) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		default:
			System.out.println("Errore: Il numero non è compreso tra 0 e 3");
		}
	}
}
