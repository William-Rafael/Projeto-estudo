package labcap14;

public class DescontoSalarial {

	public static void main(String[] args) {
		

	double[] salariosBruto = new double[] {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
	double[] salariosLiquidos;
	
	
	TransformaValores desconto10 = DoubleArrayUtils::transformaValores;
	salariosLiquidos = desconto10.executa(salariosBruto, a -> 0.9 * a);
	
	for(double salario:salariosLiquidos) {
		System.out.println(salario);
	}
	}

}
