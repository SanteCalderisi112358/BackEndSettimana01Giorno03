//Esercizio 1: Somma degli elementi di un array
//
//Scrivi un programma che calcoli la somma di tutti gli elementi di un array 
//di numeri interi.

package EserciziVari;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio07 {

	public static void main(String[] args) {
		System.out.println("Quanti numeri vuoi sommare?");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] arrayNum = new int[num];
		arrayNum = riempiArray(arrayNum, input);
		stampaArray(arrayNum);
		int somma = sommaArray(arrayNum);
		double media = mediaArray(arrayNum, somma);
		int max = massimoArray(arrayNum);
		System.out.println("La somma è: " + somma);
		System.out.printf("La media è: %.2f\n", media);
		System.out.println("Il massimo è: " + max);
		input.close();

	}

	public static int[] riempiArray(int[] array, Scanner input) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci numero:");
			array[i] = input.nextInt();
		}
		return array;
	}

	public static void stampaArray(int[] array) {
		System.out.println("L'array di numeri è:" + Arrays.toString(array));

	}

	public static int sommaArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

	public static double mediaArray(int[] array, int somma) {
		return (double) somma / array.length;
	}

	public static int massimoArray(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
