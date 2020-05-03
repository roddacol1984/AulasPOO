package uscs;

public class Aluno extends Pessoa {

	private int codigoAluno, qtdeFaltas;
	private float P1, P2;
	static int LimiteFaltas = 10;
	private static float MediaAprovacao = 7.0F;
	private static float Mediareprovacao = 3.0F;
	
	
	
	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public int getQtdeFaltas() {
		return qtdeFaltas;
	}

	public void setQtdeFaltas(int qtdeFaltas) {
		this.qtdeFaltas = qtdeFaltas;
	}

	public float getP1() {
		return P1;
	}

	public void setP1(float p1) {
		P1 = p1;
	}

	public float getP2() {
		return P2;
	}

	public void setP2(float p2) {
		P2 = p2;
	}

	public static int getLimiteFaltas() {
		return LimiteFaltas;
	}

	public static void setLimiteFaltas(int limiteFaltas) {
		LimiteFaltas = limiteFaltas;
	}

	public static float getMediaAprovacao() {
		return MediaAprovacao;
	}

	public static void setMediaAprovacao(float mediaAprovacao) {
		MediaAprovacao = mediaAprovacao;
	}

	public static float getMediareprovacao() {
		return Mediareprovacao;
	}

	public static void setMediareprovacao(float mediareprovacao) {
		Mediareprovacao = mediareprovacao;
	}

	public Aluno () {
		
	}
	
	public Aluno (
			String nome,
			String endereco,
			String cpf,
			String rg,
		
			int codigoAluno,
			float P1,
			float P2,
			int qtdeFaltas) {
		
		super(nome, endereco, cpf, rg);
		this.codigoAluno = codigoAluno;
		this.P1 = P1;
		this.P2 = P2;
		this.qtdeFaltas = qtdeFaltas;
		}
		public Aluno(Aluno a) {
			super(a.getNome(), a.getEndereco(), a.getCpf(), a.getRg());
			this.codigoAluno = a.codigoAluno;
			this.P1 = a.P1;
			this.P2 = a.P2;
			this.qtdeFaltas = a.qtdeFaltas;
		}
		
		public float Media() {
			return (this.P1 + this.P2) / 2;
		}
		
		public void imprimeAluno() {
			super.imprimePessoa();
			System.out.println("Código: " + this.codigoAluno);
			System.out.println("Nota P1: " + this.P1);
			System.out.println("Nota P2: " + this.P2);
			System.out.println("A quantidade de faltas: " + this.qtdeFaltas);
		}
		
		public void Resultado() {
			
			if (this.qtdeFaltas > Aluno.LimiteFaltas) 
				System.out.println("Aluno reprovado por faltas");
				else {
					if(this.Media() >= Aluno.MediaAprovacao)
						System.out.println("Aprovado");
					else {
						if(this.Media() < Aluno.MediaAprovacao)
							System.out.println("Reprovado");
						else
							System.out.println("Exame");
					}
			}
		}
	
}
