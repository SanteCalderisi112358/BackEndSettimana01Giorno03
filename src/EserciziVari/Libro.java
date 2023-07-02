package EserciziVari;

public class Libro {
	private String titolo;
	private String autore;
	private int numPagine;

	public Libro(String _titolo, String _autore, int _numPagine) {
		this.titolo = _titolo;
		this.autore = _autore;
		this.numPagine = _numPagine;
	}

	@Override
	public String toString() {

		return "\n----------\nTitolo: " + this.titolo + ".\nAutore: " + this.autore + ".\nNumero di pagine: "
				+ this.numPagine + "\n----------\n";

	}

}
