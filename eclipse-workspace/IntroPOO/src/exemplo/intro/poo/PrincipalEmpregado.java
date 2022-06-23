package exemplo.intro.poo;

public class PrincipalEmpregado {

	public static void main(String[] args) {
		// criar a instancia da classe empregado()
		Empregado emp = new Empregado();
		
		// chamada do metodo setEndereco
		emp.setEndereco("centro");
		
		//chamada do metodo setIdade()
		emp.setIdade(40);
		
		// chamada da funcao/metodo mostrar()
		
		System.out.println(emp.mostrar());
		
	

	}

}
