package classe_social;

public class Individo {
	private String nome;
	private double renda;
	
	public  Individo(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
		
		if(this.renda <= 105.00) {
			System.out.println("Voce é miseravel! :´(");
		} else if (this.renda >= 105.01 && renda <= 210.00) {
			System.out.println("Voce é pobre! :(");
		} else {
			System.out.println("Voce é rico! :´(");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public double getRenda() {
		return this.renda;
	}
	
	public void setRenda(double newRenda) {
		this.renda = newRenda;
	}
	
}
