package app;

import entities.Aluno;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Arthur", 20);
		System.out.println(p.apresentar());
		
		Pessoa aluno = new Aluno("Arthur", 20, "SP3075885");
		System.out.println(aluno.apresentar());
	}

}
