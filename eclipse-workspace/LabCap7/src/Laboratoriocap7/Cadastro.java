package Laboratoriocap7;

public class Cadastro {
	
	// criando os atributos
	private String nome;
	private String sobrenome;
	private int idade;
	
	//criando os getters e setters
		public String getNome() {
		return this.nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;

}
	public String getSobrenome() {
		return this.sobrenome;
		
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;

	
	}
	//definindo o contrutor padrao da classe
	public Cadastro() { //nao precisa atribuir os valores 
		
	}
	//definicao do metodo-construtor com uso de paramentros
	public Cadastro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	//definicao do metodo contrutor com 3 parametros
	public Cadastro(String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}
	//criar o metodo para mostrar os valores em tela
	public void mostrar() {
		System.out.println("Nome: " + this.nome + "\nSobrenome: " + this.sobrenome + "\nIdade: " + this.idade);
	}
	
}



/*A – Criando a classe Cadastro com múltiplos construtores
1. Crie uma classe com o nome Cadastro e declare os atributos privados nome,
sobrenome e idade;

2. Crie os assessores getter e setter para cada atributo;

3. Insira o construtor padrão da classe;

4. Crie um construtor que receba os parâmetros nome e sobrenome e atribua
os valores desses parâmetros aos atributos da classe;

5. Crie outro construtor que receba os parâmetros nome, sobrenome e idade
e atribua os valores desses parâmetros aos atributos da classe;

6. Crie um método chamado mostrar que exiba na tela o valor de cada atributo
da classe;

7. Salve e compile a classe.*/