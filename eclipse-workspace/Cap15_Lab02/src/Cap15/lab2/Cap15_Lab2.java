package Cap15.lab2;
import java.util.ArrayList;


public class Cap15_Lab2 {

	public static void main(String[] args) {
		
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		
		estudanteList.add(new Estudante("Joana", 8.5, 8.5));
		estudanteList.add(new Estudante("Antonio", 6.0, 9.0));
		estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
		estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
		estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));
		
		
		estudanteList.forEach( item -> item.setMedia( (item.getNotaPortugues() + item.getNotaMatematica()) / 2 ));
		estudanteList.forEach( item -> System.out.println(item.getNome() + " - " + item.getMedia(  )));
			
		}
	}
	

