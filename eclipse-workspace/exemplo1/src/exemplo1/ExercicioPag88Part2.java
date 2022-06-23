package exemplo1;

public class ExercicioPag88Part2 {

	public static void main(String[] args) {
		// criar a variavel de avaliacao e atribuir valor
		String mes = "Julho";
		
		//estrutura do bloco swith
		switch(mes) {
			//estabelecendo os cases
		
		case "Julho":
		
			System.out.println("O mês escolhido tem 31 dias!");
			break;
			
		case "Janeiro":
			System.out.println("O mês tem 31 dias!");
			break;
		case "Fevereivo":
			System.out.println("O mês tem 28 dias!");
			break;
		case "Março":
			System.out.println("O mês tem 31 dias!");
			break;
		case "Abril":
			System.out.println("O mês tem 30 dias!");
			break;
		case "Maio":
			System.out.println("O mês tem 31 dias!");
			break;
		case "Junho":
			System.out.println("O mês tem 30 dias!");
			break;
		case "Agosto":
			System.out.println("O mês tem 31 dias!");
			break;
		case "Setembro":
			System.out.println("O mês tem 30 dias!");
			break;
		case "Outubro":
			System.out.println("O mês escolhido tem 31 dias!");
			break;
		case "Novembro":
			System.out.println("O mês tem 30 dias!");
			break;
		case "Dezembro":
			System.out.println("O mês tem 31 dias!");
			break;
				
			
		default:
			System.out.println("Mes invalido ou Verifique a ortografia");
		}

	}

}
