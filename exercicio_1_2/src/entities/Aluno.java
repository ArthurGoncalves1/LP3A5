package entities;

public class Aluno extends Pessoa{
	private String matricula;


	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	@Override
	public String apresentar() {
		return "Ol�, eu sou o aluno " + getNome() + " com matricula " + getMatricula() + " e tenho " + getIdade() + " anos.";
	}
	
	

}
