package teste.uscs;

import uscs.Aluno;
import uscs.Pessoa;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa("Rod", "Rua Alegre", "32", "221");
		p1.imprimePessoa();
		Aluno a1 = new Aluno("Pedro", "Rua", "221", "32", 5644, 4.5F, 8.0F, 10);
		a1.imprimeAluno();
		a1.Resultado();
		
		
		
	}

}
