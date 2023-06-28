package Esercizio01;

import java.util.Scanner;

public class AnnoBisestile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci anno: ");
		int anno = input.nextInt();
		System.out.println(annoBisestile(anno));
		input.close();
	}

	public static String annoBisestile(int anno) {
		if ((anno % 4 == 0) || ((anno % 100 == 0) && (anno % 400 == 0))) {
			return "L'anno " + anno + " è bisestile";
		} else {
			return "L'anno " + anno + " non è bisestile";
		}
	}
}
