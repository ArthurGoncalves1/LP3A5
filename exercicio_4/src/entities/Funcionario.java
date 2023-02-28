package entities;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;

	public Funcionario(String nome, double salario, String departamento) {
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public void mostrarInformacoes() {
		System.out.println("Nome: " + nome + ", Salário: " + salario + ", Departamento: " + departamento);
	}
}
