package uscs;

public class Gerente extends Empregado {

	private String nomeSecretaria;
	private double bonus;

	public Gerente() {
		
	}

	public Gerente(
			String nome,
			String endereco,
			double valorHora,
			int qtdeHoras,
			String nomeSecretaria,
			double bonus) {
		
		super(nome, endereco, valorHora, qtdeHoras);
		this.nomeSecretaria = nomeSecretaria;
		this.bonus = bonus;
	}
	
	public Gerente (Gerente g) {
		super(g.getNome(), 
				g.getEndereco(), 
				g.getValorHora(),
				g.getQtdeHora());
		this.nomeSecretaria = g.nomeSecretaria;
		this.bonus = g.bonus;
		
	}
	
	public void imprimeGerente() {
		super.imprimeEmpregado();
		System.out.println("Nome da secretária:" + this.nomeSecretaria);
		System.out.println("Bonus: " + this.bonus);
	}
	
	@Override
	public double calculaSalario() {
		return(calculaSalario() + this.bonus);
		
	}
	@Override
	public void imprimeSalario() {
		System.out.println("Nome do Gerente: " + super.getNome());
		System.out.println("Sal[ario do Gerente: " + this.calculaSalario());
	}
}
