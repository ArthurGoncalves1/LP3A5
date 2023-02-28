package entities;

public class Gerente extends Funcionario{
	private String senha;

	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.senha = senha;
	}

	@Override
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Senha: " + senha);
	}
}
