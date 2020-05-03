package uscs;

public class Pessoa {
	
	
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Pessoa(){
	}

	public Pessoa (String nome, String endereco, String cpf, String rg) {
	this.nome = nome;
	this.endereco = endereco;
	this.cpf = cpf;
	this.rg = rg;
	}

	public Pessoa (Pessoa p) {
		
		this.nome = p.nome;
		this.rg = p.rg;
		this.cpf = p.cpf;
		this.endereco = p.endereco;
	}
	
	public void imprimePessoa() {
		
		System.out.println("O nome da pessoa é: " + this.nome);
		System.out.println("O CPF da pessoa é: " + this.cpf);
		System.out.println("O rg da pessoa é: " + this.rg);
		System.out.println("O endereço é: " + this.endereco);
	}
}

