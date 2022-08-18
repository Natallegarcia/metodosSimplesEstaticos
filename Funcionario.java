package metodosSimplesEstaticos;

public class Funcionario {
	String nome;
	String setor;
	double valorPorHora;
	double horasTrabalhadas;

	// utilizar um construtor para ajudar a instanciar os objetos de forma prática
	// construtor recebe os  argumentos 
	
	
	public Funcionario(String nome, String setor, double valorPorHora, double horasTrabalhadas) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.valorPorHora = valorPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	// método (ação)
	// não é um método estático e depende das informações variáveis de cada objeto criado na classe principal
	public double valorPago () {
		return valorPorHora* horasTrabalhadas;
	}
	
}
