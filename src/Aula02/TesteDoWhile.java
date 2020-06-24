package Aula02;

import java.util.Scanner;

public class TesteDoWhile {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("1- saque");
			System.out.println("2- deposito");
			System.out.println("3- extrato");
			System.out.println("0- encerrar");
			opcao = teclado.nextInt();
		} while (opcao != 0);
		/*
		 * do{ System.out.println("Valor = "+valor); valor = valor + 1; // valor++; }
		 * while (valor <= 10); while(valor <= 10){
		 * System.out.println("Valor = "+valor); valor++; }
		 */
		teclado.close();
	}
}