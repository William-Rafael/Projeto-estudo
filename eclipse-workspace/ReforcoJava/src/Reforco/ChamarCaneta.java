package Reforco;

public class ChamarCaneta {

	public static void main(String[] args) {
		Caneta2 c1 = new Caneta2();
		c1.setModelo("Azul");
		c1.setPonta(0.5f);
		c1.status();
		System.out.println("Tenho uma caneta azul 0,5 " + c1.getModelo());
		
		System.out.println("===========================================");
		Caneta2 c2 = new Caneta2();
		c2.status();
	
	}

}
