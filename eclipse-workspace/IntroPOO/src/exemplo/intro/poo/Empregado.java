package exemplo.intro.poo;

public class Empregado {
	// declanrando duas variaveis
	private String endereco;
	private int idade;
	
	// inicializar as variais 
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	void setIdade (int idade) {
		this.idade = idade;
	}
	// criar uma funcao para exibir os valores das variais 
	
	String mostrar() {
		return(endereco + idade);
	}
}
