package empregados;

public class Assistente_adm extends Funcionario{

	public Assistente_adm(String nome, String id_matricula) {
		super(nome, id_matricula);
	}

	public static void Administrar() {
		System.out.println("Administrando...");
	}
}
