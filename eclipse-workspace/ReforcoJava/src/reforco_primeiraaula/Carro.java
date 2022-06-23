package reforco_primeiraaula;

public class Carro {
	private String cor;
	private String modelo;
	private double potencia;

	public Carro(String cor, String modelo, double potencia) {

		this.cor = cor;

		this.modelo = modelo;
		this.mostrar();
		this.potencia = potencia;

	}
	public Carro(double potencia, String modelo, String cor) {
		this.potencia = potencia;
	}
	public Carro(String cor) {
		this.cor = cor;
	}

	public Carro() {

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;

	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public void mostrar() {
		System.out.println("\nCor: " + cor + "\nmodelo: " + modelo + "\npotencia: " + potencia);
	}
}