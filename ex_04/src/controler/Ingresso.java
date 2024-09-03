package controler;

public class Ingresso {
	private String categoria;
	private String camarote;
	private int num = 0;
	
	
	public Ingresso() {
		
	}
	
	public void escolha_categoria (int categoria) {
		if (categoria == 1) {
			this.categoria = "VIP";
			this.num = 1;
		} else if (categoria == 2) {
			this.categoria = "Comun";
		} else {
			System.out.println("Escolha uma opção válida");
		}
	}
	
	
	public void escolha_camarote(int camarote) {
		if (this.categoria == "VIP" && camarote == 1) {
			this.camarote = "camarote superior";
		} else if (this.categoria == "VIP" && camarote == 2) {
			this.camarote = "camarote inferior";
		} else {
			System.out.println("verifique a categoria de seu ingresso ou escolha uma opção válida");
		}
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public String getCamarote() {
		return this.camarote;
	}
	
}
