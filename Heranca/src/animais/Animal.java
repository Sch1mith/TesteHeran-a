package animais;

public class Animal {

	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void caminhar() {
		System.out.println("caminhando...");
	}
	
}
