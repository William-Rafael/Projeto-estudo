package calc.sobrecargas;

public class Aluno {
	private String nome;
	public static int contadorDeAlunos;
	
	public String getNome() {
		return this.nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void imprimeAluno() {
		System.out.println("Aluno: " + nome + "\nContagem no objeto " + nome + ": " + contadorDeAlunos +"\n");
	}
}











/*A - Criando a classe Aluno
1. Crie uma classe denominada Aluno;

2. Nessa classe, crie um campo de acesso private da string chamada nome;
3. Crie os métodos getter e setter para acesso ao campo nome;

4. Crie um novo campo público, estático, do tipo int e de nome
contadorDeAlunos;

5. Salve e compile sua classe.

B - Criando a classe Cap6_Lab3 para testar a classe Aluno
1. Crie uma classe chamada Cap6_Lab3 e garanta que o método main seja
criado nessa classe;
2. Instancie três objetos Aluno com os nomes: “joao”, “maria” e “marcos”;*/