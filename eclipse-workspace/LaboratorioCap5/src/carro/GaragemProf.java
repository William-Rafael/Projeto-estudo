package carro;

public class GaragemProf {
	//criando os atributos carroPasseio e carroUtilitario
	CarroProf carroPasseio = new CarroProf();
	CarroProf carroUtilitario = new CarroProf();

	public static void main(String[] args) {
		//Instanciando o objeto g do tipo garagem
		GaragemProf g = new GaragemProf();
		
		//oferencendo valores aos atributos 
		
		g.carroPasseio.modelo = "Gol";
		g.carroPasseio.potenciaMotor = "1.0";
		g.carroPasseio.cor = "vermelho";
		
		g.carroUtilitario.modelo = "polo";
		g.carroUtilitario.potenciaMotor = "1.0";
		g.carroUtilitario.cor = "branco";
		
		//exibindo os valores
		
		System.out.println("Atributos do carro de passeio:");
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potencia do motor: " + g.carroPasseio.potenciaMotor);
		System.out.println("cor: " + g.carroPasseio.cor);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Atributos do carro utilitario:");
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potencia do motor: " + g.carroUtilitario.potenciaMotor);
		System.out.println("Cor:" + g.carroUtilitario.cor);
		
		
	}

}
