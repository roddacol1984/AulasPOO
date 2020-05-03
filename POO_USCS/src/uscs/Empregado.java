package uscs;

public class Empregado {

	private String nome, endereco;
	private double valorHora;
	private int qtdeHora;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getQtdeHora() {
		return qtdeHora;
	}

	public void setQtdeHora(int qtdeHora) {
		this.qtdeHora = qtdeHora;
	}

	public Empregado () {
		
	}

	public Empregado (
			String nome,
			String endereco,
			double valorHora,
			int qtdeHora)
	{ this.nome = nome;
		this.endereco = endereco;
		this.valorHora = valorHora;
		this.qtdeHora = qtdeHora;
	}
	
	public Empregado (Empregado e) {
		this.nome = e.nome;
		this.endereco = e.endereco;
		this.qtdeHora = e.qtdeHora;
		this.valorHora = e.valorHora;
		}
	public void imprimeEmpregado () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("qdtehoras: " + this.qtdeHora);
		System.out.println("valor hora: "+ this.valorHora);
	}
	
	public double calculaSalario() {
		return (this.valorHora *this.qtdeHora);
		
	}
	
	public void imprimeSalario() {
		System.out.println("O salario é: " + this.calculaSalario());
		
	}
	}
	