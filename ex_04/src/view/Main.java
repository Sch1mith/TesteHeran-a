package view;
import javax.swing.*;
import controler.*;

public class Main {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso();
		
		ingresso.escolha_categoria(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ingressos VIP ou 2 para ingressos Comuns")));
		
		System.out.println("Você escolheu ingresso " + ingresso.getCategoria());
		
		ingresso.escolha_camarote(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para camarotes superiores e 2 para camarotes inferiores")));

		System.out.println("Voce escolheu " + ingresso.getCamarote());
		
	}

}
