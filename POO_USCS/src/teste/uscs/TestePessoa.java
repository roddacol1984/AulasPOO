package teste.uscs;

import uscs.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pessoa a = new Pessoa();
		Pessoa b = new Pessoa("Rodrigo","Rua Alegre","221","32");
		Pessoa c = new Pessoa(b);
		a.imprimePessoa();
		b.imprimePessoa();
		c.imprimePessoa();
		
		
	}

}
