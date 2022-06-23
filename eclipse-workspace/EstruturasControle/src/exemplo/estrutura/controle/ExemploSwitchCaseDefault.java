package exemplo.estrutura.controle;

public class ExemploSwitchCaseDefault {

	public static void main(String[] args) {
		// criar a variavel de avaliacao e atribuir valor
		String pais = "Argentina";
		
		//estrutura do bloco swith
		switch(pais) {
			//estabelecendo os cases
		case "Brasil":
		case "Portugal":
			System.out.println("bom dia!");
			break;
			
		case "França":
			System.out.println("bon jour!");
			break;
			
		case "Mexico":
		case "Chile":
		case "Argentina":
			System.out.println("Buenos Dias!");
			break;
			
			
		default:
			System.out.println("good Morning!");
		}

	}

}
