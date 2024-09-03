package controller;

public class Imovel {
	private String tipo;
		
		public Imovel (int tipo) {
			if (tipo == 1) {
				this.tipo = "Novo";
				System.out.println("O valor do imovel selecionado é R$1000000,00");
			} else if (tipo == 2) {
				this.tipo = "Velho";
				System.out.println("O valor do imovel selecionado é R$500000,00");
			} else {
				System.out.println("Escolha um valor válido");
			}
		}
	
		
		
}
