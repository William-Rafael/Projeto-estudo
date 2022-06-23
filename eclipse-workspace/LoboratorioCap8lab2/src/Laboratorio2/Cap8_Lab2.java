package Laboratorio2;

public class Cap8_Lab2 {

	//private static final String Intenger = null;

	public static void main(String[] args) {
		if(args.length > 0) {
			
		
		int contador = 0;
		int soma = 0;
		int media;
		
		for(int i = 0; i < args.length; i++)
			soma += Integer.parseInt(args[i]);
			media = soma / args.length;
			
			System.out.println("Total das idades: " +soma);
			System.out.println("Media das idades: \n" + args[0]+" " + args[1]+" " + args[2]+ " "
					+args[3]+ " " + args[4]+ "" +media);
	}else
		
		System.out.println("Entre com valores validos para as idades");
}

}
	

