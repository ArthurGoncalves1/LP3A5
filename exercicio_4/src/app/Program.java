package app;

import entities.Funcionario;
import entities.Gerente;

public class Program {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Silva", 2500.00, "Vendas");
        funcionario.mostrarInformacoes();

        Gerente gerente = new Gerente("Maria Santos", 5000.00, "Marketing", "minhasenha");
        gerente.mostrarInformacoes();

	}

}
