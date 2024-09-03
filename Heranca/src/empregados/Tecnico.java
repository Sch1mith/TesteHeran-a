package empregados;

public class Tecnico extends Funcionario{

	public Tecnico(String nome, String id_matricula) {
		super(nome, id_matricula);
	}
	
	public void Arrumar() {
		System.out.println("arrumando...");
	}

}
