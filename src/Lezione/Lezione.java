package Lezione;

public class Lezione {

	public static void main(String[] args) {
		/*int x = 10, y = 30;
		boolean test = true;
		if (test) {
			System.out.println("Test passato");
		} else {
			System.out.println("Test non passato");
		}
		System.out.println(x <= y ? "minore" : "maggiore");
		System.out.println(testNumbers(10, 20, 30));
		
		//SWITCH CASE
		String favoriteColour = "red";
		switch(favoriteColour) {
		case "green": {
			System.out.println("Il colore è verde");
			break;
		}
		case "red": {
			System.out.println("Il colore è rosso");
			break;
		}
		case "blue": {
			System.out.println("Il colore è blu");
			break;
		}
		default:
			System.out.println();
		}
		*/

		// WHILE

		int x = 6, y = 3;
		while (y <= x + 6) {
			System.out.println(y);
			y += 3;
		}
		do { // eseguo almeno una volta le istruzioni
			System.out.println(x++);

		} while (x < 10);
	}

	public static int testNumbers(int a, int b, int c) {
		return a < b ? (a < c ? a : c) : (b > c ? b : c);// Non abusare del ternary operator
	}
}
