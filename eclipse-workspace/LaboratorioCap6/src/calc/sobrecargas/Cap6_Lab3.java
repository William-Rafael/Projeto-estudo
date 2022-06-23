package calc.sobrecargas;

public class Cap6_Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		Aluno aluno1 = new Aluno();
		aluno1.setNome("jo�o");
		aluno1.contadorDeAlunos++;
		aluno1.imprimeAluno();
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.contadorDeAlunos++;
		aluno2.imprimeAluno();
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Marcos");
		aluno3.contadorDeAlunos++;
		aluno3.imprimeAluno();
		
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		
		

	}

}


/*A - Criando a classe Aluno
1. Crie uma classe denominada Aluno;

2. Nessa classe, crie um campo de acesso private da string chamada nome;
3. Crie os m�todos getter e setter para acesso ao campo nome;

4. Crie um novo campo p�blico, est�tico, do tipo int e de nome
contadorDeAlunos;

5. Salve e compile sua classe.

B - Criando a classe Cap6_Lab3 para testar a classe Aluno

1. Crie uma classe chamada Cap6_Lab3 e garanta que o m�todo main seja
criado nessa classe;
2. Instancie tr�s objetos Aluno com os nomes: �joao�, �maria� e �marcos�;

As a��es descritas nos passos 3 a 6 devem ser repetidas, sequencialmente, para
cada objeto instanciado

3. Modifique o valor do atributo nome da classe para ficar igual ao do objeto
(�Jo�o�, �Maria� ou �Marcos�), utilizando o m�todo setter apropriado;

4. Incremente a vari�vel contadorDeAlunos, usando como refer�ncia o
identificador do objeto criado;

5. Invoque o m�todo imprimeAluno() do respectivo objeto;
6. Imprima na tela o valor atual da vari�vel est�tica contadorDeAlunos a partir
do objeto atual;
7. Imprima na tela o valor da vari�vel est�tica contadorDeAlunos, acessando-a
por meio do nome da classe, da seguinte forma: Aluno.contadorDeAlunos;
8. Execute o programa.
A sa�da dever� ser como a seguinte:


*/