package exemplo1;

public class Exemplo1 {
	public enum DiaDaSemana{
		SEGUNDA, TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO;
	}
	public static void main(String[] args) {
		DiaDaSemana diaBom = DiaDaSemana.SABADO;
		System.out.println("dia bom é o " + diaBom);
		
		
	}
}



