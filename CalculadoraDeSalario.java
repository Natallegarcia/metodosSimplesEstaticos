package metodosSimplesEstaticos;

public class CalculadoraDeSalario {

	// no metodo estátido cevemos informa valores como argumento 
	//pois ele não depende das informações particulares dos objetos 
	
	
	public double valorPagar (double valorPorHora, double horasTrabalhadas) {
		return valorPorHora * horasTrabalhadas;
		
		// para chamar na classe principal esse metodo estático valorPagar é necessário criar uma variavel 
		//e faze-lo receber o metodo e isntanciar o método
	}
	
}
