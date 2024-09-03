package view;
import empregados.*;
import animais.*;
import classe_social.Individo;

public class Main {

	public static void main(String[] args) {
		//Funcionarios
		Assistente_adm Julia = new Assistente_adm("Julia", "00001");
		Tecnico Antonio = new Tecnico ("Antonio", "00002");
		
		Julia.getId_matricula();
		Antonio.getId_matricula();
		
		//Animais
		Gato Felix = new Gato("Felix");
		Cachorro Clifford = new Cachorro("Clifford");
		
		Felix.Miar();
		Clifford.latir();
		
		Felix.caminhar();
		Clifford.caminhar();
		
		//Classe Social
		Individo primoPobre = new Individo("Primo Pobre", 1000000);
		
		primoPobre.getRenda();
		
		
	}

}
