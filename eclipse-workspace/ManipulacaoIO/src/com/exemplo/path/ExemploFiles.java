package com.exemplo.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFiles {

	public static void main(String[] args) {
		// bloco try/catch
		try {
		Path arquivo = Paths.get("resources\\poema.txt");
		Path novaPasta = Paths.get("resources\\textos\\rascunhos\\vazio");
		Path pasta = Paths.get("C:\\Users\\William Rafael\\Downloads\\CURSO IMPACTA JAVA\\Nova pasta (2)");

		//utilizacao de alguns metodos com origem na classe files
		if(!Files.exists(arquivo)) {
			System.out.println("o arquivo nao existe!");
			
		}else if(Files.isDirectory(arquivo)) {
			System.out.println("O item é um diretorio!");
		}else if(Files.isRegularFile(arquivo)) {
			System.out.println("O item é um arquivo");
		}
		
		System.out.println(Files.size(arquivo));
		
		//criar o diretorio rascunhos
		Files.createDirectories(novaPasta);
		
		//exibir o conteudo do diretorio mp3
		Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));
	}catch(IOException e) {
		e.printStackTrace();
		
		
	}

}
}
