package Reforco;

public class Caneta2 {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	private boolean destampada;
	
	//contrutor
	public Caneta2() {
		this.tampar();
		this.cor = "capa transparente";
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampada() {
		this.destampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta");	
		System.out.println("modelo: " + this.modelo); //ou pode usar o getModelo()
		System.out.println("ponta: " + this.ponta);
		System.out.println("Cor" + this.cor);
		System.out.println("Tampada: " + this.tampada);
		
	}
}
