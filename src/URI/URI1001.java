package URI;

import java.util.Scanner;

public class URI1001 {
	public static void main(String arg[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b, X;

		a = teclado.nextInt();
		b = teclado.nextInt();
		X = a + b;
		System.out.println("X = " + X);
		teclado.close();
	}
}