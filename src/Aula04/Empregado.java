package Aula04;

public class Empregado {
	private String nome;
	private String cargo;
	private double salario;

	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome; // this.nome refere-se ao atributo
		this.cargo = cargo;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome; // aqui o this se faz necessário
	}

	public String getNome() {
		return this.nome; // aqui o this é opcional
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public void aumentarSalario(double percentual) {
		this.salario = this.salario + this.salario * percentual / 100;
	}

	public String imprimir() {
		return this.nome + "/" + this.cargo + " R$ " + String.format("%.2f", salario);
	}
}