package Aula04;

public class EmpregadoTeste {
	public static void main(String args[]) {
		Empregado e1, e2, e3;

		e1 = new Empregado("Jose", "Analista", 3500.0);
		e2 = new Empregado("Ana", "Arquiteta", 4500.0);
		e3 = new Empregado("Pedro", "Desenvolvedor", 4000.0);

		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());

		e1.aumentarSalario(10);
		e2.aumentarSalario(8.5);
		e3.aumentarSalario(7.5);

		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());

	}
}