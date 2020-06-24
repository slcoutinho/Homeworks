package Aula02;

import java.util.Scanner;

public class TesteIf {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float n1, n2, media;
		n1 = teclado.nextFloat();
		n2 = teclado.nextFloat();
		media = (n1 + n2) / 2;
		char sexo = teclado.nextLine().charAt(0);

		System.out.println("Media final = " + media);
		if (media >= 6.0f) {
			System.out.println("PARABENS - APROVADO!");
		} else {
			System.out.println("POOOOOOOTZ num deu");
		}
		System.out.println("Fim do programa!");
		// igualdade ==
		// atribuir valor =
		// diferente !=
		System.exit(0);
		teclado.close();
	}
}