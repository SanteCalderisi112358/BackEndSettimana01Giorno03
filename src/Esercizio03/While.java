package Esercizio03;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Inserisci una stringa. \nInserire ':q' per arrestare il programma");
			String stringa = input.nextLine();
			if (stringa.equals(":q")) {
				break;
			}
			stampa(stringa);
		}
		System.out.println("Hai inserito ':q'. \nProgramma terminato. \nAdios!");
		input.close();
	}

	public static void stampa(String inputString) {
		String inputStringNoSpace = inputString.replaceAll("\\s", "");
		System.out.println(
				"Stringa con caratteri separati dalla virgola: " + String.join(",", inputStringNoSpace.split("")));
	}
}
