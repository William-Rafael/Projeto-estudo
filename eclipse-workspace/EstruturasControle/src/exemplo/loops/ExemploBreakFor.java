package exemplo.loops;

public class ExemploBreakFor {
	public static void main(String args[]) {
		//loop for
		for(int i = 1; i < 11; i++) {
			if(i == 5) 
				//chamando a expressao break
				break;
				System.out.println("valor de i é :" + i);
			
			System.out.println("proxima linha apos o loop...");
		}
	}

}
