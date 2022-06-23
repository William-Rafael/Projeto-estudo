package labcap14;

public class MaioresSalarios {

	public static void main(String[] args) {
		double[] salariosBrutos = new double[] {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		double[] salariosTop;
		
		
		TransformaValores2 salarioAlto = DoubleArrayUtils::filtraValores;
		salariosTop = salarioAlto.executa (salariosBrutos, a -> a >= 3000.00);
		
		for(double salario : salariosTop) {
		
			
			System.out.println("Salario: " + salario);
		}
	}

}
