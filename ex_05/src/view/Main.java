package view;
import controller.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Imovel casa = new Imovel(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para imovel novo ou 2 para imovel velho")));
	}

}
