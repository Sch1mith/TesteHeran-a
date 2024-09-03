package empregados;

public class Funcionario {

	private String nome;
	private String id_matricula;
	
	public Funcionario(String nome, String id_matricula) {
		this.nome = nome;
		this.id_matricula = id_matricula;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public String getId_matricula() {
		return this.id_matricula;
	}
	
}
