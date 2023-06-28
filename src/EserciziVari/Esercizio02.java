/*Esercizio sulla ricerca del massimo:
Scrivi un programma che chieda all'utente di inserire una serie di numeri interi e 
trovi il numero più grande tra quelli inseriti. Il programma dovrebbe terminare quando 
l'utente inserisce 0. Alla fine, stampa il numero più grande.*/

package EserciziVari;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Inserire numero");
			int numero = input.nextInt();
			if (numero == 0) {
				break;
			}
			if (numero > max) {
				max = numero;
			}

		}

		input.close();

		System.out.printf("Il massimo è:\n%d", max);

	}

}
