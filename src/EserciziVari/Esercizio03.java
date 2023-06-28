//Esercizio sulla verifica della parola palindroma:
//Scrivi un programma che chieda all'utente di inserire una parola e verifichi se è palindroma, 
//ovvero se può essere letta allo stesso modo da sinistra a destra e viceversa. 
//Alla fine, stampa un messaggio che indica se la parola è palindroma o meno.

package EserciziVari;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire parola");
		String parola = input.nextLine();
		boolean flag = palindromo(parola);
		if (flag) {
			System.out.printf("'%s' è palindroma", parola);
		} else {
			System.out.printf("'%s' non è palindroma", parola);

		}

		input.close();
	}

	public static boolean palindromo(String stringa) {
		String stringaNoSpace = stringa.replaceAll(" ", "");
		for (int i = 0; i < stringaNoSpace.length() / 2; i++) {
			if (stringaNoSpace.charAt(i) != stringaNoSpace.charAt(stringaNoSpace.length() - 1 - i)) {
				return false;
			}
		}
		return true;

	}

}
