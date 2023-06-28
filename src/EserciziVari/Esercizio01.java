//Esercizio sulla somma dei numeri:
//Scrivi un programma che chieda all'utente di inserire una serie di numeri interi e calcoli la 
//loro somma. Il programma dovrebbe continuare a chiedere numeri all'utente fino a quando non 
//viene inserito un numero negativo. Alla fine, stampa la somma totale.

package EserciziVari;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {
		int somma = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Inserire numero");
			int numero = input.nextInt();
			if (numero < 0) {
				break;
			}
			somma += numero;
		}

		input.close();

		System.out.printf("La somma dei numeri introdotti è:\n%d", somma);
	}

}
