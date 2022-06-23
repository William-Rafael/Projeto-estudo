package Reforco;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		System.out.println("-------------------------------");
		
		Caneta c2 = new Caneta();
		c2.modelo = "hostnet";
		c2.cor = "preta";
		c2.destampar();
		c2.rabiscar();
		c2.status();
		
	}

}
