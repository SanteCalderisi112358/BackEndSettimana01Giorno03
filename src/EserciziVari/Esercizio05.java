package EserciziVari;

import java.util.Scanner;


public class Esercizio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire numero");
		int x = input.nextInt();

//		f(x);
//		g(f(x));
//		h(g(f(x)));
		System.out.println("Output:" + h(g(f(x))));
		input.close();

	}

	public static int f(int x) {
		return x * 2;
	}

	public static int g(int function) {
		return function * function;
	}

	public static int h(int gunction) {
		return gunction + 1;
	}
}
