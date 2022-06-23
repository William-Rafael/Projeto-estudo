package carro;



public class Garagem {
	

	public Carro carroPasseio = new Carro();
	public Carro carroUtilitario = new Carro();

public static void main(String[] args) {
	Garagem garagem = new Garagem();
	garagem.carroPasseio.modelo = "VW Jetta";
	garagem.carroPasseio.cor = "Vermelho";
	garagem.carroPasseio.potencia = 2.3;
	
	garagem.carroUtilitario.modelo = "Renault Boxer";
	garagem.carroUtilitario.cor = "Branco";
	garagem.carroUtilitario.potencia = 3.8;
	
	System.out.println("Carro de passeio: " + garagem.carroPasseio.toString());
	System.out.println("----------------------------------------------------------");
	System.out.println("Carro Utilitario: " + garagem.carroUtilitario.toString());
}

}


