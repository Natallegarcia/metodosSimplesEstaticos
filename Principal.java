package metodosSimplesEstaticos;

public class Principal {

	public static void main(String[] args) {
		// instanciar dos objetos 
		
		Funcionario x = new Funcionario ("Marta", "Programação",70.0 , 45.0 ); // objeto 
		Funcionario y = new Funcionario ("Raphael", "Financeiro", 30.0, 45.0); // objeto 
		
		System.out.println (x.valorPago());
		System.out.println (y.valorPago());
		
		CalculadoraDeSalario calc = new CalculadoraDeSalario ();
		double resultado = calc.valorPagar(70.0, 45.0);
		System.out.println (resultado);
	}
	

	
}
