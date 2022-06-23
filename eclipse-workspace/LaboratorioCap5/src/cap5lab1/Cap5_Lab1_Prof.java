package cap5lab1;

public class Cap5_Lab1_Prof {
	public static void main(String[] args) {
		//criar um objeto e instancia-lo
		FuncionarioProf f = new FuncionarioProf();
		
		//atribuindo valores aos atributos da classe Funcionario()
		f.nome = "jhon";
		f.sobrenome = "Lennon";
		f.cargo = "Estagiario";
		f.salario = 890.9;
		
		//exibindo os valores
		
		System.out.println("Nome: " + f.nome);
		System.out.println("sobrenome: " + f.sobrenome);
		System.out.println("cargo: " + f.cargo);
		System.out.println("Salario: " + f.salario);
	}

}
