package heranca;
import herancaModel.Funcionario;
import animais.*;
import social.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//técnico e assistente administrativo
		Funcionario assistente_adm = new Funcionario("Nelson", 001, 45);
		Funcionario tecnico = new Funcionario("Mandela", 002 ,57);
		
		System.out.println("Nome: " + assistente_adm.getNome());
		System.out.println("Numero de Matricula: " + assistente_adm.getNum_matricula());
		System.out.println("Nome: " + tecnico.getNome());
		System.out.println("Numero de Matricula: " + tecnico.getNum_matricula());
		
		
		//Animais
		System.out.println("\n");
		Gato Felix = new Gato("Felix");
		Cachorro Clifford = new Cachorro("Clifford");
		
		Felix.Miar();
		Clifford.Latir();
		Felix.Caminhar();
		Clifford.Caminhar();
		
		//classes sociais
		System.out.println("\n");
		double renda = Double.parseDouble(JOptionPane.showInputDialog("digite sua renda"));
		Classe_Social classe = new Classe_Social(renda);
		classe.MinhaClasse(renda);
		
		
	}

}
