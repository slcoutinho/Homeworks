package Aula02;

public class TesteOperacoes {
	public static void main(String args[]) {
		/*
		 * System.out.println("Pos incremento "+ a++); //
		 * System.out.println("Pos incremento "+a); // a= a+1;
		 * System.out.println("Pre incremento "+ ++a); // a = a+1; //
		 * System.out.prinltn("Pre incremento "+a);
		 * System.out.println("Valor do A = "+a);
		 */
		int a = 1;
		System.out.println("Valor do a = " + ++a);
		System.out.println("Valor do a depois = " + a);

		int potencia = (int) Math.pow(2, 10);

		System.out.println("Potencia = " + potencia);

		float res = (float) 1.00 / 2;
		System.out.println("Resultado da divisao = " + res);
	}
}