package cap5lab1;

public class Funcionario {
	// criando os atributos da classe funcionario
				
				private String nome;
				private String sobrenome;
				private String cargo;
				private int salario;
				
		void setNome(String nome) {
			this.nome = nome;
			
}
		void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
}

		void setCargo(String cargo) {
			this.cargo = cargo;
		}
		void setSalario(int salario) {
			this.salario = salario;
		}
		public String toString() {
			return "Nome = " + nome + "\nSobrenome = " + sobrenome + "\nCargo = " + cargo + "\nSalario = " + salario ;
		}
}




//*A – Criando uma classe Funcionario
//1. Crie um pacote chamado cap5lab1;
//2. Dentro do pacote, crie uma classe chamada Funcionario;
//3. Defina os atributos nome, sobrenome, cargo e salario na classe;
//4. Salve a classe.
//B – Criando uma classe para testar a classe Funcionario
//1. No pacote cap5lab1, crie uma classe chamada Cap5_Lab1 e insira a estrutura
//básica de um programa Java;
//2. Declare um objeto do tipo Funcionario e o instancie;
//3. Determine valores para os atributos nome, sobrenome, cargo e salario do
//objeto criado;
//4. Imprima os atributos do objeto na tela;
//5. Compile e execute o programa.
//O resultado deve ser como o exibido a seguir:*//