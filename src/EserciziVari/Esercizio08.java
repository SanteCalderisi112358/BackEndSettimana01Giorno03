package EserciziVari;

public class Esercizio08 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Il Signore degli anelli", "J. R. R. Tolkien", 1200);
		Libro libro2 = new Libro("Harry Potter e la camera dei segreti", "J. K. Rowling", 378);
		Libro libro3 = new Libro("Dracula", "Stoker", 540);
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
	}

}
