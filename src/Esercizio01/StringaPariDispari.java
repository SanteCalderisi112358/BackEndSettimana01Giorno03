package Esercizio01;

import java.util.Scanner;

public class StringaPariDispari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una stringa: ");
		String stringa = input.nextLine();

		System.out.println(stringaPariDispari(stringa));

		input.close();
	}

	public static boolean stringaPariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}


