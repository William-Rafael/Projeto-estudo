package labcap14;

public class MaiorSalario2 {

	public static void main(String[] args) {
		double[] salariosBrutos = new double[] {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		double[] salariosTop;
		salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos,(salario) -> salario >3000 ? true : false);
		System.out.println("Salarios Top");
		DoubleArrayUtils.processaValores(salariosTop, salarios -> System.out.println(salarios));

	}

}
