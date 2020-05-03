package teste.uscs;

import uscs.Empregado;
import uscs.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado e = new Empregado("Antonio", "Rua Alegre", 50.0, 230);
		e.imprimeEmpregado();
		e.imprimeSalario();
		
		Gerente g = new Gerente("Carlos", "Rua Alegre", 50.0, 200, "Ana", 2000);
		g.imprimeEmpregado();
	}

}
