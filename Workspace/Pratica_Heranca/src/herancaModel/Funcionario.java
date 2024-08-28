package herancaModel;

public class Funcionario {
	private String nome;
	private int num_matricula;
	private int idade;

	public Funcionario(String nome, int num_matricula, int idade) {
		this.nome = nome;
		this.num_matricula = num_matricula;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public int getNum_matricula() {
		return this.num_matricula;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
