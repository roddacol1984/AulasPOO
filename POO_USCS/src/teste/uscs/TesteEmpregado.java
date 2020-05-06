package teste.uscs;

import uscs.Empregado;
import uscs.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado e = new Empregado("Antonio", "Rua Alegre", 50.0, 230);
		e.imprimeEmpregado();
		e.imprimeSalario();

		Gerente g = new Gerente("Carlos", "Rua Alegre", 50.0, 200, "Ana", 200.00);
		g.imprimeEmpregado();

		Gerente h = new Gerente("Rodrigo", "Av Alegre", 60.0, 120, "Marcia", 150.00);
		h.imprimeEmpregado();
		h.imprimeSalario();
		System.out.println("Uso do for");
		for (int i = 0; i < 5; i++) {
			System.out.println("Contagem");
		}
		
		for (int tabuada = 0; tabuada <= 10; tabuada ++) {
			System.out.println(" ");
			for(int valor = 0; valor <= 10; valor ++) {
				System.out.println(tabuada  + " x " + valor + " = " + tabuada*valor);
			
			}
		}
	}

}
