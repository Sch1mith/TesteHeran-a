package social;

public class Classe_Social {

	private double qtd_dinheiro;
	
	public Classe_Social(double renda) {
		this.qtd_dinheiro = renda;
	}
	
	public double getQtd_dinheiro() {
		return qtd_dinheiro;
	}
	
	public void setQtd_dinheiro(double newRenda) {
		this.qtd_dinheiro = newRenda;
	}
	
	public void MinhaClasse(double renda) {
		if (renda <= 105.00) {
			System.out.println("voce é mizeravel");
		} else if (renda > 105.00 || renda <= 210.00)  {
			System.out.println("voce é pobre");
		} else {
			System.out.println("voce é rico");
		}
	}
	
}
