//Esercizio sulla ricerca dell'indice di un elemento in un array:
//Scrivi un programma che crei un array di numeri interi e chieda all'utente 
//di inserire un numero da cercare. Il programma dovrebbe cercare il numero nell'array e 
//restituire l'indice corrispondente se presente, altrimenti restituire -1.

package EserciziVari;

import java.util.Random;
import java.util.Scanner;



	public class Esercizio04 {

	    public static void main(String[] args) {

	        Random random = new Random();
	        int randomNumber = random.nextInt(21) + 10;
	        System.out.println("Array random di lunghezza " + randomNumber);
	        int[] array = randomArray(randomNumber);
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }

	        System.out.println("Inserire numero");
	        Scanner input = new Scanner(System.in);
	        int numero = input.nextInt();
	        int indice = cerca(array, numero);
	        if (indice != -1) {
				System.out.printf("Il numero %d è presente in posizione %d", numero, indice);
	        } else {
				System.out.printf("Il numero %d non è presente nell'array", numero);
	        }

	        input.close();
	    }

	    public static int[] randomArray(int length) {
	        int[] array = new int[length];
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            array[i] = random.nextInt(100) + 1;
	        }
	        return array;
	    }

	    public static int cerca(int[] array, int numero) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == numero) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}
