package cap15.lab01;

import java.util.HashMap;

//import com.exemplo.map.Produto;

public class Cap15_lab1 {
	public static void main(String[] args) {

		HashMap<String, Integer> pessoaMap = new HashMap<>();

		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);

		System.out.println("-- Pessoas --");

		pessoaMap.forEach((chave, valor) -> System.out.println(chave + ": " + valor));

	}
}
